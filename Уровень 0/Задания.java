/*
 Узнаете:
Что такое переменные
Как выводить сообщения на экран
Познакомился с типами int и String
Чем компиляция в Java отличается от других языков
Как делать комментарии и зачем они нужны

Напиши программу, которая выводит на экран надпись: «Амиго очень умный».
Требования:
1. Программа должна выводить текст.
2. Текст должен начинаться с «Амиго».
3. Текст должен заканчиваться на «умный».
4. Текст должен состоять из 17 символов, включая пробелы.
5. Выводимый текст должен соответствовать заданию.
 */
package uroven_0;

/**
 *
 * @author Гогитидзе Г.Н.
 */
public class Zadanie_1 {
    public static void main (String[] args) {
        // 1 задание
        System.out.println("Амиго очень умный");
        
        // 2 задание
        System.out.println("Я думаю, быть программистом - это круто");
        
        // 3 задание
        System.out.println("Элли самая красивая");
        System.out.println("Элли самая красивая");
        System.out.println("Элли самая красивая");
        System.out.println("Элли самая красивая");
        System.out.println("Элли самая красивая");
        
        // 4 задание
        System.out.println(3126-8);
        
        // 5 задание
        String name = "Гиорги";
        int age = 20;
        String city = "Томск";
        System.out.println("Имя: " + name + "\n" + age + " лет" + "\n" + "город " + city);
        
        // 6 задание
        System.out.println("Это не баг, это фича.");
        
        // 7 задание
        int x = 2;
        int y = 12;

        //x = x * 3;
        y = x + y;
        x = y - x;
        y = y - x;

        System.out.println(x);
        System.out.println(y);
        
        // 8 задание
        //String s = "23";
        int a = 3, b = 2;
        //String four = "четыре";
        //String three = "3";

        //System.out.print("два");
        //System.out.print(" плюс ");
        //System.out.print(s);
        System.out.print(b);
        System.out.print(" плюс ");
        //System.out.print("три");
        System.out.print(a);
        System.out.print(" равно ");
        //System.out.print("пять");
        System.out.print(a + b);
    }

}