package demo1;

public class Shirt {

    static float price = 19.99F;
    static final double SALES_TAX = 5;

    public static void main(String[] args) {        // TODO code application logic here
        price = price - 1;
        int shirtNumber = 5;
        double totalAmount = (price * shirtNumber) * (1+SALES_TAX/100);
        String message = "Total amount of " + shirtNumber + " shirts is $" + totalAmount;
        System.out.println(message);
    }
}
