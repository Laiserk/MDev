//Дано двухзначное натуральное число N. Требуется определить количество десятков в десятичной записи числа N.

package com.company;

import java.util.Scanner;

public class Question2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int a  = sc.nextInt();

        System.out.println(a / 10);
    }
}
