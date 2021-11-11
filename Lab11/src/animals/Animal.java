package animals;

import java.util.*;

/**
 *
 */
public abstract class Animal {

    /**
     * Default constructor
     */
    public Animal() {
        kind = "неизвестно";
        age = 0;
        weight = 0;
        legs = 6;
    }

    /**
     *
     */
    protected String kind;

    /**
     *
     */
    protected int age;

    /**
     *
     */
    protected int weight;

    /**
     *
     */
    protected int legs;

    /**
     *
     */
    @Override
    public String toString() {

        return "\nПодробная информация:"
                + "\nвид :\t\t" + kind
                + "\nвозраст :\t" + age
                + "\nвес :\t\t" + weight
                + "\nлап :\t\t" + legs;
    }

    /**
     *
     */
    public abstract void eat();
//    {
//        System.out.println("Животное ест! Не мешать!");
//    }

    /**
     *
     */
    public abstract void speak();
//    {
//        System.out.println("Животное издает звук!");
//    }

}
