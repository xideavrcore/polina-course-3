package com.example.domain;

public class Cat extends Animal {

    private String name;

    public Cat(String name) {
        super(4);
        this.name = name;
    }

    public Cat() {
        this("Мурка");
    }

    public String getName() {
        return name;
    }

    @Override
    public void eat() {
        System.out.println("Кошки любят есть пауков и рыбок");
    }

}
