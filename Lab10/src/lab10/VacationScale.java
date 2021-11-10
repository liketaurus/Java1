/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab10;

import java.util.Scanner;

/**
 *
 * @author alexa
 */
public class VacationScale {

    static int scale[] = {10, 15, 15, 15, 20, 20, 25};

    public static void setVacationScale(float years, int days) {
        if (years >= 0 && years < 6) {
            scale[(int) years] = days;
        } else if (years >= 6) {
            scale[6] = days;
        }
    }

    public static void setVacationScale() {
        String years[] = {"меньше года", "1, 2 или 3 года", "4 или 5 лет", "6 и более лет"};
        int days[] = new int[4];
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество дней отпуска для каждого случая:");
        for (int i = 0; i < years.length; i++) {
            System.out.print("\n" + years[i] + ": ");
            days[i] = sc.nextInt();
        }
        scale[0]=days[0];
        
        scale[1]=days[1];
        scale[2]=scale[1];
        scale[3]=scale[1];
        
        scale[4]=days[2];
        scale[5]=scale[4];
        
        scale[6]=days[3];
        System.out.println("Ввод окончен!");
    }

    public static String getVacationDays(float years) {
        if (years >= 0 && years < 6) {
            if (years < 1) {
                int month = (int) (12 * years);
                return "Ваш стаж работы около " + month + " месяцев, и Вам положено "
                        + scale[(int) years] + " дней отпуска!";
            }
            return "Ваш стаж работы " + (int) years + " лет, и Вам положено "
                    + scale[(int) years] + " дней отпуска!";
        } else if (years >= 6) {
            return "Ваш стаж работы " + (int) years + " лет, и Вам положено "
                    + scale[6] + " дней отпуска!";
        } else {
            return "Внимание! Неправильный стаж работы!!!";
        }
    }

}
