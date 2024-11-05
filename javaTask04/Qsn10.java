package javaTask04;

import java.util.Scanner;

public class Qsn10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number :: ");
		int number = sc.nextInt();
		int count = 0;
		while(number != 0) {
			number = number / 10;
			count++;
		}
		System.out.println("Number of digits ::" + count);

	}

}
