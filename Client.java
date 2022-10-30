/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thang7.He_phan_tan.socketTCP;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

class Client {
 public static void main(String args[]) {
 try {
 Socket skt = new Socket("localhost", 1234);
 BufferedReader in = new BufferedReader(new InputStreamReader(skt.getInputStream()));
 System.out.print("Du lieu da nhan: '");
 while (!in.ready()) {
 System.out.println(in.readLine()); // Doc mot dong va in no ra man hinh
 System.out.print("'\n");
 in.close();
 }
 }
 catch(Exception e) {
 System.out.print("He thong khong lam viec!\n");
 }
 }
}
