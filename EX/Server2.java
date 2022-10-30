import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Server2 {
    public static void main(String[] args) throws Exception {
        DatagramSocket serverSocket = new DatagramSocket(9798);
        while (true) {
            System.out.println("Luon san sang nhan tin:");
            byte[] receiveData = new byte[1024];
            byte[] sendData = new byte[2048];
            DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
            serverSocket.receive(receivePacket);

            // Xử lý dữ liệu vừa nhận
            String str;
            str = new String(receivePacket.getData());

            if (str.trim().equalsIgnoreCase("stop")) {
                break;
            }

            String s[] = str.trim().split(";");
            double c = Double.parseDouble(s[0]);
            double d = Double.parseDouble(s[1]);

            String sentence_to_client = Double.toString(((3 * c) - (2 * d)));

            InetAddress IPAddress = receivePacket.getAddress();
            int port = receivePacket.getPort();

            sendData = sentence_to_client.getBytes();
            DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, IPAddress, port);
            serverSocket.send(sendPacket);
        }
        serverSocket.close();
    }
    
}
