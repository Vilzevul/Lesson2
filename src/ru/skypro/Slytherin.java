package ru.skypro;

public class Slytherin extends Hogwarts{
    private int tricky;
    private int determination;
    private int ambitious;
    private int resourceful;
    private int powerDesire;

    public Slytherin(String student, int power, int transgression, int tricky, int determination, int ambitious, int resourceful, int powerDesire) {
        super(student, power,transgression);
        this.tricky = tricky;
        this.determination = determination;
        this.ambitious = ambitious;
        this.resourceful = resourceful;
        this.powerDesire = powerDesire;
    }
}
