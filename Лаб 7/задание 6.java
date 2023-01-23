package laba_7;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        int product = 1;
        Scanner in = new Scanner(System.in);
        System.out.println("x: ");
        int x = in.nextInt();
        if (x != 0) {
            product *= x;
        }
        System.out.println("product: " + product);

    }
    
}