package BookSource.Chapter20;

import BookSource.Chapter13.Circle;
import BookSource.Chapter13.GeometricObject;
import BookSource.Chapter13.Rectangle;
import java.util.Comparator;

/**
 * Created by Chung Time: 下午 09:17 Date: 19-12月-2017
 */
public class TestComparator {

  public static void main(String[] args) {
    GeometricObject g1 = new Rectangle(5, 5);
    GeometricObject g2 = new Circle(5);

    GeometricObject g = max(g1, g2, new GeometricObjectComparator());

    System.out.println("The area of the larger object is " + g.getArea());
  }

  public static GeometricObject max(GeometricObject g1, GeometricObject g2,
      Comparator<GeometricObject> c) {

    if (c.compare(g1, g2) > 0) {
      return g1;
    } else {
      return g2;
    }
  }
}
