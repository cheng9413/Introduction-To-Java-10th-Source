package BookSource.Chapter20;

import BookSource.Chapter13.GeometricObject;
import java.util.Comparator;
import java.io.Serializable;

/**
 * Created by Chung Time: 下午 06:37 Date: 19-12月-2017
 */
public class GeometricObjectComparator
    implements Comparator<GeometricObject>, Serializable {

  @Override
  public int compare(GeometricObject o1, GeometricObject o2) {
    double area1 = o1.getArea();
    double area2 = o2.getArea();

    if (area1 < area2) {
      return -1;
    } else if (area1 == area2) {
      return 0;
    } else {
      return 1;
    }
  }
}
