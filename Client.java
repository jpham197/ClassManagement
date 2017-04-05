import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		Scanner user = new Scanner(System.in);

		System.out.println("Welcome to the classroom management system! Command line edition");
		System.out.println("Press M for menu options.");
		keyPress(user); //takes input from user to see what user wants to do

	}

	public static void keyPress(Scanner user) {
		Menu m = new Menu();
		String enteredKey = "";
		enteredKey = user.nextLine();

		if (enteredKey.equals("m")||enteredKey.equals("M")) {
			m.showMenu();
		} else if (enteredKey.equals("e")||enteredKey.equals("E")){
			System.exit(0);
		}
	}
}
