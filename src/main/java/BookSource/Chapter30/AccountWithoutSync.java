package BookSource.Chapter30;
//Created by Chung
//Time: 11:47
//Date: 20-01-2018

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class AccountWithoutSync {

  private static Account account = new Account();

  public static void main(String[] args) {
    ExecutorService executor = Executors.newCachedThreadPool();

    //Create and launch 100 threads
    for (int i = 0; i < 100; i++) {
      executor.execute(new AddPennyTask());
    }

    executor.shutdown();

    //Wait until all tasks are finished
    while (!executor.isTerminated()) {
    }

    System.out.println("What is balance? " + account.getBalance());
  }

  //An inner class for account
  private static class Account {

    private int balance = 0;

    public int getBalance() {
      return balance;
    }

    public void deposit(int amount) {
      int newBalance = balance + amount;

      //This delay is deliberately added to magnify the
      //data-corruption problem and make is easy to see.
      try {
        Thread.sleep(2);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      balance = newBalance;
    }
  }

  //A thread for adding a penny to the account
  private static class AddPennyTask implements Runnable {

    @Override
    public void run() {
      account.deposit(1);
    }
  }
}
