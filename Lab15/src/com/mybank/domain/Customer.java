/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mybank.domain;

import java.util.ArrayList;

/**
 *
 * @author alexa
 */
public class Customer {

    private final String firstName;
    private String lastName;
    private ArrayList<Account> accounts = new ArrayList<>();

    public Customer(String firstName, String lastName) {
        this.firstName=firstName;
        this.lastName=lastName;
    }

    public Customer(String firstName, String lastName, Account account) {
        this(firstName,lastName);
        accounts.add(account);
    }

    public void addAccount(Account newAccount) {
        accounts.add(newAccount);        
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Account getAccount(int index) {
        return accounts.get(index);
    }
    
    public int getNumberOfAccounts(){
        return accounts.size();
    }

}
