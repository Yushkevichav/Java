package yushkevich.java_2.lesson_6.Methods;

import yushkevich.java_2.lesson_6.Variables;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;

public class InitConnection {
    public static void initConnection() {
        try {
            Variables.socket = new Socket("localhost", 8080);
            Variables.inputStream = new DataInputStream(Variables.socket.getInputStream());
            System.out.println("connection initialized");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
