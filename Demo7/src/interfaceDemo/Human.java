/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaceDemo;

/**
 *
 * @author alexa
 */
public abstract class Human {

    protected String name;

    public Human(String name) {
        this.name = name;
    }

    public abstract void speak();

    public abstract void think();

    public void eat() {
        System.out.println("Супермен питается человеческой пищей!");
    }

}
