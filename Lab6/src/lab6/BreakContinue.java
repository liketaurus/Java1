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
public class BreakContinue {

    public static void main(String[] args) {
        int n = 20;

        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                continue;
            }
            System.out.print(i + "  ");
        }
        System.out.println();
        int i = 0;
        while (true) {
            i++;
            System.out.print(i + "  ");
            if (i >= 20) {
                break;
            }
        }

        System.out.println();
    }

}
