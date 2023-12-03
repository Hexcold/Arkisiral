/**
 * @author hexcold || (@henrq.p)
 */
package view.playerVsPlayer;

import characters.players.Player01;
import characters.players.Player02;
import javax.swing.JOptionPane;
import logic.RobotAttack;

public class FilesPlayerVsPlayer extends javax.swing.JFrame {

    public Player01 player01;
    public Player02 player02;
    boolean errorsDetected;
    public static RobotAttack robotAttack = new RobotAttack();

    public FilesPlayerVsPlayer() {
        initComponents();
        
        player01 = new Player01("Player01", 100, 10, 15, 20, 30);
        player02 = new Player02("Player02", 100, 10, 15, 20, 30);
        errorsDetected = false;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        player01NameInput = new javax.swing.JTextField();
        player01PowerAttackInput = new javax.swing.JTextField();
        player01LifeInput = new javax.swing.JTextField();
        player01BaseAttackInput = new javax.swing.JTextField();
        player01LowerAttackInput = new javax.swing.JTextField();
        player01RangedAttackInput = new javax.swing.JTextField();
        player02NameInput = new javax.swing.JTextField();
        player02LifeInput = new javax.swing.JTextField();
        player02BaseAttackInput = new javax.swing.JTextField();
        player02LowerAttackInput = new javax.swing.JTextField();
        player02RangedAttackInput = new javax.swing.JTextField();
        player02PowerAttackInput = new javax.swing.JTextField();
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

        player01NameInput.setText("Name");
        player01NameInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                player01NameInputActionPerformed(evt);
            }
        });
        getContentPane().add(player01NameInput);
        player01NameInput.setBounds(320, 140, 110, 22);

        player01PowerAttackInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                player01PowerAttackInputActionPerformed(evt);
            }
        });
        getContentPane().add(player01PowerAttackInput);
        player01PowerAttackInput.setBounds(420, 340, 110, 22);

        player01LifeInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                player01LifeInputActionPerformed(evt);
            }
        });
        getContentPane().add(player01LifeInput);
        player01LifeInput.setBounds(320, 200, 110, 22);

        player01BaseAttackInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                player01BaseAttackInputActionPerformed(evt);
            }
        });
        getContentPane().add(player01BaseAttackInput);
        player01BaseAttackInput.setBounds(320, 240, 110, 22);

        player01LowerAttackInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                player01LowerAttackInputActionPerformed(evt);
            }
        });
        getContentPane().add(player01LowerAttackInput);
        player01LowerAttackInput.setBounds(430, 280, 110, 22);

        player01RangedAttackInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                player01RangedAttackInputActionPerformed(evt);
            }
        });
        getContentPane().add(player01RangedAttackInput);
        player01RangedAttackInput.setBounds(420, 310, 110, 22);

        player02NameInput.setText("Name");
        player02NameInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                player02NameInputActionPerformed(evt);
            }
        });
        getContentPane().add(player02NameInput);
        player02NameInput.setBounds(660, 130, 110, 22);

        player02LifeInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                player02LifeInputActionPerformed(evt);
            }
        });
        getContentPane().add(player02LifeInput);
        player02LifeInput.setBounds(660, 190, 110, 22);

        player02BaseAttackInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                player02BaseAttackInputActionPerformed(evt);
            }
        });
        getContentPane().add(player02BaseAttackInput);
        player02BaseAttackInput.setBounds(660, 230, 110, 22);

        player02LowerAttackInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                player02LowerAttackInputActionPerformed(evt);
            }
        });
        getContentPane().add(player02LowerAttackInput);
        player02LowerAttackInput.setBounds(770, 270, 110, 22);

        player02RangedAttackInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                player02RangedAttackInputActionPerformed(evt);
            }
        });
        getContentPane().add(player02RangedAttackInput);
        player02RangedAttackInput.setBounds(760, 300, 110, 22);

        player02PowerAttackInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                player02PowerAttackInputActionPerformed(evt);
            }
        });
        getContentPane().add(player02PowerAttackInput);
        player02PowerAttackInput.setBounds(760, 330, 110, 22);

        backgroud.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/playervsplayer/backgroundPlayerVsPlayer.png"))); // NOI18N
        backgroud.setText("jLabel1");
        getContentPane().add(backgroud);
        backgroud.setBounds(0, 0, 1020, 500);

        setSize(new java.awt.Dimension(1033, 506));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (player01NameInput.getText().trim().isEmpty()) {
            System.err.println("Fail: Campo de Name do Player 01 não preenchido");
            JOptionPane.showMessageDialog(null, "Fail: Preencha o campo de Name do Player 01");
            errorsDetected = true;
        } else {
            try {
                player01.setName(player01NameInput.getText());
            } catch (NumberFormatException e) {
                System.err.println("Fail: Não foi possível setar o Name do Player 01.");
                JOptionPane.showMessageDialog(null, "Fail: Não foi possível setar o Name do Player 01.");
                errorsDetected = true;
            }
        }

        if (player01LifeInput.getText().trim().isEmpty()) {
            System.err.println("Fail: Campo de Life do Player 01 não preenchido");
            JOptionPane.showMessageDialog(null, "Fail: Preencha o campo de Life do Player 01");
            errorsDetected = true;
        } else {
            try {
                player01.setlife(Double.parseDouble(player01LifeInput.getText()));
            } catch (NumberFormatException e) {
                System.err.println("Fail: Só é aceito caracteres numéricos no campo de Life do Player 01.");
                JOptionPane.showMessageDialog(null, "Fail: Só é aceito caracteres numéricos no campo de Life do Player 01.");
                errorsDetected = true;
            }
        }

        if (player01BaseAttackInput.getText().trim().isEmpty()) {
            System.err.println("Fail: Campo de Spab do Player 01 não preenchido");
            JOptionPane.showMessageDialog(null, "Fail: Preencha o campo de Spab do Player 01");
            errorsDetected = true;
        } else {
            try {
                player01.setBaseAttack(Double.parseDouble(player01BaseAttackInput.getText()));
            } catch (NumberFormatException e) {
                System.err.println("Fail: Só é aceito caracteres numéricos no campo de Spab do Player 01");
                JOptionPane.showMessageDialog(null, "Fail: Só é aceito caracteres numéricos no campo de Spab do Player 01");
                errorsDetected = true;
            }
        }

        if (player01LowerAttackInput.getText().trim().isEmpty()) {
            System.err.println("Fail: Campo de Sword Sprike do Player 01 não preenchido");
            JOptionPane.showMessageDialog(null, "Fail: Preencha o campo de Sword Sprike do Player 01");
            errorsDetected = true;
        } else {
            try {
                player01.setLowerAttack(Double.parseDouble(player01LowerAttackInput.getText()));
            } catch (NumberFormatException e) {
                System.err.println("Fail: Só são aceitos caracteres numéricos no campo de Sword Sprike do Player 01");
                JOptionPane.showMessageDialog(null, "Fail: Só são aceitos caracteres numéricos no campo de Sword Sprike do Player 01");
                errorsDetected = true;
            }
        }

        if (player01RangedAttackInput.getText().trim().isEmpty()) {
            System.err.println("Fail: Campo de Blade Thorow do Player 01 não preenchido");
            JOptionPane.showMessageDialog(null, "Fail: Preencha o campo de Blade Thorow do Player 01");
            errorsDetected = true;
        } else {
            try {
                player01.setRangedAttack(Double.parseDouble(player01RangedAttackInput.getText()));
            } catch (NumberFormatException e) {
                System.err.println("Fail: Só são aceitos caracteres numéricos no campo de Blade Thorow do Player 01");
                JOptionPane.showMessageDialog(null, "Fail: Só são aceitos caracteres numéricos no campo de Blade Thorow do Player 01");
                errorsDetected = true;
            }
        }

        if (player01PowerAttackInput.getText().trim().isEmpty()) {
            System.err.println("Fail: Campo de Power Blade do Player 01 não preenchido");
            JOptionPane.showMessageDialog(null, "Fail: Preencha o campo de Power Blade do Player 01");
            errorsDetected = true;
        } else {
            try {
                player01.setPowerAttack(Double.parseDouble(player01PowerAttackInput.getText()));
            } catch (NumberFormatException e) {
                System.err.println("Fail: Só são aceitos caracteres numéricos no campo de Power Blade do Player 01");
                JOptionPane.showMessageDialog(null, "Fail: Só são aceitos caracteres numéricos no campo de Power Blade do Player 01");
                errorsDetected = true;
            }
        }

        if (player02NameInput.getText().trim().isEmpty()) {
            System.err.println("Fail: Campo de Name do Player 02 não preenchido");
            JOptionPane.showMessageDialog(null, "Fail: Preencha o campo de Name do Player 02");
            errorsDetected = true;
        } else {
            try {
                player02.setName(player02NameInput.getText());
            } catch (NumberFormatException e) {
                System.err.println("Fail: Não foi possível setar o Name do Player 02.");
                JOptionPane.showMessageDialog(null, "Fail: Não foi possível setar o Name do Player 02.");
                errorsDetected = true;
            }
        }

        if (player02LifeInput.getText().trim().isEmpty()) {
            System.err.println("Fail: Campo de Life do Player 02 não preenchido");
            JOptionPane.showMessageDialog(null, "Fail: Preencha o campo de Life do Player 02");
            errorsDetected = true;
        } else {
            try {
                player02.setlife(Double.parseDouble(player02LifeInput.getText()));
            } catch (NumberFormatException e) {
                System.err.println("Fail: Só é aceito caracteres numéricos no campo de Life do Player 02.");
                JOptionPane.showMessageDialog(null, "Fail: Só é aceito caracteres numéricos no campo de Life do Player 02.");
                errorsDetected = true;
            }
        }

        if (player02BaseAttackInput.getText().trim().isEmpty()) {
            System.err.println("Fail: Campo de Spab do Player 02 não preenchido");
            JOptionPane.showMessageDialog(null, "Fail: Preencha o campo de Spab do Player 02");
            errorsDetected = true;
        } else {
            try {
                player02.setBaseAttack(Double.parseDouble(player02BaseAttackInput.getText()));
            } catch (NumberFormatException e) {
                System.err.println("Fail: Só é aceito caracteres numéricos no campo de Spab do Player 02");
                JOptionPane.showMessageDialog(null, "Fail: Só é aceito caracteres numéricos no campo de Spab do Player 02");
                errorsDetected = true;
            }
        }

        if (player02LowerAttackInput.getText().trim().isEmpty()) {
            System.err.println("Fail: Campo de Sword Sprike do Player 02 não preenchido");
            JOptionPane.showMessageDialog(null, "Fail: Preencha o campo de Sword Sprike do Player 02");
            errorsDetected = true;
        } else {
            try {
                player02.setLowerAttack(Double.parseDouble(player02LowerAttackInput.getText()));
            } catch (NumberFormatException e) {
                System.err.println("Fail: Só são aceitos caracteres numéricos no campo de Sword Sprike do Player 02");
                JOptionPane.showMessageDialog(null, "Fail: Só são aceitos caracteres numéricos no campo de Sword Sprike do Player 02");
                errorsDetected = true;
            }
        }

        if (player02RangedAttackInput.getText().trim().isEmpty()) {
            System.err.println("Fail: Campo de Blade Thorow do Player 02 não preenchido");
            JOptionPane.showMessageDialog(null, "Fail: Preencha o campo de Blade Thorow do Player 02");
            errorsDetected = true;
        } else {
            try {
                player02.setRangedAttack(Double.parseDouble(player02RangedAttackInput.getText()));
            } catch (NumberFormatException e) {
                System.err.println("Fail: Só são aceitos caracteres numéricos no campo de Blade Thorow do Player 02");
                JOptionPane.showMessageDialog(null, "Fail: Só são aceitos caracteres numéricos no campo de Blade Thorow do Player 02");
                errorsDetected = true;
            }
        }

        if (player02PowerAttackInput.getText().trim().isEmpty()) {
            System.err.println("Fail: Campo de Power Blade do Player 02 não preenchido");
            JOptionPane.showMessageDialog(null, "Fail: Preencha o campo de Power Blade do Player 02");
            errorsDetected = true;
        } else {
            try {
                player02.setPowerAttack(Double.parseDouble(player02PowerAttackInput.getText()));
            } catch (NumberFormatException e) {
                System.err.println("Fail: Só são aceitos caracteres numéricos no campo de Power Blade do Player 02");
                JOptionPane.showMessageDialog(null, "Fail: Só são aceitos caracteres numéricos no campo de Power Blade do Player 02");
                errorsDetected = true;
            }
        }

        if (!errorsDetected) { // Aqui você pode verificar se todos os campos estão preenchidos corretamente
            BattlePlayerVsPlayer battleplayerVsPlayer = new BattlePlayerVsPlayer(player01, player02);
            this.dispose();
            battleplayerVsPlayer.setVisible(true);
        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void player01LifeInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_player01LifeInputActionPerformed

    }//GEN-LAST:event_player01LifeInputActionPerformed

    private void player01PowerAttackInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_player01PowerAttackInputActionPerformed

    }//GEN-LAST:event_player01PowerAttackInputActionPerformed

    private void player01BaseAttackInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_player01BaseAttackInputActionPerformed

    }//GEN-LAST:event_player01BaseAttackInputActionPerformed

    private void player01LowerAttackInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_player01LowerAttackInputActionPerformed

    }//GEN-LAST:event_player01LowerAttackInputActionPerformed

    private void player01RangedAttackInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_player01RangedAttackInputActionPerformed

    }//GEN-LAST:event_player01RangedAttackInputActionPerformed

    private void player01NameInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_player01NameInputActionPerformed

    }//GEN-LAST:event_player01NameInputActionPerformed

    private void player02NameInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_player02NameInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_player02NameInputActionPerformed

    private void player02LifeInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_player02LifeInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_player02LifeInputActionPerformed

    private void player02BaseAttackInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_player02BaseAttackInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_player02BaseAttackInputActionPerformed

    private void player02LowerAttackInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_player02LowerAttackInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_player02LowerAttackInputActionPerformed

    private void player02RangedAttackInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_player02RangedAttackInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_player02RangedAttackInputActionPerformed

    private void player02PowerAttackInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_player02PowerAttackInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_player02PowerAttackInputActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backgroud;
    private javax.swing.JButton jButton1;
    private javax.swing.JTextField player01BaseAttackInput;
    private javax.swing.JTextField player01LifeInput;
    private javax.swing.JTextField player01LowerAttackInput;
    private javax.swing.JTextField player01NameInput;
    private javax.swing.JTextField player01PowerAttackInput;
    private javax.swing.JTextField player01RangedAttackInput;
    private javax.swing.JTextField player02BaseAttackInput;
    private javax.swing.JTextField player02LifeInput;
    private javax.swing.JTextField player02LowerAttackInput;
    private javax.swing.JTextField player02NameInput;
    private javax.swing.JTextField player02PowerAttackInput;
    private javax.swing.JTextField player02RangedAttackInput;
    // End of variables declaration//GEN-END:variables
}
