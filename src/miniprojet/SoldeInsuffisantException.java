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
public class SoldeInsuffisantException extends Exception {

    public SoldeInsuffisantException() {
        super("Votre solde est Insuffisant, rechargez votre compte.");
    }
    
}
