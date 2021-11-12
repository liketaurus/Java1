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
public class CheckingAccount extends Account {

    private double overdraftAmount;

    public double getOverdraftAmount() {
        return overdraftAmount;
    }

    public CheckingAccount(double balance, double overdraftAmount) {
        super(balance);
        this.overdraftAmount = overdraftAmount;
    }

    public CheckingAccount(double balance) {
        this(balance, 0);
    }

    @Override
    public void withdraw(double amount) throws OverdraftExeption {
        if (balance < amount) {
            double overdraftNeeded = amount - (balance + overdraftAmount);
            if (overdraftAmount < overdraftNeeded) {
                throw new OverdraftExeption("Недостаточный остаток кредитных средств", overdraftNeeded);
            } else {
                balance = 0.0;
                overdraftAmount -= overdraftNeeded;
            }
        } else {
            balance -= amount;
        }
    }

}
