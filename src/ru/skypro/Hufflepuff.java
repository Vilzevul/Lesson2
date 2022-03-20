package ru.skypro;

public class Hufflepuff extends Hogvards {
    private int property_01;//трудолюбие
    private int property_02;//верность
    private int property_03;//честность

    public Hufflepuff(String student, int magic, int move, int property_01, int property_02, int property_03) {
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
        hogvardsDescription();
        System.out.println("и как студент  Hufflepuff: ");
        System.out.println("трудолюбие: " + property_01 + "  верность: " + property_02 + "  честность: " + property_03);

    }

    static public void compare(Hufflepuff student1, Hufflepuff student2) {
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

        System.out.println("трудолюбие " + student1.getProperty_01() + str1 + "                 " + student2.getProperty_01() + str2);
        System.out.println("верность   " + student1.getProperty_02() + str3 + "                 " + student2.getProperty_02() + str4);
        System.out.println("честность    " + student1.getProperty_03() + str5 + "                 " + student2.getProperty_03() + str6);
    }
}
