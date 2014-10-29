package com.javarush.test.level08.lesson08.task04;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Удалить всех людей, родившихся летом
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
Удалить из словаря всех людей, родившихся летом.
*/

public class Solution
{
    public static HashMap<String, Date> createMap()
    {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Сталлоне", new Date("JUNE 1 1980"));
        map.put("Сталлоне1", new Date("JULY 1 1980"));
        map.put("Сталлоне2", new Date("OCTOBER 1 1980"));
        map.put("Сталлоне3", new Date("APRIL 1 1980"));
        map.put("Сталлоне4", new Date("AUGUST 1 1980"));
        map.put("Сталлоне5", new Date("DECEMBER 1 1980"));
        map.put("Сталлоне6", new Date("NOVEMBER 1 1980"));
        map.put("Сталлоне7", new Date("JUNE 1 1980"));
        map.put("Сталлоне8", new Date("JULY 1 1980"));
        map.put("Сталлоне9", new Date("MAY 1 1980"));

        //Напишите тут ваш код
         return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map)
    {
        Iterator<Map.Entry<String, Date>> iter = map.entrySet().iterator();
        while(iter.hasNext())
        {
            Date j = iter.next().getValue();
            if (j.getMonth() > 4 && j.getMonth()<8)
            {
                iter.remove();
            }
        }
        //Напишите тут ваш код

    }
}
