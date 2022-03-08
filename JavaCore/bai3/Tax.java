package bai3;

import java.util.*;

public class Tax {
	private ArrayList<Vehicle> x = new ArrayList<>();
	private int n;
	
	public Tax() {
		
	}
	
	public Tax(ArrayList<Vehicle> x, int n) {
		this.x = x;
		this.n = n;
	}
	
	public void setX(ArrayList<Vehicle> x) {
		this.x = x;
	}
	
	public void setN(int n) {
		this.n = n;
	}
	
	public ArrayList<Vehicle> getX() {
		return x;
	}
	
	public int getN() {
		return n;
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap so xe: ");
		this.n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			Vehicle temp = new Vehicle();
			System.out.println("Nhap thong tin xe thu " + i + 1);
			temp.nhap();
			x.add(temp);
		}
	}
	
	public void xuat() {
		System.out.println("\n\t======THUE MUA XE======");
		System.out.printf("\n%10s %20s %20s %10s %10s %10s","Ma xe","Ten xe","Chu xe","Gia Tri","Dung tich","Thue");
		for(Vehicle i : x)
			i.xuat();
		System.out.println("\nTong so xe: " + n);
	}
}
