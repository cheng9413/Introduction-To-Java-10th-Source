package BookSource.Chapter11;

/**
 * Created by Chung Time: 下午 06:44 Date: 19-12月-2017
 */
public class DynamicBindingDemo {

  public static void main(String[] args) {
    m(new GraduateStudent());
    m(new Student());
    m(new Person());
    m(new Object());
  }

  public static void m(Object x) {
    System.out.println(x.toString());
  }
}

class GraduateStudent extends Student {

}

class Student extends Person {

  @Override
  public String toString() {
    return "Student";
  }
}

class Person extends Object {

  @Override
  public String toString() {
    return "Person";
  }
}
