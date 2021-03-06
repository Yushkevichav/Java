package yushkevich.java_2.lesson_6.homework.server;

import java.io.IOException;
import java.net.*;

public class Server {
    public Server() {
        ServerSocket server = null;
        Socket socket = null;

        try {
            server = new ServerSocket(8080);
            System.out.println("Server created. Waiting for client...");
            while (true) {
                socket = server.accept();
                System.out.println("Client connected");
                new Thread(new ClientHandler(socket)).start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                socket.close();
                server.close();
                System.out.println("Server closed");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}