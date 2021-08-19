package Basic;

import java.awt.Container;
import java.awt.EventQueue;

import javax.swing.*;

public class StartEx1 extends JFrame {

	private JFrame fr;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StartEx1 frame = new StartEx1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public StartEx1() {
		prepareGUI();
	}
	
	private void prepareGUI() {
		fr = new JFrame();
		setTitle("Vi du mo dau");
		setSize(500,350);
		setLocationRelativeTo(fr);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

}
