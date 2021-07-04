package Array;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySort {
	private int[] x;
	private int n;
	
	public ArraySort() {
		
	}
	
	public ArraySort(int[] x, int n) {
		this.x = x;
		this.n = n;
	}
	
	public void setX(int[] x) {
		this.x = x;
	}
	
	public void setN(int n) {
		this.n = n;
	}
	
	public int[] getX() {
		return x;
	}
	
	public int getN() {
		return n;
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap so phan tu mang: ");
		n = sc.nextInt();
		System.out.println("Nhap mang:");
		x = new int[n];
		for(int i = 0; i < n; i++) {
			System.out.println("Nhap phan tu thu " + (i + 1));
			x[i] = sc.nextInt();
		}
	}
	
	public void xuat() {
		System.out.println("Mang sau khi da sap xep tang dan: ");
		Arrays.sort(x);
		for(int i = 0; i < n; i++) {
			System.out.print(x[i] +" ");
		}
	}
	
	public void search() {
		int y;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.print("\nNhap vi tri phan tu: ");
			y = sc.nextInt();
			if(y > n)
				System.out.println("\nVi tri khong hop le! ");
		} while(y > n);
		System.out.println("\nPhan tu o vi tri thu " + y + " co gia tri la: " + x[y - 1]);
	}
	
	public static void main(String[] args) {
		ArraySort arr = new ArraySort();
		
		arr.nhap();
		arr.xuat();
		arr.search();
	}
}
