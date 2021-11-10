/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework2;

import java.util.Scanner;

/**
 *
 * @author alexa
 */
public class TemperatureTest {

    public static int calculateCelsium(int F) {
        return (F - 32) * 5 / 9;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите температуру в Фарангейтах : ");
        int F = sc.nextInt();
        System.out.println(F + " Фаренгейт - это " + calculateCelsium(F) + "\u00B0C");
    }

}
