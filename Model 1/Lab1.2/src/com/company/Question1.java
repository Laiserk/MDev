//Дано натуральное число. Выведите его последнюю цифру.

package com.company;

import java.util.Scanner;

public class Question1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = a % 10;

        System.out.println(b);
    }
}
