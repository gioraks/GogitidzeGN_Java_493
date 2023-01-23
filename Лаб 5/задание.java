package laba_5;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args){
        String text;
        System.out.println("vvedi chislo: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       
        text = switch (n) {
            case 0 -> "zero";
            case 1 -> "one";
            case 2 -> "two";
            case 3 -> "three";
            case 4 -> "four";
            case 5 -> "five";
            case 6 -> "six";
            case 7 -> "seven";
            case 8 -> "eight";
            case 9 -> "nine";
            default -> "Error";
        };
        System.out.println(text);
    }
    
}