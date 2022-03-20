package ru.skypro;

public class Slytherin extends Hogvards {
    private int property_01;//хитрость
    private int property_02;//решительность
    private int property_03;//амбициозность
    private int property_04;//находчивость
    private int property_05;//жажда власти

    public Slytherin(String student, int magic, int move, int property_01, int property_02, int property_03,
                     int property_04, int property_05) {
        super(student, magic, move);
        this.property_01 = property_01;
        this.property_02 = property_02;
        this.property_03 = property_03;
        this.property_04 = property_04;
        this.property_05 = property_05;

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

    public int getProperty_04() {
        return property_04;
    }

    public int getProperty_05() {
        return property_05;
    }

    public void description() {
        hogvardsDescription();
        System.out.println("и как студент  Slytherin: ");
        System.out.println("хитрость: " + property_01 + "  решительность: " + property_02 + "  амбициозность: " + property_03 + "   находчивость:  " + property_04 + "   жажда власти:  " + property_05);

    }

    static public void compare(Slytherin student1, Slytherin student2) {
        String str1 = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;

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
        if (student1.getProperty_04() > student2.getProperty_04()) {
            str7 = " !";
            str8 = " ";
        } else {
            str7 = "";
            str8 = " !";
        }
        if (student1.getProperty_05() > student2.getProperty_05()) {
            str9 = " !";
            str10 = " ";
        } else {
            str10 = "";
            str10 = " !";
        }

        System.out.println("             " + student1.getStudent() + "     " + " " + student2.getStudent());

        System.out.println("хитрость " + student1.getProperty_01() + str1 + "                 " + student2.getProperty_01() + str2);
        System.out.println("решительность " + student1.getProperty_02() + str3 + "                 " + student2.getProperty_02() + str4);
        System.out.println("амбициозность    " + student1.getProperty_03() + str5 + "                 " + student2.getProperty_03() + str6);
        System.out.println("находчивость    " + student1.getProperty_04() + str7 + "                 " + student2.getProperty_04() + str8);
        System.out.println("жажда власти    " + student1.getProperty_05() + str9 + "                 " + student2.getProperty_05() + str10);

    }
}