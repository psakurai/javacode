package Day4;

import java.util.Scanner;

public class LoopLoop {
	static Scanner scanner = new Scanner(System.in);

	public static void numberEndWith7(int num) {
		for (int x = 7; x < num; x += 10) {
			System.out.println(x);
		}
	}

	public static void examCountdown(int days) {
		for (int x = days; x >= 1; x--) {
			System.out.printf("%d days before the exam\n", x);
		}
		System.out.println("The Exam Has Come!");
	}

	public static void iteratingOverChar() {
		for (char alphabet1 = 'a'; alphabet1 <= 'z'; alphabet1++) {
			System.out.printf("%c ", alphabet1);
		}
		char ch = (char) 65;
		System.out.println("\nCharacter : " + ch);
	}

	public static void latinLetter() {
		System.out.print("\nStart Letter : ");
		char startLetter = scanner.nextLine().charAt(0);
		System.out.print("\nEnd Letter : ");
		char lastLetter = scanner.nextLine().charAt(0);
		for (char alphabet1 = startLetter; alphabet1 <= lastLetter; alphabet1++) {
			System.out.printf("%c ", alphabet1);
		}
	}

	public static void infiniteLoop() {
		for (;;) {
			System.out.println("Infinite");
		}
	}

	public static void sumTillStop() {
		long sum = 0;
		for (;;) {
			System.out.print("\nNumber : ");
			int num = scanner.nextInt();
			if (num == 0)
				break;
			sum += num;
			System.out.println("Sum = " + sum);
		}
		System.out.println("Goodbye");
	}

	public static void multTable() {
		System.out.print("\nInteger : ");
		int num = scanner.nextInt();
		for (int x = 1; x <= 10; x++) {
			System.out.println(num + " x " + x + " = " + (num * x));
		}
	}

	public static void biggestSmallestNumber() {
		System.out.print("\nAmount : ");
		int num = scanner.nextInt();
		int maxNumber = Integer.MIN_VALUE;
		int minNumber = Integer.MAX_VALUE;
		for (int i = 1; i <= num; i++) {
			System.out.printf("No %d: ", i);
			int number = scanner.nextInt();
			if (number > maxNumber) {
				maxNumber = number;
			}
			if (number < minNumber) {
				minNumber = number;
			}
		}
		System.out.println("Max Number : " + maxNumber);
		System.out.println("Min Number : " + minNumber);
	}

	public static void vowelSum() {
		System.out.print("\nAmount : ");
		int num = scanner.nextInt();
		int vowelSum = 0;
		for (int i = 1; i <= num; i++) {
			System.out.printf("No %d: ", i);
			char ch = scanner.next().charAt(0);
			switch (ch) {
			case 'a':
				vowelSum += 1;
				break;
			case 'e':
				vowelSum += 2;
				break;
			case 'i':
				vowelSum += 3;
				break;
			case 'o':
				vowelSum += 4;
				break;
			case 'u':
				vowelSum += 5;
				break;
			}
		}
		System.out.println("\nSum : " + vowelSum);
	}

	public static void division234() {
		System.out.print("\nAmount : ");
		int amount = scanner.nextInt();
		double p1 = 0;
		double p2 = 0;
		double p3 = 0;
		for (int i = 1; i <= amount; i++) {
			System.out.printf("No %d: ", i);
			int num = scanner.nextInt();
			if (num % 2 == 0) {
				p1++;
			}
			if (num % 3 == 0) {
				p2++;
			}
			if (num % 4 == 0) {
				p3++;
			}
		}
		System.out.printf("\nPercentage of 2 : %.2f", (p1 / 3) * 100);
		System.out.printf("\nPercentage of 3 : %.2f", (p2 / 3) * 100);
		System.out.printf("\nPercentage of 4 : %.2f", (p3 / 3) * 100);
	}

	public static void rollerCoster() {
		System.out.print("\nHow many seat available ?: ");
		int places = scanner.nextInt();
		System.out.print("\nWhat is the min age ?: ");
		int minAge = scanner.nextInt();
		System.out.print("\nHow many people are queuing ?: ");
		int queueSize = scanner.nextInt();
		int validPeopleCount = 0;
		for (int x = 0; x < queueSize; x++) {
			System.out.print("\nAge: ");
			int personAge = scanner.nextInt();
			if (personAge >= minAge && places > validPeopleCount) {
				validPeopleCount++;
				if (validPeopleCount == places) {
					System.out.print("The rollercoaster departures.");
					break;
				} else {
					System.out.print("Waiting...");
				}
			} else {
				System.out.print("Invalid, less than " + (places - validPeopleCount) + " place(s).");
			}

		}
	}

	public static void marketPlace() {
		System.out.print("\nProduct (Apple, Banana, Kiwi) : ");
		String product = scanner.next();
		System.out.print("\nDay (Weekday, Weekend) : ");
		String day = scanner.next();

		if (product.equalsIgnoreCase("Banana")) {
			if (day.equalsIgnoreCase("Weekday")) {
				System.out.print("2.50");
			} else if (day.equalsIgnoreCase("Weekend")) {
				System.out.print("2.70");
			}
		} else if (product.equalsIgnoreCase("Apple")) {
			if (day.equalsIgnoreCase("Weekday")) {
				System.out.print("1.30");
			} else if (day.equalsIgnoreCase("Weekend")) {
				System.out.print("1.60");
			}
		} else if (product.equalsIgnoreCase("Kiwi")) {
			if (day.equalsIgnoreCase("Weekday")) {
				System.out.print("2.20");
			} else if (day.equalsIgnoreCase("Weekend")) {
				System.out.print("3.00");
			}
		}
	}

	public static void greatestNo3() {
		System.out.print("\nNo 1 : ");
		int first = scanner.nextInt();
		System.out.print("No 2 : ");
		int second = scanner.nextInt();
		System.out.print("No 3 : ");
		int third = scanner.nextInt();

		System.out.print("\nBiggest Number : ");
		if (first > second) {
			if (first > third) {
				System.out.print(first);
			} else {
				System.out.print(third);
			}
		} else {
			if (second > third) {
				System.out.print(second);
			} else {
				System.out.print(third);
			}
		}
	}

	public static void bonusPoint() {
		System.out.print("\nPoint : ");
		int point = scanner.nextInt();
		if (point >= 0 && point <= 3) {
			point += 5;
		} else if (point >= 4 && point <= 6) {
			point += 15;

		} else if (point >= 7 && point <= 9) {
			point += 20;
		}
		System.out.print("\nBonus Point : " + point);
	}

	public static void foodDrink() {
		System.out.print("\nF/D : ");
		String s = scanner.next();
		if (s.equalsIgnoreCase("curry") || s.equalsIgnoreCase("sushi") || s.equalsIgnoreCase("noodles")
				|| s.equalsIgnoreCase("spaghetti")) {
			System.out.print("\nfood");
		} else if (s.equalsIgnoreCase("tea") || s.equalsIgnoreCase("water") || s.equalsIgnoreCase("coffee")) {
			System.out.print("\ndrink");
		} else
			System.out.print("\nunknown");
	}

	public static void checkBoolNot() {
		System.out.print("\nNumber : ");
		int num = scanner.nextInt();
		if (!((num >= 100 && num <= 200) || num == 0)) {
			System.out.print("\nInvalid");
		} else
			System.out.print("\nValid");
	}

	public static void animal() {
		System.out.print("\nAnimal : ");
		String animal = scanner.nextLine();
		switch (animal) {
		case "dog":
		case "cat":
			System.out.print("Mammal");
			break;
		default:
			System.out.print("Unknown");
			break;
		}
	}

	public static void fruitVegetable() {
		System.out.print("\nProduct : ");
		String product = scanner.nextLine();
		switch (product) {
		case "carrot":
		case "cucumber":
		case "pepper":
			System.out.print("Vegetable");
			break;
		case "banana":
		case "apple":
		case "kiwi":
		case "cherry":
		case "lemon":
		case "grape":
			System.out.print("Fruit");
			break;
		default:
			System.out.print("Unknown");
			break;
		}
	}

	public static void checkVowel() {
		System.out.print("\nAlphabet : ");
		char ch = scanner.next().charAt(0);
		switch (Character.toLowerCase(ch)) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.print("Vowel");
			break;
		default:
			System.out.print("Consonant");
			break;
		}

	}

	public static void product3num() {
		System.out.print("\nNumber 1 : ");
		int a = scanner.nextInt();
		System.out.print("Number 2 : ");
		int b = scanner.nextInt();
		System.out.print("Number 3 : ");
		int c = scanner.nextInt();
		int countN = 0;
		if (a == 0 || b == 0 || c == 0)
			System.out.print("Zero");
		else {
			if (a < 0)
				countN++;
			if (b < 0)
				countN++;
			if (c < 0)
				countN++;

			if (countN % 2 == 0) {
				System.out.print("Positive");
			} else
				System.out.print("Negative");
		}
	}

	public static void sortedNumber() {
		System.out.print("\nNumber 1 : ");
		int a = scanner.nextInt();
		System.out.print("Number 2 : ");
		int b = scanner.nextInt();
		System.out.print("Number 3 : ");
		int c = scanner.nextInt();
		int countN = 0;
		if (a == 0 || b == 0 || c == 0)
			System.out.print("Zero");
		else {
			if (a < 0)
				countN++;
			if (b < 0)
				countN++;
			if (c < 0)
				countN++;

			if (countN % 2 == 0) {
				System.out.print("Positive");
			} else
				System.out.print("Negative");
		}
	}

	public static void cinema() {
		System.out.print("\nType : ");
		String type = scanner.nextLine();
		System.out.print("\nRows : ");
		int rows = scanner.nextInt();
		System.out.print("\nColumn : ");
		int cols = scanner.nextInt();
		int seats = rows * cols;
		switch (type) {
		case "premiere":
			System.out.printf("%.2f\n", seats * 12);
			break;
		case "normal":
			System.out.printf("%.2f\n", seats * 7.5);
			break;
		case "discount":
			System.out.printf("%.2f\n", seats * 5);
			break;
		default:
			System.out.print("Invalid");
			break;
		}
	}

	public static void calc() {
		System.out.print("\nNumber 1 : ");
		double n1 = scanner.nextDouble();
		System.out.print("Operator : ");
		String op = scanner.next();
		System.out.print("Number 2 : ");
		double n2 = scanner.nextDouble();
		switch (op) {
		case "+":
			System.out.printf("\n%.2f %S %.2f = %.2f\n", n1, op, n2, n1 + n2);
			break;
		case "-":
			System.out.printf("\n%.2f %S %.2f = %.2f\n", n1, op, n2, n1 - n2);
			break;
		case "*":
			System.out.printf("\n%.2f %S %.2f = %.2f\n", n1, op, n2, n1 * n2);
			break;
		case "/":
			System.out.printf("\n%.2f %S %.2f = %.2f\n", n1, op, n2, n1 / n2);
			break;
		case "%":
			System.out.printf("\n%.2f %S %.2f = %.2f\n", n1, op, n2, n1 % n2);
			break;
		default:
			System.out.print("Invalid Operator");
			break;
		}

	}

	public static void atm() {
		System.out.print("\nBalance : ");
		double b = scanner.nextDouble();
		System.out.print("Withdraw : ");
		double w = scanner.nextDouble();
		System.out.print("Limit : ");
		double l = scanner.nextDouble();
		if (b >= w && w <= l)
			System.out.print("The withdraw was successful.");
		else if (w>l)
			System.out.print("The limit was exceed.");
		else
			System.out.print("Insufficient availability.");
	}

	public static void main(String[] args) {
		// Scanner scanner = new Scanner(System.in);
		// System.out.println("Number: ");
		// int num = scanner.nextInt();
		// numberEndWith7(num);
		// examCountdown(num);
		// iteratingOverChar();
		// latinLetter();
		// infiniteLoop();
		// sumTillStop();
		// multTable();
		// 3
		// biggestSmallestNumber();
		// vowelSum();
		// division234();
		// rollerCoster();
		// marketPlace();
		// greatestNo3();
		// bonusPoint();
		// foodDrink();
		// checkBoolNot();
		// animal();
		// fruitVegetable();
		// checkVowel();
		// product3num();
		// cinema();
		// calc();
		atm();
	}
}
