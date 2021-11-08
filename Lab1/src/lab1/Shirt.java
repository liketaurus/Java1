package lab1;

public class Shirt {

    private int ShirtID = 0;
    private String description = "==no description==";
    private char colorCode = 'U';
    private double price = 20.0;
    private int quantutyInStock = 0;

    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        }
    }

    public void setQuantutyInStock(int quantutyInStock) {
        if (quantutyInStock >= 0) {
            this.quantutyInStock = quantutyInStock;
        }
    }

    public Shirt(int ShirtID, String description, char ColorCode, double price, int quantity) {
        this.ShirtID = ShirtID;
        this.description = description;
        this.colorCode = ColorCode;
        setPrice(price);
        setQuantutyInStock(quantity);
    }

    @Override
    public String toString() {
        return "Shirt ID: \t" + ShirtID + "\nDescription: \t" + description
                + "\nColor Code: \t" + colorCode + "\nShirt price: \t$" + price
                + "\nIn stock: \t" + quantutyInStock;
    }

}
