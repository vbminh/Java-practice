package Basic;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.*;

public class SwingJButton {

	private JFrame fr;
	private JLabel headerLabel;
	private JLabel statusLabel;
	private JPanel jp;
	
	public SwingJButton() {
		prepareGUI();
	}
	
	private void prepareGUI() {
		fr = new JFrame("Create Button");
		fr.setSize(500,350);
		fr.setLayout(new GridLayout(3,1));
		fr.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});
		
		headerLabel = new JLabel("",JLabel.CENTER);
		statusLabel = new JLabel("",JLabel.CENTER);
		statusLabel.setSize(400,200);
		
		jp = new JPanel();
		jp.setLayout(new FlowLayout());
		
		fr.add(headerLabel);
		fr.add(statusLabel);
		fr.add(jp);
		fr.setVisible(true);
	}
	
	private void Demo() {
		headerLabel.setText("BUTTON");
		
		JButton Submit = new JButton("Submit");
		JButton Cancel = new JButton("Cancel");
		Cancel.setHorizontalTextPosition(SwingConstants.LEFT);
		Submit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				statusLabel.setText("Submit button is clicked");
				
			}
		});
		
		Cancel.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				statusLabel.setText("Cancel button is clicked");	
			}
		});
		
		jp.add(Submit);
		jp.add(Cancel);
		fr.setVisible(true);
	}
	public static void main(String[] args) {
		SwingJButton button = new SwingJButton();
		button.Demo();
	}
	

}
