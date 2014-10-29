package com.javarush.test.level04.lesson06.task02;

/* Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());//Напишите тут ваш код
     if (a > b && a > c && a > d)
         System.out.print(a);
        else
         if (b > a && b > c && b > d)
            System.out.print(b);
        else
             if (c > d && c > a && c > b)
                 System.out.print(c);
        else
                 System.out.print(d);

    }
}
