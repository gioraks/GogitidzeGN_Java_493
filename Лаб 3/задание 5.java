* Чтобы  изменить  этот  заголовок лицензии  , выберите Заголовки лицензий в свойствах проекта .     
* Чтобы  изменить  этот  файл шаблона  , выберите Tools | Шаблоны 
* и  откройте  шаблон в редакторе . _  _   
*/
package laba_3;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter a,c: ");
        double a = in.nextInt();
        double c = in.nextInt();
        double b = Math.sqrt(c*c - a*a);
        System.out.println(b);
    }
    
}