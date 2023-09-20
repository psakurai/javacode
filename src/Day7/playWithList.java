package Day7;

import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class playWithList {

	static Scanner scanner = new Scanner(System.in);

	public static void listConsole() {
		List<String> list = new ArrayList<>(Arrays.asList("one", "two", "three"));
		System.out.print(String.join("; ", list));
	}

	public static String joinElementsByDelimitter(List<Double> items, String delimiter) {
		String output = "";
		for (Double item : items) {
			output += (new DecimalFormat("0.#").format(item) + delimiter);

		}
		return output;
	}

	public static void sumAdjacent() {
		List<Double> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Double::parseDouble)
				.collect(Collectors.toList());
		for (int i = 0; i < numbers.size() - 1; i++) {
			if (numbers.get(i).equals(numbers.get(i + 1))) {
				numbers.set(i, numbers.get(i) + numbers.get(i + 1));
				numbers.remove(i + 1);
				i = -1;
			}
		}
		System.out.print(joinElementsByDelimitter(numbers, " "));
	}

	public static List<Integer> getRemainingElements(List<Integer> longerList, List<Integer> shorterList) {
		List<Integer> nums = new ArrayList<>();
		for (int i = shorterList.size(); i < longerList.size(); i++) {
			nums.add(longerList.get(i));
		}
		return nums;
	}

	public static void mergeList() {
		List<Integer> nums1 = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt)
				.collect(Collectors.toList());
		List<Integer> nums2 = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt)
				.collect(Collectors.toList());
		List<Integer> resultNums = new ArrayList<>();
		for (int i = 0; i < Math.min(nums1.size(), nums2.size()); i++) {
			resultNums.add(nums1.get(i));
			resultNums.add(nums2.get(i));
		}
		if (nums1.size() > nums2.size()) {
			resultNums.addAll(getRemainingElements(nums1, nums2));
		} else if (nums2.size() > nums1.size()) {
			resultNums.addAll(getRemainingElements(nums2, nums1));
		}

		Collections.sort(resultNums);
		System.out.println(resultNums.toString());
		System.out.println(resultNums.toString().replaceAll("[\\[\\],]", ""));

		Collections.reverse(resultNums);
		System.out.println(resultNums.toString());
		System.out.println(resultNums.toString().replaceAll("[\\[\\],]", ""));
	}

	public static void checkSign(int n) {
		if (n > 0)
			System.out.printf("The number %d is positive.\n", n);
		else if (n < 0)
			System.out.printf("The number %d is negative.\n", n);
		else
			System.out.printf("The number %d is zero.\n", n);
	}

	public static void printTriangle() {
		System.out.print("Triangle : ");
		int n = scanner.nextInt();
		printTriangleUp(n);
		printTriangleDown(n);
	}

	public static void printTriangleUp(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 1; j <= i + 1; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

	public static void printTriangleDown(int n) {
		for (int i = n - 1; i >= 1; i--) {
			for (int j = 1; j < i + 1; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

	public static double calcRectangleArea(double w, double h) {
		return w * h;
	}

	public static double mathPower(double n, int p) {
		double result = 1;
		for (int i = 0; i < p; i++)
			result *= n;
		return result;
	}

	public static void increment(int num, int value) {
		num += value;
	}

	int varTest = 0;

	public void passbyValue(int varTest) {
		varTest += 10;
	}

	public void passbyReference(playWithList Test, int varTest) {
		Test.varTest = varTest;
	}

	public static int getMax(int a, int b) {
		if (a > b)
			return a;
		else
			return b;
	}

	public static char getMax(char a, char b) {
		if (a > b)
			return a;
		else
			return b;
	}

	public static String getMax(String a, String b) {
		int result = a.compareTo(b);

		if (result > 0) {
			return a;
		} else
			return b;
	}
	 public static void loopTest(int x)
	   {
	      loop: for (int i = 1; i < 5; i++)
	      {
	         for (int j = 1; j < 5; j++)
	         {
	            System.out.println(i);
	            if (x == 0) {  continue loop;  }
	            System.out.println(j);
	         }
	      }
	   }
	public static void main(String[] args) {
		// listConsole();
		// sumAdjacent();
		// mergeList();
		// checkSign(3);
		// checkSign(0);
		// checkSign(-3);
		// printTriangle();
		// System.out.printf("Area : %.2f\n", calcRectangleArea(3, 4));
		// System.out.printf("2^8 : %.2f\n", mathPower(2, 8));

//		playWithList Test = new playWithList();
//		System.out.println("Pass By Value");
//		System.out.println("Before : " + Test.varTest);
//		Test.passbyValue(100);
//		System.out.println("After : " + Test.varTest);
//		
//		System.out.println("\nPass By Reference");
//		System.out.println("Before : " + Test.varTest);
//		Test.passbyReference(Test, 69);
//		System.out.println("After : " + Test.varTest);

		// int num = 5;
		// System.out.println(num);
		// increment(num, 15);
		// System.out.println(num);

//		System.out.println(getMax(2, 16));
//		System.out.println(getMax('a', 'z'));
//		System.out.println(getMax("ccc", "bbb"));
		loopTest(0);	}
}
