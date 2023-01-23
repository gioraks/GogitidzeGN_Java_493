package laba_7;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("x: ");
        int x = in.nextInt();
        System.out.println("y: ");
        int y = in.nextInt();
        if (x > 2) {
           if (y > 2) {
            int z = x + y;
            System.out.println("z равен " + z);
            } 
        } else
            System.out.println("x равен " + x);
        
    }
    
}