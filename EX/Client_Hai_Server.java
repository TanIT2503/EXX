import java.io.*;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
public class Client_Hai_Server {
    static String Nhap() throws IOException {
        BufferedReader inFromUser = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("S = 25*(a+b)-6*(3c-2d)");
        System.out.print("Mau nhap vao > a;b c;d: ");
        String str = inFromUser.readLine();
        return str.trim();
    }

    public static void main(String[] args) throws Exception {
        DatagramSocket clientSocket1 = new DatagramSocket(8159);
        DatagramSocket clientSocket2 = new DatagramSocket(8259);
        InetAddress IPAddress = InetAddress.getByName("localhost");
        while (true) {
            byte[] sendData1 = new byte[1024];
            byte[] sendData2 = new byte[1024];
            byte[] receiveData1 = new byte[2048];
            byte[] receiveData2 = new byte[2048];
            
            String strs = Nhap();
            String str[] = strs.split(" ");

            // Todo: Client 1
            sendData1 = str[0].getBytes();
            DatagramPacket sendPacket1 = new DatagramPacket(sendData1, sendData1.length, IPAddress, 9998);
            clientSocket1.send(sendPacket1);
            // Todo: Client 2
            sendData2 = str[1].getBytes();
            DatagramPacket sendPacket2 = new DatagramPacket(sendData2, sendData2.length, IPAddress, 9798);
            clientSocket2.send(sendPacket2);
            
            if (strs.trim().equalsIgnoreCase("stop"))
                break;

            DatagramPacket receivePacket1 = new DatagramPacket(receiveData1, receiveData1.length);
            clientSocket1.receive(receivePacket1);
            String modified_Sentence1 = new String(receivePacket1.getData());

            DatagramPacket receivePacket2 = new DatagramPacket(receiveData2, receiveData2.length);
            clientSocket2.receive(receivePacket2);
            String modified_Sentence2 = new String(receivePacket2.getData());

            double ab = Double.parseDouble(modified_Sentence1);
            double cd = Double.parseDouble(modified_Sentence2);

            System.out.println("S = " + (25 * ab - 6 * cd));
        }
        clientSocket1.close();
        clientSocket2.close();

    }
}
