package CTDL;

import java.util.LinkedList;
import java.util.Scanner;

public class Index {

	public static void main(String[] args) {
		LinkedList<Integer> arr = new LinkedList<>();
		int n;
		
		System.out.println("Nhap danh sach");
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nhap so luong phan tu: ");
		n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			System.out.print("Nhap phan tu thu " + (i+1) + ": ");
			int tmp = sc.nextInt();
			arr.add(tmp);
		}
		
		System.out.println("\nPhan tu dau tien cua danh sach la: " + arr.getFirst());
		System.out.println("\nPhan tu cuoi cung cua danh sach la: " + arr.getLast());
		
	}

}
