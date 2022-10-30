/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thang7.He_phan_tan.socketTCP;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.ServerSocket;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class Ontap_server {
    public int Max(int a[]){
        int max=0;
        for (int i=0;i<a.length;i++){
        if(a[i]>=max)
            max=a[i];
        }
    return max;
    }
    public static void main(String args[]) throws IOException{
        Ontap_server ot=new Ontap_server();
        ServerSocket listener= new ServerSocket(9999);
        Socket socketofserver= listener.accept();
        BufferedReader is=new BufferedReader( new InputStreamReader(socketofserver.getInputStream()));
        BufferedWriter os=new BufferedWriter( new OutputStreamWriter(socketofserver.getOutputStream()));
        System.out.println("Da nghe");
        while(true){
            String line=is.readLine();
            if(line.compareTo("quit")==0)
                break;
            String[] arr=line.split(";");
            int mang[]=new int[10];
            for (int i=0;i< arr.length;i++){
                mang[i]=Integer.parseInt(arr[i]);
            }
            System.out.println(ot.Max(mang));
            os.write(String.valueOf(ot.Max(mang)));
            os.newLine();
            os.flush(); 
            
        }
         os.close();
         is.close();
         socketofserver.close();  
    }
}
