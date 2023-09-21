package Day9;

import java.math.BigInteger;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.stream.Collectors;

interface A {
	void show(int i);
	// void show2(int i);
}

public class TestingLinkedList {
	static Scanner scanner = new Scanner(System.in);

	public static void swapJoinList() {
		LinkedList<String> l_list = new LinkedList<String>();
		l_list.add("Red");
		l_list.add("Green");
		l_list.add("Black");
		l_list.add("Pink");
		l_list.add("Orange");

		LinkedList<String> l_list_2 = new LinkedList<String>();
		l_list_2.add("Square");
		l_list_2.add("Triangle");
		l_list_2.add("Rectangle");
		l_list_2.add("Circle");
		l_list_2.add("Octagon");

		System.out.println("The original linked list: " + l_list);
		Collections.swap(l_list, 2, 0);
		System.out.print("The new linked list: " + l_list);

		System.out.println("The 1st linked list: " + l_list);
		System.out.println("The 2nd linked list: " + l_list_2);
		LinkedList<String> joinList = new LinkedList<String>();
		joinList.addAll(l_list);
		joinList.addAll(1, l_list_2);
		System.out.println("The joined linked list: " + joinList);

	}

	public static void iteratingMap() {
		Map<String, Double> fruits = new LinkedHashMap<>();
		fruits.put("banana", 2.20);
		fruits.put("kiwi", 4.50);
		for (Map.Entry<String, Double> entry : fruits.entrySet()) {
			System.out.printf("%s -> %.2f%n", entry.getKey());
		}
	}

	public static void countN() {
		System.out.print("Input : ");
		double[] nums = Arrays.stream(scanner.nextLine().split(" ")).mapToDouble(Double::parseDouble).toArray();
		Map<Double, Integer> counts = new TreeMap<>();
		for (double num : nums) {
			if (!counts.containsKey(num)) {
				counts.put(num, 0);
			}
			counts.put(num, counts.get(num) + 1);
		}
		for (Map.Entry<Double, Integer> entry : counts.entrySet()) {
			DecimalFormat df = new DecimalFormat("#.#######");
			System.out.printf("%s -> %d%n", df.format(entry.getKey()), entry.getValue());
		}
		/*
		 * int[] y = {1,3,4}; for (int x : y) { System.out.print(y[x]); }
		 */
	}

	public static void wordSynonyms() {
		System.out.print("N : ");
		int n = scanner.nextInt();
		Map<String, String> counts = new TreeMap<>();
		for (int i = 0; i < n; i++) {

			String word = scanner.next();

			String synonyms = scanner.next();
			if (!counts.containsKey(word)) {
				counts.put(word, synonyms);
				continue;
			}
			counts.put(word, counts.get(word) + ", " + synonyms);
		}
		for (Map.Entry<String, String> entry : counts.entrySet()) {
			System.out.printf("%s -> %s%n", entry.getKey(), entry.getValue());
			System.out.print("\n");
		}
	}

	public static void processingArrays() {
		int min1 = Arrays.stream(new int[] { 15, 25, 35 }).min().getAsInt();
		int min2 = Arrays.stream(new int[] { 15, 25, 35 }).min().orElse(2);
		int min3 = Arrays.stream(new int[] {}).min().orElse(2);
		int max1 = Arrays.stream(new int[] { 15, 25, 35 }).max().getAsInt();
		System.out.print(min1 + ":" + min2 + ":" + min3 + ":" + max1);
	}

	public static void testLambda() {
		A obj = (i) -> System.out.print("Print : " + i);
		obj.show(6);
	}

	public static void processingArraysList() {
		ArrayList<Integer> myArrayList = new ArrayList<>() {
			{
				add(15);
				add(25);
				add(35);
			}
		};
		int min1 = myArrayList.stream().mapToInt(Integer::intValue).min().getAsInt();
		int min2 = myArrayList.stream().min(Integer::compareTo).get();

		System.out.print(min1 + ":" + min2);
	}

	public static void manipulateCollections() {
		int[] nums = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(n -> Integer.parseInt(n)).toArray();
		String[] word = { "One-", "Two-", "Three-" };
		String[] words = Arrays.stream(word).map(w -> w.toString() + "yyy").toArray(String[]::new);

		System.out.println(nums[0] + ":" + nums[1] + ":" + nums[2]);
		System.out.println(words[0] + ":" + words[1] + ":" + words[2]);
	}

	public static void wordFilter() {
		String[] words = Arrays.stream(scanner.nextLine().split(" ")).filter((w) -> w.length() % 2 == 0)
				.toArray(String[]::new);
		for (int x = 0; x < words.length; x++) {
			System.out.println(":" + words[x]);
		}
	}

	public static void largest3Numbers() {
		List<Integer> nums = Arrays.stream(scanner.nextLine().split(" ")).map((n) -> Integer.parseInt(n))
				.sorted((e1, e2) -> e2.compareTo(e1)).limit(3).collect(Collectors.toList());
		for (int num : nums) {
			System.out.println(":" + num);
		}
	}

	public static void randomizeWords() {
		String[] words = scanner.nextLine().split(" ");
		Random rnd = new Random();
		for (int x = 0; x < words.length; x++) {
			int pos1 = rnd.nextInt(words.length);
			int pos2 = rnd.nextInt(words.length);
			String temp = words[pos1].toString();
			words[pos1] = words[pos2];
			words[pos2] = temp;
		}
		System.out.print(String.join(System.lineSeparator(), words));
	}

	public static void BigFactorial() {
		System.out.print("N : ");
		int n = scanner.nextInt();
		BigInteger f = new BigInteger(String.valueOf(String.valueOf(1)));

		for (int x = n; x > 1; x--) {
			f = f.multiply(BigInteger.valueOf(x));
		}
		System.out.println("Answer : " + f);
	}

	public static void main(String[] args) {
//		swapJoinList();
//		iteratingMap();
//		countN();
//		wordSynonyms();
//		processingArrays();
//		testLambda();
//		processingArraysList();
//		manipulateCollections();
//		wordFilter();
//		largest3Numbers();
//		randomizeWords();
		BigFactorial();
	}
}
