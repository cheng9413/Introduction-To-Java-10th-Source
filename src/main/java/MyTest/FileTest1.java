package MyTest;

import java.io.File;
import java.io.IOException;

/**
 * Created by Chung Time: 下午 02:24 Date: 17-12月-2017
 */
public class FileTest1 {

  public static void main(String[] args) {

    File file = new File("src/main/resources", "text2.txt");

    try {
      System.out.println(file.createNewFile());
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

}
