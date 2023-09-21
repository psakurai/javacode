package Day9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class StudentData {
	public String firstname;
	public String lastname;
	public String age;
	public String hometown;
	static Scanner scanner = new Scanner(System.in);

	public StudentData(String firstname, String lastname, String age, String hometown) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.age = age;
		this.hometown = hometown;
	}

	public static StudentData getStudent(List<StudentData> students, String firstName, String LastName) {
		for (StudentData x : students) {
			if (x.getFirstName().equals(firstName) && x.getLastName().equals(LastName)) {
				return x;
			}
		}
		return null;
	}

	public String getFirstName() {
		return this.firstname;
	}

	public String getLastName() {
		return this.lastname;
	}

	public String getAge() {
		return this.age;
	}

	public String getHometown() {
		return this.hometown;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public void setCity(String city) {
		this.hometown = city;
	}

	public static void main(String[] args) {
		List<StudentData> students = new ArrayList<>();
		System.out.print("Student Data (First Name, Last Name, Age, City): ");
		String line = scanner.nextLine();
		while (!line.contains("end")) {
			String[] data = line.split(" ");
			String firstName = data[0];
			String lastName = data[1];
			String age = data[2];
			String city = data[3];

			StudentData existingStudent = getStudent(students, firstName, lastName);
			if (existingStudent != null) {
				existingStudent.setAge(age);
				existingStudent.setCity(city);
				System.out.println(existingStudent.getFirstName() + " " + existingStudent.getLastName() + " is " + existingStudent.getAge()
						+ " years old from " + existingStudent.getHometown() + ".");
			} else {
				StudentData student = new StudentData(firstName, lastName, age, city);
				System.out.println(student.getFirstName() + " " + student.getLastName() + " is " + student.getAge()
						+ " years old from " + student.getHometown() + ".");
				students.add(student);
			}
			System.out.print("\nStudent Data : ");
			line = scanner.nextLine();
		}
		
		Collections.sort(students, (s1, s2) -> s1.getHometown().compareTo(s2.getHometown()));
		for (int i = 0; i < students.size(); i++) {
		    System.out.println(students.get(i).getFirstName());
		    System.out.println(students.get(i).getLastName());
		    System.out.println(students.get(i).getAge());
		    System.out.println(students.get(i).getHometown());
		    System.out.println("");
		}
		System.out.println("Program ended.");
	}
}
