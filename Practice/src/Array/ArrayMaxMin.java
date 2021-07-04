package Array;

import java.util.Scanner;

public class ArrayMaxMin {
	private int[] x;
	private int n;
	
	public ArrayMaxMin() {
		
	}
	
	public ArrayMaxMin(int[] x, int n) {
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
	
	public void MaxMin() {
		int max = x[0];
		int min = x[0];
		
		for(int i = 0; i < n; i++) {
			if(x[i] > max) max = x[i];
			if(x[i] < min) min = x[i];
		}
		
		System.out.println("\nPhan tu lon nhat cua mang la: " + max);
		System.out.println("Phan tu nho nhat cua mang la: " + min);
	}
	public static void main(String[] args) {
		ArrayMaxMin arr = new ArrayMaxMin();
		
		arr.nhap();
		arr.xuat();
		arr.MaxMin();
	}

}
