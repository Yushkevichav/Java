package yushkevich.java_2.lesson_7.server;

import java.io.IOException;

public interface ClientService {
    /**
     * Читает от клиента и рассылает
     */
    void processMessage() throws IOException;
}
