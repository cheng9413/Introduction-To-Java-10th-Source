package BookSource.Chapter20;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Chung Time: 下午 10:03 Date: 20-12月-2017
 */
public class TestQueue {

  public static void main(String[] args) {
    Queue<String> queue = new LinkedList<>();
    queue.offer("Oklahoma");
    queue.offer("Indiana");
    queue.offer("Georgia");
    queue.offer("Texas");

    while (queue.size() > 0) {
      System.out.print(queue.remove() + " ");
    }
  }

}
