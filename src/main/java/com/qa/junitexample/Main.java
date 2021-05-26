package com.qa.junitexample;

import java.util.Scanner;

public class Main {

	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Choose a subject:\n - add\n - subtract\n - multiply\n - division\n");
		String result = scanner.nextLine();

		switch (result) {
		case "add":
			System.out.println("Please provide the first number:\n ");
			int add1 = Integer.parseInt(scanner.nextLine());
			System.out.println("Please provide the second number:\n");
			int add2 = Integer.parseInt(scanner.nextLine());
			System.out.println("\n" + add1 + " + " + add2 + " = " + Calculator.add(add1, add2));
			break;

		case "subtract":
			System.out.println("Please provid the first number:\n");
			int sub1 = Integer.parseInt(scanner.nextLine());
			System.out.println("Please provide the second number:\n");
			int sub2 = Integer.parseInt(scanner.nextLine());
			System.out.println("\n" + sub1 + " - " + sub2 + " = " + Calculator.subtract(sub1, sub2));
			break;

		case "multiply":
			System.out.println("Please provid the first number:\n");
			int mult1 = Integer.parseInt(scanner.nextLine());
			System.out.println("Please provide the second number:\n");
			int mult2 = Integer.parseInt(scanner.nextLine());
			System.out.println("\n" + mult1 + " * " + mult2 + " = " + Calculator.multiply(mult1, mult2));
			break;

		case "division":
			System.out.println("Please provid the first number:\n");
			int div1 = Integer.parseInt(scanner.nextLine());
			System.out.println("Please provide the second number:\n");
			int div2 = Integer.parseInt(scanner.nextLine());
			System.out.println("\n" + div1 + " / " + div2 + " = " + Calculator.divide(div1, div2));
			break;

		default:
			System.out.println("Sorry wrong value, Exiting app.");
			break;

		}

		System.out.println("Thank you, Exiting app.");
		scanner.close();

	}

}
