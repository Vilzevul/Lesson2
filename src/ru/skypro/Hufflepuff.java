package ru.skypro;

public class Hufflepuff extends Hogwarts{
    private int diligence;
    private int loyality;
    private int honesty;

    public Hufflepuff(String student, int power, int transgression, int diligence, int loyality, int honesty) {
        super(student,power,transgression);
        this.diligence = diligence;
        this.loyality = loyality;
        this.honesty = honesty;
    }
}
