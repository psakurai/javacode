package Day11;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class FileParseException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int lineNum;

	public FileParseException(String msg, int lineNum) {
		super(msg + " (at line " + lineNum + ")");
		this.lineNum = lineNum;
	}

	public int getLineNum() {
		return lineNum;
	}
}

public class TryCatch {
	static Scanner scanner = new Scanner(System.in);

	public static void tryCatchEg() {
		System.out.print("Input : ");
		String s = scanner.nextLine();
		try {
			Integer.parseInt(s);
			System.out.printf("You entered a valid integer number:%s", s);
		} catch (NumberFormatException ex) {
			System.out.print(ex);
		} catch (Exception ex) {
			System.out.print(ex);
		}
	}

	public static void numberRange() {
		System.out.print("Range 1 : ");
		int s = scanner.nextInt();
		System.out.print("Range 2 : ");
		int e = scanner.nextInt();
		int number = 0;
		boolean check = true;

		while (check) {
			try {
				System.out.println("\nEnter a number: ");
				number = scanner.nextInt();

				if (number >= s && number <= e) {
					System.out.println("Valid number : " + number);
					continue;
				} else {
					System.out.println("Invalid number : " + number);
//	                check = false;
//	                break;
				}
			} catch (Exception ex) {
				System.out.println("Invalid number : " + number);
				System.out.println("Exception : " + ex);
				check = false;
				break;
			}
		}
	}

	public static void tryFinallyExample() {
		System.out.println("Code executed before try-finally");
		try {
			String str = scanner.nextLine();
			Integer.parseInt(str);
			System.out.println("Parsing was successful.");
			return;
		} catch (NumberFormatException ex) {
			System.out.println("Parsing failed.");
		} finally {
			System.out.println("This cleanup code is always executed.");
		}
		System.out.println("This code is after the try-finally block.");
	}

	public static void tryThrow() throws FileParseException {
		System.out.println("Code executed before try-finally");
		try {
			String str = scanner.nextLine();
			Integer.parseInt(str);
			System.out.println("Parsing was successful.");
			return;
		} catch (NumberFormatException ex) {
			throw new FileParseException("This is an error msg.",91);
			// System.out.println("Parsing failed.");
		} finally {
			System.out.println("This cleanup code is always executed.");
		}
		// System.out.println("This code is after the try-finally block.");
	}
	
	public static void main(String[] args) throws FileParseException {
		JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        
        JButton tryCatchButton = new JButton("Try Catch e.g");
        tryCatchButton.addActionListener((ActionListener) new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	tryCatchEg();
            }
        });
        JButton numberRangeButton = new JButton("Number Range e.g");
        numberRangeButton.addActionListener((ActionListener) new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	numberRange();
            }
        });
        JButton tryFinallyExampleButton = new JButton("Try Finally e.g");
        tryFinallyExampleButton.addActionListener((ActionListener) new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	tryFinallyExample();
            }
        });

        panel.add(tryCatchButton);
        panel.add(numberRangeButton);
        panel.add(tryFinallyExampleButton);
        
        JFrame frame = new JFrame();
        frame.add(panel);
        frame.setSize(300, 200);
        frame.setVisible(true);
	}

}
