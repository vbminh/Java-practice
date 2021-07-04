package Array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayInsert {
	private int[] x;
	private int n;
	
	public ArrayInsert() {
		
	}
	
	public ArrayInsert(int[] x, int n) {
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
		x = new int[n];
		System.out.println("Nhap mang: ");
		for(int i = 0; i < n; i++) {
			System.out.print("Nhap phan tu thu " + (i + 1) + ": ");
			x[i] = sc.nextInt();
		}
	}
	
	public void xuat() {
		Arrays.sort(x);
		System.out.println("\nMang sau khi da sap xep tang dan la: ");
		for(int i = 0; i < n; i++)
			System.out.print(x[i] + " ");
	}
	
	public void insert() {
		int pos,ins;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.print("\nNhap vi tri chen: ");
			pos = sc.nextInt();
			if(pos < 0 || pos > n)
				System.out.println("Vi tri khong hop le");
		}while(pos < 0 || pos > n);
		
		System.out.print("Nhap gia tri: ");
		ins = sc.nextInt();
		
		int len = n + 1;
		int[] a = new int[len];
		System.arraycopy(x, 0, a, 0, n);
		for(int i = len - 1; i > pos - 1; i--)
			a[i] = a[i-1];
		a[pos-1] = ins;
		
		System.out.println("Mang sau khi chen them phan tu " + ins + " vao vi tri thu " + pos);
		for(int i = 0; i < len; i++)
			System.out.print(a[i] + " ");
	}
	public static void main(String[] args) {
		ArrayInsert arr = new ArrayInsert();
		
		arr.nhap();
		arr.xuat();
		arr.insert();

	}

}
