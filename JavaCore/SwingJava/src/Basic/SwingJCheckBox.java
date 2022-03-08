package Basic;

import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.*;

public class SwingJCheckBox {

	private JFrame fr;
	private JLabel hl;
	private JLabel sl;
	private JPanel pn;

	public static void main(String[] args) {
		SwingJCheckBox cb = new SwingJCheckBox();
		cb.demo();
	}

	
	public SwingJCheckBox() {
		prepareGUI();
	}
	
	public void prepareGUI() {
		fr = new JFrame("JCheckBox");
		fr.setSize(500,350);
		fr.setLayout(new GridLayout(4,1));
		fr.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});
		
		hl = new JLabel("",JLabel.CENTER);
		sl = new JLabel("",JLabel.CENTER);
		sl.setSize(300,50);
		
		pn = new JPanel();
		pn.setLayout(new FlowLayout());
		
		fr.add(hl);
		fr.add(sl);
		fr.add(pn);
		fr.setVisible(true);
	}
	
	private void demo() {
		hl.setText("Demo");
		hl.setFont(new Font("TimesRoman", Font.ITALIC, 20));
		sl.setText("What color is Banana?");
		sl.setForeground(Color.red);
		
		JLabel label = new JLabel("",JLabel.CENTER);
		
		final JCheckBox Re = new JCheckBox("Red");
		final JCheckBox Gr = new JCheckBox("Green");
		final JCheckBox Ye = new JCheckBox("Yellow");
		
		Re.setMnemonic(KeyEvent.VK_R);
		Gr.setMnemonic(KeyEvent.VK_G);
		Ye.setMnemonic(KeyEvent.VK_Y);
		
		Re.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				label.setText("Red checkbox: " + 
				(e.getStateChange() == 1? "Checked" : "Unchecked"));
			}
		});
		
		Gr.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				label.setText("Green checkbox: " + 
				(e.getStateChange() == 1? "Checked" : "Unchecked"));
			}
		});
		
		Ye.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				label.setText("Yellow checkbox: " + 
				(e.getStateChange() == 1? "Checked" : "Unchecked"));
			}
		});
		
		pn.add(Re);
		pn.add(Gr);
		pn.add(Ye);
		fr.add(label);
		fr.setVisible(true);
	}

}
