/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

import java.util.Scanner;

/**
 *
 * @author alexa
 */
public class Hello {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("What's your name: ");
        String name = sc.next();
        System.out.println("Input your age: ");
        int age = sc.nextInt();
        
        System.out.println("Your name is " + name + ", and you're " + age + " years old!");
        System.out.println("You was born in "+ (2021 - age));

    }

}
