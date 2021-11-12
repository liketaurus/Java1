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
    private Account account;

    public Customer(String firstName, String lastName) {
        this(firstName, lastName, null);
    }

    public Customer(String firstName, String lastName, Account account) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.account = account;
    }

    public boolean addAccount(Account newAccount) {
        if (account != null) {
            return false;
        } else {
            account = newAccount;
            return true;
        }
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
