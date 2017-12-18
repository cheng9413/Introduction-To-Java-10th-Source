package BookSource.Chapter12;

import java.io.File;
import java.io.PrintWriter;

/**
 * Created by Chung Time: 上午 09:51 Date: 18-12月-2017
 */
public class WriteData {

  public static void main(String[] args) throws java.io.IOException {
    File file = new File("scores.txt");
    if (file.exists()) {
      System.out.println("File already exists");
      System.exit(0);
    }

    // Create a file
    PrintWriter output = new PrintWriter(file);

    // Write formatted output to the file
    output.print("John T Smith ");
    output.println(90);
    output.print("Eric K Jones ");
    output.println(85);

    // Close the file
    output.close();
  }
}
