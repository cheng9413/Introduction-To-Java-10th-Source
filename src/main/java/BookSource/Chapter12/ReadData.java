package BookSource.Chapter12;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Chung Time: 上午 11:43 Date: 18-12月-2017
 */
public class ReadData {

  public static void main(String[] args) throws Exception {

    //Create a File Instance
    File file = new File("scores.txt");

    // Create a Scanner for the file
    Scanner input = new Scanner(file);

    // Create a Scanner for the file
    while (input.hasNext()) {
      String firstName = input.next();
      String mi = input.next();
      String lastName = input.next();
      int score = input.nextInt();
      System.out.println(
          firstName + " " + mi + " " + lastName + " " + score
      );
    }

    // Close the file
    input.close();

  }


}
