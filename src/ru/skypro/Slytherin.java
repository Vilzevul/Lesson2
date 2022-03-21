package ru.skypro;

public class Slytherin extends Hogvards {
    private int tricky;//хитрость
    private int determination;//решительность
    private int ambtious;//амбициозность
    private int resourseful;//находчивость
    private int powerDesire;//жажда власти

    public Slytherin(String student, int magic, int move, int tricky, int determination, int ambtious,
                     int resourseful, int powerDesire) {
        super(student, magic, move);
        this.tricky = tricky;
        this.determination = determination;
        this.ambtious = ambtious;
        this.resourseful = resourseful;
        this.powerDesire = powerDesire;

    }

    public int getTricky() {
        return tricky;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbtious() {
        return ambtious;
    }

    public int getResourseful() {
        return resourseful;
    }

    public int getPowerDesire() {
        return powerDesire;
    }

    @Override
    public String toString() {
        return (getStudent() + " обладает следующими качествами: " + "\n" + "Сила магии: " + getMagic() + " трансгрессия: " + getMove() + "\n" +
                " и как студент Слизерин" + "\n" + " хитрость: " + tricky + " решительность: " + determination + " амбициозность" + ambtious +
                " находчивость: " + resourseful + " жажда власти: " + powerDesire);
    }

    public void moreTricky(Slytherin all) {
        if (this.getTricky() > all.getTricky()) {
            System.out.println(this.getStudent() + " хитрее чем " + all.getStudent());
        } else {
            if (this.getTricky() < all.getTricky()) {
                System.out.println(all.getStudent() + " хитрее чем " + this.getStudent());
            } else {
                System.out.println(all.getStudent() + " и" + this.getStudent() + " одинаково хитрые");
            }

        }
    }

    public void moreDetermination(Slytherin all) {
        if (this.getDetermination() > all.getDetermination()) {
            System.out.println(this.getStudent() + " решительнее чем " + all.getStudent());
        } else {
            if (this.getDetermination() < all.getDetermination()) {
                System.out.println(all.getStudent() + " решительнее чем " + this.getStudent());
            } else {
                System.out.println(all.getStudent() + " и" + this.getStudent() + " одинаково решительные");

            }
        }
    }

    public void moreAmbitious(Slytherin all) {
        if (this.getAmbtious() > all.getAmbtious()) {
            System.out.println(this.getStudent() + " амбициознее чем " + all.getStudent());
        } else {
            if (this.getAmbtious() < all.getAmbtious()) {
                System.out.println(all.getStudent() + " амбициознее чем " + this.getStudent());
            } else {
                System.out.println(all.getStudent() + " и" + this.getStudent() + " одинаково амбициозные");
            }

        }
    }

    public void moreResourseful(Slytherin all) {
        if (this.getResourseful() > all.getResourseful()) {
            System.out.println(this.getStudent() + " находчивее чем " + all.getStudent());
        } else {
            if (this.getResourseful() < all.getResourseful()) {
                System.out.println(all.getStudent() + " находчивее чем " + this.getStudent());
            } else {
                System.out.println(all.getStudent() + " и" + this.getStudent() + " одинаково находчивые");
            }

        }
    }

    public void morePowerDesire(Slytherin all) {
        if (this.getPowerDesire() > all.getPowerDesire()) {
            System.out.println(this.getStudent() + " любит власть больше чем " + all.getStudent());
        } else {
            if (this.getPowerDesire() < all.getPowerDesire()) {
                System.out.println(all.getStudent() + " любит власть больше чем " + this.getStudent());
            } else {
                System.out.println(all.getStudent() + " и" + this.getStudent() + " любит власть больше чем ");
            }

        }
    }

}
