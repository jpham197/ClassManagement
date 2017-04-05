import java.util.Scanner;
import java.util.ArrayList;

public class Classroom {

	private static ArrayList<Student> roster;

	public static void createStudent() {
		Scanner user = new Scanner(System.in);
		Menu m = new Menu();
		String last = "";
		String first = "";
		float gpa = 0;

		System.out.println("Please enter the following information in order:\n*Student's:\nlast name\nFirst name\nand gpa");
		last = user.nextLine();
		first = user.nextLine();
		gpa = user.nextFloat();

		roster.add(new Student(last, first, gpa));
		System.out.println("Student added");
		m.showMenu();

	}

	public static void showClassList() {

	}
}
