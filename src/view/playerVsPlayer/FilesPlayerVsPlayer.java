/**
 * @author hexcold || (@henrq.p)
 */
package view.playerVsPlayer;

import view.battle.*;
import view.playerVsPlayer.victory.VictoryPlayer01;
import view.playerVsPlayer.victory.VictoryPlayer02;
import characters.players.Player01;
import characters.players.Player02;
import logic.Game;
import logic.RobotAttack;

public class FilesPlayerVsPlayer extends javax.swing.JFrame {

    public static RobotAttack robotAttack = new RobotAttack();

    public FilesPlayerVsPlayer() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        player01LowerAttack = new javax.swing.JLabel();
        player01PowerAttack = new javax.swing.JLabel();
        player01BaseAttack = new javax.swing.JLabel();
        player01RangedAttack = new javax.swing.JLabel();
        player01Life = new javax.swing.JLabel();
        player02LowerAttack = new javax.swing.JLabel();
        player02PowerAttack = new javax.swing.JLabel();
        player02BaseAttack = new javax.swing.JLabel();
        player02RangedAttack = new javax.swing.JLabel();
        player02Life = new javax.swing.JLabel();
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
        jButton1.setBounds(420, 400, 170, 40);

        player01LowerAttack.setBackground(new java.awt.Color(0, 0, 0));
        player01LowerAttack.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        getContentPane().add(player01LowerAttack);
        player01LowerAttack.setBounds(440, 270, 150, 16);

        player01PowerAttack.setBackground(new java.awt.Color(0, 0, 0));
        player01PowerAttack.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        getContentPane().add(player01PowerAttack);
        player01PowerAttack.setBounds(420, 340, 150, 16);

        player01BaseAttack.setBackground(new java.awt.Color(0, 0, 0));
        player01BaseAttack.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        getContentPane().add(player01BaseAttack);
        player01BaseAttack.setBounds(330, 230, 250, 16);

        player01RangedAttack.setBackground(new java.awt.Color(0, 0, 0));
        player01RangedAttack.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        getContentPane().add(player01RangedAttack);
        player01RangedAttack.setBounds(420, 300, 160, 16);

        player01Life.setBackground(new java.awt.Color(0, 0, 0));
        player01Life.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        getContentPane().add(player01Life);
        player01Life.setBounds(330, 190, 190, 16);

        player02LowerAttack.setBackground(new java.awt.Color(0, 0, 0));
        player02LowerAttack.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        getContentPane().add(player02LowerAttack);
        player02LowerAttack.setBounds(780, 270, 150, 16);

        player02PowerAttack.setBackground(new java.awt.Color(0, 0, 0));
        player02PowerAttack.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        getContentPane().add(player02PowerAttack);
        player02PowerAttack.setBounds(760, 340, 230, 16);

        player02BaseAttack.setBackground(new java.awt.Color(0, 0, 0));
        player02BaseAttack.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        getContentPane().add(player02BaseAttack);
        player02BaseAttack.setBounds(670, 230, 320, 16);

        player02RangedAttack.setBackground(new java.awt.Color(0, 0, 0));
        player02RangedAttack.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        getContentPane().add(player02RangedAttack);
        player02RangedAttack.setBounds(760, 300, 240, 16);

        player02Life.setBackground(new java.awt.Color(0, 0, 0));
        player02Life.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        getContentPane().add(player02Life);
        player02Life.setBounds(670, 190, 320, 16);

        backgroud.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/playervsplayer/backgroundPlayerVsPlayer.png"))); // NOI18N
        backgroud.setText("jLabel1");
        getContentPane().add(backgroud);
        backgroud.setBounds(0, 0, 1020, 500);

        setSize(new java.awt.Dimension(1033, 506));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    String name = "oi";
        
    Player01 player01 = new Player01(name, 100, 10, 15, 20, 30);
    Player02 player02 = new Player02("Player02", 100, 10, 15, 20, 30);
    
    player01Life.setText((player01.getName()));
    
    
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backgroud;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel player01BaseAttack;
    private javax.swing.JLabel player01Life;
    private javax.swing.JLabel player01LowerAttack;
    private javax.swing.JLabel player01PowerAttack;
    private javax.swing.JLabel player01RangedAttack;
    private javax.swing.JLabel player02BaseAttack;
    private javax.swing.JLabel player02Life;
    private javax.swing.JLabel player02LowerAttack;
    private javax.swing.JLabel player02PowerAttack;
    private javax.swing.JLabel player02RangedAttack;
    // End of variables declaration//GEN-END:variables
}
