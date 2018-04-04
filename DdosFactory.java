
package ddos;

import ddos.protocols.interfaces.DDOS;
import ddos.protocols.implementations.UDPDDos;
import ddos.protocols.implementations.TCPDDos;


public class DdosFactory {
    
   
    public static DDOS createDDOS(DDOSPattern ddosPattern) {
        switch(ddosPattern.getProtocol().toLowerCase()) {
            case "tcp":
                return new TCPDDos(ddosPattern);
            case "udp":
                return new UDPDDos(ddosPattern);
        }
        return new TCPDDos(ddosPattern);
    }
}
