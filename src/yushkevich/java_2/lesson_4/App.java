package yushkevich.java_2.lesson_4;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.HeadlessException;
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
    public App() throws HeadlessException {
        setBounds(500, 200, 400, 400);
        setTitle("My application");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


        setLayout(new GridLayout(2, 1));
        JButton jb = new JButton("Отправить");


        JPanel p1 = new JPanel();

        p1.setBackground(Color.GREEN);
        p1.setLayout(new BoxLayout(p1, BoxLayout.Y_AXIS));
        JTextArea jta1 = new JTextArea();

        p1.add(new JScrollPane(jta1));
        p1.add(jb);
        jb.addActionListener(e -> {
            jta1.append("Отправлено в: " + new Date() + "\n\r" + "\n\r");
        });


        JPanel p2 = new JPanel();
        p2.setBackground(Color.LIGHT_GRAY);
        p2.setLayout(new GridLayout(1, 1));
        JTextField jTextField = new JTextField();


        p2.add(jTextField);

        add(p1);
        add(p2);

        setVisible(true);

    }

    public static void main(String[] args) {
        new App();
    }
}