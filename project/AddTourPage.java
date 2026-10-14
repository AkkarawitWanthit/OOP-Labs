package project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AddTourPage extends JFrame implements ActionListener {
    private JTextField idTxt, nameTxt, priceTxt, seatsTxt, visaTxt, transportTxt;
    private JCheckBox internationalBox;
    private JTextArea tourList;
    private JButton addBtn, backMainBtn;

    public AddTourPage() {
        super("Tour Manager System");
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        setSize(500, 500);

        JLabel titleLabel = new JLabel("Add Tour", SwingConstants.CENTER);
        titleLabel.setForeground(Color.BLUE);
        titleLabel.setFont(new Font("", Font.BOLD, 20));

        idTxt = new JTextField();
        nameTxt = new JTextField();
        priceTxt = new JTextField();
        seatsTxt = new JTextField();
        transportTxt = new JTextField();
        visaTxt = new JTextField();
        internationalBox = new JCheckBox();
        tourList = new JTextArea();

        addBtn = new JButton("Add Tour");
        addBtn.addActionListener(this);
        backMainBtn = new JButton("Back to Main Page");
        backMainBtn.addActionListener(this);

        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(7, 2));
        inputPanel.add(new JLabel("Tour ID"));
        inputPanel.add(idTxt);
        inputPanel.add(new JLabel("Name"));
        inputPanel.add(nameTxt);
        inputPanel.add(new JLabel("Price"));
        inputPanel.add(priceTxt);
        inputPanel.add(new JLabel("Seats"));
        inputPanel.add(seatsTxt);
        inputPanel.add(new JLabel("Transport"));
        inputPanel.add(transportTxt);
        inputPanel.add(new JLabel("Visa Fee"));
        inputPanel.add(visaTxt);
        inputPanel.add(new JLabel("Is international?"));
        inputPanel.add(internationalBox);

        JPanel btnPanel = new JPanel();
        btnPanel.add(addBtn);
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
        if (e.getActionCommand().equals("Add Tour")) {
            try {
                String id = idTxt.getText();
                String name = nameTxt.getText();
                double price = Double.parseDouble(priceTxt.getText());
                int seats = Integer.parseInt(seatsTxt.getText());
                String transport = transportTxt.getText();
                if (internationalBox.isSelected()) {
                    double visa = Double.parseDouble(visaTxt.getText());
                    Database.manager.addTour(new InternationalTour(id, name, price, seats, visa));
                } else {
                    Database.manager.addTour(new DomesticTour(id, name, price, seats, transport));
                }
                showTours();
                JOptionPane.showMessageDialog(this, "Added!");
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Price, seats and visa fee must be numbers");
            }
        } else if (e.getActionCommand().equals("Back to Main Page")) {
            dispose();
        }
    }

    public static void main(String[] args) {
        new AddTourPage();
    }
}