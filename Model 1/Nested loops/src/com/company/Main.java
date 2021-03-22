package com.company;

//1
//Напишите программу, которая определяет, верно ли, что введённое число содержит по крайней мере две одинаковых цифры,
//возможно, не стоящие рядом (как, например, 212).
//
//Входные данные
//Входная строка содержит одно натуральное число.
//
//Выходные данные
//Программа должна вывести слово 'YES', если в числе есть две одинаковые цифры, и слово 'NO', если такой пары цифр нет.

//import java.util.Scanner;
//import java.lang.String;
//
//public class Main {
//
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();
//        char[] arr = str.toCharArray();
//
//        int count = 0;
//
//        for(int i = 0; i < str.length(); i++)
//        {
//            for(int j = 0; j < str.length(); j++)
//            {
//
//               if(arr[i] == arr[j])
//                   count++;
//            }
//        }
//        if(count > arr.length)
//            System.out.println("YES");
//        else
//            System.out.println("NO");
//    }
//}


//2
//Алгоритм Евклида для вычисления наибольшего общего делителя двух натуральных чисел,
// формулируется так: нужно заменять большее число на разность большего и меньшего до тех пор, пока одно из них не станет равно нулю;
// тогда второе и есть НОД. Напишите программу, которая реализует этот алгоритм.
//
//Входные данные
//Входная строка содержит два числа, разделённые пробелом – a и b .
//
//Выходные данные
//Программа должна вывести в одной строке два числа: сначала наибольший общий делитель двух введённых чисел,
// а затем – количество шагов цикла, которые были выполнены.

//import java.util.Scanner;
//import java.lang.String;
//
//public class Main {
//
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//
//        int count = 0;
//
//        while(a != 0 && b != 0)
//        {
//            if(a > b)
//                a = a - b;
//            else
//                b = b - a;
//
//            count++;
//        }
//        if(a == 0)
//            System.out.printf("%d %d", b, count );
//        else
//            System.out.printf("%d %d", a, count);
//    }
//}


//3
//Напишите программу, которая вводит натуральные числа a и b и выводит все простые числа в диапазоне от a до b .
//
//Входные данные
//Входная строка содержит два натуральных числа, a и b . Гарантируется, что a ≤ b .
//
//Выходные данные
//Программа должна вывести в одной строке через пробел все простые числа на отрезке [ a , b ] . Если таких чисел нет, программа должна вывести 0.

//import java.util.Scanner;
//import java.lang.String;
//
//public class Main {
//
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int count;
//        int flag = 1;
//        for(int i = a; i <= b; i++)
//        {
//            count = 0;
//            if(i <= 1)
//                continue;
//            for(int j = 2; j < b; j++)
//                if(i % j == 0 && i != j)
//                {
//                    count++;
//                    break;
//                }
//            if(count == 0)
//            {
//                flag = 0;
//                System.out.printf(" %d", i);
//            }
//        }
//        if(flag == 1)
//            System.out.printf("%d ", 0);
//
//    }
//}

//4
//В магазине продается мастика в ящиках по a кг (тип 1), b кг (тип 2) и c кг (тип 3). Как купить ровно N кг мастики, не вскрывая ящики? Сколькими способами можно это сделать?
//
//Входные данные
//Входная строка содержит четыре числа, разделённые пробелами: a , b , c и N .
//
//Выходные данные
//В первой строке нужно вывести число K способов, которыми можно купить заданное количество мастики ( N кг), не вскрывая ящики.
//В каждой из последующих K строчек программа должна вывести (через пробелы) три числа, k a , k b и k c : количество ящиков 1, 2 и 3 типов для каждого из K вариантов закупки.
//Варианты должны выводиться в лексикографическом порядке: сначала варианты с наименьшим значением k a , для одинаковых k a – сначала варианты с наименьшим значением k b и т.д.

//import java.util.*;
//import java.lang.String;
//
//public class Main {
//
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = sc.nextInt();
//        int N = sc.nextInt();
//
//        int C = 0;
//        int B = 0;
//        int A = 0;
//
//
//        ArrayList<int[]> list = new ArrayList<int[]>();
//
//        for(int i = 0; A + B + C <= N ; i++)
//        {
//            for(int j = 0; B + C <= N ; j++)
//            {
//                for(int g = 0; C <= N ; g++)
//                {
//                    if(A + B + C == N)
//                    {
//                        int[] arr = new int[3];
//                        arr[0] = i;
//                        arr[1] = j;
//                        arr[2] = g;
//                        list.add(arr);
//                    }
//                    C += c;
//                }
//                C = 0;
//                B += b;
//            }
//            B = 0;
//            A += a;
//        }
//
//        System.out.printf("%d", list.toArray().length);
//        System.out.println();
//
//        for(int i = 0; i < list.size(); i++)
//        {
//            for(int j = 0; j < 3; j++)
//                System.out.printf("%d ", list.get(i)[j]);
//            System.out.println();
//        }
//    }
//}

//5
//Последовательность состоит из натуральных чисел и завершается числом 0. Всего вводится не более 10000 чисел (не считая завершающего числа 0).
//Определите, сколько элементов этой последовательности равны ее наибольшему элементу.
//
//Числа, следующие за числом 0, считывать не нужно.
//
//Входные данные
//Вводится последовательность целых чисел, оканчивающаяся числом 0 (само число 0 в последовательность не входит).
//
//Выходные данные
//Выведите ответ на задачу.

//import java.util.*;
//        import java.lang.String;
//
//public class Main {
//
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        int a;
//        ArrayList<Integer> list = new ArrayList<Integer>();
//        do
//        {
//            a = sc.nextInt();
//            list.add(a);
//        }while(a != 0);
//        list.remove(list.size() - 1);
//        int max = 0;
//        for(int i = 0; i < list.size(); i++)
//        {
//            if(list.get(i) > max)
//                max = list.get(i);
//        }
//        int count = 0;
//        for(int i = 0; i < list.size(); i++)
//        {
//            if(list.get(i) == max)
//                count++;
//        }
//
//        System.out.printf("%d", count);
//    }
//}

//6
//Дана последовательность натуральных чисел, завершающаяся число 0. Определите наибольшую длину монотонного фрагмента
//последовательности (то есть такого фрагмента, где все элементы либо больше предыдущего, либо меньше).
//
//Числа, следующие за числом 0, считывать не нужно.
//Входные данные
//Дана последовательность натуральных чисел, завершающаяся число 0.
//
//Выходные данные
//Выведите ответ на задачу.

import java.util.*;
        import java.lang.String;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a;
        ArrayList<Integer> list = new ArrayList<Integer>();
        do
        {
            a = sc.nextInt();
            list.add(a);
        }while(a != 0);

        //list.remove(list.size() - 1);

        int maxCount = 0;
        int count = 1;
        int sign;
        if(list.get(1) > list.get(0))
        {
            sign = 1;
        }
        else
            sign = 0;
        for(int i = 0; i < list.size() - 1 ; i++)
        {
            if( list.get(i + 1) == 0 && maxCount < count)
                maxCount = count;

            if(list.get(i + 1) > list.get(i))
            {
                if(sign == 1)
                    count++;
                else
                {
                    if(maxCount < count)
                        maxCount = count;
                    count = 1;
                    sign = 1;
                }
            }
            else if(list.get(i + 1) < list.get(i))
            {
                if(sign == 0)
                    count++;
                else
                {
                    if(maxCount < count)
                         maxCount = count;
                    count = 1;
                    sign = 0;
                }
            }
            else
            {
                if(maxCount < count)
                    maxCount = count;
                count = 1;
            }

        }

        if( maxCount < count)
            maxCount = count;

        System.out.printf("%d", maxCount);
    }
}
