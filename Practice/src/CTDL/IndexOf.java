package CTDL;

import java.util.LinkedList;
import java.util.Scanner;

public class IndexOf {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		int n;
		int index;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("\t\tNhap danh sach so nguyen");
		System.out.print("Nhap so luong phan tu: ");
		n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			System.out.print("Nhap phan tu thu " + (i + 1) + ": ");
			int tmp = sc.nextInt();
			list.add(tmp);
		}
		
		System.out.println("\n\t\tTim kiem phan tu");
		System.out.print("\nNhap phan tu muon tim kiem: ");
		index = sc.nextInt();
		
		System.out.println("\nPhan tu " + index + " xuat hien lan dau tien tai vi tri " + list.indexOf(index));
		System.out.println("\nPhan tu " + index + " xuat hien lan cuoi cung tai vi tri " + list.lastIndexOf(index));

	}

}
