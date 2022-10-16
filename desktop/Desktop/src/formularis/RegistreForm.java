/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formularis;

import java.awt.Color;
import javax.swing.ImageIcon;

/**
 *
 * @author Dapau69
 */
public class RegistreForm extends javax.swing.JFrame {

    /**
     * Creates new form RegistreForm
     */
    public RegistreForm() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("../images/logo.png")).getImage());
        this.setLocationRelativeTo(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        registreForm = new javax.swing.JLabel();
        tornarPanel = new javax.swing.JPanel();
        tornarLabel = new javax.swing.JLabel();
        desarPanel = new javax.swing.JPanel();
        desarLabel = new javax.swing.JLabel();
        usuariLabel = new javax.swing.JLabel();
        usuariTextField = new javax.swing.JTextField();
        nomSeparator = new javax.swing.JSeparator();
        passSeparator = new javax.swing.JSeparator();
        passLabel = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(144, 164, 174));

        registreForm.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        registreForm.setText("REGISTRE");

        tornarPanel.setBackground(new java.awt.Color(0, 134, 190));
        tornarPanel.setFont(new java.awt.Font("Rockwell Condensed", 0, 14)); // NOI18N
        tornarPanel.setName(""); // NOI18N

        tornarLabel.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        tornarLabel.setForeground(new java.awt.Color(255, 255, 255));
        tornarLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tornarLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/previous.png"))); // NOI18N
        tornarLabel.setText("TORNAR");
        tornarLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tornarLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tornarLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tornarLabelMouseExited(evt);
            }
        });

        javax.swing.GroupLayout tornarPanelLayout = new javax.swing.GroupLayout(tornarPanel);
        tornarPanel.setLayout(tornarPanelLayout);
        tornarPanelLayout.setHorizontalGroup(
            tornarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tornarPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(tornarLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(116, 116, 116))
        );
        tornarPanelLayout.setVerticalGroup(
            tornarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tornarPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(tornarLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        desarPanel.setBackground(new java.awt.Color(0, 134, 190));
        desarPanel.setFont(new java.awt.Font("Rockwell Condensed", 0, 14)); // NOI18N
        desarPanel.setName(""); // NOI18N

        desarLabel.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        desarLabel.setForeground(new java.awt.Color(255, 255, 255));
        desarLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        desarLabel.setText("DESAR");
        desarLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                desarLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                desarLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                desarLabelMouseExited(evt);
            }
        });

        javax.swing.GroupLayout desarPanelLayout = new javax.swing.GroupLayout(desarPanel);
        desarPanel.setLayout(desarPanelLayout);
        desarPanelLayout.setHorizontalGroup(
            desarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, desarPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(desarLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(116, 116, 116))
        );
        desarPanelLayout.setVerticalGroup(
            desarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, desarPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(desarLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        usuariLabel.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        usuariLabel.setText("USUARI");

        usuariTextField.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        usuariTextField.setForeground(new java.awt.Color(204, 204, 204));
        usuariTextField.setText("Introdueixi el seu usuari");
        usuariTextField.setBorder(null);
        usuariTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                usuariTextFieldMousePressed(evt);
            }
        });

        passLabel.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        passLabel.setText("CONTRASENYA");

        passwordField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        passwordField.setForeground(new java.awt.Color(204, 204, 204));
        passwordField.setText("********");
        passwordField.setBorder(null);
        passwordField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                passwordFieldMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(desarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 122, Short.MAX_VALUE)
                .addComponent(tornarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(190, 190, 190)
                .addComponent(registreForm)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(usuariLabel)
                        .addComponent(usuariTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(nomSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(passLabel)
                        .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(passSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tornarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(registreForm)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 239, Short.MAX_VALUE)
                        .addComponent(desarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(41, 41, 41))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(usuariLabel)
                    .addGap(18, 18, 18)
                    .addComponent(usuariTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, 0)
                    .addComponent(nomSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(38, 38, 38)
                    .addComponent(passLabel)
                    .addGap(8, 8, 8)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, 0)
                    .addComponent(passSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tornarLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tornarLabelMouseClicked
        this.setVisible(false);
        LoginForm t1 = new LoginForm();
        t1.setVisible(true);
    }//GEN-LAST:event_tornarLabelMouseClicked

    private void tornarLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tornarLabelMouseEntered
        tornarPanel.setBackground(new Color(0, 156, 223));
    }//GEN-LAST:event_tornarLabelMouseEntered

    private void tornarLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tornarLabelMouseExited
        tornarPanel.setBackground(new Color(0, 134, 190));
    }//GEN-LAST:event_tornarLabelMouseExited

    private void desarLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_desarLabelMouseClicked
        javax.swing.JOptionPane.showMessageDialog(this, "Intent d'accés amb les dades:\nUsuari: " + usuariTextField.getText() + "\nContrasenya: " + String.valueOf(passwordField.getPassword()), "LOGIN", javax.swing.JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_desarLabelMouseClicked

    private void desarLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_desarLabelMouseEntered
        tornarPanel.setBackground(new Color(0, 156, 223));
    }//GEN-LAST:event_desarLabelMouseEntered

    private void desarLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_desarLabelMouseExited
        tornarPanel.setBackground(new Color(0, 134, 190));
    }//GEN-LAST:event_desarLabelMouseExited

    private void usuariTextFieldMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usuariTextFieldMousePressed
        if (usuariTextField.getText().equals("Introdueixi el seu usuari")) {
            usuariTextField.setText("");
            usuariTextField.setForeground(Color.black);
        }
        if (String.valueOf(passwordField.getPassword()).isEmpty()) {
            passwordField.setText("********");
            passwordField.setForeground(Color.gray);
        }

    }//GEN-LAST:event_usuariTextFieldMousePressed

    private void passwordFieldMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordFieldMousePressed
        if (String.valueOf(passwordField.getPassword()).equals("********")) {
            passwordField.setText("");
            passwordField.setForeground(Color.black);
        }
        if (usuariTextField.getText().isEmpty()){
            usuariTextField.setText("Introdueix el seu usuari");
            usuariTextField.setForeground(Color.gray);
        }

    }//GEN-LAST:event_passwordFieldMousePressed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel desarLabel;
    private javax.swing.JPanel desarPanel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator nomSeparator;
    private javax.swing.JLabel passLabel;
    private javax.swing.JSeparator passSeparator;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel registreForm;
    private javax.swing.JLabel tornarLabel;
    private javax.swing.JPanel tornarPanel;
    private javax.swing.JLabel usuariLabel;
    private javax.swing.JTextField usuariTextField;
    // End of variables declaration//GEN-END:variables
}