package BookSource.Chapter22;
//Created by Chung
//Time: 12:51
//Date: 26-12-2017

import java.util.Scanner;

public class ImprovedFibonacci {

  public static void main(String[] args) {
    //Create a Scanner
    Scanner input = new Scanner(System.in);
    System.out.println("Enter an index for the Fibonacci number: ");
    int index = input.nextInt();

    //Find and display the Fibonacci number
    System.out.println("Fibonacci number at index " + index + " is " + fib(index));
  }

  /**
   * The method for finding the Fibonacci number
   */
  public static long fib(long n) {
    long f0 = 0;//for fib(0)
    long f1 = 1;//for fib(1)
    long f2 = 1;//for fib(2)

    if (n == 0) {
      return f0;
    } else if (n == 1) {
      return f1;
    } else if (n == 2) {
      return f2;
    }

    for (int i = 3; i <= n; i++) {
      f0 = f1;
      f1 = f2;
      f2 = f0 + f1;
    }
    return f2;
  }

}
