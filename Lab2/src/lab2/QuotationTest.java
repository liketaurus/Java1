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
public class QuotationTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        int x =5;
//        System.out.println(new Quotation());
//        System.out.println(x);
//        String name = "John Doe";
//        String anotherName = name;
//        
//        System.out.println(name);
//        System.out.println(anotherName);
//        
//        anotherName = anotherName + "- is the best!";
//
//        System.out.println(name);
//        System.out.println(anotherName);

        Quotation q1 = new Quotation("East or west, home is best!");
        Quotation q2 = q1;

        System.out.println(q1);
        System.out.println(q2);

        q2.setQuote("Empty!");

        System.out.println(q1);
        System.out.println(q2);

    }

}
