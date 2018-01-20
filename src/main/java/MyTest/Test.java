package MyTest;
//Created by Chung
//Time: 15:54
//Date: 11-01-2018

public class Test implements Runnable {
  public static void main(String[] args) {
    new Test();
  }
  public Test() {
    Thread t = new Thread(this);
    t.start();
    //t.start();

  }
  public void run() {
    System.out.println("test");
  }
}
