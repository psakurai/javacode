package Day5;

import java.util.Scanner;

public class AnswerQuiz1 {
	static Scanner scanner = new Scanner(System.in);

	public static void whileLoop() {
		System.out.print("Number : ");
		int i = scanner.nextInt();
		while (i >= 1) {
			System.out.println(i);
			i--;
		}
	}

	public static void numberRange() {
		System.out.print("Number : ");
		int i = scanner.nextInt();
		while (i < 1 || i > 100) {
			System.out.print("Number : ");
			i = scanner.nextInt();
		}

		System.out.print("\nDisplayed Number : ");
		System.out.print(i);
	}

	public static void numberProcessor() {
		System.out.print("Initial Number : ");
		int i = scanner.nextInt();
		System.out.print("Command : ");
		String command = scanner.next();
		while (!command.equals("End")) {
			switch (command) {
			case "Inc":
				i++;
				break;
			case "Dec":
				i--;
				break;
			}

			System.out.print("Updated Number : ");
			System.out.print(i);
			System.out.print("\n\nCommand : ");
			command = scanner.next();
		}
		System.out.print("Displayed Number : ");
		System.out.print(i);
	}

	public static void sumDigits() {
		System.out.print("Initial Number : ");
		int sum = 0;
		int n = scanner.nextInt();

		while (n > 0) {
			sum += n % 10;
			n /= 10;

			System.out.println("Sum: " + sum);
			System.out.println(n);
		}
		System.out.print(sum);
	}

	public static void specialBonus() {
		System.out.print("Number : ");
		int stopNum = scanner.nextInt();
		int previousNum = stopNum;
		while (true) {
			System.out.print("Number : ");
			int num = scanner.nextInt();
			if (num == stopNum) {
				break;
			}
			previousNum = num;
		}

		System.out.print(previousNum * 1.2);
	}

	public static void seq2K() {
		System.out.print("No : ");
		int n = scanner.nextInt();
		int k = 1;
		while (k <= n) {
			System.out.print(k + " ");
			k = k * 2 + 1;
		}
	}

	public static void downTo1() {
		System.out.print("Number : ");
		int n = scanner.nextInt();
		for (int i = n; i >= 1; i--) {
			if (i < n)
				System.out.print(", ");
			if (i % 10 == 0)
				System.out.println();
			System.out.print(i);
		}
		System.out.println();
	}

	public static void evenPower() {
		System.out.print("Number : ");
		int n = scanner.nextInt();
		int num = 1;
		for (int i = 0; i <= n; i += 2) {
			if (i > 0)
				System.out.print(", ");
			if (i % 10 == 0)
				System.out.println();
			System.out.print(num);
			num = num * 2 * 2;
		}
		System.out.println();
	}

	public static void nestedLoop() {
		System.out.print("Iteration : ");
		int i = scanner.nextInt();
		System.out.println();
		for (int row = 0; row < i; row++) {
			for (int col = 0; col < i; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void triangle() {
		System.out.print("Iteration : ");
		int i = scanner.nextInt();
		System.out.println();
		for (int row = 0; row < i; row++) {
			for (int col = 0; col <= row; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void triangleWhile() {
		System.out.print("Iteration : ");
		int i = scanner.nextInt();
		int row = 0;

		int col = 0;
		System.out.println();
		while (row < i) {
			col = 0;
			while (col <= row) {
				System.out.print("* ");
				col++;
			}
			row++;
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// whileLoop();
		// numberRange();
		// numberProcessor();
		// sumDigits();
		// specialBonus();
		// seq2K();
		// downTo1();
		// evenPower();
		// nestedLoop();
		// triangle();
		// triangleWhile(); 
	}
}
