package MyTest;

import java.io.File;

/**
 * Created by Chung Time: 下午 02:44 Date: 17-12月-2017
 */
public class FileTest2 {

  public static void main(String[] args) {

    //Create non-existed directory
    File file = new File("src/main/resources/FileTest");
    System.out.println(file.mkdir());


    File file2 = new File("src/main/resources/FileTest2/abc");
    //cannot create non-existed directory when parent directory is also non-existed
    System.out.println(file2.mkdir());
    //can create all missing directories
    System.out.println(file2.mkdirs());

    File file3 = new File("src/main/resources/FileTest2");

    file.delete();
    file2.delete();
    file3.delete();
  }

}
