package ru.skypro;

public class Person {
    public String name;
    public String surname;


    public void changePerson(Person person) {
        //person = new Person();
        person.name = "Ilya";
        person.surname = "Lagutenko";

    }

    public String getSurname() {
        return name;
    }

    public String getName() {
        return surname;
    }
    @Override
    public String toString() {
        return name + " " + surname;
    }
}

