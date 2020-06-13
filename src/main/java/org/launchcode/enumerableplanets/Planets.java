package org.launchcode.enumerableplanets;

public enum Planets {

    MERCURY("Mercury", 88),
    VENUS("Venus", 225),
    EARTH("Earth", 365),
    MARS("Mars", 687),
    JUPTER("Jupiter", 4333),
    SATURN("Saturn", 10759),
    URANUS("Uranus", 30687),
    NEPTUNE("Neptune", 60200);


    private int yearLength;
    private String name;

    Planets(String name, int yearLength) {
        this.name = name;
        this.yearLength = yearLength;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearLength() {
        return yearLength;
    }

    public void setYearLength(int yearLength) {
        this.yearLength = yearLength;
    }
}
