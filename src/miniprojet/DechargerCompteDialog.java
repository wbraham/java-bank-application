/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miniprojet;

import javax.swing.JOptionPane;

/**
 *
 * @author Walid
 */
public class DechargerCompteDialog extends javax.swing.JDialog {
    private final Client client;
    /**
     * Creates new form DechargerCompteDialog
     */
    public DechargerCompteDialog(java.awt.Frame parent, boolean modal, Client client) {
        super(parent, modal);
        initComponents();
        this.client=client;
        setLocationRelativeTo(parent);
        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        retirerArgentBtn = new javax.swing.JButton();
        annulerRetirerArgentBtn = new javax.swing.JButton();
        sommeARetirerET = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Retirer Argent");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Retirer cette somme :");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, 20));

        retirerArgentBtn.setText("Retirer Argent");
        retirerArgentBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retirerArgentBtnActionPerformed(evt);
            }
        });
        getContentPane().add(retirerArgentBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));

        annulerRetirerArgentBtn.setText("Annuler");
        annulerRetirerArgentBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                annulerRetirerArgentBtnActionPerformed(evt);
            }
        });
        getContentPane().add(annulerRetirerArgentBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, -1, -1));
        getContentPane().add(sommeARetirerET, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 80, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void annulerRetirerArgentBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_annulerRetirerArgentBtnActionPerformed
        this.dispose();
    }//GEN-LAST:event_annulerRetirerArgentBtnActionPerformed

    private void retirerArgentBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retirerArgentBtnActionPerformed
        StringBuilder alerte = new StringBuilder();
        if (sommeARetirerET.getText().isEmpty()) {
            alerte.append("Entrez une somme d'argent.\n");
        } else {
            double flouss = 0;
            try {
                flouss = Double.parseDouble(sommeARetirerET.getText());
                int result = JOptionPane.showConfirmDialog(this, "Voulez-vous retirer la somme de " + flouss + " dinars de ce compte?\n");
                if (result == JOptionPane.OK_OPTION) {
                    try {
                        client.getAccount().retirerArgent(flouss);
                        this.dispose();
                    } catch (SoldeInsuffisantException ex) {
                        alerte.append("Vous n'avez pas suffissament d'argent dans votre compte.\n");
                    }
                }
            } catch (NumberFormatException ex) {
                alerte.append("Veuillez entrer une valeur numérique.\n");
            }
        }
        if (alerte.length() > 0) {
            JOptionPane.showMessageDialog(this, alerte.toString(), "Erreur", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_retirerArgentBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton annulerRetirerArgentBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton retirerArgentBtn;
    private javax.swing.JTextField sommeARetirerET;
    // End of variables declaration//GEN-END:variables
}
