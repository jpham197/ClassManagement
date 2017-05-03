import java.util.Scanner;

public class Client {

	public static void main(String[] args) {


		System.out.println("Welcome to the classroom management system! Command line edition");
		System.out.println("Press any key for menu options.");
		keyPress(); //takes input from user to see what user wants to do

	}
	/*
	Method name: keyPress
	Parameters: none
	Function: Takes input from user based on menu displayed and calls other functions based on user input
	*/

	public static void keyPress() {
		Scanner user = new Scanner(System.in);
		String enteredKey = "";
		enteredKey = user.nextLine();

		switch (enteredKey) {
			case "1":
				Classroom.showClassList();
				break;
			case "2":
				Classroom.createStudent();
				break;
			case"3":
				DataHandler.fullSave();
				break;
			case "m":
			case "M":
				Menu.showMenu();
				break;
			case "e":
			case "E":
				System.exit(0);
				break;
			default:
				System.out.println("Please enter a registered key.");
				Menu.showMenu();
				break;
		}

		// if (enteredKey.equals("m")||enteredKey.equals("M")) {
		// 	m.showMenu();
		// } else if (enteredKey.equals("1")) {
		// 	//show class list
		// } else if (enteredKey.equals("2")) {
		// 	Classroom.createStudent();
		// } else if (enteredKey.equals("e")||enteredKey.equals("E")) {
		// 	System.exit(0);
		// } else {
		// 	System.out.println("Please press a registered key.");
		// 	keyPress();
		// }
	}
}
