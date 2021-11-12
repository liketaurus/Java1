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
public class Bank {

    private static ArrayList<Customer> customers = new ArrayList<>();

    private Bank() {
    }

    public static void addCustomer(String f, String l, Account newAcc) {
        customers.add(new Customer(f, l, newAcc));
    }

    public static void addCustomer(String f, String l) {
        customers.add(new Customer(f, l));
    }

    public static int getNumberofCustomers() {
        return customers.size();
    }

    public static Customer getCustomer(int index) {
        return customers.get(index);
    }

}
