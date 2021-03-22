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
//public class Main{
//
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//
//        int N = sc.nextInt();
//        int M = sc.nextInt();
//
//        int[][] matrix = new int[N][M];
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
//
//        int matrix[][] = new int[N][N];
//
//        for(int i = 0; i < N; i++)
//        {
//            for(int j = 0; j < N; j++)
//            {
//                if(i == N - 1 - j )
//                    matrix[i][j] = 1;
//                if(i < N - 1 - j)
//                    matrix[i][j] = 0;
//                if(i > N - 1 - j)
//                    matrix[i][j] = 2;
//            }
//        }
//        for(int i = 0; i < N; i++)
//        {
//            for(int j = 0; j < N; j++)
//            {
//                System.out.printf("%d ",matrix[i][j]);
//            }
//            System.out.println();
//        }
//    }
//}

//3
//Проверьте, является ли двумерный массив симметричным относительно главной диагонали.
//Главная диагональ — та, которая идёт из левого верхнего угла двумерного массива в правый нижний.
//
//Входные данные
//Программа получает на вход число n  100, являющееся числом строк и столбцов в массиве.
//Далее во входном потоке идет n строк по n чисел, являющихся элементами массива.
//
//Выходные данные
//Программа должна выводить слово yes для симметричного массива и слово no для несимметричного.

//import java.util.Scanner;
//
//public class Main{
//
//    public static void main(String[] args){
//
//        Scanner sc = new Scanner(System.in);
//
//        int N = sc.nextInt();
//
//        int[][] matrix = new int[N][N];
//
//        for(int i = 0; i < N; i++)
//        {
//            for(int j = 0; j < N; j++)
//            {
//                matrix[i][j] = sc.nextInt();
//            }
//        }
//
//        int count = 0;
//        for(int i = 0; i < N; i++)
//        {
//            for(int j = 0; j < N; j++)
//            {
//                if(matrix[i][j] == matrix[j][i])
//                    count++;
//            }
//        }
//
//        if(count == N * N)
//            System.out.printf("yes");
//        else
//            System.out.printf("no");
//
//    }
//}

//4
//Даны два числа n и m. Создайте двумерный массив A[n][m], заполните его таблицей умножения A[i][j]=i*j и выведите на экран.
// При этом нельзя использовать вложенные циклы, все заполнение массива должно производиться одним циклом.
//Входные данные
//Программа получает на вход два числа n и m – количество строк и столбцов, соответственно.
//
//Выходные данные
//Программа должна вывести  полученный массив. Под каждое число отводите четыре знакоместа.
// Например, число 8 должно быть напечатано с тремя пробелами перед ним.

//import java.util.Scanner;
//
//public class Main{
//
//    public static void main(String[] args){
//
//        Scanner sc = new Scanner(System.in);
//
//        int N = sc.nextInt();
//        int M = sc.nextInt();
//
//        int[][] matrix = new int[N][M];
//
//        for(int i = 0, j = 0; i < N;)
//        {
//            if(j < M)
//            {
//                matrix[i][j] = i * j;
//                j++;
//            }
//            else
//            {
//                i++;
//                j = 0;
//            }
//
//        }
//
//        for(int i = 0; i < N; i++)
//        {
//            for(int j = 0; j < M; j++)
//            {
//                System.out.printf("%4d", matrix[i][j]);
//            }
//            System.out.println();
//        }
//
//
//    }
//}

//5
//Даны числа n и m. Создайте массив A[n][m] и заполните его змейкой (см. пример).
//Входные данные
//Программа получает на вход два числа n и m.
//
//Выходные данные
//Программа должна вывести  полученный массив, отводя на вывод каждого числа ровно 3 символа.

//import java.util.Scanner;
//
//public class Main{
//
//    public static void main(String[] args){
//
//        Scanner sc = new Scanner(System.in);
//
//        int N = sc.nextInt();
//        int M = sc.nextInt();
//
//        int[][] matrix = new int[N][M];
//        int k = 0;
//        for(int i = 0; i < N; i++)
//        {
//           for(int j = 0; j < M; j++)
//           {
//                matrix[i][j] = k;
//                k++;
//           }
//        }
//
//        for(int i = 0; i < N; i++)
//        {
//            if(i % 2 == 0)
//                for(int j = 0; j < M; j++)
//                {
//                    System.out.printf("%3d", matrix[i][j]);
//                }
//            else
//                for(int j = M - 1; j >= 0; j--)
//                {
//                    System.out.printf("%3d", matrix[i][j]);
//                }
//            System.out.println();
//        }
//
//
//    }
//}

//6
//Дано число n. Создайте массив A[2*n+1][2*n+1] и заполните его по спирали, начиная с числа 0 в центральной клетке A[n+1][n+1].
//Спираль выходит вверх, далее закручивается против часовой стрелки.
//Входные данные
//Программа получает на вход одно число n.
//
//Выходные данные
//Программа должна вывести  полученный массив, отводя на вывод каждого числа ровно 3 символа.

import java.util.Scanner;

public class Main{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[][] matrix = new int[2 * N + 1][2 * N + 1];
        int s = (2 * N + 1) ;
        int value = s * s - 1;
        int i = 0, j = s - 1 ;
        while (s != 0)
        {
            int k = 0;
            do{
                matrix[i++][j] = value--;
            }while (++k < s );
            i--; j--;
            for(k = 0; k < s - 1; k++) matrix[i][j--] = value--;
            j++; i--;
            for(k = 0; k < s - 1 ; k++) matrix[i--][j] = value--;
            i++; j++;
            for(k = 0; k < s - 2; k++) matrix[i][j++] = value--;

            ++i;
            --j;
            s = s < 3 ? 0 : s - 2;
        }
        for(int g = 0; g < 2 * N + 1 ; g++)
        {
                for(int f = 0; f < 2 * N + 1; f++)
                {
                    System.out.printf("%3d", matrix[g][f]);
                }
            System.out.println();
        }


    }
}