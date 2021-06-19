package Phieu;

import java.util.*;

public class NCC {
	private String MaNCC;
	private String TenNCC;
	private String DiaChi;
	private String SDT;
	
	public NCC() {
	}
	
	public NCC(String MaNCC, String TenNCC, String DiaChi, String SDT) {
		this.MaNCC = MaNCC;
		this.TenNCC = TenNCC;
		this.DiaChi = DiaChi;
		this.SDT = SDT;
	}
	
	public String getMaNCC() {
		return MaNCC;
	}
	
	public String getTenNCC() {
		return TenNCC;
	}
	
	public String getDiaChi() {
		return DiaChi;
	}
	
	public String getSDT() {
		return SDT;
	}
	
	public void setMaNCC(String MaNCC) {
		this.MaNCC = MaNCC;
	}
	
	public void setTenNCC(String TenNCC) {
		this.TenNCC = TenNCC;
	}
	
	public void setDiaChi(String DiaChi) {
		this.DiaChi = DiaChi;
	}
	
	public void setSDT(String SDT) {
		this.SDT = SDT;
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Ma NCC: ");
		this.MaNCC = sc.nextLine();
		System.out.print("Ten NCC: ");
		this.TenNCC = sc.nextLine();
		System.out.print("Dia chi: ");
		this.DiaChi = sc.nextLine();
		System.out.print("SDT: ");
		this.SDT = sc.nextLine();
	}
	
	@Override
	public String toString() {
		return "Ma NCC: " + MaNCC + "\tTen NCC: " + TenNCC + "\nDia chi: " + DiaChi + "\tSDT: " + SDT + "\n";
	}
}
