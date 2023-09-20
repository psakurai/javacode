package Day8;

import java.util.HashMap;
import java.util.Scanner;
/*
class BankAccount {
	static int id;
	static double balance;
	static double interest;
	static int bankAccountCount = 0;

	BankAccount() {
		BankAccount.id = ++bankAccountCount;
		System.out.println("Account #" + id + " created");
	}

	BankAccount(int id, double balance, double interest) {
		BankAccount.id = id;
		BankAccount.balance = balance;
		BankAccount.interest = 0.15;
		System.out.println("Account #" + id + " created");
	}

	public void setInterest(double interest) {
		BankAccount.interest = interest;
		System.out.println("Interest rate changed: " + interest);
	}

	public void deposit(double deposit) {
		BankAccount.balance += deposit;
		System.out.println("Deposited " + deposit + " to Account #" + BankAccount.id);
	}

	public void calcInterest(int months) {
		System.out.println("Interest: " + (BankAccount.balance * BankAccount.interest * months / 12));
	}

	public int getID() {
		return BankAccount.id;
	}
}*/

public class BankAccountTest {
	static Scanner scanner = new Scanner(System.in);
	static int id;
	static double balance;
	static double interest;
	static int bankAccountCount = 0;

	BankAccountTest() {
		BankAccountTest.id = ++bankAccountCount;
		System.out.println("Account #" + id + " created");
	}

	BankAccountTest(int id, double balance, double interest) {
		BankAccountTest.id = id;
		BankAccountTest.balance = balance;
		BankAccountTest.interest = 0.15;
		System.out.println("Account #" + id + " created");
	}

	public void setInterest(double interest) {
		BankAccountTest.interest = interest;
		System.out.println("Interest rate changed: " + interest);
	}

	public void deposit(double deposit) {
		BankAccountTest.balance += deposit;
		System.out.println("Deposited " + deposit + " to Account #" + BankAccountTest.id);
	}

	public void calcInterest(int months) {
		System.out.println("Interest: " + (BankAccountTest.balance * BankAccountTest.interest * months / 12));
	}

	public static int getID() {
		return BankAccountTest.id;
	}

	public static void main(String[] args) {
		HashMap<Integer, BankAccountTest> accounts = new HashMap<>();

		do {
			System.out.print("\nCommand: ");
			String inputLine = scanner.nextLine();
			if (inputLine.contains("end")) {
				break;
			}
			String[] items = inputLine.split(" ");
			switch (items[0]) {
			case "create":

				BankAccountTest acc = new BankAccountTest();

				System.out.print(acc.getID());
				accounts.put(acc.getID(), acc);
				break;
			case "deposit":
				for (int id=1; id<=accounts.keySet().size();id++) {
					BankAccountTest ACC = accounts.get(id);
					if (id == Integer.parseInt(items[1])) {

						// System.out.print("AAA");
						ACC.deposit(Double.parseDouble(items[2]));
						// System.out.print("AAA");
						break;
					}
				}
				break;
			case "set-interest":
				for (int id : accounts.keySet()) {
					BankAccountTest ACC = accounts.get(id);
					if (ACC.id == Integer.parseInt(items[1]))
						ACC.setInterest(Double.parseDouble(items[1]));
				}
				break;
			case "calc-interest":
				for (int id : accounts.keySet()) {
					BankAccountTest ACC = accounts.get(id);
					if (ACC.id == Integer.parseInt(items[1]))
						ACC.calcInterest(Integer.parseInt(items[2]));
				}
				break;
			default:
				System.out.println("Invalid command");
			}
		} while (true);
		System.out.println("Goodbye");
	}
}
