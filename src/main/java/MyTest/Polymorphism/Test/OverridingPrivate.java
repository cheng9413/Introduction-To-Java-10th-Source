package MyTest.Polymorphism.Test;

/**
 * Created by Chung Time: 上午 09:03 Date: 18-12月-2017
 */
public class OverridingPrivate {

  private void foo() {
    System.out.println("Private foo()");
  }

  public static void main(String[] args) {
    OverridingPrivate privateMethodClass = new PublicMethodClass();
    privateMethodClass.foo();
  }
}

class PublicMethodClass extends OverridingPrivate {
  //cannot override
  public void foo() {
    System.out.println("Private foo()");
  }

}
