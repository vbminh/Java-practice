package Array;

import java.util.*;

public class ArrayAdd {
	private int[] x;
	private int[] y;
	private int n;
	private int m;
	
	public ArrayAdd() {
		
	}
	
	public ArrayAdd(int[] x, int[] y, int n, int m) {
		this.x = x;
		this.y = y;
		this.n = n;
		this.m = m;
	}
	
	public void setX(int[] x) {
		this.x = x;
	}
	
	public void setY(int[] y) {
		this.y = y;
	}
	
	public void setN(int n) {
		this.n = n;
	}
	
	public void setM(int m) {
		this.m = m;
	}
	
	public int[] getX() {
		return x;
	}
	
	public int[] getY() {
		return y;
	}
	
	public int getN() {
		return n;
	}
	
	public int getM() {
		return m;
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap so phan tu cua mang thu nhat: ");
		m = sc.nextInt();
		
		x = new int[m];
		System.out.println("Nhap mang");
		for(int i = 0; i < m; i++) {
			System.out.print("Nhap phan tu thu " + (i + 1) + ": ");
			x[i] = sc.nextInt();
		}
		
		System.out.print("\nNhap so phan tu cua mang thu hai: ");
		n = sc.nextInt();
		y = new int[n];
		for(int i = 0; i < n; i++) {
			System.out.print("Nhap phan tu thu " + (i + 1) + ": ");
			y[i] = sc.nextInt();
		}
	}
	
	public void xuat() {
		System.out.println("\nMang thu nhat: ");
		for(int i = 0; i < m; i++)
			System.out.print(x[i] + " ");
		
		System.out.println("\nMang thu hai: ");
		for(int i = 0; i < n; i++)
			System.out.print(y[i] + " ");
	}
	
	public void add() {
		int len = m + n;
		
		int[] newarr = new int[len];
		System.arraycopy(x, 0, newarr, 0, m);
		System.arraycopy(y, 0, newarr, m, n);
		
		System.out.println("\nMang moi sau khi ghep hai mang: ");
		for(int i = 0; i < len; i++)
			System.out.print(newarr[i] + " ");
	}
	
	public static void main(String[] args) {
		ArrayAdd arr = new ArrayAdd();
		
		arr.nhap();
		arr.xuat();
		arr.add();
	}

}
