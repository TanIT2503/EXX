import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
public class Tong_Client {
    
    
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            
            
        try {
            
            System.out.println("Client is connecting ...");
            Socket socket = new Socket("127.0.0.1",8888);
            System.out.println("Client connected");
            DataOutputStream output = new DataOutputStream(socket.getOutputStream());
            DataInputStream input = new DataInputStream(socket.getInputStream());
            while(true){
                System.out.println("Input number A:");
                output.writeDouble(sc.nextDouble());
                output.flush();//truyền a
                System.out.println("Input number B:");
                output.writeDouble(sc.nextDouble());
                output.flush(); // truyen b
                double sum = input.readDouble();
                System.out.println("Sum : "+sum);
                System.out.println("Tep tuc(Y/stop)");
                String rep= sc.next();
                if(rep.equalsIgnoreCase("stop")){
                break;
                }
                
            }
             
            }
        catch(Exception e)
            {
            }
        
    }
}
    

