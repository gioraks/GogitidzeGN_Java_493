package laba_7;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("count: 60");
        int count = in.nextInt();

        boolean newLine = count % 10 == 0;
        System.out.println(newLine);

    }
    
}