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
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class Ontap_client {
    public static void main(String args[]) throws IOException{
        Socket socketofclient=new Socket("localhost",9999);
        BufferedReader is=new BufferedReader( new InputStreamReader(socketofclient.getInputStream()));
        BufferedWriter os=new BufferedWriter( new OutputStreamWriter(socketofclient.getOutputStream()));
        Scanner sc=new Scanner(System.in);
        String chuoigui="";
        do{
                System.out.print("Nhập dãy só: ");
                chuoigui=sc.next();
                os.write(chuoigui);
                os.newLine();
                os.flush();
                if(chuoigui.compareTo("quit")==0)
                    break;
                String responseLine=is.readLine();
                System.out.println("Server: " + responseLine);
        }while(true);
         os.close();
         is.close();
         socketofclient.close();
    }
    
}
