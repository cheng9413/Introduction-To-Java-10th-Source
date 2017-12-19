package BookSource.Chapter17;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Created by Chung Time: 上午 09:18 Date: 19-12月-2017
 */
public class TestIbjectStreamForArray {

  public static void main(String[] args)
      throws ClassNotFoundException, IOException {
    int[] numbers = {1, 2, 3, 4, 5};
    String[] strings = {"John", "Susan", "Kim"};

    try (//Create an output stream for file array.dat//
        ObjectOutputStream outputStream =
            new ObjectOutputStream(new FileOutputStream("array.dat", true))
    ) {
      //Write arrays to the object output stream
      outputStream.writeObject(numbers);
      outputStream.writeObject(strings);
    }

    try (//Create an input stream for file array.dat
        ObjectInputStream inputStream =
            new ObjectInputStream(new FileInputStream("array.dat"))
    ) {
      int[] newNumbers = (int[]) inputStream.readObject();
      String[] newStrings = (String[]) inputStream.readObject();

      //Display arrays
      for (int i : newNumbers) {
        System.out.print(i + " ");
      }

      System.out.println();

      for (String str : newStrings) {
        System.out.print(str + " ");
      }
    }
  }
}
