
package ddos;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;


public class DDOSer extends javax.swing.JFrame {
    
    private ScheduledExecutorService threadPool;
    
   
    private DDOSPattern ddosPattern;
    
    
    private int duration;
    
    
    public static boolean stopThread = false;
    
   
    private TimeChecker timeChecker;
    
    
    public DDOSer() {
        initComponents();
        pack();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jSpinner2 = new javax.swing.JSpinner();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jTbStart = new javax.swing.JToggleButton();
        jTbStop = new javax.swing.JToggleButton();
        jSeparator1 = new javax.swing.JSeparator();
        jTbToggleOutput = new javax.swing.JToggleButton();
        jSpConsole = new javax.swing.JScrollPane();
        jTaConsole = new javax.swing.JTextArea();
        jPbProgress = new javax.swing.JProgressBar();
        jLabel6 = new javax.swing.JLabel();
        jPTarget = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jCbProtocol = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jTfTarget = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jSPort = new javax.swing.JSpinner();
        jPDDosOptions = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jSThreads = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        jTfMessage = new javax.swing.JTextField();
        jPDuration = new javax.swing.JPanel();
        jSHours = new javax.swing.JSpinner();
        jLabel8 = new javax.swing.JLabel();
        jSMinutes = new javax.swing.JSpinner();
        jLabel9 = new javax.swing.JLabel();
        jSSeconds = new javax.swing.JSpinner();
        jLabel10 = new javax.swing.JLabel();
        jPTimeout = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jSTimeout = new javax.swing.JSpinner();
        jLabel11 = new javax.swing.JLabel();
        jSSocketTimeout = new javax.swing.JSpinner();
        jLStatus = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("JDOS");
        setAlwaysOnTop(true);
        setMinimumSize(new java.awt.Dimension(700, 300));
        setName("JDos"); // NOI18N
        setPreferredSize(new java.awt.Dimension(700, 300));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new java.awt.GridBagLayout());

        buttonGroup1.add(jTbStart);
        jTbStart.setText("Start");
        jTbStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTbStartActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        getContentPane().add(jTbStart, gridBagConstraints);

        buttonGroup1.add(jTbStop);
        jTbStop.setText("Stop");
        jTbStop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTbStopActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 8;
        getContentPane().add(jTbStop, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        getContentPane().add(jSeparator1, gridBagConstraints);

        jTbToggleOutput.setText("Advanced");
        jTbToggleOutput.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jTbToggleOutputItemStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 12;
        getContentPane().add(jTbToggleOutput, gridBagConstraints);

        jTaConsole.setEditable(false);
        jTaConsole.setColumns(20);
        jTaConsole.setRows(5);
        jTaConsole.setEnabled(false);
        jSpConsole.setViewportView(jTaConsole);
        jTaConsole.setVisible(false);
        jTaConsole.setEnabled(false);
        jSpConsole.setVisible(false);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        getContentPane().add(jSpConsole, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 15;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        getContentPane().add(jPbProgress, gridBagConstraints);

        jLabel6.setText("Progress:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 15;
        getContentPane().add(jLabel6, gridBagConstraints);

        jPTarget.setBorder(javax.swing.BorderFactory.createTitledBorder("Target / Protocol"));
        jPTarget.setLayout(new java.awt.GridLayout(3, 2));

        jLabel7.setText("Protocol:");
        jPTarget.add(jLabel7);

        jCbProtocol.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "TCP", "UDP" }));
        jPTarget.add(jCbProtocol);

        jLabel1.setText("Target Host:");
        jLabel1.setToolTipText("IP or URL of the victim");
        jPTarget.add(jLabel1);

        jTfTarget.setToolTipText("IP or URL of the victim");
        jPTarget.add(jTfTarget);

        jLabel2.setText("Port:");
        jLabel2.setToolTipText("If you take the port 0 it will automatically find an open port.");
        jPTarget.add(jLabel2);

        jSPort.setModel(new javax.swing.SpinnerNumberModel(1, 0, 65535, 1));
        jSPort.setToolTipText("If you take the port 0 it will automatically find an open port");
        jSPort.setOpaque(false);
        jPTarget.add(jSPort);

        getContentPane().add(jPTarget, new java.awt.GridBagConstraints());

        jPDDosOptions.setBorder(javax.swing.BorderFactory.createTitledBorder("DDOS Options"));
        jPDDosOptions.setLayout(new java.awt.GridLayout(2, 2));

        jLabel3.setText("Threads:");
        jLabel3.setToolTipText("Careful! If you take to many threads, your computer maybe slow down.");
        jPDDosOptions.add(jLabel3);

        jSThreads.setModel(new javax.swing.SpinnerNumberModel(1, 1, 4000, 1));
        jSThreads.setToolTipText("Careful! If you take to many threads, your computer maybe slow down.");
        jPDDosOptions.add(jSThreads);

        jLabel4.setText("Custom message:");
        jPDDosOptions.add(jLabel4);
        jPDDosOptions.add(jTfMessage);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        getContentPane().add(jPDDosOptions, gridBagConstraints);

        jPDuration.setBorder(javax.swing.BorderFactory.createTitledBorder("Duration"));
        jPDuration.setLayout(new java.awt.GridLayout(3, 2));

        jSHours.setModel(new javax.swing.SpinnerNumberModel(0, 0, 99999, 1));
        jPDuration.add(jSHours);

        jLabel8.setText("hours");
        jPDuration.add(jLabel8);

        jSMinutes.setModel(new javax.swing.SpinnerNumberModel(1, 0, 99999, 1));
        jPDuration.add(jSMinutes);

        jLabel9.setText("minutes");
        jPDuration.add(jLabel9);

        jSSeconds.setModel(new javax.swing.SpinnerNumberModel(0, 0, 99999, 1));
        jPDuration.add(jSSeconds);

        jLabel10.setText("seconds");
        jPDuration.add(jLabel10);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        getContentPane().add(jPDuration, gridBagConstraints);

        jPTimeout.setBorder(javax.swing.BorderFactory.createTitledBorder("Timeout"));
        jPTimeout.setLayout(new java.awt.GridLayout(2, 2));

        jLabel5.setText("Between attack:");
        jLabel5.setToolTipText("Timeout between every attack (single request) in milliseconds");
        jPTimeout.add(jLabel5);

        jSTimeout.setModel(new javax.swing.SpinnerNumberModel(1, 1, 999999, 1));
        jSTimeout.setToolTipText("Timeout between every attack (single request) in milliseconds");
        jPTimeout.add(jSTimeout);

        jLabel11.setText("Socket timeout:");
        jPTimeout.add(jLabel11);

        jSSocketTimeout.setModel(new javax.swing.SpinnerNumberModel(1, 1, 999999, 1));
        jPTimeout.add(jSSocketTimeout);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        getContentPane().add(jPTimeout, gridBagConstraints);

        jLStatus.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLStatus.setText("Stopped.");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 15;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        getContentPane().add(jLStatus, gridBagConstraints);

        getAccessibleContext().setAccessibleDescription("");
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Creates the DDOS pattern.
     * @return number of the attacker threads
     */
    private int createPattern() {
        String message = jTfMessage.getText();
        String host = jTfTarget.getText();
        int port = (Integer)jSPort.getValue();
        int threads = (Integer)jSThreads.getValue();
        int hours = (Integer)jSHours.getValue();
        int minutes = (Integer)jSMinutes.getValue();
        int seconds = (Integer)jSSeconds.getValue();
        int timeout = (Integer)jSTimeout.getValue();
        int socketTimeout = (Integer)jSSocketTimeout.getValue();
        String protocol = jCbProtocol.getSelectedItem().toString();
        
        ddosPattern = new DDOSPattern();
        if(!message.isEmpty()) ddosPattern.setMessage(message);
        if(!host.isEmpty()) ddosPattern.setHost(host);
        ddosPattern.setPort(port);
        ddosPattern.setThreads(threads);
        ddosPattern.setHours(hours);
        ddosPattern.setMinutes(minutes);
        ddosPattern.setSeconds(seconds);
        ddosPattern.setTimeout(timeout);
        ddosPattern.setSocketTimeout(socketTimeout);
        ddosPattern.setProtocol(protocol);
        return threads;
    }
    
    /**
     * Action method for the start button.
     * @param evt 
     */
    private void jTbStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTbStartActionPerformed
        startAll();
    }//GEN-LAST:event_jTbStartActionPerformed

    /**
     * This method is responsible for adding new
     * text to the console of the GUI. (JTextField on the bottom of the GUI)
     * @param message 
     */
    public static void appendToConsole(String message) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                Date date = new Date(System.currentTimeMillis());
                SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
                StringBuilder sb = new StringBuilder(dateFormat.format(date));
                sb.append(" ").append(message).append("\n");
                jTaConsole.append(sb.toString());
            }
        };
        SwingUtilities.invokeLater(runnable);
    }
    
    /**
     * Action method for the stop button.
     * @param evt 
     */
    private void jTbStopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTbStopActionPerformed
        stopAll();
    }//GEN-LAST:event_jTbStopActionPerformed

    /**
     * Start the whole DDOS process.
     */
    private void startAll() {
        stopThread = false;
        jTaConsole.setText("");
        if(jTfTarget.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Target may not be empty!");
            jTbStop.setSelected(true);
        } else {
            int threads = createPattern();
            // Convert the whole duration time in seconds. (for the progress bar)
            duration = (ddosPattern.getHours()*3600) + (ddosPattern.getMinutes()*60) + (ddosPattern.getSeconds());
            if(duration > 0) {
                jLStatus.setText("Attacking.");
                jPbProgress.setMaximum(duration);
                threadPool = Executors.newScheduledThreadPool(threads);
                timeChecker = new TimeChecker();
                timeChecker.start();
                for(int i=0;i<(Integer)jSThreads.getValue();i++) {
                    // add a new attacker thread to the threadpool
                    threadPool.scheduleWithFixedDelay(DdosFactory.createDDOS(ddosPattern), 1, ddosPattern.getTimeout(), TimeUnit.MILLISECONDS);
                }
            }
            else {
                JOptionPane.showMessageDialog(this, "Time must be greater than 0 seconds!");
            }
        }
    }
    
    
    private void stopAll() {
        if(timeChecker != null) timeChecker.interrupt();
        jPbProgress.setValue(0);
        stopThread = true;
        if(threadPool != null) threadPool.shutdownNow();
        threadPool = null;
        jLStatus.setText("Stopped.");
    }
    
    
    private void jTbToggleOutputItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jTbToggleOutputItemStateChanged
        if(jTbToggleOutput.isSelected()) {
            jTaConsole.setVisible(true);
            jTaConsole.setEnabled(true);
            jSpConsole.setVisible(true);
        }
        else {
            jTaConsole.setVisible(false);
            jTaConsole.setEnabled(false);
            jSpConsole.setVisible(false);
        }
        pack();
    }//GEN-LAST:event_jTbToggleOutputItemStateChanged

    /**
     * Program is closing.
     * @param evt 
     */
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        stopAll();
        System.exit(0);
    }//GEN-LAST:event_formWindowClosing

    
    class TimeChecker extends Thread {
        
        @Override
        public void run() {
            while(!isInterrupted() && !stopThread && duration > 0) {
                    try {
                        duration -= 1;
                        jPbProgress.setValue(jPbProgress.getValue()+1);
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                        interrupt();
                        stopThread = true;
                        duration = 0;
                        ex.printStackTrace();
                        break;
                    }
            }
            stopAll();
            jLStatus.setText("Finished!");
        }
    }
    
    
    public static void main(String args[]) {
        try {
            
            
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            //</editor-fold>
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } catch (InstantiationException ex) {
            ex.printStackTrace();
        } catch (IllegalAccessException ex) {
            ex.printStackTrace();
        } catch (UnsupportedLookAndFeelException ex) {
            ex.printStackTrace();
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DDOSer().setVisible(true);
            }
        });
    }
    

    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox jCbProtocol;
    private javax.swing.JLabel jLStatus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPDDosOptions;
    private javax.swing.JPanel jPDuration;
    private javax.swing.JPanel jPTarget;
    private javax.swing.JPanel jPTimeout;
    private javax.swing.JProgressBar jPbProgress;
    private javax.swing.JSpinner jSHours;
    private javax.swing.JSpinner jSMinutes;
    private javax.swing.JSpinner jSPort;
    private javax.swing.JSpinner jSSeconds;
    private javax.swing.JSpinner jSSocketTimeout;
    private javax.swing.JSpinner jSThreads;
    private javax.swing.JSpinner jSTimeout;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JScrollPane jSpConsole;
    private javax.swing.JSpinner jSpinner2;
    private static javax.swing.JTextArea jTaConsole;
    private javax.swing.JToggleButton jTbStart;
    private javax.swing.JToggleButton jTbStop;
    private javax.swing.JToggleButton jTbToggleOutput;
    private javax.swing.JTextField jTfMessage;
    private javax.swing.JTextField jTfTarget;
    
}
