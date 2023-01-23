package laba_7;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        
    Scanner in = new Scanner(System.in);
    System.out.println("score: ");

    double score = in.nextDouble();
    System.out.println("pay: ");
    
    double pay = in.nextDouble();
    if (score > 90) {
        pay = pay + pay * 0.03;
    }
    System.out.println("itog: " + pay);
    
  }
}