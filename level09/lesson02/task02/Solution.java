package com.javarush.test.level09.lesson02.task02;

/* И снова StackTrace
Написать пять методов, которые вызывают друг друга. Каждый метод должен возвращать имя метода, вызвавшего его, полученное с помощью StackTrace.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        method1();
    }

    public static String method1()
    {
        StackTraceElement[] stack = Thread.currentThread().getStackTrace();
        String ret = stack[2].getMethodName();
        System.out.println(ret);

        //Напишите тут ваш код
        return ret;
    }

    public static String method2()
    {
        StackTraceElement[] stack = Thread.currentThread().getStackTrace();
        String ret = stack[2].getMethodName();
        System.out.println(ret);

        //Напишите тут ваш код
        return ret;
    }

    public static String method3()
    {
        StackTraceElement[] stack = Thread.currentThread().getStackTrace();
        String ret = stack[2].getMethodName();
        System.out.println(ret);

        //Напишите тут ваш код
        return ret;
    }

    public static String method4()
    {
        StackTraceElement[] stack = Thread.currentThread().getStackTrace();
        String ret = stack[2].getMethodName();
        System.out.println(ret);

        //Напишите тут ваш код
        return ret;
    }

    public static String method5()
    {
        StackTraceElement[] stack = Thread.currentThread().getStackTrace();
        String ret = stack[2].getMethodName();
        System.out.println(ret);

        //Напишите тут ваш код
        return ret;
    }
}
