/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

/**
 *
 * @author alexa
 */
public class Fibonacci {

    static int fib(int n) {
        if (n <= 1) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        int n = 20;

        int i = 0;
//        while (i < n) {
//            i++;
//        for (int i=1; i<=n; i++)
        do {
            i++;
            System.out.print(fib(i) + "  ");
        } while (i < n);
        System.out.println();
    }
}
