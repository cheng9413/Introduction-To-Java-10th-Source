package BookSource.Chapter30;
//Created by Chung
//Time: 11:40
//Date: 20-01-2018

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorDemo {

  public static void main(String[] args) {
    //Create a fixed thread pool with maximum three threads
    ExecutorService executor = Executors.newFixedThreadPool(3);

    int n = 100000;

    //Summit runnable tasks to the executor
    executor.execute(new PrintChar('a', n));
    executor.execute(new PrintChar('b', n));
    executor.execute(new PrintNum(n));

    //Shut down the executor
    executor.shutdown();
  }

}
