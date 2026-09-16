package com.example;

import com.example.domain.Animal;
import com.example.domain.Belka;
import com.example.domain.Cat;
import com.example.domain.Fish;
import com.example.domain.Pet;
import com.example.domain.Spider;

public class PetMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Animal a;
        //test a spider with a spider reference
        Spider s = new Spider();
        s.eat();
        s.walk();
        Cat c = new Cat("Tom");
        c.eat();
        c.walk();
        c.play();
        a = new Cat();
        a.eat();
        a.walk();
        Pet p;
        p = new Cat();
        p.setName("Mr. Whiskers");
        p.play();
        Fish f = new Fish();
        f.setName("Guppy");
        f.eat();
        f.walk();
        f.play();
        a = new Fish();
        a.eat();
        a.walk();

        playWithAnimal(s);
        playWithAnimal(c);
        playWithAnimal(f);

        Belka b = new Belka("Рыжая");
        b.eat();
        b.walk();
        b.play();
        playWithAnimal(b);
    }

    public static void playWithAnimal(Animal a) {
        if (a instanceof Pet) {
            Pet p = (Pet) a;
            p.play();
        } else {
            System.out.println("Опасно, дикое животное");
        }
    }

}
