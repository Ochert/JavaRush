package com.javarush.test.level08.lesson11.home09;

import java.util.Date;

/* Работа с датой
1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал true, если количество дней с начала года - нечетное число, иначе false
2. String date передается в формате MAY 1 2013
Пример:
JANUARY 1 2000 = true
JANUARY 2 2020 = false
*/

public class Solution
{
    public static void main(String[] args)
    {
    }

    public static boolean isDateOdd(String date)
    {
       Date currentTime = new Date();
        Date yearStart = new Date(date);


        long msTimeDistane = currentTime.getTime() - yearStart.getTime();
        long msDay = 24*60*60*1000;

        int dayCount = (int)(msTimeDistane/msDay);

        return (dayCount%2==0);
    }
}
