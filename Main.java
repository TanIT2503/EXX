
package thang7.He_phan_tan.socketTCP;

import java.net.InetAddress;
import java.net.Socket;
public class Main {
 
public static void main(String[] argv) throws Exception {
 InetAddress addr = InetAddress.getByName("www.facebook.com.vn");
 int port = 80;
 Socket socket = new Socket(addr, port);
 System.out.print("dia chi la " +addr.getHostAddress());
 }
}

