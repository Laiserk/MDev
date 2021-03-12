//Дано трехзначное число. Найдите сумму его цифр.

package com.company;

import java.util.Scanner;

public class Question2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int i = sc.nextInt();
        int a = i % 10;
        int b = i / 10 % 10;
        int c = i / 100;
        int sum = a + b + c;

        System.out.println(sum);
    }
}
