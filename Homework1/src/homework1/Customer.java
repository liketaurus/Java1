/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework1;

/**
 *
 * @author alexa
 */
public class Customer {

    private static int BASE_NUMBER = 0;
    private static int customerNumber;// = BASE_NUMBER;

    private int ID;
    private char status = 'N';
    private double totalPurchases = 0.0;

//    static {
//        BASE_NUMBER = 500;
//        customerNumber = BASE_NUMBER;
//    }
    
    public static void setBase(int newBase){
        BASE_NUMBER = newBase;
        customerNumber = BASE_NUMBER;
    }
    
    public Customer(char status, double amount) {
        customerNumber++;
        ID = customerNumber;
        if (status == 'O') {
            this.status = status;
            totalPurchases = amount;
        }
    }

    public Customer(double amount) {
        this('O', amount);
    }

    public Customer() {
        this('N', 0.0);
    }

    public void addPurchase(double amount) {
        if (amount >= 0) {
            totalPurchases = totalPurchases + amount;
            if (status == 'N') {
                status = 'O';
            }
        }

    }

    @Override
    public String toString() {
//        String message = "Customer ID: \t\t" + ID + "\nCustomer status: \t";
//        if (status == 'N') {
//            message = message + "new client";
//        } else {
//            message = message + "existing client";
//        }
        String textStatus = (status == 'N') ? "new client" : "existing client";
        return "Customer ID: \t\t" + ID + "\nCustomer status: \t"
                + textStatus + "\nTotal purchases: \t$" + totalPurchases;
    }

    public static int getCustomers() {
        return customerNumber - BASE_NUMBER;
    }
}
