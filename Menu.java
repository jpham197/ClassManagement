public class Menu {
	/*
	1) Show class list
	2) Add student
	3) Delete student
	E) Close program
	M) Open menu

	*/

	public void showMenu() {
		Client c = new Client();
		System.out.println("Here are your menu options:\n1)Show class list\n2)Add student\n3)Delete student\nM)Open menu\nE)Close program");
		c.keyPress(); //calls keyPress method

	}
}
