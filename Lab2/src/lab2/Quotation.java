/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author alexa
 */
public class Quotation {

    String quote; 
//    = "The way to get started is to quit talking and being doing.";

    public Quotation(String quote) {
        this.quote = quote;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }

        
    @Override
    public String toString() {
//        quote = "The way to get started is to quit talking and being doing.";
        return quote;
    }

//    public static void main(String[] args) {
//        Quotation quote = new Quotation();
//        System.out.println(quote);
//    }
    
}
