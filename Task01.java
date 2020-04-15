package by.htp.unit04.main;

import java.util.Scanner;

public class Task01 {
	public static void main(String[] args) {
		int x;
		int y;
		int sum = 0, mul = 0;

		System.out.println("Первое чило x " );

		x = readFromConsole();

		System.out.println("Второе чило y");

		y = readFromConsole();

		sum = calcSum(x, y);
		mul = calcMul(x, y);

		printResult(sum, mul);

	}

	public static int readFromConsole() {
		Scanner sc = new Scanner(System.in);
		int x = 0;
		System.out.println("Введите переменную: ");
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.println("Введите переменную: ");
		}
		x = sc.nextInt();
		return x;
	}

	public static int calcSum(int x, int y) {
		return x + y;
	}

	public static int calcMul(int x, int y) {
		return x * y;
	}

	public static void printResult(int sum, int mul) {
		System.out.println("Сумма  " + sum + " Произведенеие = " + mul);
	}

}