package com.company;
//1
//Введите с клавиатуры целое число X.
//
//Выведите на экран номер элемента массива, который равен X.
//
//Если таких элементов несколько, выведите меньший номер.
//
//Выводить на экран номер элемента, который считается от 1.
//
//То есть, начальный элемент массива при выводе на экран считать первым.
//
//Если такого элемента нет, выведите "NO".

//import java.util.Scanner;
//
//public class Main
//{
//
//    public static void main(String[] args)
//    {
//        Scanner sc = new Scanner(System.in);
//
//        int n = sc.nextInt();
//        int arr[] = new int[n];
//        for(int i = 0; i < n; i++)
//            arr[i] = sc.nextInt();
//
//        int x = sc.nextInt();
//
//        for(int i = 0; i < arr.length ;i++)
//        {
//            if(arr[i] == x)
//            {
//                System.out.println(i + 1);
//                break;
//            }
//            if( i  == arr.length - 1)
//                System.out.println("NO");
//
//        }
//    }
//}

//2
//Выведите на экран сумму четных элементов массива.
//
//Если в массиве нет четных элементов, выведите "NO".


//import java.util.Scanner;

//public class Main
//{
//
//    public static void main(String[] args)
//    {
//        Scanner sc = new Scanner(System.in);
//
//        int n = sc.nextInt();
//        int arr[] = new int[n];
//        int sum = 0, count = 0;
//        for(int i = 0; i < n; i++)
//            arr[i] = sc.nextInt();
//
//        for(int i = 0; i < arr.length ;i++)
//        {
//            if(arr[i] % 2 == 0)
//            {
//                sum += arr[i];
//                count++;
//            }
//
//
//        }
//        if( count == 0)
//            System.out.println("NO");
//        else
//            System.out.println(sum);
//    }
//}

//3
//Выведите на экран среднее арифметическое элементов массива, имеющих нечетное значение.
//
//Ответ выведите с точностью 2 знака после запятой.
//
//Если в массиве нет нечетных элементов, выведите "NO".

//
//import java.util.Scanner;
//
//public class Main {
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int n = sc.nextInt();
//        int arr[] = new int[n];
//
//
//        for (int i = 0; i < n; i++)
//            arr[i] = sc.nextInt();
//
//        int count = 0;
//        float sum = 0;
//
//        for (int i = 0; i < arr.length; i++)
//        {
//            if (arr[i] % 2 != 0) {
//                sum += arr[i];
//                count++;
//            }
//
//        }
//        if (count == 0)
//            System.out.println("NO");
//        else
//            System.out.printf("%.2f",sum/count);
//    }
//}

//4
//В этой задаче не нужно вводить с клавиатуры значения элементов массива.
//
//Нужно заполнить значения элементов массива числами последовательности:
//
//4, 7, 10, 13, 16, ,,,
//
//и вывести получившийся массив на экран.
//
//Не будет считаться верным решение, в котором элементы последовательности просто выводятся на экран, не попадая в массив.

//
//import java.util.Scanner;
//
//public class Main {
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int n = sc.nextInt();
//        int arr[] = new int[n];
//
//
//        for (int i = 0, j = 4; i < n ; i++, j += 3)
//            arr[i] = j;
//
//        for(int i = 0; i < arr.length; i++)
//            System.out.printf("%d ", arr[i]);
//
//
//    }
//}

//5
//Развернуть массив в обратную сторону ("задом наперед").
//
//Последний элемент должен находится на месте начального и наоборот.
//
//Не разрешается использовать дополнительный массив.
//
//Не будет считаться верным решение, которое просто выводит на экран массив в обратном порядке, не меняя в памяти значение элементов массива.


//import java.util.Scanner;
//
//public class Main {
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int n = sc.nextInt();
//        int arr[] = new int[n];
//
//
//        for (int i = 0; i < n ; i++)
//            arr[i] = sc.nextInt();
//
//        for(int i = 0; i < n / 2 ; i++ )
//        {
//            int tmp = 0;
//            tmp = arr[i];
//            arr[i] = arr[(n - 1) - i];
//            arr[(n - 1) - i] = tmp;
//        }
//
//        for(int i = 0; i < arr.length; i++)
//            System.out.printf("%d ", arr[i]);
//
//
//    }
//}

//6
//Вывести на экран значение самого часто повторяющегося элемента массива.
//
//Если в массиве несколько таких элементов, вывести из них тот, который имеет самый меньший номер.

//
//import java.util.Scanner;
//
//public class Main {
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int n = sc.nextInt();
//        int arr[] = new int[n];
//
//        for (int i = 0; i < n ; i++)
//            arr[i] = sc.nextInt();
//
//        int mas[] = new int[n];
//
//        for(int i = 0; i < n; i++)
//        {
//            int count = 0;
//
//            for(int j = 0; j < n; j++)
//            {
//                if(arr[i] == arr[j])
//                    count++;
//            }
//            mas[i] = count;
//        }
//        int max = 0, index = 0;
//
//        for (int  i = n - 1; i >= 0; i--)
//            if(mas[i] >= max)
//            {
//                max = mas[i];
//                index = i;
//            }
//            max = arr[index];
//
//        System.out.printf("%d ", max);
//
//
//    }
//}

//7
//Переместить в начало массива все отрицательные значения массива, не меняя их относительного положения.
//
//То есть, каждый отрицательный элемент должен оказаться в том же порядке относительно всех отрицательных элементов,
//а каждый неотрицательный элемент -- в том же порядке относительно всех неотрицательных элементов.


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n ; i++)
            arr[i] = sc.nextInt();

        int negativeNumbers[] = new int[n];
        int positiveNumbers[] = new int[n];
        int j = 0, k = 0;
        for(int i = 0; i < n; i++)
        {
            if(arr[i] < 0)
            {
                negativeNumbers[j] = arr[i];
                j++;
            }
            else
            {
                positiveNumbers[k] = arr[i];
                k++;
            }
        }
        k = 0;
        for(int i = 0; i < n;i++)
        {
            if(i < j)
                arr[i] = negativeNumbers[i];
            else
            {
                arr[i] = positiveNumbers[k];
                k++;
            }

        }

        for(int i = 0; i < n; i++)
            System.out.printf("%d ", arr[i]);

    }
}