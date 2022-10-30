
package thang7.He_phan_tan.socketTCP;

import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

class Server {
 public static void main(String args[]) {
 String data = "Xinh xin chao cac ban tu Da Nang!";
 try {
 ServerSocket srvr = new ServerSocket(1234);
 Socket skt = srvr.accept();
 System.out.print("May chu da duoc ket noi!\n");
 PrintWriter out = new PrintWriter(skt.getOutputStream(), true);
 System.out.print("Du lieu se gui di cho may tram: '" + data + "'\n");
 out.print(data);
 out.close();
 skt.close(); 
 srvr.close();
 }
 catch(Exception e) {
 //System.out.print("He thong khong lam viec!\n");
 }
 }
}
