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
public class EnhancedFor {
    
    public static void main(String[] args) {
        int[] numbers = {3, 5, -2, 4, 8, 0, 1};
        
//        for (int i =0; i<numbers.length;i++)
          for (int n: numbers)
            System.out.print(Math.pow(n, 2)+"  "); //numbers[i]
        System.out.println();
    }
}
