/**
 * @author hexcold || (@henrq.p)
 */
package view.battle;

import characters.adversary.Yekmal;
import characters.players.Player01;
import logic.CheckGame;
import logic.RobotAttack;
import view.battle.defeat.DefeatYekmal;
import view.battle.gif.SwordGif;
import view.battle.victory.VictoryYekmal;

public class BattleYekmal extends javax.swing.JFrame {

    public static Player01 player = new Player01("Player", 125, 10, 15, 20, 30);
    public static Yekmal yekmal = new Yekmal();
    public static RobotAttack robotAttack = new RobotAttack();

    public BattleYekmal() {
        initComponents();
        
        youLife.setText(Double.toString(player.getLife()));
        youPowerAttack.setText(Double.toString(player.getPowerAttack()));
        youLowerAttack.setText(Double.toString(player.getLowerAttack()));
        youRangedAttack.setText(Double.toString(player.getRangedAttack()));
        youBaseAttack.setText(Double.toString(player.getBaseAttack()));

        enemyLife.setText(Double.toString(yekmal.getLife()));
        enemyPowerAttack.setText(Double.toString(yekmal.getPowerAttack()));
        enemyLowerAttack.setText(Double.toString(yekmal.getLowerAttack()));
        enemyRangedAttack.setText(Double.toString(yekmal.getRangedAttack()));
        enemyBaseAttack.setText(Double.toString(yekmal.getBaseAttack()));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        youLowerAttack = new javax.swing.JLabel();
        youPowerAttack = new javax.swing.JLabel();
        youBaseAttack = new javax.swing.JLabel();
        youRangedAttack = new javax.swing.JLabel();
        youLife = new javax.swing.JLabel();
        enemyLowerAttack = new javax.swing.JLabel();
        enemyPowerAttack = new javax.swing.JLabel();
        enemyBaseAttack = new javax.swing.JLabel();
        enemyRangedAttack = new javax.swing.JLabel();
        enemyLife = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jButton1.setText("SWORD STRIKE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(370, 420, 120, 40);

        jButton3.setText("BLADE THROW");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(500, 420, 120, 40);

        jButton4.setText("POWER BLADE");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(630, 420, 120, 40);

        jButton5.setText("SPAB");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(240, 420, 120, 40);

        youLowerAttack.setBackground(new java.awt.Color(0, 0, 0));
        youLowerAttack.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        youLowerAttack.setText("100");
        getContentPane().add(youLowerAttack);
        youLowerAttack.setBounds(440, 270, 140, 16);

        youPowerAttack.setBackground(new java.awt.Color(0, 0, 0));
        youPowerAttack.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        youPowerAttack.setText("100");
        getContentPane().add(youPowerAttack);
        youPowerAttack.setBounds(420, 340, 160, 16);

        youBaseAttack.setBackground(new java.awt.Color(0, 0, 0));
        youBaseAttack.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        youBaseAttack.setText("100");
        getContentPane().add(youBaseAttack);
        youBaseAttack.setBounds(330, 230, 240, 16);

        youRangedAttack.setBackground(new java.awt.Color(0, 0, 0));
        youRangedAttack.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        youRangedAttack.setText("100");
        getContentPane().add(youRangedAttack);
        youRangedAttack.setBounds(420, 300, 160, 16);

        youLife.setBackground(new java.awt.Color(0, 0, 0));
        youLife.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        youLife.setText("100");
        getContentPane().add(youLife);
        youLife.setBounds(330, 190, 250, 16);

        enemyLowerAttack.setBackground(new java.awt.Color(0, 0, 0));
        enemyLowerAttack.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        enemyLowerAttack.setText("100");
        getContentPane().add(enemyLowerAttack);
        enemyLowerAttack.setBounds(780, 270, 210, 16);

        enemyPowerAttack.setBackground(new java.awt.Color(0, 0, 0));
        enemyPowerAttack.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        enemyPowerAttack.setText("100");
        getContentPane().add(enemyPowerAttack);
        enemyPowerAttack.setBounds(760, 340, 220, 16);

        enemyBaseAttack.setBackground(new java.awt.Color(0, 0, 0));
        enemyBaseAttack.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        enemyBaseAttack.setText("100");
        getContentPane().add(enemyBaseAttack);
        enemyBaseAttack.setBounds(670, 230, 150, 16);

        enemyRangedAttack.setBackground(new java.awt.Color(0, 0, 0));
        enemyRangedAttack.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        enemyRangedAttack.setText("100");
        getContentPane().add(enemyRangedAttack);
        enemyRangedAttack.setBounds(760, 300, 230, 16);

        enemyLife.setBackground(new java.awt.Color(0, 0, 0));
        enemyLife.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        enemyLife.setText("100");
        getContentPane().add(enemyLife);
        enemyLife.setBounds(670, 190, 180, 16);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/battle/enemyNaryata.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1020, 500);

        setSize(new java.awt.Dimension(1033, 506));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        SwordGif swordGif = new SwordGif();
        swordGif.setVisible(true);

        yekmal.setlife(CheckGame.lowerAttack(player.getLowerAttack(), yekmal.getLife()));
        System.out.println("vida: " + yekmal.getLife());
        RobotAttack.enamyAttack(yekmal.getName(), player);

        youLife.setText(Double.toString(player.getLife()));
        youPowerAttack.setText(Double.toString(player.getPowerAttack()));
        youLowerAttack.setText(Double.toString(player.getLowerAttack()));
        youRangedAttack.setText(Double.toString(player.getRangedAttack()));
        youBaseAttack.setText(Double.toString(player.getBaseAttack()));

        enemyLife.setText(Double.toString(yekmal.getLife()));
        enemyPowerAttack.setText(Double.toString(yekmal.getPowerAttack()));
        enemyLowerAttack.setText(Double.toString(yekmal.getLowerAttack()));
        enemyRangedAttack.setText(Double.toString(yekmal.getRangedAttack()));
        enemyBaseAttack.setText(Double.toString(yekmal.getBaseAttack()));

        if ((yekmal.getLife() <= 0) || (yekmal.getLife() <= 0 && player.getLife() <= 0)) {
            yekmal.setlife(100);
            player.setlife(100);

            VictoryYekmal victoryYekmal = new VictoryYekmal();
            this.dispose();
            victoryYekmal.setVisible(true);
        } else if (yekmal.getLife() > 0 && player.getLife() <= 0) {
            yekmal.setlife(100);
            player.setlife(100);

            DefeatYekmal defeatYekmal = new DefeatYekmal();
            this.dispose();
            defeatYekmal.setVisible(true);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        SwordGif swordGif = new SwordGif();
        swordGif.setVisible(true);

        yekmal.setlife(CheckGame.rangedAttack(player.getRangedAttack(), yekmal.getLife()));
        System.out.println("vida: " + yekmal.getLife());
        RobotAttack.enamyAttack(yekmal.getName(), player);

        youLife.setText(Double.toString(player.getLife()));
        youPowerAttack.setText(Double.toString(player.getPowerAttack()));
        youLowerAttack.setText(Double.toString(player.getLowerAttack()));
        youRangedAttack.setText(Double.toString(player.getRangedAttack()));
        youBaseAttack.setText(Double.toString(player.getBaseAttack()));

        enemyLife.setText(Double.toString(yekmal.getLife()));
        enemyPowerAttack.setText(Double.toString(yekmal.getPowerAttack()));
        enemyLowerAttack.setText(Double.toString(yekmal.getLowerAttack()));
        enemyRangedAttack.setText(Double.toString(yekmal.getRangedAttack()));
        enemyBaseAttack.setText(Double.toString(yekmal.getBaseAttack()));

        if ((yekmal.getLife() <= 0) || (yekmal.getLife() <= 0 && player.getLife() <= 0)) {
            yekmal.setlife(100);
            player.setlife(100);

            VictoryYekmal victoryYekmal = new VictoryYekmal();
            this.dispose();
            victoryYekmal.setVisible(true);
        } else if (yekmal.getLife() > 0 && player.getLife() <= 0) {
            yekmal.setlife(100);
            player.setlife(100);

            DefeatYekmal defeatYekmal = new DefeatYekmal();
            this.dispose();
            defeatYekmal.setVisible(true);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        SwordGif swordGif = new SwordGif();
        swordGif.setVisible(true);

        yekmal.setlife(CheckGame.baseAttack(player.getBaseAttack(), yekmal.getLife()));
        System.out.println("vida: " + yekmal.getLife());
        RobotAttack.enamyAttack(yekmal.getName(), player);

        youLife.setText(Double.toString(player.getLife()));
        youPowerAttack.setText(Double.toString(player.getPowerAttack()));
        youLowerAttack.setText(Double.toString(player.getLowerAttack()));
        youRangedAttack.setText(Double.toString(player.getRangedAttack()));
        youBaseAttack.setText(Double.toString(player.getBaseAttack()));

        enemyLife.setText(Double.toString(yekmal.getLife()));
        enemyPowerAttack.setText(Double.toString(yekmal.getPowerAttack()));
        enemyLowerAttack.setText(Double.toString(yekmal.getLowerAttack()));
        enemyRangedAttack.setText(Double.toString(yekmal.getRangedAttack()));
        enemyBaseAttack.setText(Double.toString(yekmal.getBaseAttack()));

        if ((yekmal.getLife() <= 0) || (yekmal.getLife() <= 0 && player.getLife() <= 0)) {
            yekmal.setlife(100);
            player.setlife(100);

            VictoryYekmal victoryYekmal = new VictoryYekmal();
            this.dispose();
            victoryYekmal.setVisible(true);
        } else if (yekmal.getLife() > 0 && player.getLife() <= 0) {
            yekmal.setlife(100);
            player.setlife(100);

            DefeatYekmal defeatYekmal = new DefeatYekmal();
            this.dispose();
            defeatYekmal.setVisible(true);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        SwordGif swordGif = new SwordGif();
        swordGif.setVisible(true);

        yekmal.setlife(CheckGame.powerAttack(player.getPowerAttack(), yekmal.getLife()));
        System.out.println("vida: " + yekmal.getLife());
        RobotAttack.enamyAttack(yekmal.getName(), player);

        youLife.setText(Double.toString(player.getLife()));
        youPowerAttack.setText(Double.toString(player.getPowerAttack()));
        youLowerAttack.setText(Double.toString(player.getLowerAttack()));
        youRangedAttack.setText(Double.toString(player.getRangedAttack()));
        youBaseAttack.setText(Double.toString(player.getBaseAttack()));

        enemyLife.setText(Double.toString(yekmal.getLife()));
        enemyPowerAttack.setText(Double.toString(yekmal.getPowerAttack()));
        enemyLowerAttack.setText(Double.toString(yekmal.getLowerAttack()));
        enemyRangedAttack.setText(Double.toString(yekmal.getRangedAttack()));
        enemyBaseAttack.setText(Double.toString(yekmal.getBaseAttack()));

        if ((yekmal.getLife() <= 0) || (yekmal.getLife() <= 0 && player.getLife() <= 0)) {
            yekmal.setlife(100);
            player.setlife(100);

            VictoryYekmal victoryYekmal = new VictoryYekmal();
            this.dispose();
            victoryYekmal.setVisible(true);
        } else if (yekmal.getLife() > 0 && player.getLife() <= 0) {
            yekmal.setlife(100);
            player.setlife(100);

            DefeatYekmal defeatYekmal = new DefeatYekmal();
            this.dispose();
            defeatYekmal.setVisible(true);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel enemyBaseAttack;
    private javax.swing.JLabel enemyLife;
    private javax.swing.JLabel enemyLowerAttack;
    private javax.swing.JLabel enemyPowerAttack;
    private javax.swing.JLabel enemyRangedAttack;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel youBaseAttack;
    private javax.swing.JLabel youLife;
    private javax.swing.JLabel youLowerAttack;
    private javax.swing.JLabel youPowerAttack;
    private javax.swing.JLabel youRangedAttack;
    // End of variables declaration//GEN-END:variables
}
