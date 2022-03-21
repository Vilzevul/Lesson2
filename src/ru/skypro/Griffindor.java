package ru.skypro;

public class Griffindor extends Hogvards {

    private int nobility;//благородство
    private int honour;//честь
    private int bravery;//храбрость

    public Griffindor(String student, int magic, int move, int nobility, int honour, int bravery) {
        super(student, magic, move);
        this.nobility = nobility;
        this.honour = honour;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonour() {
        return honour;
    }

    public int getBravery() {
        return bravery;
    }

    @Override
    public String toString() {
        return (getStudent() + " обладает следующими качествами: " + "\n" + "Сила магии: " + getMagic() + " трансгрессия: "
                + getMove() + "\n" + " и как студент Гриффиндор: " + "\n" + " благородство: " + nobility + " честь: " + honour +
                " храбрость " + bravery);
    }

    public void moreHonour(Griffindor all) {
        if (this.getHonour() > all.getHonour()) {
            System.out.println(this.getStudent() + " честнее чем " + all.getStudent());
        } else {
            if (this.getHonour() < all.getHonour()) {
                System.out.println(all.getStudent() + " честнее чем " + this.getStudent());
            } else {
                System.out.println(all.getStudent() + " и" + this.getStudent() + " одинаково честные");
            }

        }
    }

    public void moreNobility(Griffindor all) {
        if (this.getNobility() > all.getNobility()) {
            System.out.println(this.getStudent() + " благороднее чем " + all.getStudent());
        } else {
            if (this.getNobility() < all.getNobility()) {
                System.out.println(all.getStudent() + " благороднее чем " + this.getStudent());
            } else {
                System.out.println(all.getStudent() + " и" + this.getStudent() + " одинаково благородны");
            }

        }
    }

    public void moreBrave(Griffindor all) {
        if (this.getBravery() > all.getBravery()) {
            System.out.println(this.getStudent() + " храбрее чем " + all.getStudent());
        } else {
            if (this.getBravery() < all.getBravery()) {
                System.out.println(all.getStudent() + " храбрее чем " + this.getStudent());
            } else {
                System.out.println(all.getStudent() + " и" + this.getStudent() + " одинаково храбрые");
            }
        }
    }
}
