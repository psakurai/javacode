package Day10;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class StringProcessing {
	static Scanner scanner = new Scanner(System.in);

	public static void stringToChar() {
		String str = new String(new char[] { 's', 't', 'r' });
		char[] charArr = str.toCharArray();
		for (int x = 0; x < charArr.length; x++) {
			System.out.print(charArr[x]);
		}
		System.out.println();
	}

	public static void joinString() {
		String str = "abc";
		String[] arr = new String[3];
		String repeated = null;
		for (int x = 0; x < arr.length; x++) {
			arr[x] = str;
			repeated = String.join("", arr);
			;
		}
		System.out.println(repeated);
	}

	public static void repeatedString() {
		System.out.print("Word : ");
		String[] words = scanner.nextLine().split(" ");
		List<String> result = new ArrayList<>();
		for (String word : words) {
			result.add(word.repeat(words.length));
		}
		System.out.print(String.join("", result));
	}

	public static void subString() {
		String card = "TEST1234";
		System.out.println(card.substring(1, 4));
		System.out.println(card.substring(4));
	}

	public static void searchIndex() {
		String fruits = "banana, apple, kiwi, banana, apple";
		System.out.println(fruits.indexOf("banana"));
		System.out.println(fruits.indexOf("orange"));

		System.out.println(fruits.lastIndexOf("banana"));
		System.out.println(fruits.lastIndexOf("orange"));
	}

	public static void regex() {
		String text = "Hello,.. I am Arif.";
		String[] words = text.split("[, .]+");
		for (String word : words) {
			System.out.println(word);
		}
	}

	public static void splitString() {
		String text = "Hello, arifamiruddin@graduate.utm.my, you have been using arifamiruddin@graduate.utm.my in your registration.";
		System.out.println(text);
		String replacedText = text.replace("arifamiruddin@graduate.utm.my", "arif@gmail.com");
		System.out.println(replacedText);
	}

	public static void concatPerformance() {
		System.out.println(new Date());
		String text = "";
		for (int i = 0; i < 100000; i++)
			text += "a";
		System.out.println(new Date());
	}

	public static void stringBuilderPerformance() {
		System.out.println(new Date());
		StringBuilder text = new StringBuilder();
		for (int i = 0; i < 100000; i++)
			text.append("a");
		System.out.println(new Date());
		System.out.println(text.length());
		text.setLength(0);
		text.append("Add new line of string.");
		System.out.println(text.length());
		System.out.println(text.charAt(0));
		text.insert(4, "APPEND ");
		System.out.println(text);
	}

	public static void randomSeq() {
		Random randGen = new Random(12345);
		System.out.println("Random[1...1,000 000] : " + (randGen.nextInt(1000000) + 1));

		Random randGen2 = new Random(12345);
		System.out.println("Random[1...1,000 000] : " + (randGen2.nextInt(1000000) + 1));
		// Need to understand how PRNG
	}

	public static void randomNumberInRange() {
		Random randGen = new Random();
		Random randGen2 = new Random();
		int start = 2;
		int end = 8;
		System.out.println("Random[" + start + "..." + end + "] : " + (randGen.nextInt(end - start + 1) + start));
		System.out.println("Random[" + start + "..." + end + "] : " + (randGen2.nextInt(start, end)));
		// Need to understand how PRNG
	}

	public static void formatStrings() {
		System.out.println(String.format("|%6d|", 99));
		System.out.println(String.format("|%-6d|", 99));
		System.out.println(String.format("|%06d|", 99));
		System.out.println(String.format("|%06.2f|", 9.9));
	}

	public static void interestCalculator() {
		BigDecimal initialAmount = new BigDecimal(scanner.next());
		BigDecimal interestRate = new BigDecimal(scanner.next());
		BigDecimal hundred = new BigDecimal(100);

		BigDecimal total = initialAmount.add(initialAmount.multiply(interestRate.divide(hundred)));
		System.out.print(total);
	}

	public static void main(String[] args) {
//		stringToChar();
//		joinString();
//		repeatedString();
//		subString();
//		searchIndex();
//		regex();
//		splitString();
//		concatPerformance();
//		stringBuilderPerformance();
//		randomSeq();
//		randomNumberInRange();
//		formatStrings();
		// interestCalculator();
	}
}
