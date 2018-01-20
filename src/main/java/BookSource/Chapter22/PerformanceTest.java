package BookSource.Chapter22;
//Created by Chung
//Time: 10:44
//Date: 25-12-2017

public class PerformanceTest {

  public static void main(String[] args) {
    long n = 1_000_000;
    getTime(n);
    getTime(10*n);
    getTime(100*n);
    getTime(1000*n);
  }

  public static void getTime(long n){
    long startTime = System.currentTimeMillis();
    long k = 0;
    for (int i = 1; i <= n; i++) {
      k = k + 5;
    }

    long endTime = System.currentTimeMillis();
    System.out.println("Execution time for n = " + n + " is " +
        (endTime - startTime) + " milliseconds");
  }

}
