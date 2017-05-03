import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;

public class DataHandler {

  private static Formatter x;

  public static void readFile() {
    String fileName = "temp.csv";
    File file = new File(fileName);

    try {
      Scanner in = new Scanner(file);
      while (in.hasNext()) {
        String data = in.next(); //retrieves a whole line of data from the .csv file
        String[] val = data.split(",");
        System.out.println(val[2]);
      }
      in.close();
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
  }

  public static void accessFile() {
		File save = new File("save.csv");
		if (save.exists() == true) {
			try {
				x = new Formatter("save.csv");
				System.out.println("Save file created. All data will be stored on \"save.csv\"");
			} catch (Exception e) {
				System.out.println("Error occurred.");
			}
		} else {
			System.out.println("A save file has already been created, overwriting file.");
		}
	}

  public static void addData() {
    x.format("%s%s%s", "Arg1", "Arg2", "Arg3");
  }

  public static void closeFile() {
    x.close();
  }

  public static void fullSave() { //Uses all methods written above
    accessFile();
    addData();
    closeFile();
  }
}
