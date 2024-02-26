
package process1;

import java.net.*;
import java.io.*;

public class Process1 {

    public static void main(String[] args) throws SocketException, UnknownHostException, IOException {
        DatagramSocket socket1 = new DatagramSocket(8800);
        InetAddress address = InetAddress.getByName("Localhost");
        String message ="start";
        byte[] sendMsg = new byte[1000];
        sendMsg = message.getBytes();
        DatagramPacket sendingPacket = new DatagramPacket(sendMsg, sendMsg.length, address, 9900);
        socket1.send(sendingPacket);
    }
    
}
