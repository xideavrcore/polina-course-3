package com.example.domain;

public class Belka extends Animal implements Pet {

    private String name;

    public Belka(String name) {
        super(4);
        this.name = name;
    }

    public Belka() {
        this("Белка");
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        System.out.println(name + " любит прыгать по деревьям");
    }

    @Override
    public void eat() {
        System.out.println("Белка ест орехи");
    }

}
