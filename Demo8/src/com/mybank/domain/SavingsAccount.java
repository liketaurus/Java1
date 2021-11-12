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
public class SavingsAccount extends Account {

    public SavingsAccount(double balance, double interestRate) {
        super(balance);
        this.interestRate = interestRate;
    }
    private double interestRate;

    public double getInterestRate() {
        return interestRate;
    }

}
