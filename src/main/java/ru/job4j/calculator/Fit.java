package ru.job4j.calculator;

public class Fit {
    public static double manWeight(short menheight) {
        double man = (menheight - 100) * 1.15;
        return man;
    }

    public static double womanWeight(short womanheight) {
        double woman = (womanheight - 110) * 1.15;
        return woman;
    }

    public static void main(String[] args) {
        short menheight = 187;
        double man = Fit.manWeight(menheight);
        System.out.println("Man 187 is " + man);
        short womanheight = 156;
        double woman = Fit.womanWeight(womanheight);
        System.out.println("Woman 156 is " + woman);

    }
}
