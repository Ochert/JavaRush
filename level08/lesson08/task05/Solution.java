package com.javarush.test.level08.lesson08.task05;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
    {
       Map<String, String> map = new HashMap<String, String>();
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
        return (HashMap<String,String>)map;
        //Напишите тут ваш код

    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map)
    {
        ArrayList<String> list = new ArrayList<String>();
        Iterator<Map.Entry<String, String>> iter = map.entrySet().iterator();

        while(iter.hasNext())
        {
           list.add(iter.next().getValue());
        }

        for (int i = 1; i < list.size(); i++)
        {
            for (int j = 0; j < i; j++)
            {
             if (list.get(j).equals(list.get(i)))
             {
                 removeItemFromMapByValue(map,list.get(j));
             }
            }
        }
        //Напишите тут ваш код

    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value)
    {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair: copy.entrySet())
        {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }
}
