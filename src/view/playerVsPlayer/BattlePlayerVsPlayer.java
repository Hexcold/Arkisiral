/**
 * @author hexcold || (@henrq.p)
 */
package view.playerVsPlayer;

import characters.players.Player; 
import view.playerVsPlayer.victory.VictoryPlayer01;
import view.playerVsPlayer.victory.VictoryPlayer02;
import characters.players.Player01;
import characters.players.Player02;
import logic.Game;
import view.battle.gif.SwordGif;
import view.playerVsPlayer.draw.DrawPlayerVsPlayer;

public class BattlePlayerVsPlayer extends javax.swing.JFrame {

    public Player01 player01;
    public Player02 player02;

    public BattlePlayerVsPlayer(Player p01, Player p02) {
        initComponents();

        player01 = new Player01(p01.getName(), p01.getLife(), p01.getBaseAttack(), p01.getLowerAttack(), p01.getRangedAttack(), p01.getPowerAttack());
        player02 = new Player02(p02.getName(), p02.getLife(), p02.getBaseAttack(), p02.getLowerAttack(), p02.getRangedAttack(), p02.getPowerAttack());
        
        player01Name.setText(player01.getName());
        player01Life.setText(Double.toString(player01.getLife()));
        player01PowerAttack.setText(Double.toString(player01.getPowerAttack()));
        player01LowerAttack.setText(Double.toString(player01.getLowerAttack()));
        player01RangedAttack.setText(Double.toString(player01.getRangedAttack()));
        player01BaseAttack.setText(Double.toString(player01.getBaseAttack()));

        
        player02Name.setText(player01.getName());
        player02Life.setText(Double.toString(player02.getLife()));
        player02PowerAttack.setText(Double.toString(player02.getPowerAttack()));
        player02LowerAttack.setText(Double.toString(player02.getLowerAttack()));
        player02RangedAttack.setText(Double.toString(player02.getRangedAttack()));
        player02BaseAttack.setText(Double.toString(player02.getBaseAttack()));
        
        if (player01.getLife() > 0 && player02.getLife() <= 0) {
            VictoryPlayer01 victoryPlayer01 = new VictoryPlayer01(player01);
            this.dispose();
            victoryPlayer01.setVisible(true);
        } else if (player01.getLife() <= 0 && player02.getLife() > 0) {
            VictoryPlayer02 victoryPlayer02 = new VictoryPlayer02(player02);
            this.dispose();
            victoryPlayer02.setVisible(true);
        } else if (player01.getLife() <= 0 && player02.getLife() <= 0) {
            DrawPlayerVsPlayer drawPlayerVsPlayer = new DrawPlayerVsPlayer();
            this.dispose();
            drawPlayerVsPlayer.setVisible(true);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonSwordStrikePlayer01 = new javax.swing.JButton();
        buttonBladeThrowPlayer01 = new javax.swing.JButton();
        buttonPowerBladePlayer01 = new javax.swing.JButton();
        buttonSpabPlayer01 = new javax.swing.JButton();
        buttonSwordStrikePlayer02 = new javax.swing.JButton();
        buttonPowerBladePlayer02 = new javax.swing.JButton();
        buttonBladeThrowPlayer02 = new javax.swing.JButton();
        buttonSpabPlayer02 = new javax.swing.JButton();
        player02Name = new javax.swing.JLabel();
        player01Name = new javax.swing.JLabel();
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

        buttonSwordStrikePlayer01.setText("SWORD STRIKE");
        buttonSwordStrikePlayer01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSwordStrikePlayer01ActionPerformed(evt);
            }
        });
        getContentPane().add(buttonSwordStrikePlayer01);
        buttonSwordStrikePlayer01.setBounds(20, 370, 120, 40);

        buttonBladeThrowPlayer01.setText("BLADE THROW");
        buttonBladeThrowPlayer01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBladeThrowPlayer01ActionPerformed(evt);
            }
        });
        getContentPane().add(buttonBladeThrowPlayer01);
        buttonBladeThrowPlayer01.setBounds(150, 370, 120, 40);

        buttonPowerBladePlayer01.setText("POWER BLADE");
        buttonPowerBladePlayer01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPowerBladePlayer01ActionPerformed(evt);
            }
        });
        getContentPane().add(buttonPowerBladePlayer01);
        buttonPowerBladePlayer01.setBounds(90, 420, 120, 40);

        buttonSpabPlayer01.setText("SPAB");
        buttonSpabPlayer01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSpabPlayer01ActionPerformed(evt);
            }
        });
        getContentPane().add(buttonSpabPlayer01);
        buttonSpabPlayer01.setBounds(90, 320, 120, 40);

        buttonSwordStrikePlayer02.setText("SWORD STRIKE");
        buttonSwordStrikePlayer02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSwordStrikePlayer02ActionPerformed(evt);
            }
        });
        getContentPane().add(buttonSwordStrikePlayer02);
        buttonSwordStrikePlayer02.setBounds(760, 60, 120, 40);

        buttonPowerBladePlayer02.setText("POWER BLADE");
        buttonPowerBladePlayer02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPowerBladePlayer02ActionPerformed(evt);
            }
        });
        getContentPane().add(buttonPowerBladePlayer02);
        buttonPowerBladePlayer02.setBounds(830, 110, 120, 40);

        buttonBladeThrowPlayer02.setText("BLADE THROW");
        buttonBladeThrowPlayer02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBladeThrowPlayer02ActionPerformed(evt);
            }
        });
        getContentPane().add(buttonBladeThrowPlayer02);
        buttonBladeThrowPlayer02.setBounds(890, 60, 120, 40);

        buttonSpabPlayer02.setText("SPAB");
        buttonSpabPlayer02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSpabPlayer02ActionPerformed(evt);
            }
        });
        getContentPane().add(buttonSpabPlayer02);
        buttonSpabPlayer02.setBounds(830, 10, 120, 40);

        player02Name.setFont(new java.awt.Font("Samurai", 0, 24)); // NOI18N
        player02Name.setText("PLayer02");
        getContentPane().add(player02Name);
        player02Name.setBounds(620, 110, 210, 60);

        player01Name.setFont(new java.awt.Font("Samurai", 0, 24)); // NOI18N
        player01Name.setText("jLabel1");
        getContentPane().add(player01Name);
        player01Name.setBounds(300, 120, 210, 60);

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

    private void buttonSwordStrikePlayer01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSwordStrikePlayer01ActionPerformed
        SwordGif swordGif = new SwordGif();
        swordGif.setVisible(true);
        
        player02.setlife(Game.lowerAttack(player01.getLowerAttack(), player02.getLife()));
        System.out.println("vida: " + player02.getLife());

        player01Life.setText(Double.toString(player01.getLife()));
        player01PowerAttack.setText(Double.toString(player01.getPowerAttack()));
        player01LowerAttack.setText(Double.toString(player01.getLowerAttack()));
        player01RangedAttack.setText(Double.toString(player01.getRangedAttack()));
        player01BaseAttack.setText(Double.toString(player01.getBaseAttack()));

        player02Life.setText(Double.toString(player02.getLife()));
        player02PowerAttack.setText(Double.toString(player02.getPowerAttack()));
        player02LowerAttack.setText(Double.toString(player02.getLowerAttack()));
        player02RangedAttack.setText(Double.toString(player02.getRangedAttack()));
        player02BaseAttack.setText(Double.toString(player02.getBaseAttack()));
        
        if (player01.getLife() > 0 && player02.getLife() <= 0) {
            VictoryPlayer01 victoryPlayer01 = new VictoryPlayer01(player01);
            this.dispose();
            victoryPlayer01.setVisible(true);
        } else if (player01.getLife() <= 0 && player02.getLife() > 0) {
            VictoryPlayer02 victoryPlayer02 = new VictoryPlayer02(player02);
            this.dispose();
            victoryPlayer02.setVisible(true);
        } else if (player01.getLife() <= 0 && player02.getLife() <= 0) {
            DrawPlayerVsPlayer drawPlayerVsPlayer = new DrawPlayerVsPlayer();
            this.dispose();
            drawPlayerVsPlayer.setVisible(true);
        }
    }//GEN-LAST:event_buttonSwordStrikePlayer01ActionPerformed

    private void buttonBladeThrowPlayer01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBladeThrowPlayer01ActionPerformed
        SwordGif swordGif = new SwordGif();
        swordGif.setVisible(true);
        
        player02.setlife(Game.rangedAttack(player01.getRangedAttack(), player02.getLife()));
        System.out.println("vida: " + player02.getLife());

        player01Life.setText(Double.toString(player01.getLife()));
        player01PowerAttack.setText(Double.toString(player01.getPowerAttack()));
        player01LowerAttack.setText(Double.toString(player01.getLowerAttack()));
        player01RangedAttack.setText(Double.toString(player01.getRangedAttack()));
        player01BaseAttack.setText(Double.toString(player01.getBaseAttack()));

        player02Life.setText(Double.toString(player02.getLife()));
        player02PowerAttack.setText(Double.toString(player02.getPowerAttack()));
        player02LowerAttack.setText(Double.toString(player02.getLowerAttack()));
        player02RangedAttack.setText(Double.toString(player02.getRangedAttack()));
        player02BaseAttack.setText(Double.toString(player02.getBaseAttack()));
        
        
        if (player01.getLife() > 0 && player02.getLife() <= 0) {
            VictoryPlayer01 victoryPlayer01 = new VictoryPlayer01(player01);
            this.dispose();
            victoryPlayer01.setVisible(true);
        } else if (player01.getLife() <= 0 && player02.getLife() > 0) {
            VictoryPlayer02 victoryPlayer02 = new VictoryPlayer02(player02);
            this.dispose();
            victoryPlayer02.setVisible(true);
        } else if (player01.getLife() <= 0 && player02.getLife() <= 0) {
            DrawPlayerVsPlayer drawPlayerVsPlayer = new DrawPlayerVsPlayer();
            this.dispose();
            drawPlayerVsPlayer.setVisible(true);
        }
    }//GEN-LAST:event_buttonBladeThrowPlayer01ActionPerformed

    private void buttonPowerBladePlayer01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPowerBladePlayer01ActionPerformed
        SwordGif swordGif = new SwordGif();
        swordGif.setVisible(true);
        
        player02.setlife(Game.powerAttack(player01.getPowerAttack(), player02.getLife()));
        System.out.println("vida: " + player02.getLife()); 

        player01Life.setText(Double.toString(player01.getLife()));
        player01PowerAttack.setText(Double.toString(player01.getPowerAttack()));
        player01LowerAttack.setText(Double.toString(player01.getLowerAttack()));
        player01RangedAttack.setText(Double.toString(player01.getRangedAttack()));
        player01BaseAttack.setText(Double.toString(player01.getBaseAttack()));

        player02Life.setText(Double.toString(player02.getLife()));
        player02PowerAttack.setText(Double.toString(player02.getPowerAttack()));
        player02LowerAttack.setText(Double.toString(player02.getLowerAttack()));
        player02RangedAttack.setText(Double.toString(player02.getRangedAttack()));
        player02BaseAttack.setText(Double.toString(player02.getBaseAttack()));
        
        
        if (player01.getLife() > 0 && player02.getLife() <= 0) {
            VictoryPlayer01 victoryPlayer01 = new VictoryPlayer01(player01);
            this.dispose();
            victoryPlayer01.setVisible(true);
        } else if (player01.getLife() <= 0 && player02.getLife() > 0) {
            VictoryPlayer02 victoryPlayer02 = new VictoryPlayer02(player02);
            this.dispose();
            victoryPlayer02.setVisible(true);
        } else if (player01.getLife() <= 0 && player02.getLife() <= 0) {
            DrawPlayerVsPlayer drawPlayerVsPlayer = new DrawPlayerVsPlayer();
            this.dispose();
            drawPlayerVsPlayer.setVisible(true);
        }
    }//GEN-LAST:event_buttonPowerBladePlayer01ActionPerformed

    private void buttonSpabPlayer01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSpabPlayer01ActionPerformed
        SwordGif swordGif = new SwordGif();
        swordGif.setVisible(true);
        
        player02.setlife(Game.baseAttack(player01.getBaseAttack(), player02.getLife()));
        System.out.println("vida: " + player02.getLife());

        player01Life.setText(Double.toString(player01.getLife()));
        player01PowerAttack.setText(Double.toString(player01.getPowerAttack()));
        player01LowerAttack.setText(Double.toString(player01.getLowerAttack()));
        player01RangedAttack.setText(Double.toString(player01.getRangedAttack()));
        player01BaseAttack.setText(Double.toString(player01.getBaseAttack()));

        player02Life.setText(Double.toString(player02.getLife()));
        player02PowerAttack.setText(Double.toString(player02.getPowerAttack()));
        player02LowerAttack.setText(Double.toString(player02.getLowerAttack()));
        player02RangedAttack.setText(Double.toString(player02.getRangedAttack()));
        player02BaseAttack.setText(Double.toString(player02.getBaseAttack()));
        
        
        if (player01.getLife() > 0 && player02.getLife() <= 0) {
            VictoryPlayer01 victoryPlayer01 = new VictoryPlayer01(player01);
            this.dispose();
            victoryPlayer01.setVisible(true);
        } else if (player01.getLife() <= 0 && player02.getLife() > 0) {
            VictoryPlayer02 victoryPlayer02 = new VictoryPlayer02(player02);
            this.dispose();
            victoryPlayer02.setVisible(true);
        } else if (player01.getLife() <= 0 && player02.getLife() <= 0) {
            DrawPlayerVsPlayer drawPlayerVsPlayer = new DrawPlayerVsPlayer();
            this.dispose();
            drawPlayerVsPlayer.setVisible(true);
        }
    }//GEN-LAST:event_buttonSpabPlayer01ActionPerformed

    private void buttonSwordStrikePlayer02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSwordStrikePlayer02ActionPerformed
        SwordGif swordGif = new SwordGif();
        swordGif.setVisible(true);
        
        player01.setlife(Game.lowerAttack(player02.getLowerAttack(), player01.getLife()));
        System.out.println("vida: " + player01.getLife());

        player02Life.setText(Double.toString(player02.getLife()));
        player02PowerAttack.setText(Double.toString(player02.getPowerAttack()));
        player02LowerAttack.setText(Double.toString(player02.getLowerAttack()));
        player02RangedAttack.setText(Double.toString(player02.getRangedAttack()));
        player02BaseAttack.setText(Double.toString(player02.getBaseAttack()));

        player01Life.setText(Double.toString(player01.getLife()));
        player01PowerAttack.setText(Double.toString(player01.getPowerAttack()));
        player01LowerAttack.setText(Double.toString(player01.getLowerAttack()));
        player01RangedAttack.setText(Double.toString(player01.getRangedAttack()));
        player01BaseAttack.setText(Double.toString(player01.getBaseAttack()));
        
        
        if (player01.getLife() > 0 && player02.getLife() <= 0) {
            VictoryPlayer01 victoryPlayer01 = new VictoryPlayer01(player01);
            this.dispose();
            victoryPlayer01.setVisible(true);
        } else if (player01.getLife() <= 0 && player02.getLife() > 0) {
            VictoryPlayer02 victoryPlayer02 = new VictoryPlayer02(player02);
            this.dispose();
            victoryPlayer02.setVisible(true);
        } else if (player01.getLife() <= 0 && player02.getLife() <= 0) {
            DrawPlayerVsPlayer drawPlayerVsPlayer = new DrawPlayerVsPlayer();
            this.dispose();
            drawPlayerVsPlayer.setVisible(true);
        }
    }//GEN-LAST:event_buttonSwordStrikePlayer02ActionPerformed

    private void buttonPowerBladePlayer02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPowerBladePlayer02ActionPerformed
        SwordGif swordGif = new SwordGif();
        swordGif.setVisible(true);
        
        player01.setlife(Game.powerAttack(player02.getPowerAttack(), player01.getLife()));
        System.out.println("vida: " + player01.getLife());

        player02Life.setText(Double.toString(player02.getLife()));
        player02PowerAttack.setText(Double.toString(player02.getPowerAttack()));
        player02LowerAttack.setText(Double.toString(player02.getLowerAttack()));
        player02RangedAttack.setText(Double.toString(player02.getRangedAttack()));
        player02BaseAttack.setText(Double.toString(player02.getBaseAttack()));

        player01Life.setText(Double.toString(player01.getLife()));
        player01PowerAttack.setText(Double.toString(player01.getPowerAttack()));
        player01LowerAttack.setText(Double.toString(player01.getLowerAttack()));
        player01RangedAttack.setText(Double.toString(player01.getRangedAttack()));
        player01BaseAttack.setText(Double.toString(player01.getBaseAttack()));

        
        if (player01.getLife() > 0 && player02.getLife() <= 0) {
            VictoryPlayer01 victoryPlayer01 = new VictoryPlayer01(player01);
            this.dispose();
            victoryPlayer01.setVisible(true);
        } else if (player01.getLife() <= 0 && player02.getLife() > 0) {
            VictoryPlayer02 victoryPlayer02 = new VictoryPlayer02(player02);
            this.dispose();
            victoryPlayer02.setVisible(true);
        } else if (player01.getLife() <= 0 && player02.getLife() <= 0) {
            DrawPlayerVsPlayer drawPlayerVsPlayer = new DrawPlayerVsPlayer();
            this.dispose();
            drawPlayerVsPlayer.setVisible(true);
        }
    }//GEN-LAST:event_buttonPowerBladePlayer02ActionPerformed

    private void buttonBladeThrowPlayer02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBladeThrowPlayer02ActionPerformed
        SwordGif swordGif = new SwordGif();
        swordGif.setVisible(true);
        
        player01.setlife(Game.rangedAttack(player02.getRangedAttack(), player01.getLife()));
        System.out.println("vida: " + player01.getLife());

        player02Life.setText(Double.toString(player02.getLife()));
        player02PowerAttack.setText(Double.toString(player02.getPowerAttack()));
        player02LowerAttack.setText(Double.toString(player02.getLowerAttack()));
        player02RangedAttack.setText(Double.toString(player02.getRangedAttack()));
        player02BaseAttack.setText(Double.toString(player02.getBaseAttack()));

        player01Life.setText(Double.toString(player01.getLife()));
        player01PowerAttack.setText(Double.toString(player01.getPowerAttack()));
        player01LowerAttack.setText(Double.toString(player01.getLowerAttack()));
        player01RangedAttack.setText(Double.toString(player01.getRangedAttack()));
        player01BaseAttack.setText(Double.toString(player01.getBaseAttack()));
        
        if (player01.getLife() > 0 && player02.getLife() <= 0) {
            VictoryPlayer01 victoryPlayer01 = new VictoryPlayer01(player01);
            this.dispose();
            victoryPlayer01.setVisible(true);
        } else if (player01.getLife() <= 0 && player02.getLife() > 0) {
            VictoryPlayer02 victoryPlayer02 = new VictoryPlayer02(player02);
            this.dispose();
            victoryPlayer02.setVisible(true);
        } else if (player01.getLife() <= 0 && player02.getLife() <= 0) {
            DrawPlayerVsPlayer drawPlayerVsPlayer = new DrawPlayerVsPlayer();
            this.dispose();
            drawPlayerVsPlayer.setVisible(true);
        }
    }//GEN-LAST:event_buttonBladeThrowPlayer02ActionPerformed

    private void buttonSpabPlayer02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSpabPlayer02ActionPerformed
        SwordGif swordGif = new SwordGif();
        swordGif.setVisible(true);
        
        player01.setlife(Game.powerAttack(player02.getPowerAttack(), player01.getLife()));
        System.out.println("vida: " + player01.getLife());

        player02Life.setText(Double.toString(player02.getLife()));
        player02PowerAttack.setText(Double.toString(player02.getPowerAttack()));
        player02LowerAttack.setText(Double.toString(player02.getLowerAttack()));
        player02RangedAttack.setText(Double.toString(player02.getRangedAttack()));
        player02BaseAttack.setText(Double.toString(player02.getBaseAttack()));

        player01Life.setText(Double.toString(player01.getLife()));
        player01PowerAttack.setText(Double.toString(player01.getPowerAttack()));
        player01LowerAttack.setText(Double.toString(player01.getLowerAttack()));
        player01RangedAttack.setText(Double.toString(player01.getRangedAttack()));
        player01BaseAttack.setText(Double.toString(player01.getBaseAttack()));
        
        if (player01.getLife() > 0 && player02.getLife() <= 0) {
            VictoryPlayer01 victoryPlayer01 = new VictoryPlayer01(player01);
            this.dispose();
            victoryPlayer01.setVisible(true);
        } else if (player01.getLife() <= 0 && player02.getLife() > 0) {
            VictoryPlayer02 victoryPlayer02 = new VictoryPlayer02(player02);
            this.dispose();
            victoryPlayer02.setVisible(true);
        } else if (player01.getLife() <= 0 && player02.getLife() <= 0) {
            DrawPlayerVsPlayer drawPlayerVsPlayer = new DrawPlayerVsPlayer();
            this.dispose();
            drawPlayerVsPlayer.setVisible(true);
        }
    }//GEN-LAST:event_buttonSpabPlayer02ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backgroud;
    private javax.swing.JButton buttonBladeThrowPlayer01;
    private javax.swing.JButton buttonBladeThrowPlayer02;
    private javax.swing.JButton buttonPowerBladePlayer01;
    private javax.swing.JButton buttonPowerBladePlayer02;
    private javax.swing.JButton buttonSpabPlayer01;
    private javax.swing.JButton buttonSpabPlayer02;
    private javax.swing.JButton buttonSwordStrikePlayer01;
    private javax.swing.JButton buttonSwordStrikePlayer02;
    private javax.swing.JLabel player01BaseAttack;
    private javax.swing.JLabel player01Life;
    private javax.swing.JLabel player01LowerAttack;
    private javax.swing.JLabel player01Name;
    private javax.swing.JLabel player01PowerAttack;
    private javax.swing.JLabel player01RangedAttack;
    private javax.swing.JLabel player02BaseAttack;
    private javax.swing.JLabel player02Life;
    private javax.swing.JLabel player02LowerAttack;
    private javax.swing.JLabel player02Name;
    private javax.swing.JLabel player02PowerAttack;
    private javax.swing.JLabel player02RangedAttack;
    // End of variables declaration//GEN-END:variables
}
