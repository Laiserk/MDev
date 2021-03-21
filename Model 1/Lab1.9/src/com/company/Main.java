package com.company;
//1
//Напишите функцию, которая принимает на вход двузначное натуральное число и возвращает сумму его цифр.


//import java.util.Scanner;
//
//public class Main
//{
//
//    public static int Sum(int num)
//    {
//        int a = num % 10 + num /10 ;
//        return a;
//    }
//    public static void main(String[] args)
//    {
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        System.out.printf("%d ",Sum(a));
//
//    }
//}

//2
//Напишите функцию, которая вычисляет сумму цифр во всех двузначных натуральных числах, кратных 7.
//ЫЫЫЫЫЫЫЫЫЫЫЫЫЫЫЫЫЫЫЫЫЫЫЫЫЫЫЫЫЫ


//import java.util.Scanner;
//
//public class Main
//{
//
//    public static void main(String[] args)
//    {
//        Scanner sc = new Scanner(System.in);
//        //int a = sc.nextInt();
//        System.out.printf("%d", 125);
//
//    }
//}


//3
//Напишите функцию, которая для заданного трехзначного натурального числа X
//вычисляет количество трехзначных натуральных чисел, меньших X, сумма цифр которых кратна 13-ти.


//import java.util.Scanner;
//
//public class Main
//{
//    public static int Fun(int x)
//    {
//        int count = 0;
//        for(int i = 99; i < x; i++ )
//        {
//            if((i % 10 + (i / 100 % 10) + (i / 10 % 10)) % 13 == 0)
//                count++;
//        }
//        return count;
//    }
//    public static void main(String[] args)
//    {
//        Scanner sc = new Scanner(System.in);
//        int x = sc.nextInt();
//
//        System.out.printf("%d", Fun(x));
//
//    }
//}

//4
//Напишите функцию, которая получает на вход вещественное число X (double, 0<X<1) и натуральное число N
//и выводит на экран N первых двоичных разрядов дробной части числа X.
//
//Подсказка-алгоритм:
//
//Умножаем число X на 2.
//Целую часть результата (0 или 1) выводим на экран.
//Отбрасываем целую часть (если это 1, убираем его).
//С получившимся числом повторяем действия начиная с пункта 1.


//import java.util.Scanner;
//
//public class Main
//{
//    public static void Fun(int N, double x)
//    {
//        int count = 0;
//        for(int i = 0; i < N ; i++)
//        {
//            x *= 2;
//            if(x >= 1)
//            {
//                System.out.printf("%d", 1);
//                x -= 1;
//            }
//            else
//            {
//                System.out.printf("%d", 0);
//            }
//
//        }
//    }
//    public static void main(String[] args)
//    {
//        Scanner sc = new Scanner(System.in);
//
//
//        double x = sc.nextDouble();
//        int N = sc.nextInt();
//
//        Fun(N,x);
//        //System.out.printf("%d", Fun(N, x));
//
//    }
//}

//5
//Напишите функцию, которая получает на вход целочисленный массив и вычисляет среднее арифметическое элементов массива,
//которые являются четырехзначными натуральными числами.
//
//Если в массиве нет таких чисел, функция должна вернуть число -1.
//
//В главной программе:
//
//Сначала запросите с клавиатуры число элементов массива (N).
//Затем создайте целочисленный массив из N элементов и введите его значения с клавиатуры.
//После этого передайте этот массив на вход указанной функции и выведите результат функции на экран.
//Выводите ответ с точностью 2 знача после запятой.


//import java.util.Scanner;
//
//public class Main
//{
//    public static double Fun(int arr[])
//    {
//        double sum = 0, count = 0;
//
//        for(int i = 0; i < arr.length;i++)
//        {
//            if(arr[i] > 999 && arr[i] <= 9999)
//            {
//                sum += arr[i];
//                count++;
//            }
//        }
//        if(count != 0 )
//            return sum/count;
//        else
//            return -1;
//
//    }
//    public static void main(String[] args)
//    {
//        Scanner sc = new Scanner(System.in);
//
//        int N = sc.nextInt();
//
//        int arr[] = new int[N];
//
//        for (int i = 0; i< N; i++)
//            arr[i] = sc.nextInt();
//
//
//
//        System.out.printf("%.2f", Fun(arr));
//
//    }
//}

//6
//Напишите функцию, которая получает на вход целочисленный массив, находит наименьший элемент массива и переставляет его в начало массива (под индексом 0).
//Остальные элементы сдвигаются, соответственно, вправо, на одну позицию. Если в массиве несколько одинаковых наименьших элементов,
//переставлять нужно тот из них, который имеет наименьший номер.
//
//В главной программе:
//
//Сначала запросите с клавиатуры число элементов массива (N).
//Затем создайте целочисленный массив из N элементов и введите его значения с клавиатуры.
//После этого передайте этот массив на вход указанной функции.
//После окончания работы функции выведите массив на экран.
//Не будет считаться правильным решение, которое просто выводит элементы массива в нужном порядке, не переставляя элементы массива в памяти так, как указано.
//Выводите ответ с точностью 2 знача после запятой.

import java.util.Scanner;

public class Main
{
    public static int[] Fun(int arr[])
    {
        int min = 99999999;
        int minIndex = 0;
        int tmp;
        int flag = 0;
        for(int i = 0 ; i < arr.length; i++)
        {
            if(arr[i] < min)
            {
                minIndex = i;
                min = arr[i];
            }

        }
        int mas[] = new int[arr.length];

        for(int i = 0, j = 1; i < arr.length; i++, j++)
        {
            if(arr[i] == min && flag == 0)
            {
                j--;
                flag = 1;
            }
            else
                mas[j] = arr[i];
        }
        mas[0] = min;

        return mas;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int arr[] = new int[N];

        for (int i = 0; i< N; i++)
            arr[i] = sc.nextInt();
        for(int  i = 0; i< arr.length; i++)
            System.out.printf("%d ", Fun(arr)[i]);

    }
}