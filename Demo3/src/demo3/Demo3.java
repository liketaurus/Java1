/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo3;

/**
 *
 * @author alexa
 */
public class Demo3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ConstructorDemo cd = new ConstructorDemo();
        System.out.println(cd);
        cd.setDate(12, 12, 2020);
        System.out.println(cd);
        cd.setDate(1, 1, 2021);
        System.out.println(cd);

    }

}
