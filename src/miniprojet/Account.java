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
public class Account implements Serializable {
    private double balance = 0;
    private int accountNumber;
    private static int numberOfAccounts = 0;
    
    Account(){
        accountNumber = getNextAccountNumber();
    }
    
    public static int getNextAccountNumber(){
        return ++numberOfAccounts;
    }
    
        public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    public int getAccountNumber() {
        return accountNumber;
    }
    
    public void retirerArgent(double argent) throws SoldeInsuffisantException{
        if(argent > balance){
            throw new SoldeInsuffisantException();
        }
        balance -= argent;
    }
    
    public void ajouterArgent(double argent) throws SommeIncorrecteException{
        if(argent <= 0){
            throw new SommeIncorrecteException();
        }
        balance += argent;
    }

    void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
}
