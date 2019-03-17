package yushkevich.java_2.lesson_6.Methods;

import yushkevich.java_2.lesson_6.Clients.ClientChat;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class InitConnection {
    public static void initConnection() {
        try {
            ClientChat.socket = new Socket("localhost", 8080);
            ClientChat.outputStream = new DataOutputStream(ClientChat.socket.getOutputStream());
            ClientChat.inputStream = new DataInputStream(ClientChat.socket.getInputStream());
            System.out.println("connection initialized");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
