package com.javarush.test.level07.lesson09.task02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* 5 слов в обратном порядке
Введи с клавиатуры 5 слов в список строк. Выведи их в обратном порядке.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
     ArrayList<String> list = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 5; i++)
        {
            list.add(reader.readLine());
        }

        for (int i = 0; i < (list.size()/2); i++)
        {
             String str = list.get(i);
            list.set(i,list.get(list.size()-1-i));
            list.set((list.size()-1-i),str);

        }

        for (String elem : list)
        {
            System.out.println(elem);
        }
        //Напишите тут ваш код

    }
}
