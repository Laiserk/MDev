package com.company;


public class Main {

    public static void main(String[] args) {

        var v = new Vector2D(1.2374, 2.2334);
        var v2 = new Vector2D();
        var v3 = new Vector2D(v);

        v.print();
        v2.print();
        v3.print();
    }
}


