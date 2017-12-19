package BookSource.Chapter12;

import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Chung Time: 下午 02:22 Date: 18-12月-2017
 */
public class WebCrawler {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a URL:　");
    String url = scanner.nextLine();
    crawler(url);
  }

  private static void crawler(String startingUrl) {
    ArrayList<String> listOfPendingURLs = new ArrayList<>();
    ArrayList<String> listOfTraversedURLs = new ArrayList<>();

    listOfPendingURLs.add(startingUrl);
    while (!listOfPendingURLs.isEmpty() &&
        listOfTraversedURLs.size() < 100) {
      String urlString = listOfPendingURLs.remove(0);
      //avoid repeating crawling
      if (!listOfTraversedURLs.contains(urlString)) {
        listOfTraversedURLs.add(urlString);
        System.out.println("Craw " + urlString);

        for (String s : getSubURLs(urlString)) {
          if (!listOfTraversedURLs.contains(s)) {
            listOfPendingURLs.add(s);
          }
        }
      }
    }

  }

  private static ArrayList<String> getSubURLs(String urlString) {
    ArrayList<String> list = new ArrayList<>();

    try {
      URL url = new URL(urlString);
      Scanner scanner = new Scanner(url.openStream());
      int current = 0;
      while (scanner.hasNext()) {
        String line = scanner.nextLine();
        current = line.indexOf("http", current);
        while (current > 0) {
          int endIndex = line.indexOf("\"", current);
          if (endIndex > 0) {//Ensure that a correct URL is found
            list.add(line.substring(current, endIndex));
            current = line.indexOf("http:", endIndex);
          } else {
            current = -1;
          }
        }
      }
    } catch (Exception e) {
      System.out.println("Error: " + e.getMessage());
    }
    return list;
  }

}
