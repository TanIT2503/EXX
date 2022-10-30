/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thang7.He_phan_tan.socketTCP;

import java.net.*;
import java.io.*;
public class lookForPorts {
public static void main(String[] args) {
 Socket theSocket;
 String host = "localhost";
 
 for (int i = 440; i < 446; i++) {
 try {
 System.out.println("Looking for "+ i);

 theSocket = new Socket(host, i);
 System.out.println("Day la mot server tren port " + i + " cua " + 
host);
 } catch (UnknownHostException e) {
 System.err.println("Khong ton tai server nao !");
 break;
 } catch (IOException e) {
 System.err.println(" Khong ket noi duoc!");
 }
 }  
 }
}
