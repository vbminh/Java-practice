package Basic;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;

public class SwingJLabel{
	private JFrame fr;
	private JLabel headerLabel;
	private JLabel statusLabel;
	private JPanel jp;

	private void prepareGUI() {
		fr = new JFrame("Hi! I'm Vu Binh Minh");
		fr.setSize(600,400);
		fr.setLayout(new GridLayout(3,2));
		fr.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});
		
		headerLabel = new JLabel("",JLabel.CENTER);
		statusLabel = new JLabel("",JLabel.CENTER);
		statusLabel.setSize(350,50);
		
		jp = new JPanel();
		jp.setLayout(new FlowLayout());
		
		fr.add(headerLabel);
		fr.add(statusLabel);
		fr.add(jp);
		fr.setVisible(true);
	}
	
	public SwingJLabel() {
		prepareGUI();
	}
	
	private void Demo() {
		headerLabel.setText("Control in action: JLable");
		statusLabel.setText("love u");
		JLabel label = new JLabel("",JLabel.CENTER);
		
		label.setText("My love is Nguyen Ha Trang");
		label.setOpaque(true);
		label.setBackground(Color.gray);
		label.setForeground(Color.white);
		
		jp.add(label);
		fr.setVisible(true);
	}
	
	public static void main(String[] args) {
		SwingJLabel SJ = new SwingJLabel();
		SJ.Demo();
	}
}
