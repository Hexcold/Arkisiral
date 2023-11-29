/**
 * @author hexcold || (@henrq.p)
 */

package view.playerVsPlayer.victory;

import view.MenuMain;

public class VictoryPlayer02 extends javax.swing.JFrame {
    
    

    public VictoryPlayer02() {
        initComponents();
        
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        winner = new javax.swing.JLabel();
        backgroud = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton1.setText("NEXT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(430, 370, 170, 40);

        winner.setFont(new java.awt.Font("Samurai", 0, 14)); // NOI18N
        winner.setText("jLabel2");
        getContentPane().add(winner);
        winner.setBounds(440, 310, 150, 50);

        backgroud.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/battle/victory/victoryNaryata.png"))); // NOI18N
        backgroud.setText("jLabel1");
        getContentPane().add(backgroud);
        backgroud.setBounds(0, 0, 1020, 500);

        setSize(new java.awt.Dimension(1033, 506));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        MenuMain menuMain = new MenuMain();
        this.dispose();
        menuMain.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backgroud;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel winner;
    // End of variables declaration//GEN-END:variables
}
