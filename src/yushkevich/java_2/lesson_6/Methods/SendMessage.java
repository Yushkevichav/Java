package yushkevich.java_2.lesson_6.Methods;

import yushkevich.java_2.lesson_6.Variables;

import java.io.IOException;

public class SendMessage {
    public static void sendMessage(String message) {
        try {
            Variables.outputStream.writeUTF(message);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
