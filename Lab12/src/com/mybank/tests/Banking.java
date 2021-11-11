/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mybank.tests;

import com.mybank.domain.Bank;
import com.mybank.domain.Customer;

/**
 *
 * @author alexa
 */
public class Banking {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bank myBank = new Bank();

        myBank.addCustomer("John", "Doe");
        myBank.addCustomer("Jane", "Doe");
        myBank.addCustomer("Fox", "Mulder");
        myBank.addCustomer("Dana", "Scully");
        myBank.addCustomer("John", "Doe");
        System.out.println("В банке " + myBank.getNumberofCustomers() + " клиентов:");

        myBank.getCustomer(0).getAccount().deposit(1000);
        myBank.getCustomer(2).getAccount().deposit(650);
        myBank.getCustomer(3).getAccount().deposit(70650);
        myBank.getCustomer(4).getAccount().deposit(2000);

        myBank.getCustomer(2).getAccount().withdraw(350);
        myBank.getCustomer(0).getAccount().withdraw(2000);

        for (int i = 0; i < myBank.getNumberofCustomers(); i++) {
            Customer tempCustomer = myBank.getCustomer(i);
            System.out.println("Клиент №" + (i + 1)
                    + " - " + tempCustomer.getLastName() + ", "
                    + tempCustomer.getFirstName() + " имеет на счету $"
                    + tempCustomer.getAccount().getBalance()
            );
        }

    }

}
