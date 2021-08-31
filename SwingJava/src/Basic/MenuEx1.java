package Basic;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.*;

public class MenuEx1 extends JFrame {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuEx1 frame = new MenuEx1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public MenuEx1() {
		perpareGUI();
	}
	
	private void perpareGUI() {
		JMenuBar menubar = new JMenuBar();
		ImageIcon icon = new ImageIcon("exit.jpg");
		
		
		JMenu file = new JMenu("file");
		file.setMnemonic(KeyEvent.VK_F);
		
		
		JMenuItem exit = new JMenuItem("Exit",icon);
		exit.setMnemonic(KeyEvent.VK_E);
		exit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		file.add(exit);
		menubar.add(file);
		
		setJMenuBar(menubar);
		
		setTitle("Vi du menu");
		setSize(500,350);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
