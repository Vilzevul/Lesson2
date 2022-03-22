package ru.skypro;

public class Ravenclaw extends Hogvards {
    private int clever;//ум
    private int wit;//мудрость
    private int wisdom;//остроумие
    private int creative;//творчество


    public Ravenclaw(String student, int magic, int move, int clever, int wit, int wisdom,
                     int creative) {
        super(student, magic, move);
        this.clever = clever;
        this.wit = wit;
        this.wisdom = wisdom;
        this.creative = creative;

    }

    public int getClever() {
        return clever;
    }

    public int getWit() {
        return wit;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getCreative() {
        return creative;
    }

    @Override
    public String toString() {
        return (toString1() + " и как студент Когтевран" + "\n" + " ум: " + clever + " мудрость: " + wit + " остроумие: " + wisdom + " творчество: " + creative);
    }

    public void moreClever(Ravenclaw all) {
        if (this.getClever() > all.getClever()) {
            System.out.println(this.getStudent() + " умнее чем " + all.getStudent());
        } else {
            if (this.getClever() < all.getClever()) {
                System.out.println(all.getStudent() + " умнее чем " + this.getStudent());
            } else {
                System.out.println(all.getStudent() + " и" + this.getStudent() + " одинаково умные");
            }

        }
    }

    public void moreWit(Ravenclaw all) {
        if (this.getWit() > all.getWit()) {
            System.out.println(this.getStudent() + " мудрее чем " + all.getStudent());
        } else {
            if (this.getWit() < all.getWit()) {
                System.out.println(all.getStudent() + " мудрее чем " + this.getStudent());
            } else {
                System.out.println(all.getStudent() + " и" + this.getStudent() + " одинаково мудрые");
            }

        }
    }

    public void moreWisdom(Ravenclaw all) {
        if (this.getWisdom() > all.getWisdom()) {
            System.out.println(this.getStudent() + " остроумнее чем " + all.getStudent());
        } else {
            if (this.getWisdom() < all.getWisdom()) {
                System.out.println(all.getStudent() + " остроумнее чем " + this.getStudent());
            } else {
                System.out.println(all.getStudent() + " и" + this.getStudent() + " одинаково остроумные");
            }

        }
    }

    public void moreCreative(Ravenclaw all) {
        if (this.getCreative() > all.getCreative()) {
            System.out.println(this.getStudent() + " более творческий чем " + all.getStudent());
        } else {
            if (this.getCreative() < all.getCreative()) {
                System.out.println(all.getStudent() + " более творческий чем " + this.getStudent());
            } else {
                System.out.println(all.getStudent() + " и" + this.getStudent() + " одинаково творческие");
            }

        }
    }
}
