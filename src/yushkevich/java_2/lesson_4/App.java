/**
 * Java 2. Lesson 4
 *
 * @author Andrey Yushkevich
 * version dated March 09, 2019
 */

package yushkevich.java_2.lesson_4;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.*;


public class App extends JFrame {
    JTextArea jTextArea = new JTextArea();
    JTextField jTextField = new JTextField();
    Date dateNow = new Date();
    SimpleDateFormat formatForDateNow = new SimpleDateFormat("dd.MM.yyyy 'в' hh:mm:ss a zzz");

    public App() throws HeadlessException {
        setBounds(325, 200, 800, 500);
        setTitle("My application");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


        setLayout(new GridLayout(2, 1));


        JButton jb = new JButton("Отправить");


        JPanel p1 = new JPanel();
        p1.setBackground(Color.GREEN);
        p1.setLayout(new BoxLayout(p1, BoxLayout.Y_AXIS));

        jTextArea.setEditable(false);
        p1.add(new JScrollPane(jTextArea));
        p1.add(jb);
        jTextArea.setLineWrap(true);
        jTextArea.setWrapStyleWord(true);


        JPanel p2 = new JPanel();
        p2.setBackground(Color.LIGHT_GRAY);
        p2.setLayout(new GridLayout(1, 1));


        p2.add(jTextField);
        jb.addActionListener(e -> {
            if (jTextField.getText().length() > 0) {
                sendMessage();
            }
        });
        p2.add(new JScrollPane(jTextField));
        jTextField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (jTextField.getText().length() > 0) {
                    if (e.getKeyCode() == KeyEvent.VK_ENTER) sendMessage();
                }
            }
        });


        add(p1);
        add(p2);


        setVisible(true);
    }


    void sendMessage() {
        String out = jTextField.getText();
        jTextArea.append(formatForDateNow.format(dateNow) + ": " + out + "\n\r" + "\n\r");
        jTextField.setText("");
        jTextField.grabFocus();
    }


    public static void main(String[] args) {
        new App();
    }
}