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
public class Customer {

    private static final int NUMBER_BASE = 200;
    private static int numberOfCustomers = NUMBER_BASE;

    private int ID;
    private String name;
    private String address;
    private String phone;
    private String email;

    public Customer() {
        numberOfCustomers++;
        this.ID = numberOfCustomers;
        this.name = "John Doe";
        this.address = "Washington, DC";
        this.phone = "555-55-55";
        this.email = "john@doe.com";
    }

    public static int getNumberOfCustomers() {
        return numberOfCustomers - NUMBER_BASE;
    }

    public void setCustInfo(String name) {
        setCustInfo(name,"not specified","not specified");
    }
    
    public void setCustInfo(String name, String address, String phone) {
        setCustInfo(name,address,phone,"not specified");
    }    

    public void setCustInfo(String name, String address, String phone, String email) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }

    @Override
    public String toString() {
        return "\nCustomer #" + ID
                + "\n----------------"
                + "\nName :\t\t" + name
                + "\nAddress :\t" + address
                + "\nPhone :\t\t" + phone
                + "\nEmail :\t\t" + email;
    }

}
