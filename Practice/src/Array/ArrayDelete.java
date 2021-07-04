package Array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDelete {
	private int[] x;
	private int n;
	
	public ArrayDelete() {
		
	}
	
	public ArrayDelete(int[] x, int n) {
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
		System.out.println("\nMang vua nhap");
		for(int i = 0; i < n; i++)
			System.out.print(x[i] + " ");
	}
	
	public void delete() {
		int pos;
		Scanner sc = new Scanner(System.in);
		System.out.print("\nNhap vi tri can xoa: ");
		pos = sc.nextInt();
		for(int i = pos - 1; i < n - 1; i++) {
			x[i] = x[i+1];
		}
		
		int[] newarr = new int[n-1];
		System.arraycopy(x, 0, newarr, 0, n-1);
		
		System.out.println("Mang sau khi xoa phan tu thu " + pos + ": ");
		for(int i = 0; i < n - 1; i++) {
			System.out.print(newarr[i] + " ");
		}
	}
	public static void main(String[] args) {
		ArrayDelete arr = new ArrayDelete();
		
		arr.nhap();
		arr.xuat();
		arr.delete();
	}

}
