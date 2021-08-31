package Basic;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.*;

public class MenuEx2 extends JFrame {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuEx2 frame = new MenuEx2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public MenuEx2() {
		prepareGUI();
	}

	private void prepareGUI() {
		JMenuBar menubar = new JMenuBar();
		
		JMenu file = new JMenu("file");
		JMenuItem newfile = new JMenuItem("New");
		newfile.setMnemonic(KeyEvent.VK_N);
		
		JMenuItem open = new JMenuItem("Open file...");
		open.setMnemonic(KeyEvent.VK_O);
		
		JMenu save = new JMenu("Save");
		JMenuItem savefile = new JMenuItem("Save");
		JMenuItem saveas = new JMenuItem("Save as...");
		savefile.setMnemonic(KeyEvent.VK_V);
		saveas.setMnemonic(KeyEvent.VK_0);
		
		save.add(savefile);
		save.add(saveas);
		
		JMenuItem exit = new JMenuItem("Exit");
		exit.setMnemonic(KeyEvent.VK_E);
		exit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
		});
		
		file.add(newfile);
		file.add(open);
		file.add(save);
		file.add(exit);
		menubar.add(file);
		setJMenuBar(menubar);
		
		setTitle("Vi du menu con");
		setSize(500, 350);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
