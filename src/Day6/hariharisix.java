package Day6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class hariharisix {
	static Scanner scanner = new Scanner(System.in);

	public static void building() {
		System.out.print("Floors : ");
		int floor = scanner.nextInt();
		System.out.print("Rooms : ");
		int room = scanner.nextInt();
		for (int x = floor; x >= 1; x--) {
			for (int y = 0; y < room; y++) {
				if (x == floor) {
					System.out.println("L{" + x + "}{" + y + "}");
				} else if (x % 2 == 0) {
					System.out.println("O{" + x + "}{" + y + "}");
				} else {
					System.out.println("A{" + x + "}{" + y + "}");
				}
			}
			System.out.println();
		}
	}

	public static void travelSaving() {
		System.out.print("Destination : ");
		String destination;
		while (!(destination = scanner.nextLine()).equals("End")) {
			System.out.print("Budget : ");
			double neededSum = Double.parseDouble(scanner.nextLine());
			double collectedSum = 0;
			while (collectedSum < neededSum) {
				System.out.print("Debit : ");
				collectedSum += Double.parseDouble(scanner.nextLine());
				System.out.printf("Collected: %.2f\n", collectedSum);
			}
			System.out.printf("Going to %s!\n", destination);
		}
	}

	public static void letterCombination() {
		char start = scanner.nextLine().charAt(0);
		char end = scanner.nextLine().charAt(0);
		char x = scanner.nextLine().charAt(0);
		int counter = 0;
		for (char l1 = start; l1 <= end; l1++) {
			for (char l2 = start; l2 <= end; l2++) {
				for (char l3 = start; l3 <= end; l3++) {
					if (l1 != x && l2 != x && l3 != x) {
						System.out.println(l1 + " " + l2 + " " + l3);
						counter++;
					}
				}
			}
		}
		System.out.println("Counter : " + counter);
	}

	public static void dayoftheWeek() {
		String[] days = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };
		int day = Integer.parseInt(scanner.nextLine());
		if (day >= 1 && day <= 7) {
			System.out.println(days[day - 1]);
		} else
			System.out.println("Invalid Day");
	}

	public static void singleVal() {
		String val = scanner.nextLine();
		String[] items = val.split(" ");
		int[] arr = new int[items.length];

		for (int i = 0; i < items.length; i++)
			System.out.println(items[i]);
	}

	public static void arraySingle() {
		String inputLine = scanner.nextLine();
		String[] items = inputLine.split(" ");
		int[] arr = Arrays.stream(items).mapToInt(e -> Integer.parseInt(e)).toArray();
		double[] doubles = Arrays.stream(items).mapToDouble(e -> Double.parseDouble(e)).toArray();
		String[] stringsArray = Arrays.stream(items).toArray(String[]::new);
		Character[] charactersArray = Arrays.stream(items).toArray(Character[]::new);
	}

	public static void reverseArr() {
		String val = scanner.nextLine();
		String[] items = val.split(" ");
		int[] arr = new int[items.length];

		for (int i = items.length - 1; i >= 0; i--)
			System.out.println(items[i]);
	}

	public static void joinArray() {
		String[] items = { "one", "two" };
		System.out.println(String.join(", ", items));// Only for string
	}

	public static void forEach() {
		int[] items = { 1, 2, 3, 4, 5, 6 };
		for (int number : items) {
			System.out.print(number + " ini spacing ");
		}
	}

	public static void listOverview() {
		List<Integer> nums = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50, 60));
		for (int i = 0; i < nums.size(); i++)
			System.out.print(nums.get(i) + " ");
		System.out.println();
		nums.remove(2);
		for (int i = 0; i < nums.size(); i++)
			System.out.print(nums.get(i) + " ");
		System.out.println();
		nums.remove(Integer.valueOf(40));
		for (int i = 0; i < nums.size(); i++)
			System.out.print(nums.get(i) + " ");
		System.out.println();
		nums.add(100);
		for (int i = 0; i < nums.size(); i++)
			System.out.print(nums.get(i) + " ");
		System.out.println();
		nums.add(0, -100);
		for (int i = 0; i < nums.size(); i++)
			System.out.print(nums.get(i) + " ");
		System.out.println();
	}
	
	public static void listSingle() {
		String inputLine = scanner.nextLine();
		String[] items = inputLine.split(" ");
		List<String> arr = Arrays.stream(items).collect(Collectors.toList());
		for (int i = 0; i < arr.size(); i++)
			System.out.println(arr.get(i) + " ");
	}
	
	public static void main(String[] args) {
		// building();
		// travelSaving();
		// letterCombination();
		// dayoftheWeek();
		// singleVal();
		// arraySingle();
		// reverseArr();
		// joinArray();
		// forEach();
		// listOverview();
		listSingle();
	}
}
