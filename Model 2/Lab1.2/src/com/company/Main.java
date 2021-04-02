package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();

        System.out.println(Integer.toBinaryString(x));
        System.out.println(Integer.toOctalString(x));
        System.out.println(Integer.toHexString(x));

        if(Byte.MAX_VALUE > x )
            System.out.println("YES");
        else
            System.out.println("NO");

        if(Short.MAX_VALUE > x )
            System.out.println("YES");
        else
            System.out.println("NO");

    }
}
