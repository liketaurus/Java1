/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mybank.tests;

import com.mybank.domain.Account;
import com.mybank.domain.Bank;
import com.mybank.domain.CheckingAccount;
import com.mybank.domain.Customer;
import com.mybank.domain.SavingsAccount;
import com.mybank.reporting.CustomerReport;

/**
 *
 * @author alexa
 */
public class Banking {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Bank.addCustomer("John", "Doe", new SavingsAccount(1000, 0.3));
        Bank.addCustomer("Jane", "Doe", new CheckingAccount(5000));
        Bank.addCustomer("Fox", "Mulder", new CheckingAccount(5000, 5000));
        Bank.addCustomer("Dana", "Scully", new SavingsAccount(0, 0.7));

        System.out.println("В банке " + Bank.getNumberofCustomers() + " клиентов:");
        System.out.println("У первого было $1000, у второго - $5000, у третьего - $5000 и $5000 кредитных средств, у четвертого - $0");

        System.out.println("Первому ложим $1000 и снимаем $2000");
        Bank.getCustomer(0).getAccount().deposit(1000);
        Bank.getCustomer(0).getAccount().withdraw(2000);
        System.out.println("Третьему ложим $650 и снимаем $6500");
        Bank.getCustomer(2).getAccount().deposit(650);
        Bank.getCustomer(2).getAccount().withdraw(6500);
        System.out.println("Четвертому ложим $70650");
        Bank.getCustomer(3).getAccount().deposit(70650);

        CustomerReport.generateReport();

    }

}
