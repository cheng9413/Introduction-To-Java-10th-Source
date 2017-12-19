package BookSource.Chapter17;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by Chung Time: 下午 07:49 Date: 18-12月-2017
 */
public class TestDataStream {

  public static void main(String[] args) throws IOException {

    try (//Create an output stream for file temp.dat
        DataOutputStream outputStream =
            new DataOutputStream(new FileOutputStream("temp.dat"))
    ) {
      //Write students test scores to the file
      outputStream.writeUTF("John");
      outputStream.writeDouble(85.5);
      outputStream.writeUTF("Jim");
      outputStream.writeDouble(185.5);
      outputStream.writeUTF("George");
      outputStream.writeDouble(105.25);
    }

    try (
        DataInputStream inputStream =
            new DataInputStream(new FileInputStream("temp.dat"))
    ) {
      //Read student test scores from the file
      System.out.println(inputStream.readUTF() + " " + inputStream.readDouble());
      System.out.println(inputStream.readUTF() + " " + inputStream.readDouble());
      System.out.println(inputStream.readUTF() + " " + inputStream.readDouble());
    }

  }

}
