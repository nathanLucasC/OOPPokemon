package org.example;

public class Charmander extends Pokemon implements Runs{

    public Charmander(){
        this.setName("Charmander");
        this.setType("Fire");
        this.setWeakness("Water");
        this.setResistance("Grass");
    }

    @Override
    public void attack() {
        System.out.println(this.getName() + " attacks using Scratch!");
    }

    @Override
    public void makeNoise() {
        System.out.println("Roaaaarr!");
    }

    @Override
    public void run() {
        System.out.println(this.getName() + " attempts to run away...");
    }
}
