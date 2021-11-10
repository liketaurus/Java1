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
public class Order {

    private Shirt[] items;

    public Order(Shirt[] shirts) {
        items = new Shirt[shirts.length];
        items = shirts;        
    }

    private double totalAmount() {
        double amount = 0;
        for (Shirt s : items) {
            amount = amount + s.getPrice();
        }
        return amount;
    }

    @Override
    public String toString() {
        String message = "Заказаны такие товары (" + items.length + ") на сумму $" + totalAmount() + " :";
        for (Shirt s : items) {
            message = message + "\n" + s;
        }
        return message;
    }

}
