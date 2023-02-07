package org.example;

public class Pidgey extends Pokemon implements Flies{

    public Pidgey(){
        this.setName("Pidgey");
        this.setType("Flying");
        this.setWeakness("Rock");
        this.setResistance("Ghost");
    }

    @Override
    public void attack() {
        System.out.println(this.getName() + " attacks using Gust!");
    }

    @Override
    public void makeNoise() {
        System.out.println("Tweeeet!");
    }

    @Override
    public void fly() {
        System.out.println(this.getName() + " attempts to fly away...");
    }
}
