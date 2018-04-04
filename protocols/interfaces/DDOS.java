
package ddos.protocols.interfaces;

import ddos.DDOSPattern;
import java.net.SocketAddress;


public abstract class DDOS implements Runnable {
    private DDOSPattern ddosPattern;
    private SocketAddress address;
    
    public DDOS() {
        
    }
    
    public DDOS(DDOSPattern ddosPattern) {
        this.ddosPattern = ddosPattern;
    }

   
    public abstract void writeLineToSocket(String message);
    
    
    protected abstract void createSocket();
    
    
    protected abstract void connectToSocket();
    
    
    protected abstract void closeSocket();

    
    public DDOSPattern getDdosPattern() {
        return ddosPattern;
    }

   
    public void setDdosPattern(DDOSPattern ddosPattern) {
        this.ddosPattern = ddosPattern;
    }

    public SocketAddress getAddress() {
        return address;
    }

    
    public void setAddress(SocketAddress address) {
        this.address = address;
    }
}
