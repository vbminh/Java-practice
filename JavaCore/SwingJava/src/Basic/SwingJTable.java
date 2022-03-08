package Basic;

import java.util.Scanner;

import javax.swing.*;

public class SwingJTable {

	private JFrame fr;

	
	public static void main(String[] args) {
		new SwingJTable();
	}

	public SwingJTable() {
		fr = new JFrame();
		int m, n;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("\nNhap so cot: ");
		m = sc.nextInt();
		System.out.print("Nhap so dong: ");
		n = sc.nextInt();
		
		String[][] data = new String[n][m];
		String[] column = new String[m];
		
		sc.nextLine();
		for(int i = 0; i < m; i++) {
			System.out.println("Nhap ten cot thu " + (i + 1) + ": ");
			column[i] = sc.nextLine();
		}
		
		
		for(int i = 0; i < n; i++) {
			System.out.println("Nhap dong du lieu thu " + (i + 1) + ": ");
			for(int j = 0; j < m; j++) {
				System.out.println("Nhap cot thu " + (j + 1) + ": ");
				data[i][j] = sc.nextLine();
			}
		}
		
		JTable JT = new JTable(data, column);
		JT.setBounds(30,40,200,300);
		
		JScrollPane sp = new JScrollPane(JT);
		
		fr.add(sp);
		fr.setSize(500,300);
		fr.setVisible(true);
	}

}
