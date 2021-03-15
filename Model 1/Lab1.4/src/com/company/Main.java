package com.company;
//1
//Напишите программу, которая обнуляет заданное количество последних бит числа.

//import java.util.Scanner;
//
//
//public class Main
//{
//
//    public static void main(String[] args)
//    {
//        Scanner sc = new Scanner(System.in);
//
//        int a = sc.nextInt();
//        int i = sc.nextInt();
//
//        a =  a & -(1 << i);
//
//
//        System.out.printf("%d", a);
//    }
//}


//2
//Напишите программу, вычисляющую заданную степень числа 2, используя битовые операции

//import java.util.Scanner;
//
//public class Main
//{
//
//    public static void main(String[] args)
//    {
//        Scanner sc = new Scanner(System.in);
//
//        int n = sc.nextInt();
//        int i;
//
//        i = (1 << n);
//
//
//        System.out.printf("%d", i);
//    }
//}

//3
//Напишите программу, которая в заданном целом числе A устанавливает значение бита под номером i равным 1. Биты нумеруются с нуля, начиная от младших.

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
//        int i = sc.nextInt();
//
//        a = a | (1 << i);
//
//
//        System.out.printf("%d", a);
//    }
//}

//4
//Напишите программу, которая в заданном целом числе A устанавливает значение бита под номером i равным 1. Биты нумеруются с нуля, начиная от младших.

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
//        int i = sc.nextInt();
//
//        a = a ^ (1 << i);
//
//
//        System.out.printf("%d", a );
//    }
//}

//5
//Напишите программу, обнуляющие все биты целого числа А, кроме i младших бит.

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
//        int i = sc.nextInt();
//
//        int k = 0;
//        for(int j = 0; j < i; j++)
//        {
//            k = (k<< 1) | 1;
//        }
//
//        a &= k;
//
//        System.out.printf("%d", a );
//    }
//}

//6
//Дано натуральное число N. Определите является ли число N точной степенью числа 2.

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i = 0; i < Math.pow(2, n); i++)
        {
            if(n == Math.pow(2, i) )
            {
                System.out.println("YES");
                break;
            }
            else if( Math.pow(i, 2) > n )
            {
                System.out.println("NO");
                break;
            }

        }

    }
}