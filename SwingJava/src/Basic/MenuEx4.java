package Basic;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;

import javax.swing.*;

public class MenuEx4 extends JFrame {

	private JLabel Status;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuEx4 frame = new MenuEx4();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MenuEx4() {
		prepareGUI();
	}
	
	private void prepareGUI() {
		Status = new JLabel("Vu Binh Minh",JLabel.CENTER);
		Status.setBorder(BorderFactory.createEtchedBorder());
		add(Status,BorderLayout.SOUTH);
		
		JMenuBar menubar = new JMenuBar();
		
		JMenu file = new JMenu("File");
		file.setMnemonic(KeyEvent.VK_F);
		JMenu view = new JMenu("View");
		view.setMnemonic(KeyEvent.VK_V);
		
		JMenuItem New = new JMenuItem("New");
		New.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N,ActionEvent.CTRL_MASK));
		
		JMenuItem Open = new JMenuItem("Open");
		Open.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, ActionEvent.CTRL_MASK));
		
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
		file.add(Exit);
		
		JCheckBoxMenuItem checkbox = new JCheckBoxMenuItem("Name");
		checkbox.setSelected(true);
		checkbox.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				Status.setVisible(e.getStateChange() == ItemEvent.SELECTED);
				
			}
		});
		
		view.add(checkbox);
		
		menubar.add(file);
		menubar.add(view);
		setJMenuBar(menubar);
		
		setTitle("Vi du check box");
		setSize(500,350);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

}
