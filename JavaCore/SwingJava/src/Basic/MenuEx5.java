package Basic;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.*;

public class MenuEx5 extends JFrame {

	private JPopupMenu popup;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuEx5 frame = new MenuEx5();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public MenuEx5() {
		prepareGUI();
	}
	
	private void prepareGUI() {
		popup = new JPopupMenu();
		
		JMenuItem maxItem = new JMenuItem("Maximize");
		maxItem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(getExtendedState() != JFrame.MAXIMIZED_BOTH)
					setExtendedState(Frame.MAXIMIZED_BOTH);
				
			}
		});
		
		popup.add(maxItem);
		
		JMenuItem nomal = new JMenuItem("Nomal");
		nomal.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(getExtendedState() != JFrame.NORMAL)
					setExtendedState(Frame.NORMAL);
			}
		});
		
		popup.add(nomal);
		
		JMenuItem quit = new JMenuItem("Quit");
		quit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
		});
		
		popup.add(quit);
		
		addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				if(e.getButton() == MouseEvent.BUTTON3) {
					popup.show(e.getComponent(),e.getX(),e.getY());
				}
			}
		});
		
		setTitle("Vi du popupMenu");
		setSize(500,350);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
