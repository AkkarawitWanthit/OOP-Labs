package project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BookingPage extends JFrame implements ActionListener {
    private JTextField idTxt, peopleTxt;
    private JTextArea tourList;
    private JButton bookBtn, backMainBtn;

    public BookingPage() {
        super("Tour Manager System");
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        setSize(500, 500);

        JLabel titleLabel = new JLabel("Book Tour", SwingConstants.CENTER);
        titleLabel.setForeground(Color.BLUE);
        titleLabel.setFont(new Font("", Font.BOLD, 20));

        idTxt = new JTextField();
        peopleTxt = new JTextField();
        tourList = new JTextArea();

        bookBtn = new JButton("Book");
        bookBtn.addActionListener(this);
        backMainBtn = new JButton("Back to Main Page");
        backMainBtn.addActionListener(this);

        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(2, 2));
        inputPanel.add(new JLabel("Tour ID"));
        inputPanel.add(idTxt);
        inputPanel.add(new JLabel("People"));
        inputPanel.add(peopleTxt);

        JPanel btnPanel = new JPanel();
        btnPanel.add(bookBtn);
        btnPanel.add(backMainBtn);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 1));
        panel.add(inputPanel);
        panel.add(btnPanel);
        panel.add(tourList);

        this.add(titleLabel, BorderLayout.NORTH);
        this.add(panel, BorderLayout.CENTER);
        showTours();
        setVisible(true);
    }

    public void showTours() {
        tourList.setText(Database.manager.showAll());
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Book")) {
            try {
                Tour t = Database.manager.findTour(idTxt.getText());
                int people = Integer.parseInt(peopleTxt.getText());
                if (t == null) {
                    JOptionPane.showMessageDialog(this, "Tour not found");
                } else if (t.book(people)) {
                    JOptionPane.showMessageDialog(this, "Booked! Total: " + t.calculatePrice() * people);
                    showTours();
                } else {
                    JOptionPane.showMessageDialog(this, "Not enough seats");
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "People must be a number");
            }
        } else if (e.getActionCommand().equals("Back to Main Page")) {
            dispose();
        }
    }

    public static void main(String[] args) {
        new BookingPage();
    }
}