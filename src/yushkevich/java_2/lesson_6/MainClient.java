package yushkevich.java_2.lesson_6;

import yushkevich.java_2.lesson_6.Clients.ClientChat;
import yushkevich.java_2.lesson_6.Clients.ServerChat;

import java.io.IOException;

public class MainClient {
    public static void main(String[] args) throws IOException {

        Thread thread1 = new Thread() {
            public void run() {
                try {
                    new ServerChat();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        };


        Thread thread2 = new Thread() {
            public void run() {
                new ClientChat();
            }
        };

        thread1.start();
        thread2.start();
    }
}