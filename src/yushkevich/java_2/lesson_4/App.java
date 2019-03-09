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

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.WindowConstants;


public class App extends JFrame {
    JTextArea jta1 = new JTextArea();
    JTextArea jta2 = new JTextArea();
    Date dateNow = new Date();
    SimpleDateFormat formatForDateNow = new SimpleDateFormat("hh:mm:ss a zzz");

    public App() throws HeadlessException {
        setBounds(325, 200, 800, 500);
        setTitle("My application");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


        setLayout(new GridLayout(2, 1));


        JButton jb = new JButton("Отправить");


        JPanel p1 = new JPanel();
        p1.setBackground(Color.GREEN);
        p1.setLayout(new BoxLayout(p1, BoxLayout.Y_AXIS));

        jta1.setEditable(false);
        p1.add(new JScrollPane(jta1));
        p1.add(jb);
        jta1.setLineWrap(true);
        jta1.setWrapStyleWord(true);


        JPanel p2 = new JPanel();
        p2.setBackground(Color.LIGHT_GRAY);
        p2.setLayout(new GridLayout(1, 1));


        p2.add(jta2);
        jb.addActionListener(e -> {
            sendMessage();
        });
        p2.add(new JScrollPane(jta2));
        jta2.setLineWrap(true);
        jta2.setWrapStyleWord(true);
        jta2.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) sendMessage();
            }
        });


        add(p1);
        add(p2);


        setVisible(true);
    }


    void sendMessage() {
        String out = jta2.getText();
        jta1.append(formatForDateNow.format(dateNow) + ": " + out + "\n\r" + "\n\r");
        jta2.setText("");
        jta2.grabFocus();
    }


    public static void main(String[] args) {
        new App();
    }
}