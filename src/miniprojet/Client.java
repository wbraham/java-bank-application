/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miniprojet;

import java.io.Serializable;

/**
 *
 * @author Walid
 */
public class Client implements Serializable{
    private final String nomComplet;
    private final String email;
    private final String password;
    private final String adresse;
    private final int telephone;
    private final int cin;
    private final Double solde;
    private final Account account;

    public Client(String nomComplet, String email, String password, String adresse, int telephone, int cin, Double solde, Account account) {
        this.nomComplet = nomComplet;
        this.email = email;
        this.password = password;
        this.adresse = adresse;
        this.telephone = telephone;
        this.cin = cin;
        this.solde = solde;
        this.account = account;
    }
    
    public String basicInfo(){
        return " Account Number: " + account.getAccountNumber() + " - Name: " + getNomComplet();
    }

    @Override
    public String toString() {
        return "Client{" + "nomComplet=" + nomComplet + ", email=" + email + ", password=" + password + ", adresse=" + adresse + ", telephone=" + telephone + ", cin=" + cin + ", solde=" + solde + ", account=" + account + '}';
    }

    public String getNomComplet() {
        return nomComplet;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
    
    public String getAdresse() {
        return adresse;
    }

    public int getTelephone() {
        return telephone;
    }

    public int getCin() {
        return cin;
    }

    public Double getSolde() {
        return solde;
    }

    public Account getAccount() {
        return account;
    }
    
}
