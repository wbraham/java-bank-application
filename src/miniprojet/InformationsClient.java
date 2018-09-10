/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miniprojet;

/**
 *
 * @author Walid
 */
public class InformationsClient extends javax.swing.JDialog {

    /**
     * Creates new form InformationsClient
     */
    public InformationsClient(java.awt.Frame parent, boolean modal, Client client) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(parent);
        nomTV.setText(client.getNomComplet());
        passwordTV.setText(client.getPassword());
        CINTV.setText(client.getCin()+"");
        numCompteTV.setText(client.getAccount().getAccountNumber()+"");
        soldeTV.setText(client.getAccount().getBalance()+"");
        emailTV.setText(client.getEmail());
        telephoneTV.setText(client.getTelephone()+"");
        adresseTV.setText(client.getAdresse());
        setSize(270, 270);
        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        nomTV = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        passwordTV = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        numCompteTV = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        CINTV = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        soldeTV = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        emailTV = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        telephoneTV = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        adresseTV = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridLayout(9, 2));

        jLabel1.setText("Nom Complet");
        getContentPane().add(jLabel1);
        getContentPane().add(nomTV);

        jLabel3.setText("Mot de passe");
        getContentPane().add(jLabel3);
        getContentPane().add(passwordTV);

        jLabel2.setText("N° Compte");
        getContentPane().add(jLabel2);
        getContentPane().add(numCompteTV);

        jLabel5.setText("CIN");
        getContentPane().add(jLabel5);
        getContentPane().add(CINTV);

        jLabel7.setText("Solde");
        getContentPane().add(jLabel7);
        getContentPane().add(soldeTV);

        jLabel9.setText("Email");
        getContentPane().add(jLabel9);
        getContentPane().add(emailTV);

        jLabel11.setText("Telephone");
        getContentPane().add(jLabel11);
        getContentPane().add(telephoneTV);

        jLabel13.setText("Adresse");
        getContentPane().add(jLabel13);
        getContentPane().add(adresseTV);

        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CINTV;
    private javax.swing.JLabel adresseTV;
    private javax.swing.JLabel emailTV;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel nomTV;
    private javax.swing.JLabel numCompteTV;
    private javax.swing.JLabel passwordTV;
    private javax.swing.JLabel soldeTV;
    private javax.swing.JLabel telephoneTV;
    // End of variables declaration//GEN-END:variables
}
