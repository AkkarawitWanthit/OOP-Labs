package project;   

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainPage extends JFrame implements ActionListener {
    private JPanel panel;
    private JLabel titleLabel;
    private JButton addTourButton;
    private JButton bookButton;
    private JButton searchButton;
    private JButton exitButton;

    public MainPage() {
        setTitle("Tour Management System");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 300);
        setLocationRelativeTo(null);

        titleLabel = new JLabel("Tour Main Menu", SwingConstants.CENTER);
        titleLabel.setForeground(new Color(236, 72, 153));
        titleLabel.setFont(new Font("SansSerif", Font.BOLD, 20));

        addTourButton = new JButton("Add Tour");
        addTourButton.addActionListener(this);
        bookButton = new JButton("Book Tour");
        bookButton.addActionListener(this);
        searchButton = new JButton("Search Tours");
        searchButton.addActionListener(this);
        exitButton = new JButton("Exit");
        exitButton.addActionListener(this);

        panel = new JPanel();
        panel.setBackground(new Color(255, 241, 246));
        panel.setLayout(new GridLayout(4, 1));
        panel.add(addTourButton);
        panel.add(bookButton);
        panel.add(searchButton);
        panel.add(exitButton);

        add(titleLabel, BorderLayout.NORTH);
        add(panel, BorderLayout.CENTER);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String actionCommand = e.getActionCommand();
        if (actionCommand.equals("Add Tour")) {
            new AddTourPage();
        } else if (actionCommand.equals("Book Tour")) {
            new BookingPage();
        } else if (actionCommand.equals("Search Tours")) {
            new SearchPage();
        } else if (actionCommand.equals("Exit")) {
            int chosenOption = JOptionPane.showConfirmDialog(this, "Do you want to exit the program?","Tour Management System", JOptionPane.OK_CANCEL_OPTION);
            if (chosenOption == JOptionPane.OK_OPTION)
                System.exit(0);
        }
    }

    public static void main(String[] args) {
        new MainPage();
    }
}