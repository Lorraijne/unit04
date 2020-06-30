package by.htp.unit04.main;

import java.util.Scanner;

public class Task03 {
	public static void main(String[] args) {

		int value = 1;
		int cash = 1;
		double money = 1;
		double sum = 1;

		System.out.print("Выберите КОНВЕРТИРУЕМУЮ валюту: 1 - BYN, 2 - USD, 3 - EUR "); //не хватает проверки
		value = readFromConsole();
		System.out.print("Введите размер суммы ");
		money = readFromConsole(); 
		System.out.print("Выберите валюту В КОТОРУЮ вы хотите конвертировать деньги: 1 - BYN, 2 - USD, 3 - EUR ");
		cash = readFromConsole();
		
		sum = convert (value, cash, money);
		
		System.out.println("Итого " + sum);

	}

	public static int readFromConsole() {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNextInt() == false) {
			String str = sc.next();
			System.out.println("Вы ввели '" + str + "', а нужно 1, 2 или 3");
			System.out.print("Попробуйте ещё раз ");
		}
			return sc.nextInt();
		
	}
	
	public static double convert (int value, int cash, double money) {
		double sum = 1;
		switch (value) {
		case 1:
			if (cash == 2) {
				sum = money / 2.4506;
			} else if (cash == 3) {
				sum = money / 2.6832;
			} else {
				System.out.println("И зачем?");
				sum = money;
			}
			break;
		case 2:
			if (cash == 1) {
				sum = money * 2.4506;
			} else if (cash == 3) {
				sum = money * 0.9133;
			} else {
				System.out.println("И зачем?");
				sum = money;
			}
			break;
		case 3:
			if (cash == 1) {
				sum = money * 2.4506;
			} else if (cash == 2) {
				sum = money / 0.9133;
			} else {
				System.out.println("И зачем?");
				sum = money;
			}
			break;
		}
		return sum;
		
		
		
	}
}
// задания модуля 4 зачтены
