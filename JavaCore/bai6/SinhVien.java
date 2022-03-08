package bai6;

import java.util.*;

public class SinhVien {
	private int Masv;
	private String Tensv;
	private String Diachi;
	private String SDT;
	
	public SinhVien() {
	}
	
	public SinhVien(int Masv,String Tensv,String Diachi,String SDT) {
		this.Masv = Masv;
		this.Tensv = Tensv;
		this.Diachi = Diachi;
		this.SDT = SDT;
	}
	
	public void setMasv(int Masv) {
		this.Masv = Masv;
	}
	
	public void setTensv(String Tensv) {
		this.Tensv = Tensv;
	}
	
	public void setDiachi(String Diachi) {
		this.Diachi = Diachi;
	}
	
	public void setSDT(String SDT) {
		this.SDT = SDT;
	}
	
	public int getMasv() {
		return Masv;
	}
	
	public String getTensv() {
		return Tensv;
	}
	
	public String getDiachi() {
		return Diachi;
	}
	
	public String getSDT() {
		return SDT;
	}
	
	public boolean checkMasv(boolean check) {
		String s = Integer.toString(Masv);
		if(s.isEmpty())
			System.out.print("\nMa sinh vien khong duoc bo trong.");
		else
			check = false;
		return check;
	}
	
	public boolean checkTensv(boolean check) {
		if(Tensv.isEmpty())
			System.out.print("\nTen sinh vien khong duoc bo trong.");
		else
			check = false;
		return check;
	}
	
	public boolean checkDiachi(boolean check) {
		if(Diachi.isEmpty())
			System.out.print("\nDia chi khong duoc bo trong.");
		else
			check = false;
		return check;
	}
	
	public boolean checkSDT(boolean check) {
		if(SDT.length() > 10)
			System.out.print("\nSDT khong duoc qua 10 chu so.");
		else
			check = false;
		return check;
	}
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		boolean check = false;
		
		do {
			System.out.print("Nhap ma sinh vien: ");
			this.Masv = sc.nextInt();
			sc.nextLine();
		}while(this.checkMasv(check));
		
		do {
			System.out.print("Nhap ten sinh vien: ");
			this.Tensv = sc.nextLine();
		}while(this.checkTensv(check));
		
		do {
			System.out.print("Nhap dia chi: ");
			this.Diachi = sc.nextLine();
		}while(this.checkDiachi(check));
		
		do {
			System.out.print("Nhap so dien thoai: ");
			this.SDT = sc.nextLine();
		}while(this.checkSDT(check));
	}
	
	public void output() {
		System.out.printf("\n%10s %15s %15s %15s",this.Masv,this.Tensv,this.Diachi,this.SDT);
	}
}
