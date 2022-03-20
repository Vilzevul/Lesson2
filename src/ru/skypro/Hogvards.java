package ru.skypro;

public class Hogvards {
    private String student;
    private int magic;
    private int move;

    public Hogvards(String student, int magic, int move) {
        this.student = student;
        this.magic = magic;
        this.move = move;
    }

    public String getStudent() {
        return student;
    }

    public int getMagic() {
        return magic;
    }

    public int getMove() {
        return move;
    }

    public void hogvardsDescription() {
        System.out.println(student + " " +
                "обладает качествами: ");
        System.out.println("магия: " + magic + "     трансгрессия: " + move);
    }

    static public void compare(Hogvards student1, Hogvards student2) {
        String str1 = "             " + student1.getStudent();
        String str2 = " " + student2.getStudent();

        System.out.println(str1 + "     " + str2);

        System.out.println("Магия  " + student1.getMagic() + "                 " + student2.getMagic());
        System.out.println("Перемещение    " + student1.getMove() + "                 " + student2.getMove());
        if (student1.getMagic() > student2.getMagic())
            System.out.println(student1.getStudent() + " круче чем " + student2.getStudent());
        else
            System.out.println(student2.getStudent() + " круче чем " + student1.getStudent());
    }
}
