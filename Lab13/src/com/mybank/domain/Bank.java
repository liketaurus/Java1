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
public class Bank {

    private final int MAX_COUNT = 1000;
    private Customer[] customers;

    private int numberofCustomers;

    public Bank() {
        customers = new Customer[MAX_COUNT];
        numberofCustomers = 0;
    }

    public void addCustomer(String f, String l, Account newAcc) {
        customers[numberofCustomers] = new Customer(f, l, newAcc);
        numberofCustomers++;
    }

    public int getNumberofCustomers() {
        return numberofCustomers;
    }

    public Customer getCustomer(int index) {
        return customers[index];
    }

}
