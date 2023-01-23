package laba_7;

import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double radius, area;
		System.out.print("Enter radius: ");
		radius = input.nextDouble();
		if(radius >= 0) {
		    area = 3.14159 * radius * radius;
		    System.out.println("Radius: " + radius + ", Area: " + area);
		}
		else {
		    System.out.println("Incorrect data");
		}
	}

}