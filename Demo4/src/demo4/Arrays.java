/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo4;

import java.util.Scanner;

/**
 *
 * @author alexa
 */
public class Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int ages[];
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите количество респондентов : ");
        ages = new int[sc.nextInt()];

        //for (int i = 0; i < ages.length; i++) {
        int i = 1;
        for (int age : ages) {
            System.out.print("Введите возраст " + i + " респондента : ");
            age = sc.nextInt();
            i++;
        }
    }

}
