/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author alexa
 */
public class PersonTwo {

    String quotation;
    String author;

    public PersonTwo(String quote, String author) {
        quotation = quote;
        this.author = author;
    }

    @Override
    public String toString() {
        return quotation + "\n\t\t -- " + author;
    }   

}
