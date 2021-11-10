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
public class VacationTest {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

//        VacationScale.setVacationScale(0, 12);
//        displayVacation();
        
        VacationScale.setVacationScale();
        displayVacation();

    }

    private static void displayVacation() {
        System.out.print("\nВведите Ваш стаж в годах : ");
        System.out.println(VacationScale.getVacationDays(sc.nextFloat())+"\n");
    }

}
