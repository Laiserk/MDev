//Пирожок в столовой стоит a рублей и b копеек. Определите, сколько рублей и копеек нужно заплатить за n пирожков.

package com.company;

import java.util.Scanner;

public class Question4
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();

        a = a * n;
        b = b * n;

        if(b >= 100)
        {
            int c = b / 100;
            b = b % 100;
            a = a + c;
        }

        System.out.printf("%d %d", a, b);
    }
}
