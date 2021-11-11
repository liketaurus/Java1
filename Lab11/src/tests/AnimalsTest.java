/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests;

//import animals.Cat;
import animals.Animal;
import animals.Dog;
import animals.Pet;
import animals.Spider;

/**
 *
 * @author alexa
 */
public class AnimalsTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        animals.Cat myCat = new animals.Cat("Барсик");
        System.out.println(myCat);
        myCat.play();
        myCat.mrrr();
        myCat.speak();
        myCat.eat();

        Dog myDog = new Dog("Шарик");
        System.out.println(myDog);
        myDog.play();
        myDog.defend();
        myDog.bringShoes();
        myDog.speak();
        myDog.eat();

        Spider spider = new Spider();
        System.out.println(spider);
        spider.makeNet();
        spider.speak();
        spider.eat();

        System.out.println("Кот - это животное? " + (myCat instanceof Animal));                
        
    }

}
