package com.company;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SimpleGUI extends JFrame {
    private JButton button = new JButton("Press");
    private JTextField input = new JTextField("", 5);
    private JLabel label = new JLabel("Input:");
    private JRadioButton radio1 = new JRadioButton("Select this");
    private JRadioButton radio2 = new JRadioButton("Select that");
    private JCheckBox check = new JCheckBox("Check", false);

    public SimpleGUI () {
        super("Simple Example");
        this.setBounds(100, 100, 250, 100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container conteiner = this.getContentPane();
        conteiner.setLayout(new GridLayout(3, 2, 2, 2));
        conteiner.add(label);
        conteiner.add(input);

        ButtonGroup group = new ButtonGroup();
        group.add(radio1);
        group.add(radio2);
        conteiner.add(radio1);
        radio1.setSelected(true);
        conteiner.add(radio2);
        conteiner.add(check);
        button.addActionListener(new ButtonEventListener ());
        conteiner.add(button);

    }

    class ButtonEventListener implements ActionListener {
        public void actionPerformed (ActionEvent e) {
            String message = "";
            message += "Text is " + input.getText() + "\n";
            message += (radio1.isSelected() ? "Radio #1" : "Radio #2") + " is selected!\n";
            message += "Checkbox is " + ((check.isSelected()) ? "checked" : "unchecked");
            JOptionPane.showMessageDialog(null, message, "Output", JOptionPane.PLAIN_MESSAGE);
        }
    }
}
