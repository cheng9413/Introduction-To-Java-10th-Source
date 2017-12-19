package BookSource.Chapter11;

import java.util.ArrayList;

/**
 * Created by Chung Time: 下午 06:46 Date: 19-12月-2017
 */
public class MyStack {

  private ArrayList<Object> list = new ArrayList<>();

  public boolean isEmpty() {
    return list.isEmpty();
  }

  public int getSize() {
    return list.size();
  }

  public Object peek() {
    return list.get(getSize() - 1);
  }

  public Object pop() {
    Object o = list.get(getSize() - 1);
    list.remove(getSize() - 1);
    return o;
  }

  public void push(Object o) {
    list.add(o);
  }

  @Override
  /** Override the toString in the Object class */
  public String toString() {
    return "stack: " + list.toString();
  }
}