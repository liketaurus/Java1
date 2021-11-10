/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab9;

/**
 *
 * @author alexa
 */
public class DateTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DateOne myDate = new DateOne(25,1,2021);
        System.out.println(myDate);     
        
        DateOne currentDate = new DateOne();
        System.out.println(currentDate);     
    }

}
