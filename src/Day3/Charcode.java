package Day3;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Charcode {
	public static void uniCode() {
		char ch = 'a';
		System.out.printf("The code of '%c' is: %d%n", ch, (int) ch);
		ch = 'b';
		System.out.printf("The code of '%c' is: %d%n", ch, (int) ch);
		ch = 'A';
		System.out.printf("The code of '%c' is: %d%n", ch, (int) ch);
		ch = '\u0449';
		System.out.printf("The code of '%c' is: %d%n", ch, (int) ch);
	}

	public static void uniCodeScan() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("\nEnter 3 number:  \n");
		char first = scanner.nextLine().charAt(0);
		char second = scanner.nextLine().charAt(0);
		char third = scanner.nextLine().charAt(0);

		System.out.printf("%n%c -> %d%n%c -> %d%n%c -> %d%n", first, (int) first, second, (int) second, third,
				(int) third);
		System.out.printf("%n%c -> %d%n%c -> %d%n%c -> %d%n", third, (int) third, second, (int) second, first,
				(int) first);
	}

	public static void uniCodeSortDesc(char[] charArray) {
		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < charArray.length; i++) {
			for (int j = i + 1; j < charArray.length; j++) {
				if (charArray[i] < charArray[j]) {
					char temp = charArray[i];
					charArray[i] = charArray[j];
					charArray[j] = temp;
				}
			}
		}

		System.out.println("\nSorted < : ");
		for (int x = 0; x < 3; x++) {
			System.out.println(charArray[x]);
		}
	}

	public static void uniCodeSortAsce(char[] charArray) {
		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < charArray.length; i++) {
			for (int j = i + 1; j < charArray.length; j++) {
				if (charArray[i] > charArray[j]) {
					char temp = charArray[i];
					charArray[i] = charArray[j];
					charArray[j] = temp;
				}
			}
		}

		System.out.println("\nSorted > : ");
		for (int x = 0; x < 3; x++) {
			System.out.println(charArray[x]);
		}
	}

	public static void uniCodeSort() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("\nEnter 3 number:  \n");
		char first = scanner.nextLine().charAt(0);
		char second = scanner.nextLine().charAt(0);
		char third = scanner.nextLine().charAt(0);
		char[] charArray = { first, second, third };

		uniCodeSortDesc(charArray);
		uniCodeSortAsce(charArray);
	}

	public static void concatString() {
		String fname = "Ivan";
		String lname = "Ivankov";
		String age = "23";

		System.out.printf("\nFullname: %s %s.\n", fname, lname);
		System.out.println("Age : " + age + ".");
	}

	public static void firstLast() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("\nEnter 3 number:  \n");
		char first = scanner.nextLine().charAt(0);
		char second = scanner.nextLine().charAt(0);
		char third = scanner.nextLine().charAt(0);
		char[] charArray = { first, second, third };

		uniCodeSortDesc(charArray);
		uniCodeSortAsce(charArray);
	}

	public static void modOperator() {
		int x = 7342;
		System.out.println("\n" + (7342 % 100) / 10);
	}

	public static void checkOddEven() {

		Scanner scanner = new Scanner(System.in);
		System.out.print("\nNumber : ");
		int x = scanner.nextInt();

		if (x % 2 == 0)
			System.out.println("\n" + x + " is even.");
		else
			System.out.println("\n" + x + " is odd.");
	}

	public static void waterPlant() {
		Scanner scanner = new Scanner(System.in);

		int minValue = 0;
		int maxValue = 101;

		double humidity;

		do {
			System.out.print("\nHumidity : ");
			humidity = scanner.nextDouble();
		} while (humidity < minValue || humidity > maxValue);

		if (humidity > 90.0)
			System.out.println("Rain -> Skip Watering.");
		else
			System.out.println("No Rain -> Water the Plants.");
	}

	public static void valueComparison() {
		Scanner scanner = new Scanner(System.in);

		int a = 5;
		int b = 10;

		System.out.println();
		System.out.println(a < b);
		System.out.println(a > 100);
		System.out.println(a <= 5);
		System.out.println(b == 2 * a);
		System.out.println(b != 2 * a);
	}

	public static void stringComparison() {
		String a = "Example";
		String b = "example";
		String a1 = "Example";
		String b1 = "#Example";

		System.out.println();
		System.out.println(a.equals(b));
		System.out.println(a.equalsIgnoreCase(b));
		System.out.println(b.substring(1));
		System.out.println(a.equals(b.substring(1)));
		System.out.println(a == b.substring(1));
	}

	public static void freezingWeather() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("\nTemperature (C) : ");
		int temp = scanner.nextInt();

		if (temp <= 0)
			System.out.println("Freezing Weather!");
		else
			System.out.print("Temperature Above 0!");
	}

	public static void blockCode() {
		String color = "red";
		if (color.equals("red"))
			System.out.println("\nTomato");
		else
			System.out.println("\nBanana");
		System.out.println("Lemon");
	}

	public static void seriesCondition() {
		int a = 5;
		System.out.println();
		if (a == 7)
			System.out.print("Equal to 7");
		else if (a > 7)
			System.out.print("Bigger than 7");
		else if (a > 5)
			System.out.print("Bigger than 5");
		else if (a > 4)
			System.out.print("Bigger than 4");
		else
			System.out.print("Smaller than 5");
	}

	public static void numToWord() {
		int num = 0;

		System.out.println("\n\n0-Quit. ");
		do {
			Scanner scanner = new Scanner(System.in);
			System.out.print("Number : ");
			num = scanner.nextInt();
			switch (num) {
			case 0:
				System.out.println("End");
				break;
			case 1:
				System.out.println("One");
				break;
			case 2:
				System.out.println("Two");
				break;
			case 3:
				System.out.println("Three");
				break;
			case 4:
				System.out.println("Four");
				break;
			case 5:
				System.out.println("Five");
				break;
			case 6:
				System.out.println("Six");
				break;
			case 7:
				System.out.println("Seven");
				break;
			case 8:
				System.out.println("Eight");
				break;
			case 9:
				System.out.println("Nine");
				break;
			default:
				System.out.println("Out of range");
				break;
			}
		} while (num != 0);
	}

	public static void checkPassword() {
		String passwd;

		System.out.println("\n\n0-Quit. ");
		do {
			Scanner scanner = new Scanner(System.in);
			System.out.print("\nPassword : ");
			passwd = scanner.nextLine();

			if (passwd.equals("s3cr3t")) {
				System.out.println("Welcome.");
			} else {
				System.out.println("Wrong password!");
			}
		} while (passwd.equals("0"));
	}

	public static void areaOfFigures() {
		String figure;
		int val1;
		int val2;
		Scanner scanner = new Scanner(System.in);
		System.out.print("\n\nEnter Figure : ");
		figure = scanner.nextLine();
		do {
			switch (figure) {
			case "square":
				System.out.print("Value : ");
				val1 = scanner.nextInt();
				System.out.printf("The area is %.2f", (double) (val1 * val1));
				break;
			case "rectangle":
				System.out.print("Value 1: ");
				val1 = scanner.nextInt();
				System.out.print("Value 2: ");
				val2 = scanner.nextInt();
				System.out.printf("The area is %.2f", (double) (val1 * val2));
				break;
			case "circle":
				System.out.print("Radius : ");
				val1 = scanner.nextInt();
				System.out.printf("The area is %.2f", (double) (((val1 * val1) * 3.142)));
				break;
			default:
				System.out.println("Out of bound.");
				break;
			}
		} while (figure == "quit");
	}

	public static void coffeeShop() {
		Scanner scanner = new Scanner(System.in);

		System.out.print("\n\nOrder : ");
		String order = scanner.nextLine();
		System.out.print("Extra : ");
		String extra = scanner.nextLine();
		double price = 0;

		if (order.equals("Coffee")) {
			price = 1.0;
			System.out.println("You have chosen coffee!.");
		} else if (order.equals("Tea")) {
			price = 0.6;
			System.out.println("You have chosen tea!.");
		}
		if (extra.equals("Sugar")) {
			price += 0.4;
			System.out.println("You added extra sugar!.");
		}
		System.out.printf("Price : %.2f", price);
	}

	public static void validTriangle() {
		Scanner scanner = new Scanner(System.in);

		System.out.print("\n\nOrder : ");
		String order = scanner.nextLine();
		System.out.print("Extra : ");
		String extra = scanner.nextLine();
		double price = 0;

		if (order.equals("Coffee")) {
			price = 1.0;
			System.out.println("You have chosen coffee!.");
		} else if (order.equals("Tea")) {
			price = 0.6;
			System.out.println("You have chosen tea!.");
		}
		if (extra.equals("Sugar")) {
			price += 0.4;
			System.out.println("You added extra sugar!.");
		}
		System.out.printf("Price : %.2f", price);
	}

	public static void incDec() {
		int a = 1;
		System.out.println("\n\nPrefix");
		System.out.println(--a);
		System.out.println(a);

		System.out.println("\nPostfix");
		a = 1;
		System.out.println(a--);
		System.out.println(a);
	}

	public static void sumNumber() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("\n\nN : ");
		int num = scanner.nextInt();
		int sum = 0;
		for (int x = 1; x <= num; x++) {
			sum += x;
		}

		System.out.println("Sum : " + sum);
	}

	public static void main(String[] args) {
		uniCode();
		// uniCodeScan();
		// uniCodeSort();
		concatString();
		modOperator();
		// checkOddEven();
		// waterPlant();
		valueComparison();
		stringComparison();
		// freezingWeather();
		blockCode();
		// checkOddEven();
		seriesCondition();
		// numToWord();
		// checkPassword();
		// areaOfFigures();
		// coffeeShop();
		incDec();
		sumNumber();
	}
}
