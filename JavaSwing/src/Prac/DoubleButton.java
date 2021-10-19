package Prac;

import java.awt.Component;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.KeyStroke;
import javax.swing.border.EmptyBorder;

public class DoubleButton extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DoubleButton frame = new DoubleButton();
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
	public DoubleButton() {
		prepareGUI();
	}
	
	public void prepareGUI() {
		JMenuBar menubar = new JMenuBar();
		
		JMenu File = new JMenu("File");
		
		JMenuItem New = new JMenuItem("New");
		New.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, ActionEvent.CTRL_MASK));
		
		JMenuItem Open = new JMenuItem("Open");
		Open.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, ActionEvent.CTRL_MASK));
		
		JMenu Save = new JMenu("Save");
		Save.setMnemonic(KeyEvent.VK_S);
		
		JMenuItem save = new JMenuItem("Save...");
		
		JMenuItem saveas = new JMenuItem("Save as");
		
		Save.add(save);
		Save.add(saveas);
		
		JMenuItem Close = new JMenuItem("Close");
		Close.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E, ActionEvent.CTRL_MASK));
		Close.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
		});
		
		File.add(New);
		File.add(Open);
		File.add(Save);
		File.add(Close);
		
		JMenu View = new JMenu("View");
		JLabel status = new JLabel("Do you want marry me?");
		status.setBorder(new EmptyBorder(50, 200, 0, 100));
		
		JCheckBox showstt = new JCheckBox("Show status");
		showstt.setSelected(true);
		showstt.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				status.setVisible(e.getStateChange() == ItemEvent.SELECTED);
			}
			
		});
		
		View.add(showstt);
		
		menubar.add(File);
		menubar.add(View);
		setJMenuBar(menubar);
		
		JPanel content = new JPanel();
		content.setLayout(new BoxLayout(content,BoxLayout.Y_AXIS));
		getContentPane().add(content);
		
		content.add(Box.createVerticalGlue());
		
		JPanel nav = new JPanel();
		nav.setAlignmentX(Component.RIGHT_ALIGNMENT);
		nav.setLayout(new BoxLayout(nav,BoxLayout.X_AXIS));
		
		JButton Ok = new JButton("Ok");
		Ok.setAlignmentX(Component.RIGHT_ALIGNMENT);
		Ok.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				status.setText("I'm really happy");
			}
		});
		
		nav.add(Ok);
		
		Ok.add(Box.createRigidArea(new Dimension(34, 12)));
		
		JButton No = new JButton("No");
		No.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				status.setText("I'm very sad");
			}
		});
		
		nav.add(No);
		
		No.add(Box.createRigidArea(new Dimension(37, 12)));
		
		
		
		
		getContentPane().add(status,BorderLayout.NORTH);
		content.add(nav);
		content.add(Box.createRigidArea(new Dimension(0,15)));
		
		
		setTitle("Demo double button");
		setSize(500,350);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);		
	}

}
