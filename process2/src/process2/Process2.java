
package process2;

import java.net.*;
import java.io.*;


public class Process2 {

    public static void main(String[] args) throws SocketException, UnknownHostException, IOException, InterruptedException {
        DatagramSocket socket2 = new DatagramSocket(9900);
        InetAddress address = InetAddress.getByName("Localhost"); 
        byte[] receiveMsg = new byte[1000];
        DatagramPacket receivingPackOne = new DatagramPacket(receiveMsg, receiveMsg.length);
        DatagramPacket receivingPacketTwo = new DatagramPacket(receiveMsg, receiveMsg.length);
        socket2.receive(receivingPackOne);
        String affichage = new String(receivingPackOne.getData());
        System.out.println(affichage +" recu");
        String message ="ping";
        byte[] sendMsg = new byte[1000];
        sendMsg = message.getBytes();
        DatagramPacket sendingPacket = new DatagramPacket(sendMsg, sendMsg.length, address, 10000);
        while (true) {  
        Thread.sleep(2000);
        socket2.send(sendingPacket);
        socket2.receive(receivingPacketTwo);
        String msg = new String(receivingPacketTwo.getData());
        System.out.println(msg +" recu");
        }
    }
}


