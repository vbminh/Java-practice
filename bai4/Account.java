package bai4;

import java.util.*;

public class Account {
	private long STK;
	private String Tentk;
	private double Sotien;
	
	public Account() {
		
	}
	
	public Account(long STK,String Tentk,double Sotien) {
		this.STK = STK;
		this.Tentk = Tentk;
		this.Sotien = Sotien;
	}
	
	public void setSTK(long STK) {
		this.STK = STK;
	}
	
	public void setTentk(String Tentk) {
		this.Tentk = Tentk;
	}
	
	public void setSotien(double Sotien) {
		this.Sotien = Sotien;
	}
	
	public long getSTK() {
		return STK;
	}
	
	public String getTentk() {
		return Tentk;
	}
	
	public double getSotien() {
		return Sotien;
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap so tai khoan: ");
		this.STK = sc.nextLong();
		sc.nextLine();
		System.out.print("Nhap ten tai khoan: ");
		this.Tentk = sc.nextLine();
		System.out.print("Nhap so tien hien co: ");
		this.Sotien = sc.nextDouble();
	}
	
	public double Naptien() {
		double tiennap;
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap so tien muon nap: ");
		do {
			tiennap = sc.nextDouble();
			if(tiennap < 0)
				System.out.println("\nSo tien nhap khong dung. Moi nhap lai: ");
			else {
				Sotien = Sotien + tiennap;
				System.out.println("\nBan vua nap " + tiennap + " vao tai khoan. So du: " + Sotien);
			}
		}while(tiennap < 0);
		return Sotien;
	}
	
	public double Ruttien() {
		double tienrut;
		double phi = 5;
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap so tien muon rut: ");
		do {
			tienrut = sc.nextDouble();
			if(tienrut > this.Sotien)
				System.out.println("\nSo du tai khoan khong du. Moi nhap lai: ");
			else {
				this.Sotien = Sotien - tienrut - phi;
				System.out.println("\nBan vua rut thanh cong " + tienrut + ". So du: " + Sotien);
			}
		}while(tienrut > this.Sotien);
		return Sotien;
	}
	
	public double Daohan() {
		double laisuat = 0.035;
		this.Sotien = Sotien + Sotien*laisuat;
		System.out.println("\nBan vua duoc " + this.Sotien + " dao han 1 thang.");
		return Sotien;
	}
	
	public void Chuyentien() {
		
		Scanner sc = new Scanner(System.in);
		
		
		
	}
	
	public void xuat() {
		System.out.printf("\n%15s %15s %10s",this.STK,this.Tentk,this.Sotien);
	}
}
