/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mybank.reporting;

import com.mybank.domain.Account;
import com.mybank.domain.Bank;
import com.mybank.domain.CheckingAccount;
import com.mybank.domain.Customer;
import com.mybank.domain.SavingsAccount;

/**
 *
 * @author alexa
 */
public class CustomerReport {

    public static void generateReport() {
        System.out.print("\nОТЧЕТ ПО КЛИЕНТАМ (" + Bank.getNumberofCustomers() + " клиентов)");
        System.out.print("\n=================================================================");
        for (int i = 0; i < Bank.getNumberofCustomers(); i++) {
            Customer tempCustomer = Bank.getCustomer(i);
            System.out.print("\nКлиент №" + (i + 1)
                    + ": " + tempCustomer.getLastName() + ", "
                    + tempCustomer.getFirstName());
            int numberOfAccounts = tempCustomer.getNumberOfAccounts();
            if (numberOfAccounts == 0) {
                System.out.println("\n\tУ клиента пока нет счетов");
            } else {
                for (int j = 0; j < numberOfAccounts; j++) {
                    Account tempAccount = tempCustomer.getAccount(j);
                    if (tempAccount instanceof CheckingAccount) {
                        System.out.print("\n\t Счет №" + (j + 1) + "(расчетный): $"
                                + tempAccount.getBalance() + ". Остаток кредитных средств: $"
                                + ((CheckingAccount) tempAccount).getOverdraftAmount());
                    } else {
                        System.out.print("\n\t Счет №" + (j + 1) + "(сберегательный): $"
                                + tempAccount.getBalance() + ". Процент на остаток: "
                                + ((SavingsAccount) tempAccount).getInterestRate() + "%");
                    }
                }
            }

        }
        System.out.println();
    }
}
