package bai2;

import java.util.*;

public class SinhVien {
	private ArrayList<Information> sv = new ArrayList<>();
	private int n;
	
	public SinhVien() {
		
	}
	
	public SinhVien(ArrayList<Information> sv,int n) {
		this.sv = sv;
		this.n = n;
	}
	
	public void setSv(ArrayList<Information> sv) {
		this.sv = sv;
	}
	
	public void setN(int n) {
		this.n = n;
	}
	
	public ArrayList<Information> getSv() {
		return sv;
	}
	
	public int getN() {
		return n;
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap so sv: ");
		this.n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			Information temp = new Information();
			System.out.println("Nhap thong tin sinh vien thu " + i + 1);
			temp.nhap();
			sv.add(temp);
		}
	}
	
	public void xuat() {
		System.out.println("\t---------BANG DIEM---------");
		System.out.printf("\n%10s %20s %10s %10s %10s","Ma sv","Ho ten","Diem LT","Diem TH","Diem TB");
		for(int i = 0; i < n; i++)
			sv.get(i).xuat();
		System.out.println("\nTong so sv: " + this.n);
	}
}
