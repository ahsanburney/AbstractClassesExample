package com.ahsanburney;

/**
 * Created by Kulsum on 6/10/2017.
 */
public class Penguin extends  Bird{
    public Penguin(String name) {
        super(name);
    }

    @Override
    public void fly() {
        super.fly();
        System.out.println("I'm not very good at that!");
    }
}
