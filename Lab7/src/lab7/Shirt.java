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
public class Shirt {

    private double price;
    private String description;

    public Shirt(double price, String description) {
        this.price = price;
        this.description = description;
    }

    public Shirt() {
        this(20.0, "Просто рубашка");
    }

    public String getDescription() {
        return description;
    }

    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        }
    }

    @Override
    public String toString() {
        return "Рубашка '" + description + "' стоит $" + price;
    }

    public double getPrice() {
        return price;
    }

}
