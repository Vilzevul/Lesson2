package ru.skypro;

public class Main {

    public static void main(String[] args) {
        // Griffindor
        Griffindor potter = new Griffindor("Гарри Поттер", 1, 2, 10, 20, 40);
        Griffindor hermione = new Griffindor("Гермиона Грейнджер", 2, 3, 11, 21, 31);
        Griffindor ron = new Griffindor("Рон Уизли", 1, 1, 1, 2, 3);

        // Slytherin
        Slytherin draco = new Slytherin("Драко Малфой", 5, 6, 7, 9, 9, 9, 9);
        Slytherin graham = new Slytherin("Грэхэм Монтегю", 11, 51, 6, 7, 6, 5, 4);
        Slytherin gregory = new Slytherin("Грегори Гойл", 0, 0, 1, 1, 1, 1, 2);

        // Hufflepuff
        Hufflepuff zacharias = new Hufflepuff("Захария Смит", 1, 2, 10, 20, 30);
        Hufflepuff cedric = new Hufflepuff("Седрик Диггори", 2, 3, 11, 21, 31);
        Hufflepuff justin = new Hufflepuff("Джастин Финч-Флетчли", 1, 1, 1, 2, 3);

        // Ravenclaw
        Ravenclaw chang = new Ravenclaw("Чжоу Чанг", 5, 6, 7, 9, 9, 9);
        Ravenclaw padma = new Ravenclaw("Падма Патил", 11, 51, 16, 27, 36, 45);
        Ravenclaw marcus = new Ravenclaw("Маркус Белби", 3, 4, 1, 11, 11, 11);


        hermione.moreHonour(ron);
        draco.moreResourseful(graham);
        zacharias.moreDiligence(cedric);
        chang.moreClever(padma);
        System.out.println(hermione);
        draco.moreMagicPower(hermione);
        cedric.moreTransgression(justin);
    }
}
