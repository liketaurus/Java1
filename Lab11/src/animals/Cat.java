package animals;

import java.util.*;

/**
 *
 */
public class Cat extends Pet {

    /**
     * Default constructor
     */
    public Cat(String name) {
        super(name);
        this.kind = "кошачьи";
        this.legs = 4;
    }

    /**
     *
     */
    public void mrrr() {
        System.out.println("Кот урчит и успокаивает!");
    }

    @Override
    public void play() {
        System.out.println("Кот играет с едой!");
    }

    @Override
    public void speak() {
        System.out.println("Кот говорит МЯУ!");
    }

    @Override
    public void eat() {
        System.out.println("Кот ест Вискас!");
    }

    
}
