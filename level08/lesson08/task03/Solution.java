package com.javarush.test.level08.lesson08.task03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
    {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("Иванов","Саша");
        map.put("Петров","Саша");
        map.put("Сидоров","Алеша");
        map.put("Пучков","Дмитрий");
        map.put("Кишинев","Петя");
        map.put("Васильев","Сергей");
        map.put("Петечкин","Сергей");
        map.put("Глушаков","Петя");
        map.put("Смешной","Иван");
        map.put("Семочкин","Андрей");

        //Напишите тут ваш код
          return map;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
    {
        int count = 0;
        for (Map.Entry<String, String> pair : map.entrySet())
        {
            if(pair.getValue().equals(name))
            {
                count++;
            }
        }
        return count;
        //Напишите тут ваш код

    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String familiya)
    {
        int count = 0;
        for (Map.Entry<String, String> pair : map.entrySet())
        {
            if (pair.getKey().equals(familiya))
            {
                count++;
            }
        }
        return count;
        //Напишите тут ваш код

    }
}
