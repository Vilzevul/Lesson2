package ru.skypro;

public class Employee {
    private static int counter;
    private final int id;
    private String name;
    private String patronymic;
    private String lastName;
    private int unit;
    private double salary;

    public Employee(String name, String patronymic, String lastName, int unit, double salary) {
        this.id = counter;
        this.name = name;
        this.lastName = lastName;
        this.patronymic = patronymic;
        this.unit = unit;
        this.salary = salary;
        counter++;
    }

    //геттеры
    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public int getUnit() {
        return unit;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setUnit(int unit) {
        this.unit = unit;
    }

    @Override
    public String toString() {
        return id + ". " + name + " " + patronymic + " " + lastName +", подразделение - "
                + unit + "; зарплата составила - " + salary + " рублей";
    }

}
