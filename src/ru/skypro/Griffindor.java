package ru.skypro;

public class Griffindor extends Hogvards {

    private int property_01;//благородство
    private int property_02;//честь
    private int property_03;//храбрость

    public Griffindor(String student, int magic, int move, int property_01, int property_02, int property_03) {
        super(student, magic, move);
        this.property_01 = property_01;
        this.property_02 = property_02;
        this.property_03 = property_03;
    }

    public int getProperty_01() {
        return property_01;
    }

    public int getProperty_02() {
        return property_02;
    }

    public int getProperty_03() {
        return property_03;
    }

    public void description() {
        System.out.println(getStudent() + " " + "обладает следующими качествами: ");
        System.out.println("    Магия: " + getMagic() + "   трансгрессия: " + getMove());
        System.out.println("и как студент  Griffindor: ");
        System.out.println("благородство: " + property_01 + "  /   честь: " + property_02 + "  /   храбрость: " + property_03);
        System.out.println("<----->");
    }

    static public void compare(Griffindor student1, Griffindor student2) {
        String str1 = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        if (student1.getProperty_01() > student2.getProperty_01()) {
            str1 = " !";
            str2 = "";
        } else {
            str1 = "";
            str2 = " !";
        }
        if (student1.getProperty_02() > student2.getProperty_02()) {
            str3 = " !";
            str4 = "";
        } else {
            str3 = "";
            str4 = " !";
        }
        if (student1.getProperty_03() > student2.getProperty_03()) {
            str5 = " !";
            str6 = "";
        } else {
            str5 = "";
            str6 = " !";
        }
        System.out.println("             " + student1.getStudent() + "     " + " " + student2.getStudent());

        System.out.println("благородство " + student1.getProperty_01() + str1 + "                 " + student2.getProperty_01() + str2);
        System.out.println("честь        " + student1.getProperty_02() + str3 + "                 " + student2.getProperty_02() + str4);
        System.out.println("храбрость    " + student1.getProperty_03() + str5 + "                 " + student2.getProperty_03() + str6);
    }
}
