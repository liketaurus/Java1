/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

import java.util.Scanner;

public class Person {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите Ваш возраст в годах: ");
        int age = sc.nextInt();

        int ageDays = age * 365;
        long ageSeconds = ageDays * 24 * 60 * 60;
        long ageMilliSeconds = ageSeconds * 1000;
        
        System.out.println("Вы прожили: \n--------\n"+age+" лет \n"
                +ageDays+" дней \n"+ageSeconds+" секунд\n"
                +ageMilliSeconds+" миллисекунд");
    }
}
