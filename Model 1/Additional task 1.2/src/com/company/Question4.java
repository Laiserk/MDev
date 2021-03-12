//Дан прямоугольник со сторонами A и B. Требуется вычислить квадрат диагонали прямоугольника

package com.company;

import java.util.Scanner;

public class Question4
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt(), b = sc.nextInt();

        int c =  a * a + b * b;

        System.out.println(c);
    }
}
