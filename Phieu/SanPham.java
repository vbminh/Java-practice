package Phieu;

import java.util.Scanner;

public class SanPham {
	private String MaSP;
	private String TenSP;
	private int SL;
	private float DG;
	
	public SanPham() {
	}
	
	public SanPham(String MaSP,String TenSP,int SL, float DG) {
		this.MaSP = MaSP;
		this.TenSP = TenSP;
		this.SL = SL;
		this.DG = DG;
	}
	
	public String getMaSP() {
		return MaSP;
	}
	
	public String getTenSP() {
		return TenSP;
	}
	
	public int getSL() {
		return SL;
	}
	
	public float getDG() {
		return DG;
	}
	
	public void setMaSP(String MaSP) {
		this.MaSP = MaSP;
	}
	
	public void setTenSP(String TenSP) {
		this.TenSP = TenSP;
	}
	
	public void setSl(int SL) {
		this.SL = SL;
	}
	
	public void setDG(float DG) {
		this.DG = DG;
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Ma SP: ");
		this.MaSP = sc.nextLine();
		System.out.print("Ten SP: ");
		this.TenSP = sc.nextLine();
		System.out.print("So luong: ");
		this.SL = sc.nextInt();
		System.out.print("Don gia: ");
		this.DG = sc.nextFloat();
	}
	
	@Override 
	public String toString() {
		return "\nSan Pham{" + "MaSP =" + MaSP + ", TenSP=" + TenSP + ", SL=" + SL + ", DG=" + DG + ", Thanh tien=" + SL*DG + "}";
	}
}
