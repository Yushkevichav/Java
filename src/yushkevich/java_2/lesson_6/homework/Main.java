package yushkevich.java_2.lesson_6.homework;

import yushkevich.java_2.lesson_6.homework.client.Client;
import yushkevich.java_2.lesson_6.homework.server.Server;

public class Main {
    public static void main(String[] args) {
        Thread thread1 = new Thread() {
            public void run(){
                new Server();
            }
        };

        Thread thread2 = new Thread() {
            public void run(){
                new Client();
            }
        };

        thread1.start();
        try {
            thread1.join(2000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        thread2.start();
    }
}
