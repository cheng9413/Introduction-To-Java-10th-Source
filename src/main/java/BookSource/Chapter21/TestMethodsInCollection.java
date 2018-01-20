package BookSource.Chapter21;
//Created by Chung
//Time: 10:41
//Date: 24-12-2017

import java.util.HashSet;
import java.util.Set;

public class TestMethodsInCollection {

  public static void main(String[] args) {
    //Create set 1
    Set<String> set1 = new HashSet<>();

    //Add strings to set1
    set1.add("London");
    set1.add("Paris");
    set1.add("New York");
    set1.add("San Francisco");
    set1.add("Beijing");

    System.out.println("set1 is " + set1);
    System.out.println(set1.size() + " elements in set1");

    //Delete a string from set1
    set1.remove("London");
    System.out.println("\nset1 is " + set1);
    System.out.println(set1.size() + " elements in set1");

    //Create set2
    Set<String> set2 = new HashSet<>();

    //Add strings to set2
    set2.add("London");
    set2.add("Shanghai");
    set2.add("Paris");
    System.out.println("\nset2 is " + set2);
    System.out.println(set2.size() + " elements in set2");

    System.out.println("\nIs Taipei in set2? " + set2.contains("Taipai"));

    set1.addAll(set2);
    System.out.println("\nAfter adding set2 to set1, set1 is " + set1);

    set1.removeAll(set2);
    System.out.println("After removing set2 from set1 set1 is " + set1);

    set1.retainAll(set2);
    System.out.println("After keeping common elements in set2 " + set2 +
        "from set1, set1 is " + set1);
  }
}
