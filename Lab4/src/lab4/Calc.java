/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

import java.util.Scanner;
import java.math.BigInteger;

public class Calc {

    public static BigInteger calculateTotal(int x, int y) {
        return BigInteger.valueOf(x).multiply(BigInteger.valueOf(y));
    }

    public static void main(String[] args) {
        int int1, int2;
        Scanner sc = new Scanner(System.in);
        System.out.print("int 1 = ");
        int1 = sc.nextInt();
        System.out.print("int 2 = ");
        int2 = sc.nextInt();

        System.out.println("\n" + int1 + " x " + int2 + " = "
                + calculateTotal(int1, int2));
    }
}
