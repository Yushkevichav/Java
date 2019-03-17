package yushkevich.java_2.lesson_6.Methods;

import yushkevich.java_2.lesson_6.Clients.ClientChat;

import java.io.IOException;

public class SendMessage {
    public static void sendMessage(String message) {
        try {
            ClientChat.outputStream.writeUTF(message);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
