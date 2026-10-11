package project;

import javax.swing.*;

public class MainPage extends JFrame {
    public MainPage() {
        JButton showBtn = new JButton("Show Tours");
        JButton bookBtn = new JButton("Book Tour");
        JTextArea area = new JTextArea(5, 30);

        JPanel p = new JPanel();
        p.add(showBtn);
        p.add(bookBtn);
        p.add(area);
        add(p);

        setSize(350, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MainPage();
    }
}
