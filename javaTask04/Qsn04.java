package javaTask04;

import java.util.Scanner;

public class Qsn04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number - ");
		int a = sc.nextInt();
		System.out.println("Enter second number - ");
		int b = sc.nextInt();
		System.out.println("Current value of a ::" + a);
		System.out.println("Current value of b ::" + b);
		int temp;
		temp = a;
		a = b;
		b = temp;
		System.out.println("New value of a ::" + a);
		System.out.println("New value of b ::" + b);
	}

}
