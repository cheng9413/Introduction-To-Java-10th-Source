package BookSource.Chapter31;
//Created by Chung
//Time: 22:37
//Date: 20-01-2018

import java.net.InetAddress;
import java.net.UnknownHostException;

public class IdentifyHostName {

  public static void main(String[] args) {
    for (int i = 0; i < args.length; i++) {
      try {
        InetAddress address = InetAddress.getByName(args[i]);
        System.out.print("Host name: " + address.getHostName() + " ");
        System.out.println("IP address: " + address.getHostAddress());
      } catch (UnknownHostException ex) {
        System.err.println("Unknown host or IP address " + args[i]);
      }
    }
  }

}
