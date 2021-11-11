package animals;

import java.util.*;

/**
 *
 */
public class Spider extends Animal {

    /**
     * Default constructor
     */
    public Spider() {
        this.legs = 8;
        this.kind = "насекомые";
    }

    /**
     *
     */
    public void makeNet() {
        System.out.println("Паук плетет паутину!");
    }

    @Override
    public void eat() {
        System.out.println("Паук ест мух!");
    }

    @Override
    public void speak() {
        System.out.println("Паук молчит!");
    }

}
