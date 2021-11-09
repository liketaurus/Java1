/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

import java.util.Scanner;

/**
 *
 * @author alexa
 */
public class Counter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите правую границу: ");
        final int MAX_COUNT = sc.nextInt();

        System.out.println();
        int i = 0;
//        while (i < MAX_COUNT) {
//        for (int i = 1; i <= MAX_COUNT; i++) //{
//            i++;
        do {
            i++;
            System.out.print(i + "  ");
        } while (i < MAX_COUNT);
        System.out.println();
    }

}
