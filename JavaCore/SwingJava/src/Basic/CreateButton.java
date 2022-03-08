package Basic;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class CreateButton extends JFrame {

	private JFrame f;
	
	public static void main(String[] args) {
		new CreateButton();
	}

	public CreateButton() {
		JButton b = new JButton("Click");
		
		b.setBounds(80,70,100,40);
		add(b);
		setSize(300,200);
		setLayout(null);
		setVisible(true);
	}

}
