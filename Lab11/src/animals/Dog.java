package animals;

import java.util.*;

/**
 *
 */
public class Dog extends Pet {

    /**
     * Default constructor
     */
    public Dog(String name) {
        super(name);
        this.kind = "волчьи";
        this.legs = 4;
    }

    /**
     *
     */
    public void defend() {
        System.out.println("Собака сторожит дом!");
    }

    /**
     *
     */
    public void bringShoes() {
        System.out.println("Собака приносит тапочки!");
    }

    @Override
    public void speak() {
        System.out.println("Собака лает!");
    }

    @Override
    public void eat() {
        System.out.println("Собака грызет кость!");
    }
    
    

}
