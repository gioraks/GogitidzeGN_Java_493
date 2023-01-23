package laba_7;

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("x: ");
		double x = in.nextDouble();
		System.out.println(Math.abs(x - 5) < 4.5);
		System.out.println(x - 5 >= 4.5);

    }
    
}