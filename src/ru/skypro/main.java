package ru.skypro;

public class main {

    public static void main(String[] args) {
        Gryffindor Harry = new Gryffindor("Гарри Поттер", 97, 66, 25, 30, 40);
        Gryffindor Hermiona = new Gryffindor("Гермиона Грейнджер" ,82, 87,40, 35, 30);
        Gryffindor Ron = new Gryffindor("Рон Уизли", 78, 43, 55, 78, 61);

        Slytherin Drako = new Slytherin("Драко Малфой", 91, 78, 55, 43, 66, 25, 77);
        Slytherin Grehem = new Slytherin("Грэхэм Монтегрю",78, 66, 48, 55, 67, 34, 64);
        Slytherin Gregory = new Slytherin("Грегори Гойл", 78, 37, 66, 32, 49, 12, 55);

        Hufflepuff smith = new Hufflepuff("Захария Смит", 56, 89, 67, 35, 44);
        Hufflepuff sedric = new Hufflepuff("Седрик Дигори", 96, 89, 88, 54, 61);
        Hufflepuff justin = new Hufflepuff("Джастин Финч-Флетчли", 78, 83, 47, 86, 73);

        Ravenclaw chang = new Ravenclaw("Чжоу Чанг",67, 84, 66, 33, 44, 66);
        Ravenclaw patil = new Ravenclaw("Падма Патил", 54,65, 73, 44, 99, 64);
        Ravenclaw belbi = new Ravenclaw("Маркус Белби" , 61,87, 44, 67, 94, 36);
    Harry.students();
    Hermiona.students();
    Ron.students();
    
    }

}

