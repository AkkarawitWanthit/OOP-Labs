package project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BookingPage extends JFrame implements ActionListener {
    private JButton domesticBtn, internationalBtn, backMainBtn;

    public BookingPage() {
        super("Tour Manager System");
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        setSize(300, 300);

        JLabel titleLabel = new JLabel("Choose Tour Type", SwingConstants.CENTER);
        titleLabel.setForeground(Color.BLUE);
        titleLabel.setFont(new Font("", Font.BOLD, 20));

        domesticBtn = new JButton("Domestic Tour");
        domesticBtn.addActionListener(this);
        internationalBtn = new JButton("International Tour");
        internationalBtn.addActionListener(this);
        backMainBtn = new JButton("Back to Main Page");
        backMainBtn.addActionListener(this);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 1));
        panel.add(domesticBtn);
        panel.add(internationalBtn);
        panel.add(backMainBtn);

        this.add(titleLabel, BorderLayout.NORTH);
        this.add(panel, BorderLayout.CENTER);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String actionCommand = e.getActionCommand();
        if (actionCommand.equals("Domestic Tour")) {
            new DomesticGUI();
        } else if (actionCommand.equals("International Tour")) {
            new InternationalGUI();
        } else if (actionCommand.equals("Back to Main Page")) {
            dispose();
        }
    }

    public static void main(String[] args) {
        new BookingPage();
    }
}