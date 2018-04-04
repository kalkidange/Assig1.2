
package ddos.protocols.implementations;

import ddos.DDOSPattern;
import ddos.protocols.interfaces.TCP;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;


public class TCPDDos extends TCP {
    
    
    public TCPDDos(DDOSPattern ddosPattern) {
        super(ddosPattern);
    }
    
    @Override
    public void writeLineToSocket(String message) {
        try(BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(getSocket().getOutputStream()))) {
            bw.write(getDdosPattern().getMessage());
            bw.flush();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
