package ru.skypro;

public class Ravenclaw extends Hogwarts {
    private int clever;
    private int wit;
    private int wisdom;
    private int creative;

    public Ravenclaw(String student, int power, int transgression, int clever, int wit, int wisdom, int creative) {
        super(student, power, transgression);
        this.clever = clever;
        this.wit = wit;
        this.wisdom = wisdom;
        this.creative = creative;
    }
}
