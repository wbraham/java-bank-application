/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package miniprojet;

import javax.swing.JFrame;

/**
 *
 * @author Walid
 */
public class ClientPanel extends javax.swing.JPanel {
    
    /** Creates new form ClientPanel */
    public ClientPanel() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        compteSourceET = new javax.swing.JTextField();
        soldeEnvoyerET = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        envoyerArgentBtn = new javax.swing.JButton();
        compteDestinationET = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        mapsPanel = new javax.swing.JPanel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Bienvenue , ");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel2.setForeground(new java.awt.Color(0, 204, 51));
        jLabel2.setText("Walid");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, -1, -1));

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 40, 10, 260));

        jButton1.setText("jButton1");
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 10, 40, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("De :");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 110, 30, 20));

        compteSourceET.setText("N° Compte Source");
        add(compteSourceET, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 110, 140, -1));

        soldeEnvoyerET.setText("Solde à envoyer");
        add(soldeEnvoyerET, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 170, 140, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Argent :");
        jLabel5.setToolTipText("");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 170, 50, 20));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Transferer Argent");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 60, -1, -1));

        jCheckBox1.setText("J'accèpte");
        add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 210, -1, -1));

        envoyerArgentBtn.setText("Envoyer");
        envoyerArgentBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                envoyerArgentBtnActionPerformed(evt);
            }
        });
        add(envoyerArgentBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 250, -1, -1));

        compteDestinationET.setText("N° Compte Destination");
        add(compteDestinationET, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 140, 140, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Vers :");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 140, 40, 20));
        add(mapsPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 430, 280));
    }// </editor-fold>//GEN-END:initComponents

    private void envoyerArgentBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_envoyerArgentBtnActionPerformed
        /*StringBuilder alerte = new StringBuilder();
        if (compteSourceET.getText().isEmpty()||compteDestinationET.getText().isEmpty()||soldeEnvoyerET.getText().isEmpty()){
            alerte.append("Un ou plusieurs champs sont vides\n");
        } else{
            double flouss = 0;
            int source = 0;
            int destination = 0;
            try{
            flouss = Double.parseDouble(soldeEnvoyerET.getText());
            source = Integer.parseInt(compteSourceET.getText());
            destination = Integer.parseInt(compteDestinationET.getText());
                //if (client.getAccount().getAccountNumber()==source && client.getAccount().getAccountNumber()==destination){
                    client.getAccount().retirerArgent(flouss);
                    client2.getAccount().ajouterArgent(flouss);
                    System.out.println(client.getAccount().getBalance());
                    System.out.println(client2.getAccount().getBalance());
                    JOptionPane.showMessageDialog(this, "Vous venez d'envoyer "+flouss+" dinars vers le compte "+destination);
                //}
            } catch(NumberFormatException e){
                alerte.append("Entrez un chiffre");
            }
        }
        if (alerte.length()>0){
            JOptionPane.showMessageDialog(this, alerte.toString(),"Erreur",JOptionPane.WARNING_MESSAGE);
        }*/
    }//GEN-LAST:event_envoyerArgentBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField compteDestinationET;
    private javax.swing.JTextField compteSourceET;
    private javax.swing.JButton envoyerArgentBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel mapsPanel;
    private javax.swing.JTextField soldeEnvoyerET;
    // End of variables declaration//GEN-END:variables

}
