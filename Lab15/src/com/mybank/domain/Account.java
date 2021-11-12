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
public abstract class Account {

    protected double balance;

    protected Account(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance = balance + amount;        
    }

    public void withdraw(double amount) throws OverdraftExeption{
        if (amount <= balance) {
            balance = balance - amount;            
        }else
            throw new OverdraftExeption("Недостаточно средств на счету", amount-balance);
    }
}
