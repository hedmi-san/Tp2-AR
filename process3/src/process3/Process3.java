
package process3;
import java.net.*;
import java.io.*;
public class Process3 {

    public static void main(String[] args) throws SocketException, UnknownHostException, IOException, InterruptedException {
       DatagramSocket socket3 = new DatagramSocket(10000);
        InetAddress address = InetAddress.getByName("Localhost"); 
        byte[] receiveMsg = new byte[1000];
        DatagramPacket receivingPacket = new DatagramPacket(receiveMsg, receiveMsg.length);
        String message ="pong ";
        byte[] sendMsg = new byte[1000];
        sendMsg = message.getBytes();
        DatagramPacket sendingPacket = new DatagramPacket(sendMsg, sendMsg.length, address, 9900);
         while (true) {            
        socket3.receive(receivingPacket);
        Thread.sleep(2000);
        socket3.send(sendingPacket);
        String msg = new String(receivingPacket.getData());
        System.out.println(msg +" recu");
        }    
    }
}
