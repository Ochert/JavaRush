package com.javarush.test.level07.lesson12.home06;

/* Семья
Создай класс Human с полями имя(String), пол(boolean),возраст(int), отец(Human), мать(Human). Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/

public class Solution
{
    public static void main(String[] args)
    {
        Human grandFather1 = new Human("дедушка Митя", true, 60, null, null);
        System.out.println(grandFather1);
        Human grandMother1 = new Human("бабушка Марфа", false, 60, null, null);
        System.out.println(grandMother1);
        Human grandFather2 = new Human("дедушка Петя", true, 60, null, null);
        System.out.println(grandFather2);
        Human grandMother2 = new Human("бабушка Люся", false, 60, null, null);
        System.out.println(grandMother2);
        Human father = new Human("папа Саша", true, 35, grandFather1, grandMother1);
        System.out.println(father);
        Human mother = new Human("мама Катя", false, 34, grandFather2, grandMother2);
        System.out.println(mother);
        Human son1 = new Human("сын Петр", true, 15, father, mother);
        System.out.println(son1);
        Human son2 = new Human("сын Женя", true, 12, father, mother);
        System.out.println(son2);
        Human daughter = new Human("дочь Жоржетта", false, 10, father, mother);
        System.out.println(daughter);


        //Написать тут ваш код
    }

    public static class Human
    {

        public  String name;
        public boolean sex;
        public int age;
        public  Human father;
        public Human mother;

        public Human (String name, boolean sex, int age, Human father, Human mother)
        {
            this.name = name;
            this.sex = sex;
            this.age= age;
            this.father = father;
            this.mother = mother;


         toString();

        }



        //Написать тут ваш код

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }

}
