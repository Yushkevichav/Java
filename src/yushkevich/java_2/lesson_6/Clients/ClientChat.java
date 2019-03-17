package yushkevich.java_2.lesson_6.Clients;

import yushkevich.java_2.lesson_6.Methods.InitConnection;
import yushkevich.java_2.lesson_6.Methods.InitReceiver;
import yushkevich.java_2.lesson_6.Methods.ProcessMessage;

import java.awt.BorderLayout;
import java.awt.Color;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class ClientChat extends JFrame {

    public static DataOutputStream outputStream;
    public static DataInputStream inputStream;
    public static JTextArea outputTextArea;
    public static JTextField inputTextField;
    public static Socket socket;

    public ClientChat() {
        InitConnection.initConnection();
        initGui();
        InitReceiver.initReceiver();
    }


    private void initGui() {
        outputTextArea = new JTextArea();
        inputTextField = new JTextField();

        setTitle("Clients");
        setBounds(500, 200, 700, 700);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());


        panel.add(new JScrollPane(outputTextArea));

        outputTextArea.setBackground(new Color(193, 255, 247));
        outputTextArea.setEditable(false);     //чтобы нельзя было печатать текст в поле


        JPanel panel1 = new JPanel();
        panel1.setLayout(new BoxLayout(panel1, BoxLayout.X_AXIS));

        inputTextField.setBackground(new Color(255, 249, 252));

        JButton button = new JButton("Send");

        panel1.add(inputTextField);
        panel1.add(button);

        //нажатие кнопки
        button.addActionListener(e -> {
            ProcessMessage.processMessage();
        });

        //нажание Enter
        inputTextField.addActionListener(e -> ProcessMessage.processMessage());

        add(panel, BorderLayout.CENTER);
        add(panel1, BorderLayout.SOUTH);
        setVisible(true);

        System.out.println("gui initialized ");
    }
}
