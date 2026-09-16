package com.example.domain;

public class Fish extends Animal implements Pet {

    private String name;

    public Fish() {
        super(0);
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
        System.out.println("Рыбка просто плавает");
    }

    @Override
    public void walk() {
        System.out.println("Рыбки, конечно, гулять не могут - они плавают");
    }

    @Override
    public void eat() {
        System.out.println("Рыбки едят червяков");
    }

}
