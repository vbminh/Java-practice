package Basic;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Scanner;

import javax.swing.*;

public class SwingJColorChoser {

	private JFrame fr;
	private JLabel hl;
	private JLabel sl;
	private JPanel pn;

	private void prepareGUI() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap ten Frame: ");
		String name = sc.nextLine();

		fr = new JFrame(name);
		fr.setSize(700,400);
		fr.setLayout(new GridLayout(3,1));
		fr.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});
		
		hl = new JLabel("",JLabel.CENTER);
		sl = new JLabel("",JLabel.CENTER);
		sl.setSize(600, 150);
		
		pn = new JPanel();
		pn.setLayout(new FlowLayout());
		
		fr.add(hl);
		fr.add(sl);
		fr.add(pn);
		fr.setVisible(true);
	}
	
	public SwingJColorChoser() {
		prepareGUI();
	}
	
	private void Demo() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap tieu de: ");
		String title = sc.nextLine();
		
		hl.setText(title);
		JButton b = new JButton("Choose color");
		b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Color bgrColor = JColorChooser.showDialog(fr, "Choose background color", Color.WHITE);
				
				if(bgrColor != null) {
					pn.setBackground(bgrColor);
					fr.getContentPane().setBackground(bgrColor);
				}
			}
		});
		
		pn.add(b);
		fr.setVisible(true);
		
	}
	public static void main(String[] args) {
		SwingJColorChoser cl = new SwingJColorChoser();
		cl.Demo();
	}

}
