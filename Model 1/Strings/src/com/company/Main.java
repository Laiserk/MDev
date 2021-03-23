package com.company;


//1
//Напишите функцию boolean IsDigit(char c) (Java), function IsDigit(c:char):boolean (Pascal), bool IsDigit(unsigned char c) (C/C++), определяющую, является ли данный символ цифрой или нет.
//
//Естественно, программа должна считывать данные, вызывать эту функцию и выдавать ответ.
//
//Входные данные
//Задан единственный символ c.
//
//Выходные данные
//Необходимо вывести  строку yes, если символ является цифрой, и строку no в противном случае.

//import java.util.Scanner;
//import java.io.IOException;
//
//public class Main {
//
//    public static boolean isDigit(char c)
//    {
//        if(c >= 48 && c <= 57 )
//            return true;
//        else
//            return false;
//    }
//
//    public static void main(String[] args) throws IOException {
//
//        Scanner sc = new Scanner(System.in);
//
//        char c = (char) System.in.read();
//
//        if(isDigit(c))
//            System.out.printf("yes");
//            else
//                System.out.printf("no");
//
//    }
//}


//2
//Измените регистр символа, если он был латинской буквой: сделайте его заглавным, если он был строчной буквой и наоборот. Для этого напишите отдельную функцию, меняющую регистр символа.
//
//Входные данные
//Задан единственный символ C.
//
//Выходные данные
//Необходимо вывести  получившийся символ.

//import java.util.Scanner;
//import java.io.IOException;
//
//public class Main {
//
//    public static void Func(char c)
//    {
//        if(c >= 65 && c <= 90)
//        {
//            System.out.printf("%c\n", c + 32);
//        }
//        else if(c >= 97 && c <= 122)
//            System.out.printf("%c\n", c - 32);
//        else
//            System.out.printf("%c\n", c);
//
//    }
//
//    public static void main(String[] args) throws IOException {
//
//        Scanner sc = new Scanner(System.in);
//
//        char c = (char) System.in.read();
//
//        Func(c);
//    }
//}

//3
//Дана строка, содержащая пробелы. Найдите, сколько в ней слов (слово – это последовательность непробельных символов, слова разделены одним пробелом, первый и последний символ строки – не пробел).
//
//Входные данные
//На вход подается несколько строк.
//
//Выходные данные
//Необходимо вывести  количество слов в первой из введенных строк.

//import java.util.Scanner;
//import java.io.IOException;
//
//public class Main {
//
//    public static void Func(String str)
//    {
//        int count = 1;
//        for(int i = 0; i < str.length(); i++)
//        {
//            if(str.toCharArray()[i] == ' ')
//            {
//                count++;
//            }
//        }
//        System.out.printf("%d", count);
//    }
//
//    public static void main(String[] args) throws IOException {
//
//        Scanner sc = new Scanner(System.in);
//
//        String str = new String(sc.nextLine());
//
//        Func(str);
//    }
//}

//4
//Дана строка, содержащая пробелы. Найдите в ней самое длинное слово, выведите  это слово и его длину. Если таких слов несколько, выведите первое из них.
//
//Входные данные
//Задана одна строка, содержащая пробелы. Слова разделены ровно одним пробелом. Пробелы в начале и конце строки допускаются.
//
//Выходные данные
//Необходимо вывести самое длинное слово в строке и его длину.

//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Scanner;
//import java.io.IOException;
//
//public class Main {
//
//    public static void Func(String str)
//    {
//        String[] subStr;
//        subStr = str.split(" ");
//
//        int max = 0, index = 0;
//
//        for(int i = subStr.length - 1; i >= 0; i--)
//        {
//            if(subStr[i].length() >= max)
//            {
//                max = subStr[i].length() ;
//                index = i;
//            }
//
//        }
//        System.out.printf("%s\n", subStr[index]);
//        System.out.printf("%d", max);
//    }
//
//    public static void main(String[] args) throws IOException {
//
//        Scanner sc = new Scanner(System.in);
//
//        String str = new String(sc.nextLine());
//
//        Func(str);
//    }
//}

//5
//По данной строке определите, является ли она палиндромом (то есть, можно ли прочесть ее наоборот, как, например, слово "топот").
//
//Входные данные
//На вход подается 1 строка без пробелов.
//
//Выходные данные
//Необходимо вывести  yes, если строка является палиндромом, и no в противном случае.

//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Scanner;
//import java.io.IOException;
//
//public class Main {
//
//    public static void Func(String str)
//    {
//        int count = 0;
//        if(str.length() % 2 == 0)
//        {
//            for(int i = 0; i < str.length() / 2; i++)
//            {
//                if(str.toCharArray()[i] == str.toCharArray()[str.length() - 1 - i])
//                    count++;
//
//            }
//        }
//        else
//        {
//            for(int i = 0; i < str.length() / 2; i++)
//            {
//                if(str.toCharArray()[i] == str.toCharArray()[str.length() - 1 - i])
//                    count++;
//            }
//
//        }
//        if(count == str.length() / 2)
//            System.out.printf("yes");
//        else
//            System.out.printf("no");
//    }
//
//    public static void main(String[] args) throws IOException {
//
//        Scanner sc = new Scanner(System.in);
//        String str = new String(sc.nextLine());
//
//        Func(str);
//    }
//}

//6
//Дана строка. Известно, что она содержит ровно две одинаковые буквы. Найдите эти буквы. Гарантируется, что повторяются буквы только одного вида.
//
//Входные данные
//На вход подается 1 строка.
//
//Выходные данные
//Необходимо вывести  букву, которая встречается в строке дважды.

//import java.util.Scanner;
//import java.io.IOException;
//
//public class Main {
//
//    public static void Func(String str)
//    {
//        for(int i = 0; i < str.length(); i++)
//        {
//            for(int j = 0; j < str.length(); j++)
//            {
//                if(str.toCharArray()[i] == str.toCharArray()[j] && i != j)
//                {
//                    System.out.printf("%c", str.toCharArray()[i]);
//                    return;
//                }
//            }
//        }
//    }
//
//    public static void main(String[] args) throws IOException {
//
//        Scanner sc = new Scanner(System.in);
//        String str = new String(sc.nextLine());
//
//        Func(str);
//    }
//}

//7
//Капитан Флинт зарыл клад на Острове сокровищ. Он оставил описание, как найти клад. Описание состоит из строк вида: "North 5", где  слово – одно из "North", "South", "East", "West", – задает направление движения, а  число – количество шагов, которое необходимо пройти в этом направлении.
//
//Напишите программу, которая по описанию пути к кладу определяет точные координаты клада, считая, что начало координат находится в начале пути, ось OX направлена на восток, ось OY – на север.
//
//Входные данные
//На вход подается последовательность строк указанного формата. Гарантируется, что числа не превосходят 108.
//
//Выходные данные
//Необходимо вывести  координаты клада – два целых числа через пробел. Гарантируется, что эти числа не превосходят 108.

//import java.util.Scanner;
//import java.io.IOException;
//
//public class Main {
//
//    public static int[] Func(String direction, int step)
//    {
//        int x = 0, y = 0;
//        switch (direction)
//        {
//            case "North":
//                y += step;
//                break;
//            case "South":
//                y -= step;
//                break;
//            case "East":
//                x += step;
//                break;
//            case "West":
//                x -= step;
//                break;
//        }
//        int arr[] = new int[2];
//        arr[0] = x;
//        arr[1] = y;
//        return arr;
//    }
//
//    public static void main(String[] args) throws IOException {
//
//        Scanner sc = new Scanner(System.in);
//        String str;
//        int step = 0, count = 0, x = 0, y = 0;
//        String direction = " ";
//        String[] subStr;
//        while (true)
//        {
//            str  = sc.nextLine();
//            subStr = str.split(" ");
//            for(int i = 0; i < subStr.length; i++)
//            {
//                    if(i % 2 == 0)
//                    {
//                        direction = subStr[i];
//                    }
//                    else
//                    {
//                        step = Integer.parseInt(subStr[i]);
//                    }
//                    count++;
//                if(count == 2 || i == subStr.length - 1) {
//                    x += Func(direction, step)[0];
//                    y += Func(direction, step)[1];
//                    count = 0;
//                }
//
//            }
//        }
//        //System.out.printf("%d %d", x, y);
//    }
//}

//8
//Дана строка, состоящая из строчных латинских букв и пробелов. Проверьте, является ли она палиндромом без учета пробелов (например, "аргентина манит негра").
//
//Входные данные
//На вход подается 1 строка длины не более 100, содержащая пробелы. Подряд может идти произвольное число пробелов.
//
//Выходные данные
//Необходимо вывести yes, если данная строка является палиндромом, и no в противном случае.

//
//import java.util.Scanner;
//import java.io.IOException;
//
//public class Main {
//
//    public static void Func(String str)
//    {
//        int count = 0;
//        str = str.replaceAll("\\s+","");
//        if(str.length() % 2 == 0)
//        {
//            for(int i = 0; i < str.length() / 2; i++)
//            {
//                if(str.toCharArray()[i] == str.toCharArray()[str.length() - 1 - i])
//                    count++;
//
//            }
//        }
//        else
//        {
//            for(int i = 0; i < str.length() / 2; i++)
//            {
//                if(str.toCharArray()[i] == str.toCharArray()[str.length() - 1 - i])
//                    count++;
//            }
//
//        }
//        if(count == str.length() / 2)
//            System.out.printf("yes");
//        else
//            System.out.printf("no");
//    }
//
//    public static void main(String[] args) throws IOException {
//
//        Scanner sc = new Scanner(System.in);
//        String str = (sc.nextLine());
//
//        Func(str);
//    }
//}

//9
//Юлий Цезарь использовал свой способ шифрования текста. Каждая буква заменялась на следующую по алфавиту через K позиций по кругу. Необходимо по заданной шифровке определить исходный текст.
//
//Входные данные
//В первой строке дана шифровка, состоящая из заглавных латинских букв. Во второй строке число K (1 ≤ K ≤ 10).
//
//Выходные данные
//Требуется вывести результат расшифровки.


//import java.util.Scanner;
//import java.io.IOException;
//
//public class Main {
//
//    public static void Func(String str, int k)
//    {
//        for(int i = 0; i < str.length(); i++)
//        {
//            if(str.toCharArray()[i] - k < 65)
//            {
//                System.out.printf("%c", (str.toCharArray()[i] - k ) + 26 );
//            }
//            else
//                System.out.printf("%c", str.toCharArray()[i] - k );
//        }
//    }
//
//    public static void main(String[] args) throws IOException {
//
//        Scanner sc = new Scanner(System.in);
//
//        String str = (sc.nextLine());
//        int k = sc.nextInt();
//
//        Func(str, k);
//    }
//}

//10
//Дана строка, Вам требуется преобразовать все идущие подряд пробелы в один.
//
//Входные данные
//Длина строки не превосходит 1000.
//
//Выходные данные
//Выведите измененную строку.

import java.util.Scanner;
        import java.io.IOException;

public class Main {

    public static void Func(String str)
    {
        str = str.replaceAll(" {2,}", " ");
        System.out.printf("%s", str);
    }

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        String str = (sc.nextLine());

        Func(str);
    }
}