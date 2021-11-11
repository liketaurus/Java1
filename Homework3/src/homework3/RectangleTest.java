/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework3;

public class RectangleTest {

    public static void main(String[] args) {
        
        Rectangle myRect = new Rectangle(45,55);        
        displayRectangle(myRect);

        Rectangle newRect = new Rectangle();
        displayRectangle(newRect);
        
        myRect.setWidth(15);
        displayRectangle(myRect);

    }

    private static void displayRectangle(Rectangle myRect) {        
        System.out.println("Площадь прямоугольника : "
                + myRect.getArea() + "см\u00b2");
        System.out.println("Периметр прямоугольника : "
                + myRect.getPerimeter() + "см");
        System.out.println();
        myRect.draw();
    }

}
