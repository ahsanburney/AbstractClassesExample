package com.ahsanburney;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Dog dog = new Dog("Yorkie");
        dog.breathe();
        dog.eat();

        System.out.println("====================");

        Parrot parrot = new Parrot("Australian Ringneck");
        parrot.breathe();
        parrot.eat();
        parrot.fly();

        System.out.println("======================");

        Penguin penguin = new Penguin("Australian Penguin");
        penguin.breathe();
        penguin.eat();
        penguin.fly();
    }
}
