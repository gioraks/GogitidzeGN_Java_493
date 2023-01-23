package laba_7;
import java.util.Scanner;

public class Task17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("age: ");
        int age = in.nextInt();
        System.out.println(age >= 16 ? "20": "10");
    }
    
}