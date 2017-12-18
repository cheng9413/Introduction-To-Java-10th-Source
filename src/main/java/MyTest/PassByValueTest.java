package MyTest;

/**
 * Created by Chung Time: 下午 12:44 Date: 17-12月-2017
 */
public class PassByValueTest {

  public static void main(String[] args) {

    /*
    * Pass by value
    * The number is copied to the method
    * So no effect on number in main();
    * */
    System.out.println("-----Primitive test-----");
    int number = 10;
    System.out.println("Before changeNumber: "+number);
    changeNumber(number);
    System.out.println("After changeNumber: "+number);

    System.out.println();

    /*
    * Pass by value
    * The value is memory address in this case
    * The method changed the property of person
    * not the address
    * */
    System.out.println("-----Object test-----");
    Person person = new Person();
    System.out.println("Before changeAge: "+person.getAge());
    person.changeAge(25);
    System.out.println("After changeAge: "+person.getAge());

  }

  public static void changeNumber(int number) {
    number = 50;
    System.out.println("Number in method: "+number);
  }
}

class Person {

  private int age = 20;

  public Person() {
  }

  public Person(int age) {
    this.age = age;
  }

  public void changeAge(int age) {
    this.age = age;
  }

  public int getAge() {
    return age;
  }
}
