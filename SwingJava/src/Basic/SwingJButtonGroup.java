package Basic;

import java.awt.*;
import java.awt.event.ActionListener;

import javax.swing.*;

public class SwingJButtonGroup extends JFrame implements ActionListener {
	JLabel title;
	JLabel status;
	JRadioButton rb1, rb2, rb3;
	JButton b;

	public static void main(String[] args) {
		new SwingJButtonGroup();
	}

	
	public SwingJButtonGroup() {
		title = new JLabel("");
		title.setText("1 + 1 = ?");
		title.setFont(new Font("Arial", Font.BOLD, 25));
		title.setForeground(Color.red);
		title.setBounds(200,50,200,30);
		
		status = new JLabel("");
		status.setText("Choose answer: ");
		status.setFont(new Font("Arial", Font.ITALIC, 20));
		status.setBounds(200,100,300,30);
		
		rb1 = new JRadioButton("2");
		rb1.setBounds(200,150,100,30);
		
		rb2 = new JRadioButton("0");
		rb2.setBounds(200,200,100,30);
		
		rb3 = new JRadioButton("3");
		rb3.setBounds(200,250,100,30);
		
		ButtonGroup br = new ButtonGroup();
		br.add(rb1);
		br.add(rb2);
		br.add(rb3);
		
		b = new JButton("Submit");
		b.setBounds(200,300,100,30);
		b.addActionListener(this);
		
		add(rb1);
		add(rb2);
		add(rb3);
		add(b);
		
		setTitle("ButtonGroup");
		setSize(700,500);
		setLayout(null);
		setVisible(true);
	}
	
	public void actionPerformed(ActiveEvent e) {
		if(rb1.isSelected()) 
			JOptionPane.showMessageDialog(this, "Your answer is true");
		if(rb2.isSelected())
			JOptionPane.showMessageDialog(this, "Your answer is not true");
		if(rb3.isSelected())
			JOptionPane.showMessageDialog(this, "Your answer is fail");
	}
}
