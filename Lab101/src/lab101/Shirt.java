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
public class Shirt {

    private static final int BASE_ID = 1000;
    private static int currentId = BASE_ID;

    private int ID;
    private String description;
    private String color;
    private double price;
    private int quantityInStock;

    public Shirt(String description, String color, double price, int quantityInStock) {
        currentId++;
        this.ID = currentId;
        this.description = description;
        this.color = color;
        this.price = price;
        this.quantityInStock = quantityInStock;
    }

    public Shirt() {
        this("нет описания", "неизвестен", 20.00, 1);
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "\nТовар №" + ID
                + ": \nмодель : \t" + description
                + "\nцвет :\t\t" + color
                + "\nцена :\t\t$" + price
                + "\nв наличии: \t" + quantityInStock + " шт.";
    }

}
