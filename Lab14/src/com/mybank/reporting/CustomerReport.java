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
            Account tempAccount = tempCustomer.getAccount();
            System.out.print("\nКлиент №" + (i + 1)
                    + ": " + tempCustomer.getLastName() + ", "
                    + tempCustomer.getFirstName());
            if (tempAccount instanceof CheckingAccount) {
                System.out.print("\n\t Расчетный счет: $"
                        + tempAccount.getBalance() + ". Остаток кредитных средств: $"
                        + ((CheckingAccount) tempAccount).getOverdraftAmount());
            } else {
                System.out.print("\n\t Сберегательный счет: $"
                        + tempAccount.getBalance() + ". Процент на остаток: "
                        + ((SavingsAccount) tempAccount).getInterestRate() + "%");
            }
        }
        System.out.println();
    }
}
