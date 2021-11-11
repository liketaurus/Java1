package animals;

import java.util.*;

/**
 *
 */
public abstract class Pet extends Animal {

    /**
     * Default constructor
     */
    public Pet(String name) {
        this.name = name;
    }

    /**
     *
     */
    protected String name;

    /**
     *
     */
    public void play() {
        System.out.println("Хозяин играет с питомцем");
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nимя :\t\t" + name;
    }

}
