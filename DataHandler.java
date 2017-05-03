import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class DataHandler {

  public Handler() {

  }

  public void save() {
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
}
