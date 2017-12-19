package BookSource.Chapter17;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import jdk.internal.util.xml.impl.Input;

/**
 * Created by Chung Time: 下午 05:35 Date: 18-12月-2017
 */
public class TestFileStream {

  public static void main(String[] args) throws IOException {
    //try-with-resources
    try (
        // Create an output stream to the file, try with resources
        FileOutputStream outputStream = new FileOutputStream("temp.dat")
    ) {
      //output values to the file
      for (int i = 1; i < 10; i++) {
        outputStream.write(i);
      }
    }

    try (
        //Create an input stream from the file
        FileInputStream inputStream = new FileInputStream("temp.dat")
    ) {
      //Read values from the file
      int value;
      while ((value = inputStream.read()) != -1) {
        System.out.print(value + " ");
      }
    }
  }

}
