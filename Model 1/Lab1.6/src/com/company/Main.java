package com.company;

//1
//Введите с клавиатуры целое число.
//
//Выведите на экран, к какой категории оно относится:
//
//"DIGIT", если это однозначное неотрицательное число;
//
//"NUM", если это двузначное число положительное число;
//
//"OTHER", если оно не относится к первым двум категориям.

//import java.util.Scanner;
//
//public class Main
//{
//
//    public static void main(String[] args)
//    {
//        Scanner sc = new Scanner(System.in);
//	    int a = sc.nextInt();
//	    int count = 0;
//
//	    if(a >= 0 && a / 10 == 0 )
//        {
//            System.out.println("DIGIT");
//            count++;
//        }
//
//        if(a > 0 && a / 100 == 0 && a / 10 != 0 )
//        {
//            System.out.println("NUM");
//            count++;
//        }
//
//        if(count == 0 )
//            System.out.println("OTHER");
//    }
//}

//2
//Даны три различных целых числа. Требуется вывести их в стандартный поток вывода в порядке возрастания.
//
//Не разрешается пользоваться функциями min/max и подобным им, а также оператором присваивания (за исключением ввода исходных чисел).

//import java.util.Scanner;
//
//public class Main
//{
//
//    public static void main(String[] args)
//    {
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = sc.nextInt();
//
//       if(a < b && a < c)
//           if(b<c)
//               System.out.printf("%d %d %d", a, b, c);
//           else
//               System.out.printf("%d %d %d", a, c, b);
//
//       if(b < a && b < c)
//           if(a < c)
//               System.out.printf("%d %d %d", b, a, c);
//           else
//               System.out.printf("%d %d %d", b, c, a);
//
//       if(c < a && c < b)
//           if(a < b)
//               System.out.printf("%d %d %d", c, a, b);
//           else
//               System.out.printf("%d %d %d", c, b, a);
//
//    }
//}

//3
//Введите с клавиатуры неотрицательное целое число.
//
//Выведите на экран окончание порядкового числительного во фразе вида "сколько тортов?".
//
//Выводите латинскими буквами.

//import java.util.Scanner;
//
//public class Main
//{
//
//    public static void main(String[] args)
//    {
//        Scanner sc = new Scanner(System.in);
//        int a ;
//
//            a = sc.nextInt();
//            System.out.printf("%d ", a);
//            int count = 0;
//            System.out.printf("TOPT");
//            if(a % 10 >= 5 || a % 10 == 0 || (a > 10 && a < 15) || a == 111)
//            {
//                System.out.printf("OB");
//                count++;
//            }
//            if((a % 10 == 1 && a != 11 )&& count == 0)
//            {
//                count++;
//            }
//
//            if((a % 10 > 1 && a % 10 < 5 && a != 12 && a != 13 && a != 14) &&  count == 0)
//                System.out.printf("A");
//    }
//}


//4
//Введите с клавиатуры вещественные числа A и B.
//
//Выведите на экран решение неравенства "A|x|+B>0".
//
//Числа выводите с точностью 1 знак после запятой.

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();



    }
}
