package com.company;
//1
//С клавиатуры вводятся целые числа, пока не будет введено отрицательное число.
//
//        Вывести на экран количество введенных чисел.

//import java.util.Scanner;
//
//public class Main
//{
//
//    public static void main(String[] args)
//    {
//        Scanner sc = new Scanner(System.in);
//
//        int a, count = 0;
//        do
//        {
//            a = sc.nextInt();
//            count ++;
//        }  while (a >= 0);
//
//        System.out.printf("%d", count);
//    }
//}

//2
//С клавиатуры вводятся натуральные числа, пока не будет введено число, делящееся на 5.
//
//Вывести на экран сумму тех введенных чисел, которые больше 10.
//
//Если таких чисел не окажется, вывести 0.

//import java.util.Scanner;
//
//public class Main
//{
//
//    public static void main(String[] args)
//    {
//        Scanner sc = new Scanner(System.in);
//
//        int a, count = 0;
//        int sum = 0;
//        do
//        {
//            a = sc.nextInt();
//            if(a > 10)
//                sum += a;
//
//        }  while (a % 5 != 0);
//
//        System.out.printf("%d", sum);
//    }
//}

//3
//С клавиатуры вводятся двузначные числа (натуральные), пока не будет введено другое число.
//
//Вывести на экран сумму цифр во всех двузначных числах.
//
//import java.util.Scanner;
//
//public class Main
//{
//
//    public static void main(String[] args)
//    {
//        Scanner sc = new Scanner(System.in);
//
//        int a, count = 0;
//        int sum = 0;
//        do
//        {
//            a = sc.nextInt();
//            if(a <= 99 && a >= 10)
//            {
//                sum += a / 10;
//                sum += a % 10;
//            }
//        }  while (a / 10 != 0 && a / 100 == 0);
//
//        System.out.printf("%d", sum);
//    }
//}

//4
//С клавиатуры вводится два натуральных числа -- A и B.
//
//Вывести на экран частное и остаток от деления A на B, не используя операцию деления.
//
//Подсказка: нужно вычитать из первого числа второе и считать, сколько раз это получилось сделать.

//
//import java.util.Scanner;
//
//public class Main
//{
//
//    public static void main(String[] args)
//    {
//        Scanner sc = new Scanner(System.in);
//
//        int a, b;
//        a = sc.nextInt();
//        b = sc.nextInt();
//        int div = 0, mod = 0;
//        while(a >= b)
//        {
//            a = a - b;
//            div++;
//        }
//        if(a != 0)
//            mod = a;
//
//        System.out.printf("%d %d", div, mod);
//    }
//}

//5
//С клавиатуры вводится натуральное число. Вывести на экран количество цифр в двоичном представлении числа.
//
//Подсказка: нужно делить число на 2 и считать остатки.
//
//Пояснение с примеру:
//
//Число 35 в двоичном виде записывается как 100011. Это 6 разрядов.


//import java.util.Scanner;
//
//public class Main
//{
//
//    public static void main(String[] args)
//    {
//        Scanner sc = new Scanner(System.in);
//
//        int a, count = 1;
//        a = sc.nextInt();
//
//        while (a / 2 != 0)
//        {
//            a = a / 2;
//            count++;
//        }
//
//        System.out.printf("%d", count);
//    }
//}

//6
//Ввести с клавиатуры нечетное натуральное число N (25<N<100).
//
//Найти сумму всех четных чисел в диапазоне от 25 до N.
//
//Вывести результат на экран.
//
//import java.util.Scanner;
//
//public class Main
//{
//
//    public static void main(String[] args)
//    {
//        Scanner sc = new Scanner(System.in);
//
//        int a, sum = 0;
//        a = sc.nextInt();
//
//        for(int i = 25; i < a; i++)
//        {
//            if(i % 2 == 0)
//                sum += i;
//        }
//
//        System.out.printf("%d", sum);
//    }
//}

//7
//Ввести с клавиатуры натуральное число N (N<10^9).
//
//Вывести на экран количество десятичных цифр в числе.

//import java.util.Scanner;
//
//public class Main
//{
//
//    public static void main(String[] args)
//    {
//        Scanner sc = new Scanner(System.in);
//
//        int a, count = 1;
//        a = sc.nextInt();
//
//        for(int i = 0; i <= 9; i++)
//        {
//            a = (int)(a / 10);
//            if(a != 0)
//                count ++;
//        }
//
//        System.out.printf("%d", count);
//    }
//}

//8
//С клавиатуры вводится (в целочисленную ячейку памяти!) натуральное число N (N<10^9).
//Вывести на экран самую младшую нечетную цифру в десятичном представлении числа. Если в числе нет нечетных цифр, вывести "NO".

//import java.util.Scanner;
//
//public class Main
//{
//
//    public static void main(String[] args)
//    {
//        Scanner sc = new Scanner(System.in);
//
//        int a, countEven = 0, min = 9999999, countNum = 0;
//        a = sc.nextInt();
//
//        for(int i = 0; i <= 9; i++)
//        {
//            if((a % 10) % 2 != 0 && (a % 10) != 1)
//            {
//                if(a % 10 < min)
//                    min = a % 10;
//            }
//            else
//                countEven ++;
//
//            a = (int)(a / 10);
//            countNum++;
//        }
//        if(countEven == countNum)
//            System.out.println("NO");
//        else
//            System.out.println(min);
//    }
//}

//9
//С клавиатуры вводится (в целочисленную ячейку памяти!) натуральное число N (N<109).
//Вывести на экран самую маленькую положительную цифру в десятичном представлении числа.

//import java.util.Scanner;
//
//public class Main
//{
//
//    public static void main(String[] args)
//    {
//        Scanner sc = new Scanner(System.in);
//
//        int a, countEven = 0, min = 9999999, countNum = 0;
//        a = sc.nextInt();
//
//        for(int i = 0; i <= 9; i++)
//        {
//            if(a % 10 < min && a % 10 != 0)
//                min = a % 10;
//
//            a = (int)(a / 10);
//        }
//            System.out.println(min);
//    }
//}

//10
//Ввести с клавиатуры натуральное число N (N<1000). Вывести на экран наименьшее простое число, которое больше чем N.

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int a, min = 0, flag = 0;
        a = sc.nextInt();

        for(int i = 0; i < 100000; i++)
        {
            for(int j = 2; j < i; j++)
            {
                if(i % j == 0)
                {
                    flag = 1;
                    break;
                }
            }
            if( i > a  && flag != 1)
            {
                min = i;

                break;
            }
            flag = 0;

        }
        System.out.println(min);
    }
}