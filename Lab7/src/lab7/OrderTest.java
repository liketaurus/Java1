/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7;

/**
 *
 * @author alexa
 */
public class OrderTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Shirt myShirt = new Shirt(14.0,"черная, с длинным рукавом");
        Order myOrder = new Order(myShirt, 2);
//        System.out.println(myShirt);
        System.out.println(myOrder);
    }
    
}
