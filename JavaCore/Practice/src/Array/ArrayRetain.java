package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayRetain {
	private ArrayList<Integer> x = new ArrayList<>();
	private ArrayList<Integer> y = new ArrayList<>();
	private int n;
	private int m;
	
	public ArrayRetain() {
		
	}
	
	public ArrayRetain(ArrayList<Integer> x,ArrayList<Integer> y,int n, int m) {
		this.x = x;
		this.y = y;
		this.n = n;
		this.m = m;
	}
	
	public void setX(ArrayList<Integer> x) {
		this.x = x;
	}
	
	public void setY(ArrayList<Integer> y) {
		this.y = y;
	}
	
	public void setN(int n) {
		this.n = n;
	}
	
	public void setM(int m) {
		this.m = m;
	}
	
	public ArrayList<Integer> getX() {
		return x;
	}
	
	public ArrayList<Integer> getY() {
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
		for(int i = 0; i < m; i++) {
			System.out.print("Nhap phan tu thu " + (i + 1) + ": ");
			int tmp = sc.nextInt();
			x.add(tmp);
		}
		
		System.out.print("\nNhap so phan tu cua mang thu hai: ");
		n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			System.out.print("Nhap phan tu thu " + (i + 1) + ": ");
			int tmp = sc.nextInt();
			y.add(tmp);
		}
	}
	
	public void xuat() {
		System.out.print("\nMang vua nhap: \nArray 1: ");
		for(int i = 0; i < m; i++)
			System.out.print(x.get(i) + " ");
		
		System.out.print("\nArray 2: ");
		for(int i = 0; i < n; i++)
			System.out.print(y.get(i) + " ");
	}
	
	public void Similar() {
		x.retainAll(y);
		System.out.print("\nPhan tu giong nhau cua hai mang la: " + x);
	}
	
	public static void main(String[] args) {
		ArrayRetain arr = new ArrayRetain();
		
		arr.nhap();
		arr.xuat();
		arr.Similar();

	}

}
