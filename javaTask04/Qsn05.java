package javaTask04;

import java.util.Scanner;

public class Qsn05 {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter a number :: ");
		int num = sc.nextInt();
		boolean flag = false;
		if (num == 0 || num == 1) {
			flag = true;
		}
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				flag = true;
				break;
			}
		}
		if (!flag) {
			System.out.println(num + " is a Prime Number");
		}
		else {
			System.out.println(num + " is not a Prime Number");
		}

	}

}
