//Электронные часы показывают время в формате h:mm:ss, то есть сначала записывается количество часов,
// потом обязательно двузначное количество минут, затем обязательно двузначное количество секунд.
// Количество минут и секунд при необходимости дополняются до двузначного числа нулями.
//        С начала суток прошло n секунд. Выведите, что покажут часы.

package com.company;

import java.util.Scanner;

public class Question5
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        int hrs = a / 3600;
        int min = a / 60 - hrs * 60;
        int sec = a - min * 60 - hrs * 3600;
        int days = hrs / 24;

        hrs = hrs - days * 24;
        System.out.printf("%d:%d:%d", hrs, min, sec);
    }
}
