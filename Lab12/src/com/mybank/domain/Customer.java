/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mybank.domain;

/**
 *
 * @author alexa
 */
public class Customer {
    private final String firstName;
    private String lastName;
    private final Account account; 

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        account = new Account(0);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Account getAccount() {
        return account;
    }
    
    
    
    
    
    
}
