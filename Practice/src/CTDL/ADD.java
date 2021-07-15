package CTDL;

import java.util.LinkedList;
import java.util.Scanner;

public class ADD {

	public static void main(String[] args) {
		LinkedList<Integer> arr = new LinkedList<>();
		int n;
		
		System.out.println("Nhap danh sach so nguyen");
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nhap so phan tu: ");
		n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			System.out.print("Nhap phan tu thu " + (i + 1) + ": ");
			int temp = sc.nextInt();
			arr.add(temp);
		}
		
		System.out.println("\nDanh sach vua nhap: " + arr);
		
		System.out.println("\nNhap phan tu them vao vi tri dau tien: ");
		int a = sc.nextInt();
		System.out.println("Nhap phan tu them vao vi tri cuoi cung: ");
		int b = sc.nextInt();
		
		arr.addFirst(a);
		arr.addLast(b);
		System.out.print("\nDanh sach sau khi them: " + arr);
	}

}
