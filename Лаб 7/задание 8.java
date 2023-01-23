package laba_7;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter pulse: ");

        int pulse = in.nextInt();
        if (pulse > 56) {
            System.out.println("Продолжайте тренироваться");
        } else {
            System.out.println("ваше сердце в отличном состоянии");
        }
    }
    
}