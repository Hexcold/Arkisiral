/*
 * @author hexcold || (@henrq.p)
 */

package view;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import logic.save.Save;
import view.History.MenuStoryPlayer;

public class MenuMain extends javax.swing.JFrame {

    public MenuMain() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        startGame = new javax.swing.JButton();
        contnue = new javax.swing.JButton();
        playerVsPlayer = new javax.swing.JButton();
        story = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        backgroudMenuMain = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ARKISIRAL");
        getContentPane().setLayout(null);

        startGame.setText("START GAME");
        startGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startGameActionPerformed(evt);
            }
        });
        getContentPane().add(startGame);
        startGame.setBounds(200, 180, 150, 40);

        contnue.setText("CONTINUE");
        contnue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contnueActionPerformed(evt);
            }
        });
        getContentPane().add(contnue);
        contnue.setBounds(200, 230, 150, 40);

        playerVsPlayer.setText("P´LAYER VS PLAYER");
        playerVsPlayer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playerVsPlayerActionPerformed(evt);
            }
        });
        getContentPane().add(playerVsPlayer);
        playerVsPlayer.setBounds(200, 280, 150, 40);

        story.setText("STORY");
        story.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                storyActionPerformed(evt);
            }
        });
        getContentPane().add(story);
        story.setBounds(200, 330, 150, 40);

        exit.setText("EXIT");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        getContentPane().add(exit);
        exit.setBounds(200, 380, 150, 40);

        backgroudMenuMain.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/backgroudMenuMain.png"))); // NOI18N
        backgroudMenuMain.setText("jLabel2");
        getContentPane().add(backgroudMenuMain);
        backgroudMenuMain.setBounds(0, 0, 1020, 500);

        setSize(new java.awt.Dimension(1034, 504));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void contnueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contnueActionPerformed
        try {
            this.dispose();
            Save.game();
        } catch (IOException ex) {
            Logger.getLogger(MenuMain.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_contnueActionPerformed

    private void storyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_storyActionPerformed

    }//GEN-LAST:event_storyActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    private void playerVsPlayerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playerVsPlayerActionPerformed

    }//GEN-LAST:event_playerVsPlayerActionPerformed

    private void startGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startGameActionPerformed
        MenuStoryPlayer menuStoryPlayer = new MenuStoryPlayer();
        this.dispose();
        menuStoryPlayer.setVisible(true);
    }//GEN-LAST:event_startGameActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backgroudMenuMain;
    private javax.swing.JButton contnue;
    private javax.swing.JButton exit;
    private javax.swing.JButton playerVsPlayer;
    private javax.swing.JButton startGame;
    private javax.swing.JButton story;
    // End of variables declaration//GEN-END:variables
}
