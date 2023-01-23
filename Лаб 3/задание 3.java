/*
* Чтобы изменить этот заголовок лицензии, выберите Заголовки лицензий в свойствах проекта.
* Чтобы изменить этот файл шаблона, выберите Tools | Шаблоны
* и откройте шаблон в редакторе.
*/
package laba_3;

import java.util.Scanner;


public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter a, b: ");
        double a = in.nextDouble();
        double b = in.nextDouble();
        System.out.println("Summa: " + (a+b));
        System.out.println("Raznost: " + (a-b));
        System.out.println("Mult: " + (a*b));
        
        
        
    }
    
}