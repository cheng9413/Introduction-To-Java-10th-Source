package BookSource.Chapter12;

import java.io.File;
import java.util.Date;

/**
 * Created by Chung Time: 上午 09:38 Date: 18-12月-2017
 */
public class TestFileClass {

  public static void main(String[] args) {
    File file = new java.io.File("image/us.gif");
    //file.exists()
    System.out.println("Does it exist? " + file.exists());
    //file.length() in bytes
    System.out.println("The file has " + file.length() + " bytes");
    //file.canRead()
    System.out.println("Can it be read? " + file.canRead());
    //file.canWrite()
    System.out.println("Can it be written? " + file.canWrite());
    //file.isDirectory()
    System.out.println("Is it a directory? " + file.isDirectory());
    //file.isFile()
    System.out.println("Is it a file? " + file.isFile());
    //file.isAbsolute()
    System.out.println("Is it absolute? " + file.isAbsolute());
    //file.isHidden()
    System.out.println("Is it hidden? " + file.isHidden());
    //file.getAbsolutePath()
    System.out.println("Absolute path is " + file.getAbsolutePath());
    //file.lastModified())
    System.out.println("Last modified on " + new Date(file.lastModified()));
  }
}
