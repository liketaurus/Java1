/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo5;

import java.util.Arrays;

/**
 *
 * @author alexa
 */
public class Demo5 {

    public static void main(String[] args) {
        int[] numbers = {12, 5, -3, 0, 25, 18, 1, 256, 7};
        System.out.println(Arrays.toString(numbers));
        
        Arrays.sort(numbers);        
        System.out.println(Arrays.toString(numbers));
        
        int[] part = Arrays.copyOf(numbers, 4);
        int[] part2 = {-3, 0, 1, 5};
        
        System.out.println(Arrays.toString(part));
        System.out.println(Arrays.equals(part, part2));
    }

}
