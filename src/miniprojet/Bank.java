/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miniprojet;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Walid
 */
public class Bank implements Serializable {
    private ArrayList<Client> clients = new ArrayList<Client>();
    
    void addClient(Client client) {
        if(compteExistant(client.getAccount().getAccountNumber())){
            client.getAccount().setAccountNumber(validAccountNumber());
        }
        clients.add(client);
    }
    
    private int validAccountNumber(){
        int accountNumber;
        do {
            accountNumber = Account.getNextAccountNumber();
        } while(compteExistant(accountNumber));      
        return accountNumber;
    }
    
    private boolean compteExistant(int accountNumber){
        for(Client c : clients){
            if(c.getAccount().getAccountNumber() == accountNumber){
                return true;
            }
        }
        return false;
    }

    Client getClient(int account) {
        return clients.get(account);
    }
    
    ArrayList<Client> getClients(){
        return clients;
    }

    Client getClientByAccountNumber(int accountNumber) {
        Client client = null;
        for(Client c : clients){
            if(c.getAccount().getAccountNumber() == accountNumber){
                client = c;
                break;
            }
        }
        return client;
    }

    void removeClient(Client client) {
        clients.remove(client);
    }
}
