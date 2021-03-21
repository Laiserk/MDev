package com.company;


//1
//Дан массив N × M. Требуется повернуть его по часовой стрелке на 90 градусов.
//
//Входные данные
//На первой строке даны натуральные числа N и M (1 ≤ N, M ≤ 50). На следующих N строках записано по M неотрицательных чисел, не превышающих 109 – сам массив.
//
//Выходные данные
//Выведите повернутый массив в формате входных данных.

//import java.util.Scanner;
//
//public class Main
//{
//
//    public static void main(String[] args)
//    {
//        Scanner sc = new Scanner(System.in);
//
//        int N = sc.nextInt();
//        int M = sc.nextInt();
//
//        int matrix[][] = new int[N][M];
//
//        for(int i = 0; i < N; i++)
//        {
//            for(int j = 0; j < M; j++)
//            {
//                matrix[i][j] = sc.nextInt();
//            }
//        }
//
//
//        System.out.printf("%d %d", M, N);
//        System.out.println();
//
//        for(int i = 0; i < M; i++)
//        {
//            for(int j = N - 1; j >= 0; j--)
//            {
//                System.out.printf("%d ",matrix[j][i]);
//            }
//            System.out.println();
//        }
//
//    }
//}

//2
//Дано число n, n  100 . Создайте массив n×n и заполните его по следующему правилу:
//- числа на диагонали, идущей из правого верхнего в левый нижний угол, равны 1;
//- числа, стоящие выше этой диагонали, равны 0;
//- числа, стоящие ниже этой диагонали, равны 2.
//
//Входные данные
//Программа получает на вход число n.
//
//Выходные данные
//Необходимо вывести  полученный массив. Числа разделяйте одним пробелом.


import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int matrix[][] = new int[N][N];

        for(int i = 0; i < N; i++)
        {
            for(int j = 0; j < N; j++)
            {
                if(i == N - 1 - j )
                    matrix[i][j] = 1;
                if(i < N - 1 - j)
                    matrix[i][j] = 0;
                if(i > N - 1 - j)
                    matrix[i][j] = 2;
            }
        }
        for(int i = 0; i < N; i++)
        {
            for(int j = 0; j < N; j++)
            {
                System.out.printf("%d ",matrix[i][j]);
            }
            System.out.println();
        }
    }
}
