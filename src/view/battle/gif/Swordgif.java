/**
 * @author hexcold || (@henrq.p)
 */
package view.battle.gif;

import java.util.Timer;
import java.util.TimerTask;

public class SwordGif extends javax.swing.JFrame {

    Timer timer = new Timer();

    public SwordGif() {
        initComponents();
        
        timer.schedule(task, 1000);
        this.dispose();
    }
    
    TimerTask task = new TimerTask() {
        @Override
        public void run() {
            dispose();
            
        }
    };

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/battle/gif/sword.gif"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, -10, 500, 290);

        setSize(new java.awt.Dimension(496, 272));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
