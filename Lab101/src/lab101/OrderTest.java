/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab101;

/**
 *
 * @author alexa
 */
public class OrderTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Shirt shirts[] = {
            new Shirt("поло", "черный", 35.50, 10),
            new Shirt("спортивная", "желтый", 15.50, 5),
            new Shirt(),
            new Shirt("офисная", "белая", 30.0, 10)};

        Order myOrder = new Order(shirts);
        System.out.println(myOrder);

    }

}
