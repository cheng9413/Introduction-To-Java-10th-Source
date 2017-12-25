package Chapter21;
//Created by Chung
//Time: 16:27
//Date: 24-12-2017

import java.util.LinkedHashSet;
import java.util.Set;

public class TestLinkedHashSet {

  public static void main(String[] args) {
    //Create a hash set
    Set<String> set = new LinkedHashSet<>();

    //Add strings to the set
    set.add("London");
    set.add("Paris");
    set.add("New York");
    set.add("San Francisco");
    set.add("Beijing");
    set.add("New York");

    System.out.println(set);

    //Display the elements in the hash set
    for (String element : set) {
      System.out.println(element.toLowerCase() + " ");
    }
  }

}
