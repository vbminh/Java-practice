package Basic;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class StartEx3 extends JFrame {

	private JFrame fr;
	private JPanel pn;

	
	public static void main(String[] args) {
		StartEx3 st = new StartEx3();
		st.demo();
	}

	
	public StartEx3() {
		prepareGUI();
	}
	
	private void prepareGUI() {
		fr = new JFrame();
		fr.setSize(500,350);
		fr.setTitle("Vi du 3");
		fr.setLayout(new GridLayout(3,1));
		fr.setLocationRelativeTo(null);
		fr.setDefaultCloseOperation(EXIT_ON_CLOSE);
		fr.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});
		
		pn = new JPanel();
		pn.setLayout(new FlowLayout());
		pn.setToolTipText("Content Panel");
		
		fr.add(pn);
		fr.setVisible(true);
	}
	
	private void demo() {
		JLabel lb = new JLabel("",JLabel.CENTER);
		
		JButton b = new JButton("Click here");
		b.setSize(50, 30);
		b.setToolTipText("button tooltip");
		
		b.setMnemonic(KeyEvent.VK_F1);
		b.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				lb.setText("Button is " + (e.getStateChange() == 1? "clicked" : " not clicked"));
				
			}
		});
		
		pn.add(b);
		fr.add(lb);
		fr.setVisible(true);
	}

}
