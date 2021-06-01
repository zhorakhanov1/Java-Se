package com.company.GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {
    private JLabel label;
    private JTextField textField;
    private JButton button;
    private JComboBox agesbox;
    private Integer[] ages = new Integer[100];

    public MainFrame() throws HeadlessException {
        setTitle("Alisher's Application");
        setSize(800,800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        for(Integer i =0;i<100;i++){
            ages[i]= i;
        }

        label = new JLabel("Name:");
        label.setLocation(170, 140);
        label.setSize(70, 30);
        add(label);

        textField = new JTextField();
        textField.setLocation(310,140);
        textField.setSize(200,30);
        add(textField);

        label = new JLabel("Phone:");
        label.setLocation(170, 180);
        label.setSize(70, 30);
        add(label);

        JTextField textField1 = new JTextField();
        textField1.setLocation(310,180);
        textField1.setSize(200,30);
        add(textField1);

        label = new JLabel("Age:");
        label.setLocation(170, 220);
        label.setSize(70, 30);
        add(label);

        agesbox = new JComboBox(ages);
        agesbox.setSize(200,30);
        agesbox.setLocation(310,220);
        add(agesbox);

        button = new JButton("Confirm");
        button.setSize(340,30);
        button.setLocation(170,260);
        add(button);

        JTextArea area = new JTextArea();
        area.setSize(340, 200);
        area.setLocation(170, 300);
        area.setEditable(false);
        add(area);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = textField.getText();
                String a = textField1.getText();
                Integer age = (Integer) agesbox.getSelectedItem();
                if(!text.equals("")){
                    area.append(text + " - " + a + " - " + age + " years\n");
                    textField.setText("");
                    textField1.setText("");
                    agesbox.setSelectedItem(0);
                }
            }
        });
        add(button);

    }
}
