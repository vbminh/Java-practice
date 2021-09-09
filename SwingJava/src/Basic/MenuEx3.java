package Basic;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.security.KeyStore;

import javax.swing.*;

public class MenuEx3 extends JFrame {
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuEx3 frame = new MenuEx3();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public MenuEx3() {
		prepareGUI();
	}

	private void prepareGUI() {
		JMenuBar menubar = new JMenuBar();
		
		JMenu file = new JMenu("file");
		
		JMenuItem New = new JMenuItem("New");
		New.setMnemonic(KeyEvent.VK_N);
		
		JMenuItem Open = new JMenuItem("Open file...");
		Open.setMnemonic(KeyEvent.VK_O);
		
		JMenu Save = new JMenu("Save");
		
		JMenuItem Savef = new JMenuItem("Save file");
		Savef.setMnemonic(KeyEvent.VK_S);
		
		JMenuItem Saveas = new JMenuItem("Save as...");
		Saveas.setMnemonic(KeyEvent.VK_SPACE);
		
		Save.add(Savef);
		Save.add(Saveas);
		
		JMenuItem Exit = new JMenuItem("Exit");
		Exit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E, ActionEvent.CTRL_MASK));
		Exit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
		});
		
		file.add(New);
		file.add(Open);
		file.add(Save);
		file.add(Exit);
		
		menubar.add(file);
		setJMenuBar(menubar);
		
		setTitle("Practice");
		setSize(500,350);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
}
