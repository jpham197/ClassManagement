import java.util.Scanner;

public class Client {

	public static void main(String[] args) {


		System.out.println("Welcome to the classroom management system! Command line edition");
		System.out.println("Press M for menu options.");
		keyPress(); //takes input from user to see what user wants to do

	}

	public static void keyPress() {
		Scanner user = new Scanner(System.in);
		Menu m = new Menu();
		String enteredKey = "";
		enteredKey = user.nextLine();

		switch (enteredKey) {
			case "m":
			case "M":
				m.showMenu();
				break;
			case "e":
			case "E":
				System.exit(0);
				break;
			default:
				System.out.println("Please enter a registered key.");
				m.showMenu();
				break;
		}
	}
}
