package org.example;

import org.example.receive.ReceiveThread;
import org.example.send.SendThread;

import java.io.IOException;
import java.net.Socket;

public class Main {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 8888);
        System.out.println("Connect Server");

        ReceiveThread receiveThread = new ReceiveThread(socket);
        receiveThread.start();

        SendThread sendThread = new SendThread(socket);
        sendThread.start();
    }
}