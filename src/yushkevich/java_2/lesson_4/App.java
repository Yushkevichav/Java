package yushkevich.java_2.lesson_4;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Date;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.WindowConstants;


public class App extends JFrame {
    JTextArea jta1 = new JTextArea();
    JTextField jtf1 = new JTextField();

    public App() throws HeadlessException {
        setBounds(500, 200, 400, 400);
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


        p2.add(jtf1);
        jb.addActionListener(e -> {
            sendMessage();
        });

        jtf1.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) sendMessage();
            }
        });


        add(p1);
        add(p2);

        setVisible(true);
    }
    void sendMessage () {
        String out = jtf1.getText();
        jta1.append(new Date() + ": " + out + "\n\r" + "\n\r");
        jtf1.setText("");
        jtf1.grabFocus();
    }


    public static void main(String[] args) {
        new App();
    }
}