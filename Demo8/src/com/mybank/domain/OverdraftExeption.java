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
public class OverdraftExeption extends Exception {

    private final double deficit;

    public OverdraftExeption(String message, double deficit) {
        super(message);
        this.deficit = deficit;
    }

    public double getDeficit() {
        return deficit;
    }

}
