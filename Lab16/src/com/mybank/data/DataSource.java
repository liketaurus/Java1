/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mybank.data;

import com.mybank.domain.Bank;
import com.mybank.domain.CheckingAccount;
import com.mybank.domain.Customer;
import com.mybank.domain.SavingsAccount;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author alexa
 */
public class DataSource {

    private File dataFile;

    public DataSource(String dataFilePath) {
        this.dataFile = new File(dataFilePath);
    }

    public void loadData() throws IOException {
        Scanner input = new Scanner(dataFile);
        Customer customer;
        int numberOfCustomers = input.nextInt();
        for (int i = 0; i < numberOfCustomers; i++) {
            String firstName = input.next();
            String lastName = input.next();
            Bank.addCustomer(firstName, lastName);
            customer = Bank.getCustomer(i);
            int numberOfAccounts = input.nextInt();
            while(numberOfAccounts-->0){
                char accountType = input.next().charAt(0);
                switch (accountType){
                    case 'S':{
                        float balance = input.nextFloat();
                        float rate = input.nextFloat();
                        customer.addAccount(new SavingsAccount(balance, rate));
                        break;
                    }
                    case 'C':{
                        float balance = input.nextFloat();
                        float overdraft = input.nextFloat();
                        customer.addAccount(new CheckingAccount(balance, overdraft));
                        break;
                    }
                }
            }

        }
    }

}
