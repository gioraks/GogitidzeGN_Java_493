package laba_7;
import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int age, weight, height;
        System.out.println("age: ");
        age = in.nextInt();
        System.out.println("weight: ");
        weight = in.nextInt();
        System.out.println("height: ");
        height = in.nextInt();
		System.out.println(age > 13 && age < 18);
		System.out.println(weight > 23 || height > 152);
		System.out.println(weight > 23 ^ height > 152);
    }
    
}