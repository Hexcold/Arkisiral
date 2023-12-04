/**
 * @author hexcold || (@henrq.p)
 */

package view.History.data;

import characters.adversary.Senrub;
import view.History.MenuStorySenrub01;

public class DataSenrub extends javax.swing.JFrame {
    
    public Senrub senrub = new Senrub();

    public DataSenrub() {
        initComponents();
        
        enemyLife.setText(Double.toString(senrub.getLife()));
        enemyPowerAttack.setText(Double.toString(senrub.getPowerAttack()));
        enemyLowerAttack.setText(Double.toString(senrub.getLowerAttack()));
        enemyRangedAttack.setText(Double.toString(senrub.getRangedAttack()));
        enemyBaseAttack.setText(Double.toString(senrub.getBaseAttack()));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        enemyLife = new javax.swing.JLabel();
        enemyBaseAttack = new javax.swing.JLabel();
        enemyLowerAttack = new javax.swing.JLabel();
        enemyRangedAttack = new javax.swing.JLabel();
        enemyPowerAttack = new javax.swing.JLabel();
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
        jButton1.setBounds(610, 400, 80, 40);

        enemyLife.setBackground(new java.awt.Color(0, 0, 0));
        enemyLife.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        getContentPane().add(enemyLife);
        enemyLife.setBounds(410, 230, 60, 16);

        enemyBaseAttack.setBackground(new java.awt.Color(0, 0, 0));
        enemyBaseAttack.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        getContentPane().add(enemyBaseAttack);
        enemyBaseAttack.setBounds(410, 270, 70, 16);

        enemyLowerAttack.setBackground(new java.awt.Color(0, 0, 0));
        enemyLowerAttack.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        getContentPane().add(enemyLowerAttack);
        enemyLowerAttack.setBounds(520, 310, 60, 16);

        enemyRangedAttack.setBackground(new java.awt.Color(0, 0, 0));
        enemyRangedAttack.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        getContentPane().add(enemyRangedAttack);
        enemyRangedAttack.setBounds(500, 340, 70, 16);

        enemyPowerAttack.setBackground(new java.awt.Color(0, 0, 0));
        enemyPowerAttack.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        enemyPowerAttack.setText("100");
        getContentPane().add(enemyPowerAttack);
        enemyPowerAttack.setBounds(500, 380, 60, 16);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Story/Data/DataSenrub.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1020, 500);

        setSize(new java.awt.Dimension(1033, 500));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        MenuStorySenrub01 menuStorysenrub = new MenuStorySenrub01();
        this.dispose();
        menuStorysenrub.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel enemyBaseAttack;
    private javax.swing.JLabel enemyLife;
    private javax.swing.JLabel enemyLowerAttack;
    private javax.swing.JLabel enemyPowerAttack;
    private javax.swing.JLabel enemyRangedAttack;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
