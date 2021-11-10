/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework2;

import java.util.Scanner;

public class ClockTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите время дня в формате ЧЧММ : ");

        Clock myClock = new Clock(sc.nextInt());
        System.out.println(myClock);

        myClock.setCurrentTime(805);
        System.out.println(myClock);

        myClock.setCurrentTime(2635);
        System.out.println(myClock);

        System.gc();

    }
}
