package com.company;

public class Main {

    public static void main(String[] args) {
        var f1 = new Fraction(1, 3);
        var f2 = new Fraction(3, 4);
        var f3 = new Fraction(-1, 2);


        System.out.println(f1.subFractionTo(f2).toString());
        System.out.println(f2.multFractionTo(f3).toString());
        System.out.println(f3.divFractionTo(f1).toString());

        System.out.println(Fraction.subFraction(f1,f2).toString());
        System.out.println(Fraction.multFraction(f2,f3).toString());
        System.out.println(Fraction.divFraction(f3,f1).toString());
    }
}
