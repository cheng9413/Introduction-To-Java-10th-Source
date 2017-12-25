package Chapter21;
//Created by Chung \n
//Time: 18:02
//Date: 21-12-2017

import java.util.HashSet;
import java.util.Set;

public class TestHashSet {

  public static void main(String[] args) {
    //Create a hash set
    Set<String> set = new HashSet<>();

    //Add strings to the set
    set.add("London");
    set.add("Paris");
    set.add("New York");
    set.add("San Francisco");
    set.add("Beijing");
    //No duplicates
    set.add("New York");

    System.out.println(set);

    //Display the elements
    for (String s : set) {
      System.out.print(s.toUpperCase()+" ");
    }
  }
}
