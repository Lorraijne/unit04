package by.htp.unit04.main;

import java.util.Random;
import java.util.Scanner;

public class Task02 {

	public static void main(String[] args) {
		Random rnd = new Random();
		int x = rnd.nextInt(10);
		int y = rnd.nextInt(10);

		print(x, y);
		result(x, y);

	}

	public static int result(int x, int y) {

		Scanner sc = new Scanner(System.in);
		int mul = 0;
		if (sc.hasNextInt()) {
			mul = sc.nextInt();

			if (mul == x * y) {
				System.out.println("Ответ правильный");
			} else {
				System.out.println("Ответ неправильный");
			}
		} else {
			System.out.println("Ответ неправильный");
		}

		mul = x * y;
		return mul;
	}

	public static void print(int x, int y) {
		System.out.println("Умножь это " + x + " на это " + y);
	}

}
