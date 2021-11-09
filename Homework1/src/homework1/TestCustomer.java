/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework1;

import java.util.Scanner;

/**
 *
 * @author alexa
 */
public class TestCustomer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Customer newCustomer;
        Scanner sc = new Scanner(System.in);
        
        Customer.setBase(50);

        System.out.print("Customer purchases? ");
        double purchases = sc.nextDouble();
        if (purchases > 0) {
            newCustomer = new Customer(purchases);
        } else {
            newCustomer = new Customer();
        }
        System.out.println();
        Customer customer2 = new Customer();
        Customer customer3 = new Customer(23456);

        System.out.println(newCustomer);
        System.out.println();
        newCustomer.addPurchase(55);
        System.out.println(customer2);
        System.out.println();
        System.out.println(customer3);
        System.out.println();
        System.out.println("Total number of clients: "+Customer.getCustomers());
        
    }

}
