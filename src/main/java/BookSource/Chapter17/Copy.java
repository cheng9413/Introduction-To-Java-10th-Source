package BookSource.Chapter17;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by Chung Time: 下午 09:38 Date: 18-12月-2017
 */
public class Copy {

  /*
   * Main method
   * @param args[0] for source file
   * @param args[1] for target file
   * */
  public static void main(String[] args) throws IOException {
    //Check command-line parameter usage
    if (args.length != 2) {
      System.out.println(
          "Usage: java Copy sourceFile targetFile"
      );
      System.exit(1);
    }

    //Check if source file exists
    File sourceFile = new File(args[0]);
    if (!sourceFile.exists()) {
      System.out.println(
          "Source file" + args[0] + " does not exist"
      );
    }

    //Check if target file exists
    File targetFile = new File(args[1]);
    if (targetFile.exists()) {
      System.out.println(
          "Target file " + args[1] + " already exists");
      System.exit(3);
    }

    try (
        //Create an input stream
        BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream(sourceFile));

        //Create an output stream
        BufferedOutputStream outputStream = new BufferedOutputStream(
            new FileOutputStream(targetFile))
    ) {
      //Continuously read a byte from input and write it to output
      int r, numberOfBytesCopied = 0;
      while ((r = inputStream.read()) != -1) {
        outputStream.write((byte) r);
        numberOfBytesCopied++;
      }

      //Display the file size
      System.out.println(numberOfBytesCopied + " bytes copied");
    }
  }
}
