package bai2;

import java.util.*;

public class Information {
	private int Masv;
	private String Hoten;
	private float DiemLT;
	private float DiemTH;
	
	public Information() {
	}
	
	public Information(int Masv,String Hoten,float DiemLT,float DiemTH) {
		this.Masv = Masv;
		this.Hoten = Hoten;
		this.DiemLT = DiemLT;
		this.DiemTH = DiemTH;
	}
	
	public void setMasv(int Masv) {
		this.Masv = Masv;
	}
	
	public void setHoten(String Hoten) {
		this.Hoten = Hoten;
	}
	
	public void setDiemLT(float DiemLT) {
		this.DiemLT = DiemLT;
	}
	
	public void setDiemTH(float DiemTH) {
		this.DiemTH = DiemTH;
	}
	
	public int getMasv() {
		return Masv;
	}
	
	public String getHoten() {
		return Hoten;
	}
	
	public float getDiemLT() {
		return DiemLT;
	}
	
	public float getDiemTH() {
		return DiemTH;
	}
	
	public float DiemTB() {
		return (DiemLT + DiemTH) / 2;
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap ma sv: ");
		this.Masv = sc.nextInt();
		System.out.print("Nhap ho ten: ");
		this.Hoten = sc.next();
		System.out.print("Nhap diem ly thuyet: ");
		this.DiemLT = sc.nextFloat();
		System.out.print("Nhap diem thuc hanh: ");
		this.DiemTH = sc.nextFloat();
	}
	
	public void xuat() {
		System.out.printf("\n%10s %20s %10s %10s %10s",this.Masv,this.Hoten,this.DiemLT,this.DiemTH,this.DiemTB());
	}
}
