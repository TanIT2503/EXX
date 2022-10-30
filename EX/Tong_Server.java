
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Tong_Server {
    public static void main(String[] args){
        
        
        try {
            ServerSocket sv = new ServerSocket(8888);
            System.out.println("Server is connecting ...");
            Socket socket = sv.accept();
            System.out.println("Server connected");
            // nhan dl tu client
            DataInputStream input = new DataInputStream(socket.getInputStream());
            // truyem dl sang client
            DataOutputStream output = new DataOutputStream(socket.getOutputStream());
            while(true){
            double a = input.readDouble();
            double b = input.readDouble();
            System.out.println("Number A:"+a);
            System.out.println("Number B:"+b);
            double sum =a+b;
            // transfer result to client
            output.writeDouble(sum);
            output.flush();
            
            }
        }
        catch(Exception e)
            {
            }
        
    }
}


