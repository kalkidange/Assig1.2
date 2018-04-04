
package ddos;

import java.io.Serializable;


public class DDOSPattern implements Serializable {
    
   
    private String protocol;
    
    
    private String host;
    
   
    private int port;
    
    
    private int threads;
    
    
    private String message;
    
    
    private int hours;
    
    /**
     * The duration in minutes.
     * Must be greater equal 0.
     */
    private int minutes;
    
    /**
     * The duration in seconds.
     * Must be greater equal 0.
     */
    private int seconds;
    
    /**
     * The timeout between an attack.
     * This attribute specifies the
     * break between every attack in milliseconds.
     */
    private int timeout;
    
    /**
     * The socket timeout.
     * The timeout how long a socket should wait 
     * until the connection aborts in milliseconds.
     */
    private int socketTimeout;
    
    
    public DDOSPattern() {
        this("TCP", "0.0.0.0", 0, 1, "Hello", 0, 5, 0, 5000, 5000);
    }
    
    
    public DDOSPattern(String protocol, String host, int port, int threads, String message, int hours, int minutes, int seconds, int timeout, int socketTimeout) {
        this.protocol = protocol;
        this.port = port;
        this.threads = threads;
        this.message = message;
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
        this.timeout = timeout;
        this.socketTimeout = socketTimeout;
    }

    
    public String getProtocol() {
        return protocol;
    }

    /**
     * Set the protocol name.
     * @param protocol the name of the protocol (tcp, udp ...).
     */
    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    
    public String getHost() {
        return host;
    }

    
    public void setHost(String host) {
        this.host = host;
    }

    
    public int getPort() {
        return port;
    }

   
    public void setPort(int port) {
        this.port = port;
    }

    
    public int getThreads() {
        return threads;
    }

    
    public void setThreads(int threads) {
        this.threads = threads;
    }
    
    
    public String getMessage() {
        return message;
    }

   
    public void setMessage(String message) {
        this.message = message;
    }
    
    
    public int getHours() {
        return hours;
    }
    
   
    public void setHours(int hours) {
        this.hours = hours;
    }

   
    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public int getTimeout() {
        return timeout;
    }

    public void setTimeout(int timeout) {
        this.timeout = timeout;
    }

    public int getSocketTimeout() {
        return socketTimeout;
    }

    public void setSocketTimeout(int socketTimeout) {
        this.socketTimeout = socketTimeout;
    }
}
