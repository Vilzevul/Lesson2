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

    @Override
    public String toString() {
        return (getStudent() + " обладает следующими качествами: " + "\n" + "Сила магии: " + getMagic() + " трансгрессия: " + getMove() + "\n");
    }

    public void moreMagicPower(Hogvards all) {
        if (this.getMagic() > all.getMagic()) {
            System.out.println(this.getStudent() + " сильнее по силе магии чем " + all.getStudent());
        } else {
            if (this.getMagic() < all.getMagic()) {
                System.out.println(all.getStudent() + " сильнее по силе магии  чем " + this.getStudent());
            } else {
                System.out.println(all.getStudent() + " и" + this.getStudent() + " одинаково сильные");
            }


        }
    }
    public void moreTransgression(Hogvards all) {
        if (this.getMove() > all.getMove()) {
            System.out.println(this.getStudent() + " сильнее по силе трансгрессии чем " + all.getStudent());
        } else {
            if (this.getMove() < all.getMove()) {
                System.out.println(all.getStudent() + " сильнее по силе трансгрессии  чем " + this.getStudent());
            } else {
                System.out.println(all.getStudent() + " и" + this.getStudent() + " одинаково сильные в трансгрессии");
            }


        }
    }

}