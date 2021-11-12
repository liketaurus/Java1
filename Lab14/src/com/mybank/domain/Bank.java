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

    private static final int MAX_COUNT = 1000;
    private static Customer[] customers = new Customer[MAX_COUNT];

    private static int numberofCustomers = 0;

//    static {
//        customers = new Customer[MAX_COUNT];
//        numberofCustomers = 0;
//    }
    
    private Bank() {
    }

    public static void addCustomer(String f, String l, Account newAcc) {
        customers[numberofCustomers] = new Customer(f, l, newAcc);
        numberofCustomers++;
    }

    public static int getNumberofCustomers() {
        return numberofCustomers;
    }

    public static Customer getCustomer(int index) {
        return customers[index];
    }

}
