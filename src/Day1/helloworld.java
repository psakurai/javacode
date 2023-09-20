package Day1;

public class helloworld {
	public static char str = '"';

	public static void PracticeProgram1() {
		System.out.println("Practice Program 1\n");
		System.out.println("This program prints the first lines\nof the song " + str + "slots" + str + ".\n");
		System.out.println("She lives in a trailer");
		System.out.println("On the outskirts 'a Reno");
		System.out.println("She plays quarter slots in the locals casino.");
	}

	public static void PracticeProgram2() {
		System.out.println("Practice Program 2\n");
		System.out.println("A " + str + "quoted" + str + "String is\n'much' better if you learn\nthe " + "rules of "
				+ str + "escape sequences." + str + "\n");
		System.out.println("Also, " + str + str + "represents an empty String.\nDon't forget to use \\ " + str
				+ " instead of " + str + " !\n'' is not the same as " + str);
	}
	
	public static void PracticeProgram3() {
		System.out.println("Practice Program 3\n");
		System.out.println("\ta\tb\tc");
		System.out.println("\\\\");
		System.out.println("'");
		System.out.println("\"\"\"");
		System.out.println("C:\nin\the downward spiral");
	}
	
	public static void PracticeProgram4() {
		System.out.println("Practice Program 4\n");
		System.out.println("/\\//\\\\///\\\\\\");
	}
	
	public static void A2U1() {
		System.out.println("   _____");
		System.out.println("  /     \\");
		System.out.println(" /       \\");
	}
	public static void A2D3() {
		System.out.println(" \\       /");
	}
	public static void A2D4() {
		System.out.println("  \\_____/");
	}
	public static void A2D5() {
		System.out.println("|         |");
	}
	public static void A2D6() {
		System.out.println(" +-------+");
	}
	public static void main(String[] args) {
		PracticeProgram1();
		System.out.println();
		PracticeProgram2();
		System.out.println();
		PracticeProgram3();
		System.out.println();
		PracticeProgram4();
		System.out.println();
		System.out.println("Activity 2");
		
		for (int x = 0; x<4;x++) {
			A2U1();
			if (x == 0) {
				A2D3();
				A2D4();
			}
			if (x == 1) {
				A2D5();
				A2D5();
				A2D5();
				A2D3();
				A2D4();
			}
			if (x == 2) {
				A2D6();
			}
		}
		
	}
}
