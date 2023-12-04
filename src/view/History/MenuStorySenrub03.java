/**
 * @author hexcold || (@henrq.p)
 */
package view.History;

import logic.story.FullStory;
import view.MenuMain;
import view.battle.BattleSenrub;

public class MenuStorySenrub03 extends javax.swing.JFrame {

    public MenuStorySenrub03() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jButton1.setText("NEXT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(480, 390, 80, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Story/StorySenrub03.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1020, 500);

        setSize(new java.awt.Dimension(1033, 500));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        if (FullStory.getChecker()) {
            MenuMain menuMain = new MenuMain();
            this.dispose();
            menuMain.setVisible(true);
        } else {
            BattleSenrub battleSenrub = new BattleSenrub();
            this.dispose();
            battleSenrub.setVisible(true);
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
