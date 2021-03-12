//Дано трехзначное натуральное число N. Требуется определить сумму цифр в десятичной записи числа N.

package com.company;

import java.util.Scanner;

public class Question3
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int i  = sc.nextInt();

        int a = i / 100;
        int b = i / 10 % 10;
        int c = i % 10;


        int sum = a + b + c;
        System.out.println(sum);
    }
}
