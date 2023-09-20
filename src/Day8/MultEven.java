package Day8;

import java.util.Scanner;

class Bike1 {
	int bikeVal = 69;

	Bike1() {
		System.out.println("Bike 1 is created");
		bikeVal = 79;
	}

	Bike1(String param, Bike1 obj) {
		System.out.println("Bike 1 " + param + " is created");
		obj.bikeVal = 99;
	}
}

class Car {
	String brand;
	String model;
	String horsepower;

	Car(String brand, String model) {
		this.brand = brand;
		this.model = model;
		this.horsepower = "-1";
	}

	Car(String brand, String model, String horsepower) {
		this(brand, model);
		this.horsepower = horsepower;
	}

	public String toString() {
		if (horsepower == "-1")
			return String.format("%s:%s", brand, model);
		else
			return String.format("%s:%s:%s", brand, model, horsepower);
	}
}

public class MultEven {
	static Scanner scanner = new Scanner(System.in);
	public static int soe;
	public static int soo;

	public static int getMultipleOfEvensAndOdds() {
		System.out.print("Number : ");
		int n = scanner.nextInt();
		n = Math.abs(n);
		int sod;
		int len = String.valueOf(n).length();
		for (int x = 0; x < len; x++) {
			sod = n % 10;
			if (sod % 2 == 0)
				getSumOfEvenDigits(sod);
			else
				getSumOfOddDigits(sod);
			n = n / 10;
		}
		System.out.println("Even Sum: " + getSumOfEvenDigits(0));
		System.out.println("Odd Sum: " + getSumOfOddDigits(0));
		return getSumOfEvenDigits(0) * getSumOfOddDigits(0);
	}

	public static int getSumOfEvenDigits(int n) {
		soe += n;
		return soe;
	}

	public static int getSumOfOddDigits(int n) {
		soo += n;
		return soo;
	}

	public static void carWith2Contstructor() {
		System.out.print("Brand : ");
		String brand = scanner.nextLine();

		System.out.print("Model : ");
		String model = scanner.nextLine();

		System.out.print("Horse Power : ");
		String horsePower = scanner.nextLine();
		if (horsePower.equals("")) {
			Car carObj = new Car(brand, model);
			System.out.print(carObj);
		} else {
			Car carObj = new Car(brand, model, horsePower);
			System.out.print(carObj);
		}
	}

	public static void main(String[] args) {
		// System.out.println("\nAnswer : "+getMultipleOfEvensAndOdds());

//		Bike1 bikeTest = new Bike1();
//		System.out.println(bikeTest.bikeVal);
//		Bike1 bikeTestWithParameter = new Bike1("with parameter", bikeTest);
//		System.out.println(bikeTest.bikeVal);
//		System.out.println(bikeTestWithParameter.bikeVal);

		// THIS ALL YANG LAGI SATU
		/*
		 * YangLagiSatu s1 = new YangLagiSatu(111, "saad"); YangLagiSatu s2 = new
		 * YangLagiSatu(222, "saadia");
		 * 
		 * s1.displayNonStatic(); s2.displayNonStatic(); // s1.display(); s1.setID(999);
		 * System.out.println(s1.getID()); System.out.println(s1.toString()); //
		 * s1.getName(); System.out.println("This is from diff class " + s1.getVal());
		 * // How to use // this protected?
		 */
		// CARS
		carWith2Contstructor();
	}
}
