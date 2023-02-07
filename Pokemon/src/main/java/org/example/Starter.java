package org.example;

public class Starter {
    public static void start(){
        Charmander charmander = new Charmander();
        Pidgey pidgey = new Pidgey();

        charmander.makeNoise();
        charmander.attack();
        charmander.run();
        System.out.println();
        pidgey.makeNoise();
        pidgey.attack();
        pidgey.fly();
    }
}
