package ru.skypro;

public class Hogwarts {
    private String student;
    private int power;
    private int transgression;

    public Hogwarts(String student, int power, int transgression) {
        this.student = this.student;
        this.power = this.power;
        this.transgression = this.transgression;
    }

    public String getStudent() {
        return student;
    }

    public int getTransgression() {
        return transgression;
    }

    public int getPower() {
        return power;
    }

    public void students() {
        System.out.println(student + " "+" Сила = " + power +" " + " Трансгрессия = " + transgression);
    }
}
