package com.ahsanburney;

/**
 * Created by Kulsum on 6/10/2017.
 */
public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating");
    }

    @Override
    public void breathe() {
        System.out.println("Breathe in,Breathe out repeat");

    }
}
