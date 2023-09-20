package Day2;

import java.time.LocalDate;
import java.util.Scanner;
import java.math.BigDecimal;

public class CheerCheer {
	public static void main(String[] args) {
		// Static method example
		printCheer();
		printCheer();
		// Methods calling each other
		day1();
		day2();
		// Static method problems
		boat();

		callLollipop();

		// Class
		Driver call;
		call = new Driver();
		call.callFromExtendClass();

		// Variable Scope and Lifetime
		scopeAndLifetime();

		// Centuries Example
		centuriesExample();

		// Integer Overflow Example
		integerOverflow();

		// Integer Literal
		integerLiteral();

		// Convert M to KM
		// convertMtoKM();

		// Convert centuries to years, days, hours
		// calcCentury();
		piPrecision();

		// Convert pound to dollar
		// convertPoundtoDollar();

		scientificNotation();
		floatingPointCalculations();
		// sumReal();
		specialNumbers();
	}

	public static void printCheer() {
		System.out.println("Three cheers for Pirates!");
		System.out.println("Huzzah");
		System.out.println("Huzzah");
		System.out.println("Huzzah");
		System.out.println();
	}

	public static void day1() {
		System.out.println("A partridge in a pear tree.");
	}

	public static void day2() {
		System.out.println("Two turtle doves, and");
		day1();
		System.out.println();
	}

	public static void egg() {
		System.out.println("I do not like green eggs and ham,");
		System.out.println("I do not like them, Sam I am!");
	}

	public static void boat() {
		egg();
		System.out.println("I do not like them on boat.");
		System.out.println("I do not like them with a goat.");
		egg();
	}

	public static void lollipop() {
		System.out.println();
		System.out.println("Lollipop, lollipop");
		System.out.println("Oh, lolli lolli lolli");
	}

	public static void callLollipop() {
		lollipop();
		lollipop();
		System.out.println("Call my baby lollipop");
	}

	public static void scopeAndLifetime() {
		String outer = "\nI'm inside the Main()";
		for (int x = 0; x < 10; x++) {
			String inner = "I'm inside the loop";
		}
		System.out.println(outer);
		// Variable cannot be accessed since declaration is done inside the loop
		// System.out.println(inner);
	}

	public static void centuriesExample() {
		byte centuries = 20;
		short years = 2000;
		int days = 730484;
		long hours = 17531616;

		System.out.printf("\n%d Centuries = %d years = % days = %d hours\n", centuries, years, days, hours);
	}

	public static void integerOverflow() {
		byte counter = 0;

		System.out.println();
		for (int x = 0; x < 260; x++) {
			counter++;
			System.out.println(counter);
		}
	}

	public static void integerLiteral() {
		System.out.println();
		System.out.println(0xFFFFFFFF);
		System.out.println(0L);
	}

	public static void convertMtoKM() {
		while (true) {
			try {
				System.out.print("\nMeter : ");
				Scanner scanner = new Scanner(System.in);
				int meters = Integer.parseInt(scanner.nextLine());

				double kilometers = meters / 1000.0;
				System.out.printf("Kilometers : %.3f", kilometers);
				System.out.println();
			} catch (NumberFormatException e) {
				System.out.println("Exception occurred:  " + e.toString());
			}
		}
	}

	public static void calcCentury() {
		// byte centuries = 20;
		// short years = 2000;
		// int days = 730484;
		// long hours = 17531616;

		while (true) {
			try {
				System.out.print("\nCentury : ");
				Scanner scanner = new Scanner(System.in);
				byte century = scanner.nextByte();
				short years = (short) (century * 100);
				int days = (int) (years * 365.2425);
				long hours = days * 24;
				System.out.printf("\n%d Centuries = %d years = %d days = %d hours\n", century, years, days, hours);
				// System.out.println();
			} catch (NumberFormatException e) {
				System.out.println("Exception occurred:  " + e.toString());
			}
		}

	}

	public static void piPrecision() {
		float floatPi = 3.141592653589793238f;
		double doublePi = 3.141592653589793238;

		System.out.println("\nFloat PI is : " + floatPi);
		System.out.println("\nDouble PI is : " + doublePi);
	}

	public static void convertPoundtoDollar() {
		while (true) {
			try {
				System.out.print("\nPound : ");
				Scanner scanner = new Scanner(System.in);
				double num = Double.parseDouble(scanner.nextLine());

				double result = num * 1.31;
				System.out.printf("Dollar : %.3f", result);
				System.out.println();
			} catch (NumberFormatException e) {
				System.out.println("Exception occurred:  " + e.toString());
			}
		}
	}

	public static void scientificNotation() {
		System.out.println();
		double d = 10000000000000000000000000000000000.0;
		System.out.println(d);

		double d2 = 20e-3;
		System.out.println(d2);

		double d3 = Double.MAX_VALUE;
		System.out.println(d3);
	}

	public static void floatingPointCalculations() {
		double a = 1.00000001311302;
		double b = (double) 0.33d;
		double sum = 1.33f;
		System.out.printf("a+b=%.14f sum=%.2f equal=%b\n", a + b, sum, (a + b == sum));

		double num = 0;
		for (int i = 0; i < 100000; i++) {
			num += 0.0001;
		}

		System.out.println(num);
	}

	public static void sumReal() {
		try {
			System.out.print("\nTotal Number : ");
			Scanner scanner = new Scanner(System.in);
			int howMany = Integer.parseInt(scanner.nextLine());
			BigDecimal rNumber = new BigDecimal(0);
			System.out.println();
			for (int x = 0; x < howMany; x++) {
				System.out.printf("Real Number %d : ", x + 1);
				BigDecimal num = new BigDecimal(scanner.nextLine());
				rNumber = rNumber.add(num);
			}
			System.out.println("\nSum Number : " + rNumber);
		} catch (NumberFormatException e) {
			System.out.println("Exception occurred:  " + e.toString());
		}
	}

	public static void specialNumbers() {
		while (true) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("\nEnter a number: ");
			String string = scanner.nextLine();
			char[] charArray = string.toCharArray();
			int stringLength = string.length();
			int total = 0;
			for (int x = 0; x < stringLength; x++) {
				total += Integer.parseInt(String.valueOf(charArray[x]));
			}
			System.out.print("\nTotal : " + total);
			if (total % 5 == 0 || total % 7 == 0 || total % 11 == 0)
				System.out.println(" -> True");
			else
				System.out.println(" -> False");
		}
	}
}

class Person {
	String name;
	int age;

	void birthday() {
		age++;
		System.out.println("\nName : " + name + "\nAge : " + age);
	}
}

class Driver extends Person {
	long driversLicenseNumber;
	LocalDate expirationDate;

	void callFromExtendClass() {
		Person john;
		john = new Person();
		john.name = "John Smith";
		john.age = 23;

		driversLicenseNumber = 69;
		expirationDate = LocalDate.of(2023, 9, 12);
		john.birthday();
		System.out.println("Driver License Number : " + driversLicenseNumber + "\nExpiration Date : "
				+ expirationDate.toString() + "\n");
	}

}
