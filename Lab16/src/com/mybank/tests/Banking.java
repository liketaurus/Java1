/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mybank.tests;

import com.mybank.data.DataSource;
import com.mybank.domain.Account;
import com.mybank.domain.Bank;
import com.mybank.domain.CheckingAccount;
import com.mybank.domain.Customer;
import com.mybank.domain.OverdraftExeption;
import com.mybank.domain.SavingsAccount;
import com.mybank.reporting.CustomerReport;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alexa
 */
public class Banking {

    public static void main(String[] args) {

        DataSource source = new DataSource("R:\\JavaCourse\\Lab16\\src\\com\\mybank\\data\\test.dat");
        try {
            source.loadData();
        } catch (IOException ex) {
            System.err.println("ОШИБКА!\n\t" + ex.getMessage());
            System.exit(0);
        }

        CustomerReport.generateReport();

    }

}
