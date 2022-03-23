package ru.skypro;

public class Hufflepuff extends Hogvards {
    private int diligence;//трудолюбие
    private int loyality;//верность
    private int honesty;//честность

    public Hufflepuff(String student, int magic, int move, int diligence, int loyality, int honesty) {
        super(student, magic, move);
        this.diligence = diligence;
        this.loyality = loyality;
        this.honesty = honesty;
    }

    public int getDiligence() {
        return diligence;
    }

    public int getLoyality() {
        return loyality;
    }

    public int getHonesty() {
        return honesty;
    }

    @Override
    public String toString() {
        return (super.toString() +  " и как студент Пуффендуй" + "\n" + " трудолюбие: " + diligence + " верность: " + loyality + " честность" + honesty);
    }

    public void moreDiligence(Hufflepuff all) {
        if (this.getDiligence() > all.getDiligence()) {
            System.out.println(this.getStudent() + " трудолюбивее чем " + all.getStudent());
        } else {
            if (this.getDiligence() < all.getDiligence()) {
                System.out.println(all.getStudent() + " трудолюбивее чем " + this.getStudent());
            } else {
                System.out.println(all.getStudent() + " и" + this.getStudent() + " одинаково трудолюбивы");
            }
        }
    }

    public void moreLoyality(Hufflepuff all) {
        if (this.getLoyality() > all.getLoyality()) {
            System.out.println(this.getStudent() + " вернее чем " + all.getStudent());
        } else {
            if (this.getLoyality() < all.getLoyality()) {
                System.out.println(all.getStudent() + " вернее чем " + this.getStudent());
            } else {
                System.out.println(all.getStudent() + " и" + this.getStudent() + " одинаково верные");
            }
        }
    }

    public void moreHonesty(Hufflepuff all) {
        if (this.getHonesty() > all.getHonesty()) {
            System.out.println(this.getStudent() + " честнее чем " + all.getStudent());
        } else {
            if (this.getHonesty() < all.getHonesty()) {
                System.out.println(all.getStudent() + " честнее чем " + this.getStudent());
            } else {
                System.out.println(all.getStudent() + " и" + this.getStudent() + " одинаково честные");
            }

        }
    }

}