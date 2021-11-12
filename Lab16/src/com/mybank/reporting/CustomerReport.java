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
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

/**
 *
 * @author alexa
 */
public class CustomerReport {

    public static void generateReport() {

        Locale locale = new Locale("en","US");
        NumberFormat bf = NumberFormat.getCurrencyInstance(locale);        
        DecimalFormat rf = new DecimalFormat("##.##%");
        
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
                        System.out.print("\n\t Счет №" + (j + 1) + "(расчетный): "
                                + bf.format(tempAccount.getBalance()) + ". Остаток кредитных средств: "
                                + bf.format(((CheckingAccount) tempAccount).getOverdraftAmount()));
                    } else {
                        System.out.print("\n\t Счет №" + (j + 1) + "(сберегательный): "
                                + bf.format(tempAccount.getBalance()) + ". Процент на остаток: "
                                + rf.format(((SavingsAccount) tempAccount).getInterestRate()));
                    }
                }
            }

        }
        System.out.println();
    }
}
