package BookSource.Chapter13;

/**
 * Created by Chung Time: 下午 06:56 Date: 19-12月-2017
 */
public class ComparableRectangle extends Rectangle
    implements Comparable<ComparableRectangle> {

  /**
   * Construct a ComparableRectangle with specified properties
   */
  public ComparableRectangle(double width, double height) {
    super(width, height);
  }

  @Override // Implement the compareTo method defined in Comparable
  public int compareTo(ComparableRectangle o) {
    if (getArea() > o.getArea()) {
      return 1;
    } else if (getArea() < o.getArea()) {
      return -1;
    } else {
      return 0;
    }
  }

  @Override // Implement the toString method in GeometricObject
  public String toString() {
    return "Width: " + getWidth() + " Height: " + getHeight() +
        " Area: " + getArea();
  }
}
