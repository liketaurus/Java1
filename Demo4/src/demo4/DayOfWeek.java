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
public class DayOfWeek {

    static String days[] = {"понедельник", "вторник", "среда", "четверг",
        "пятница", "суббота", "воскресенье"};

    static String getName(int day) {
        return day + "-й день недели - это " + days[day - 1];
    }

    public static void main(String[] args) {
//
//        days[0] = "начальник";
//        days[0] = "понеділок";
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите номер дня : ");        
        System.out.println(getName(sc.nextInt()));
    }

}
