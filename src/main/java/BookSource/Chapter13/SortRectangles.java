package BookSource.Chapter13;

/**
 * Created by Chung Time: 下午 06:56 Date: 19-12月-2017
 */
public class SortRectangles {

  public static void main(String[] args) {
    ComparableRectangle[] rectangles = {
        new ComparableRectangle(3.4, 5.4),
        new ComparableRectangle(13.24, 55.4),
        new ComparableRectangle(7.4, 35.4),
        new ComparableRectangle(1.4, 25.4)};
    java.util.Arrays.sort(rectangles);
    for (Rectangle rectangle : rectangles) {
      System.out.print(rectangle + " ");
      System.out.println();
    }
  }
}
