//Дано целое число n. Выведите следующее за ним четное число. При решении этой задачи нельзя использовать условную инструкцию if и циклы.

package com.company;

import java.util.Scanner;

public class Question3
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int i = sc.nextInt();

        if(i % 2 == 0)
            i = i + 2;
        else
            i++;

        System.out.println(i);
    }
}
