package ru.skypro;

public class Gryffindor extends Hogwarts {
    private int nobility;
    private int honour;
    private int bravery;

    public Gryffindor(String student, int power, int transgression, int nobility, int honour, int bravery) {
        super(student,power,transgression);
        this.nobility = nobility;
        this.honour = honour;
        this.bravery = bravery;

    }
}
