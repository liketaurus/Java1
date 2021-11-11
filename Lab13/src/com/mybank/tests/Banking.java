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

        myBank.addCustomer("John", "Doe", new SavingsAccount(1000, 0.3));
        myBank.addCustomer("Jane", "Doe", new CheckingAccount(5000));
        myBank.addCustomer("Fox", "Mulder", new CheckingAccount(5000, 5000));
        myBank.addCustomer("Dana", "Scully", new SavingsAccount(0, 0.7));

        System.out.println("В банке " + myBank.getNumberofCustomers() + " клиентов:");
        System.out.println("У первого было $1000, у второго - $5000, у третьего - $5000 и $5000 кредитных средств, у четвертого - $0");
        
        System.out.println("Первому ложим $1000 и снимаем $2000");
        myBank.getCustomer(0).getAccount().deposit(1000);
        myBank.getCustomer(0).getAccount().withdraw(2000);
        System.out.println("Третьему ложим $650 и снимаем $6500");
        myBank.getCustomer(2).getAccount().deposit(650);
        myBank.getCustomer(2).getAccount().withdraw(6500);
        System.out.println("Четвертому ложим $70650");
        myBank.getCustomer(3).getAccount().deposit(70650);               

        for (int i = 0; i < myBank.getNumberofCustomers(); i++) {
            Customer tempCustomer = myBank.getCustomer(i);
            Account tempAccount = tempCustomer.getAccount();
            System.out.print("\nКлиент №" + (i + 1)
                    + " - " + tempCustomer.getLastName() + ", "
                    + tempCustomer.getFirstName() + " имеет на счету $"
                    + tempAccount.getBalance() + ". ");
            if (tempAccount instanceof CheckingAccount) {
                System.out.print("Осталось кредитных средств $"
                        + ((CheckingAccount) tempAccount).getOverdraftAmount());
            } else {
                System.out.print("Ежемесячный процент "
                        + ((SavingsAccount) tempAccount).getInterestRate() + "%");
            }
        }
        System.out.println();

    }

}
