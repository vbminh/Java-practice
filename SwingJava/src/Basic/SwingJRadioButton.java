package Basic;

import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.*;

public class SwingJRadioButton {

	private JFrame fr;
	private JLabel title;
	private JLabel status;
	private JPanel pn;

	public static void main(String[] args) {
		SwingJRadioButton rb = new SwingJRadioButton();
		rb.demo();
	}

	public SwingJRadioButton() {
		prepareGUI();
	}
	
	private void prepareGUI() {
		fr = new JFrame("JRadioButton");
		fr.setSize(500,350);
		fr.setLayout(new GridLayout(4,1));
		fr.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		title = new JLabel("",JLabel.CENTER);
		status = new JLabel("",JLabel.CENTER);
		
		pn = new JPanel();
		pn.setLayout(new FlowLayout());
		
		fr.add(title);
		fr.add(status);
		fr.add(pn);
		fr.setVisible(true);
	}
	
	private void demo() {
		title.setText("Demo");
		title.setFont(new Font("Arial", Font.PLAIN, 20));
		title.setForeground(Color.red);
		
		status.setText("Do you like watermelon?");
		status.setForeground(Color.blue);
		
		JLabel label = new JLabel("",JLabel.CENTER);
		
		JRadioButton Y = new JRadioButton("Yes, I do");
		JRadioButton N = new JRadioButton("No, I don't");
		Y.setMnemonic(KeyEvent.VK_Y);
		N.setMnemonic(KeyEvent.VK_N);
		
		Y.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				label.setText("\"Yes\" Button: " + 
				(e.getStateChange() == 1? "clicked" : "unclicked"));
			}
		});
		
		N.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				label.setText("\"No\" Button: "
				+ (e.getStateChange() == 1? "clicked" : "unclicked"));	
			}
		});
		
		pn.add(Y);
		pn.add(N);
		fr.add(label);
		fr.setVisible(true);
	}

}
