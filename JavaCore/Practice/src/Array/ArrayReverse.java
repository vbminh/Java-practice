package Array;

import java.util.*;

public class ArrayReverse {
	private ArrayList<Integer> x = new ArrayList<>();
	private int n;
	
	public ArrayReverse() {
		
	}
	
	public ArrayReverse(ArrayList<Integer> x, int n) {
		this.x = x;
		this.n = n;
	}
	
	public void setX(ArrayList<Integer> x) {
		this.x = x;
	}
	
	public void setN(int n) {
		this.n = n;
	}
	
	public ArrayList<Integer> getX() {
		return x;
	}
	
	public int getN() {
		return n;
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap so phan tu mang: ");
		n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			System.out.print("Nhap phan tu thu " + (i + 1) + ": ");
			int tmp = sc.nextInt();
			x.add(tmp);
		}
	}
	
	public void Reverse() {
		System.out.println("\nMang vua nhap: ");
		for(int i = 0; i < n; i++)
			System.out.print(x.get(i) + " ");
		
		Collections.reverse(x);
		System.out.println("\nMang sau khi dao nguoc: ");
		for(int i = 0; i < n; i++)
			System.out.print(x.get(i) + " ");
		
	}
	public static void main(String[] args) {
		ArrayReverse arr = new ArrayReverse();
		
		arr.nhap();
		arr.Reverse();

	}

}
