package com.example;

import com.example.domain.Animal;
import com.example.domain.Cat;
import com.example.domain.Fish;
import com.example.domain.Spider;

public class PetMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Animal a;
        Spider s = new Spider();
        s.walk();
        Cat c = new Cat("Том");
        c.walk();
        a = new Cat();
        a.walk();
        Fish f = new Fish();
        f.setName("Гуппи");
        f.walk();
        a = new Fish();
        a.walk();

        s.eat();
        c.eat();
        f.eat();
        a.eat();
        a = new Cat();
        a.eat();
    }

}
