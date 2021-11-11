/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework3;

import java.util.Scanner;

/**
 *
 * @author alexa
 */
public class Rectangle {

    private int width = 10;
    private int height = 10;

    private final int MAX = 30;
    private final Scanner sc = new Scanner(System.in);

    public Rectangle() {
//        width = 25;
//        height = 10;
//        System.out.println("Создан прямоугольник по умолчанию "
//                + width + " x " + height);
        this(25, 10);
        System.out.println("Это прямоугольник по умолчанию!");
    }

    public Rectangle(int w, int h) {
        setWidth(w);
        setHeight(h);
        System.out.println("Создан прямоугольник размером "
                + width + " x " + height);
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        if (width > 0 && width < MAX) {
            this.width = width;
        } else {
            System.out.println("Ошибка!"
                    + "\nШирина не может быть меньше нуля и "
                    + " больше " + MAX + "см!");
        }
    }

    public void setWidth() {
        System.out.print("Введите ширину : ");
        int w = sc.nextInt();
        if (w > 0 && w < MAX) {
            width = w;
        } else {
            System.out.println("Ошибка!"
                    + "\nШирина не может быть меньше нуля и "
                    + " больше " + MAX + "см!");
        }
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        if (height > 0 && height < MAX) {
            this.height = height;
        } else {
            System.out.println("Ошибка!"
                    + "\nВысота не может быть меньше нуля и "
                    + " больше " + MAX + "см!");
        }
    }

    public void setHeight() {
        System.out.print("Введите высоту : ");
        int h = sc.nextInt();
        if (h > 0 && h < MAX) {
            height = h;
        } else {
            System.out.println("Ошибка!"
                    + "\nВысота не может быть меньше нуля и "
                    + " больше " + MAX + "см!");
        }
    }

    public int getPerimeter() {
        return 2 * (width + height);
    }

    public int getArea() {
        return width * height;
    }

    public void draw() {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print(" \u25A0 ");
            }
            System.out.println();
        }
    }
}
