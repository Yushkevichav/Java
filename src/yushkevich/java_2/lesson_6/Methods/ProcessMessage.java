package yushkevich.java_2.lesson_6.Methods;

import yushkevich.java_2.lesson_6.Variables;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ProcessMessage {
    public static void processMessage() {
        if (!Variables.inputTextField.getText().equals("")) {
            String message = Variables.inputTextField.getText();
            Variables.outputTextArea.append(new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(Calendar.getInstance().getTime()) + "\n" + message + "\n");
            Variables.inputTextField.setText("");
            SendMessage.sendMessage(message);
        }

    }
}
