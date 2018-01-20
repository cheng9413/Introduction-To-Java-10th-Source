package BookSource.Chapter22;
//Created by Chung
//Time: 15:19
//Date: 26-12-2017

import java.util.Scanner;

public class GCDEuclid {

  /** Find GCD for integers m and n*/
  public static int gcd(int m, int n) {
    if (m % n == 0) {
      return n;
    } else {
      return gcd(n, m % n);
    }
  }

  public static void main(String[] args) {
    //Create a Scanner
    Scanner input = new Scanner(System.in);
    System.out.println("Enter first integer: ");
    int m = input.nextInt();
    System.out.println("Enter second integer: ");
    int n = input.nextInt();

    System.out.println("The greatest common divisor for " +
        m + " and " + n + " is " + gcd(m, n));
  }

}
