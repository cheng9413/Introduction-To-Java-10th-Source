package BookSource.Chapter20;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Created by Chung Time: 下午 02:26 Date: 19-12月-2017
 */
public class TestIteratr {

  public static void main(String[] args) {
    Collection<String> collection = new ArrayList<>();
    collection.add("New York");
    collection.add("Atlanta");
    collection.add("Dallas");
    collection.add("Madison");


    /*This can be replaced by foreach loop
    Iterator<String> iterator = collection.iterator();
    while (iterator.hasNext()) {
      System.out.println(iterator.next().toUpperCase() + " ");
    }*/

    for (String aCollection : collection) {
      System.out.println(aCollection.toUpperCase() + " ");
    }
    System.out.println();
  }

}
