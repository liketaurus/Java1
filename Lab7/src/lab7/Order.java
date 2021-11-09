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
public class Order {

    private Shirt orderedShirts;
    private int numberOfShirts;
    private double amount;

    public Order(Shirt orderedShirts, int numberOfShirts) {
        this.orderedShirts = orderedShirts;
        this.numberOfShirts = numberOfShirts;
        this.amount = orderedShirts.getPrice() * numberOfShirts;
    }

    public Order(Shirt orderedShirts) {
        this.orderedShirts = orderedShirts;
        numberOfShirts = 1;
        amount = orderedShirts.getPrice();
    }

    @Override
    public String toString() {
        return "Заказана '"+ orderedShirts.getDescription()+"' в количестве "
                + numberOfShirts+" штук на сумму $" + amount;
    }

}
