package javaTask04;

import java.util.Scanner;

public class Qsn09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age :: ");
		int age = sc.nextInt();
		if (age>60) {
			System.out.println("You are a Senior Citizen");
		}
		else {
			System.out.println("You are not a Senior Citizen");
		}

	}

}
