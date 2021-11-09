/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab;

/**
 *
 * @author alexa
 */
public class CustomerTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Customer cust1 = new Customer();
        Customer cust2 = new Customer();
        Customer cust3 = new Customer();
        cust1.setCustInfo("Jane Doe", "LA", "123-12-34");
        cust2.setCustInfo("Fox Mulder", "WA, DC", "555-12-34", "fox@mulder.com");
        cust3.setCustInfo("Dana Scully");
        
        System.out.println(cust1);
        System.out.println(cust2);
        System.out.println(cust3);
        
        System.out.println("\nTotal number of customers: "
                +Customer.getNumberOfCustomers());
        
    }
    
}
