package CTDL;

import java.util.LinkedList;
import java.util.Scanner;

public class UpdateList {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		int n;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("\t\tNhap danh sach so nguyen");
		System.out.print("Nhap so luong phan tu: ");
		n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			System.out.print("Nhap phan tu thu " + (i + 1) + ": ");
			list.add(sc.nextInt());
		}
		
		System.out.println("\t\tUpdate");
		System.out.print("Nhap vi tri can update: ");
		int index = sc.nextInt();
		System.out.print("Nhap gia tri update: ");
		int value = sc.nextInt();
		
		list.add(index, value);
		
		System.out.print("\nDanh sach sau khi update: " + list);
	}

}
