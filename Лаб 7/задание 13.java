package laba_7;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int num;
    System.out.println("num: ");
    num = in.nextInt();
		System.out.println((num >= 1) && (num <=100));
		System.out.println(((num >= 1) && (num <=100)) || (num < 0));
    }
    
}