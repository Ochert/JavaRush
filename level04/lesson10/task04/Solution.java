package com.javarush.test.level04.lesson10.task04;

/* S-квадрат
Вывести на экран квадрат из 10х10 букв S используя цикл while.
Буквы в одной строке не разделять.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
     String s="S";
         for (int i=0;i<10;i++)
         {
             for (int j=0;j<10;j++)
             {
                 System.out.print(s);

             }
                      System.out.println();

         }

    }
}
