package com.javarush.test.level08.lesson11.home06;

/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/

import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<Human> childrens = new ArrayList<Human>();
        ArrayList<Human> grand1 = new ArrayList<Human>();
        ArrayList<Human> grand2 = new ArrayList<Human>();

        Human grandFather1 = new Human("дедушка Василий",true, 60,grand1 );
        Human grandMother1 = new Human("бабушка Маша", false, 60, grand1);
        Human grandFather2 = new Human("дедушка Петр",true, 60,grand2 );
        Human grandMother2 = new Human("бабушка Марфа", false, 60,grand2);
        Human father = new Human("папа Гена", true, 30,childrens );
        Human mother = new Human("мама Рита", false, 30,childrens);
        Human son = new Human("сын Гоша",true, 12,new ArrayList<Human>());
        Human son1 = new Human("сын Петя",true, 10,new ArrayList<Human>());
        Human son2 = new Human("сын Митя",true, 8,new ArrayList<Human>());

        childrens.add(son);
        childrens.add(son1);
        childrens.add(son2);
        grand1.add(father);
        grand2.add(mother);


        System.out.println(grandFather1);
        System.out.println(grandMother1);
        System.out.println(grandFather2);
        System.out.println(grandMother2);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(son);
        System.out.println(son1);
        System.out.println(son2);
        //Написать тут ваш код
    }

    public static class Human
    {
        public String name;
        public boolean sex;
        public int age;
        public ArrayList<Human> children;

        public Human(String name, boolean sex, int age, ArrayList<Human> children)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;

         }
        //Написать тут ваш код

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0)
            {
                text += ", дети: "+this.children.get(0).name;

                for (int i = 1; i < childCount; i++)
                {
                    Human child = this.children.get(i);
                    text += ", "+child.name;
                }
            }

            return text;
        }
    }

}
