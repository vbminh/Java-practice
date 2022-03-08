package Phieu;

import java.util.*;

public class Phieu {
	private String MaPhieu;
	private String NgayLap;
	private NCC x;
	private ArrayList<SanPham> y = new ArrayList<>();
	private int n;
	
	public Phieu() {
		
	}
	
	public Phieu(String MaPhieu,String NgayLap,NCC x,ArrayList<SanPham> y,int n) {
		this.MaPhieu = MaPhieu;
		this.NgayLap = NgayLap;
		this.x = x;
		this.y = y;
		this.n = n;
	}
	
	public String getMaPhieu() {
		return MaPhieu;
	}
	
	public String getNgayLap() {
		return NgayLap;
	}
	
	public NCC getX() {
		return x;
	}
	
	public ArrayList<SanPham> getY() {
		return y;
	}
	
	public int getN() {
		return n;
	}
	
	public void setMaPhieu(String MaPhieu) {
		this.MaPhieu = MaPhieu;
	}
	
	public void setNgayLap(String NgayLap) {
		this.NgayLap = NgayLap;
	}
	
	public void setX(NCC x) {
		this.x = x;
	}
	
	public void setY(ArrayList<SanPham> y) {
		this.y = y;
	}
	
	public void setN(int n) {
		this.n = n;
	}
	
	@Override
	public String toString() {
		return "\nMa phieu: " + MaPhieu + "\tNgay lap: " + NgayLap + x + "\n" + y + "\n";
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Ma phieu: ");
		this.MaPhieu = sc.nextLine();
		System.out.print("Ngay lap: ");
		this.NgayLap = sc.nextLine();
		this.x = new NCC();
		x.nhap();
		System.out.print("Nhap so san pham: ");
		this.n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			SanPham tmp = new SanPham();
			System.out.println("Nhap thong tin sp thu " + i +1);
			tmp.nhap();
			y.add(tmp);
		}
	}
}
