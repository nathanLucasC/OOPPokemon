package org.example;

public abstract class Pokemon {
    private String name;
    private String type;
    private String weakness;
    private String resistance;

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getWeakness() {
        return weakness;
    }

    public String getResistance() {
        return resistance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setWeakness(String weakness) {
        this.weakness = weakness;
    }

    public void setResistance(String resistance) {
        this.resistance = resistance;
    }

    public abstract void attack();
    public abstract void makeNoise();
}
