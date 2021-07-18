package CTDL;

import java.util.LinkedList;
import java.util.Scanner;

public final class ClearList {

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
		
		System.out.print("\nDanh sach vua nhap: " + list);
		
		System.out.println("\nXoa nhieu phan tu lien tiep trong danh sach");
		System.out.print("Vi tri bat dau: ");
		int x = sc.nextInt();
		System.out.print("Vi tri ket thuc: ");
		int y = sc.nextInt();
		
		list.subList(x, y).clear();
		
		System.out.print("\nDanh sach sau khi xoa: "  + list);
	}

}
