package Basic;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class SwingJButtonGroup extends JFrame implements ActionListener {
    JRadioButton rb1, rb2, rb3;
    JButton b;
 
    public SwingJButtonGroup() {
    	JLabel label = new JLabel("",JLabel.CENTER);
    	label.setText("1 + 1 = ?");
    	label.setBounds(100,50,100,30);
    	label.setForeground(Color.red);
    	label.setFont(new Font("Arial", Font.BOLD, 20));
 
        rb1 = new JRadioButton("3");
        rb1.setBounds(100, 100, 100, 30);
 
        rb2 = new JRadioButton("2");
        rb2.setBounds(100, 150, 100, 30);
        
        rb3 = new JRadioButton("0");
        rb3.setBounds(100, 200, 100, 30);
 
        ButtonGroup bg = new ButtonGroup();
        bg.add(rb1);
        bg.add(rb2);
        bg.add(rb3);
 
        b = new JButton("click");
        b.setBounds(100, 250, 80, 30);
        b.addActionListener(this);
        
        add(label);
        add(rb1);
        add(rb2);
        add(rb3);
        add(b);
 
        setTitle("Vi du JRadioButton trong Java Swing");
        setSize(500, 350);
        setLayout(null);
        setLocationRelativeTo(label);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
 
    public void actionPerformed(ActionEvent e) {
        if (rb1.isSelected()) {
            JOptionPane.showMessageDialog(this, "Ket qua sai");
        }
        if (rb2.isSelected()) {
            JOptionPane.showMessageDialog(this, "Ket qua dung");
        }
        if (rb3.isSelected()) {
            JOptionPane.showMessageDialog(this, "Ket qua sai");
        }
    }
 
    public static void main(String args[]) {
        new SwingJButtonGroup();
    }
}