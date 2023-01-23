package laba_7;
import java.util.Scanner;
public class Task18 {
    public static void main(String[] args) {
        double x, income, number, score, scale, tax, i = 0, j = 1;
        Scanner in = new Scanner(System.in);
        System.out.println("x: ");
        x = in.nextInt();
        System.out.println("income: ");
        income = in.nextDouble();
        System.out.println("number: ");
        number = in.nextDouble();
        System.out.println("scale: ");
        scale = in.nextDouble();
        if(x > 10) {
            score = 3 * scale;
        }
        else {
            score = 4 * scale;
        }
        if(income > 10000) {
            tax = income * 0.2;
        }
        else {
            tax = income * 0.17 + 1000;
        }
        if(number % 3 == 0) {
            number = i;
        }
        else {
            number = j;
        }
		System.out.println("score: " + score + " tax: " + tax + " number: " + number);
    }
    
}