package yushkevich.java_2.lesson_6.Methods;

import yushkevich.java_2.lesson_6.Clients.ClientChat;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ProcessMessage {
    public static void processMessage() {
        if (!ClientChat.inputTextField.getText().equals("")) {
            String message = ClientChat.inputTextField.getText();
            ClientChat.outputTextArea.append(new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(Calendar.getInstance().getTime()) + "\n" + message + "\n");
            ClientChat.inputTextField.setText("");
            SendMessage.sendMessage(message);
        }

    }
}
