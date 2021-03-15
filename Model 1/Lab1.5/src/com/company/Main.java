package com.company;

//1
//На числовой прямой дан отрезок [3;8]. Требуется определить, принадлежит ли точка x данному отрезку.

//import java.util.Scanner;
//
//public class Main
//{
//
//    public static void main(String[] args)
//    {
//        Scanner sc = new Scanner(System.in);
//
//        double a = sc.nextDouble();
//
//        if(a >= 3 && a <= 8)
//            System.out.println("true");
//        else
//            System.out.println("false");
//    }
//}

//2
//На числовой прямой даны два отрезка [−3;5] и [9;15]. Требуется определить, принадлежит ли точка x любому из данных отрезков.

//import java.util.Scanner;
//
//public class Main
//{
//
//    public static void main(String[] args)
//    {
//        Scanner sc = new Scanner(System.in);
//
//        double a = sc.nextDouble();
//
//        if(a >= - 3 && a <= 5 || a >= 9 && a <= 15 )
//            System.out.println("true");
//        else
//            System.out.println("false");
//    }
//}

//3
//На числовой прямой даны два отрезка [−2;3] и [6;9]. Требуется определить, что точка x НЕ принадлежит ни одному из данных отрезков.

//import java.util.Scanner;
//
//public class Main
//{
//
//    public static void main(String[] args)
//    {
//        Scanner sc = new Scanner(System.in);
//
//        double a = sc.nextDouble();
//
//        if(a >= - 2 && a <= 3 || a >= 6 && a <= 9 )
//            System.out.println("false");
//        else
//            System.out.println("true");
//    }
//}

//4
//Дано целое число. Требуется определить, является ли данное число трехзначным положительным числом, кратным пяти.

//import java.util.Scanner;
//
//public class Main
//{
//
//    public static void main(String[] args)
//    {
//        Scanner sc = new Scanner(System.in);
//
//        int a = sc.nextInt();
//        int b, c, d;
//
//        if(a / 1000 == 0 && a / 100 != 0 && a / 10 != 0)
//        {
//            if(a > 0)
//            {
//                if(a % 5 == 0)
//                {
//                    System.out.println("true");
//                }
//                else
//                    System.out.println("false");
//            }
//            else
//                System.out.println("false");
//        }
//        else
//            System.out.println("false");
//
//    }
//}

//5
//Даны 4 целых числа. Требуется определить, есть ли среди этих чисел взаимно противоположные (0 противоположен сам себе).

//import java.util.Scanner;
//
//public class Main
//{
//
//    public static void main(String[] args)
//    {
//        Scanner sc = new Scanner(System.in);
//
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = sc.nextInt();
//        int d = sc.nextInt();
//
//        if(a + b == 0 || a + c == 0 || a + d == 0 || b + c == 0 || b + d == 0 || c + d == 0)
//                System.out.println("true");
//            else
//                System.out.println("false");
//
//    }
//}

//6
//Даны 3 целых числа. Требуется определить, есть ли среди этих чисел хотя бы два четных.

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int count = 0;

        if(a % 2 == 0)
            count++;
        if(b % 2 == 0)
            count++;
        if(c % 2 == 0)
            count++;

        if (count >= 2)
            System.out.println("true");
        else
            System.out.println("false");

    }
}
