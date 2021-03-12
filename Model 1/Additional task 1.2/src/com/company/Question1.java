//Дано натуральное число N. Требуется определить младшую цифру в десятичной записи числа N.

package com.company;

import java.util.Scanner;

public class Question1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int a  = sc.nextInt();

        System.out.println(a % 10);
    }
}
