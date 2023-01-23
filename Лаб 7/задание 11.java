package laba_7;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        final int sms_per_meter = 100;
        double weight, m_height, s_height, height, bmi;
        Scanner in = new Scanner(System.in);

        System.out.println("weight(kg): ");
        weight = in.nextDouble();

        System.out.println("height(m): ");
        m_height = in.nextDouble();

        System.out.println("height(sms): ");
        s_height = in.nextDouble();

        height = m_height * 100 + s_height;
        bmi = weight / (height / sms_per_meter * height / sms_per_meter);
        
        System.out.println("BMI равно " +bmi);
        if (bmi < 18.5)
            System.out.println("Недостаточный вес");
        else if (bmi < 25)
            System.out.println("Норма");
        else if (bmi < 30)
            System.out.println("Избыточный вес");
        else
            System.out.println("Ожирение");


    }
    
}