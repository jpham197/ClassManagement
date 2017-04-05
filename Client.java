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

		if (enteredKey.equals("m")||enteredKey.equals("M")) {
			m.showMenu();
			keyPress();
		} else if (enteredKey.equals("e")||enteredKey.equals("E")){
			System.exit(0);
		}
	}
}
