package project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SearchPage extends JFrame implements ActionListener {
    private JTextField priceTxt, nameTxt;
    private JTextArea searchResults;
    private JButton searchBtn, backMainBtn;

    public SearchPage() {
        super("Tour Manager System");
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        setSize(500, 500);

        JLabel titleLabel = new JLabel("Tour Search", SwingConstants.CENTER);
        titleLabel.setForeground(Color.BLUE);
        titleLabel.setFont(new Font("", Font.BOLD, 20));

        priceTxt = new JTextField(30);
        nameTxt = new JTextField(30);
        searchResults = new JTextArea(10, 50);

        searchBtn = new JButton("Search");
        searchBtn.addActionListener(this);
        backMainBtn = new JButton("Back to Main Page");
        backMainBtn.addActionListener(this);

        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(2, 2));
        inputPanel.add(new JLabel("Price <="));
        inputPanel.add(priceTxt);
        inputPanel.add(new JLabel("Name contains:"));
        inputPanel.add(nameTxt);

        JPanel btnPanel = new JPanel();
        btnPanel.add(searchBtn);
        btnPanel.add(backMainBtn);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 1));
        panel.add(inputPanel);
        panel.add(btnPanel);
        panel.add(searchResults);

        this.add(titleLabel, BorderLayout.NORTH);
        this.add(panel, BorderLayout.CENTER);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Search")) {
            try {
                searchResults.setText("Results:\n");
                for (Tour t : Database.manager.getTours()) {
                    boolean ok = true;
                    if (!priceTxt.getText().isEmpty()
                            && t.calculatePrice() > Double.parseDouble(priceTxt.getText()))
                        ok = false;
                    if (!nameTxt.getText().isEmpty()&& !t.getName().toLowerCase().contains(nameTxt.getText().toLowerCase()))
                        ok = false;
                    if (ok)
                        searchResults.append(t.getInfo() + "\n");
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Price must be a number.");
            }
        } else if (e.getActionCommand().equals("Back to Main Page")) {
            dispose();
        }
    }

    public static void main(String[] args) {
        new SearchPage();
    }
}