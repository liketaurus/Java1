/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

import java.util.Scanner;

/**
 *
 * @author alexa
 */
public class DateTwo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите номер дня: ");
        int dayNumber = sc.nextInt();

        String dayName;
//        if (dayNumber == 1) {
//            dayName = "понедельник";
//        } else if (dayNumber == 2) {
//            dayName = "вторник";
//        } else if (dayNumber == 3) {
//            dayName = "среда";
//        } else if (dayNumber == 4) {
//            dayName = "четверг";
//        } else if (dayNumber == 5) {
//            dayName = "пятница";
//        } else if (dayNumber == 6) {
//            dayName = "суббота";
//        } else if (dayNumber == 7) {
//            dayName = "воскресенье";
//        } else {
//            dayName = "неизвестный день. Ошибка ввода?";
//        }
            switch(dayNumber){
                case (1):
                    dayName = "понедельник";
                    break;
                case (2):
                    dayName = "вторник";
                    break;
                case (3):
                    dayName = "среда";
                    break;
                case (4):
                    dayName = "четверг";
                    break;
                case (5):
                    dayName = "пятница";
                    break;
                case (6):
                    dayName = "суббота";
                    break;
                case (7):
                    dayName = "воскресенье";
                    break;
                default:
                    dayName = "неизвестный день. Ошибка ввода?";
            }  

        System.out.println(dayNumber + "-й день недели - это " + dayName);
    }

}
