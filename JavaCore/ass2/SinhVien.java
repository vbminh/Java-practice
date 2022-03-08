package ass2;

import java.util.*;

public class SinhVien extends Nguoi {
	private String MaSV;
	private String Nganh;
	private int Khoa;
	
	public SinhVien() {
		
	}
	
	public SinhVien(String Hoten,String NgaySinh,String QueQuan,String MaSV,String Nganh,int Khoa) {
	super(Hoten,NgaySinh,QueQuan);
		this.MaSV = MaSV;
		this.Nganh = Nganh;
		this.Khoa = Khoa;
	}
	
	public String getMaSV() {
		return MaSV;
	}
	
	public String getNganh() {
		return Nganh;
	}
	
	public int getKhoa() {
		return Khoa;
	}
	
	public void setMaSV(String MaSV) {
		this.MaSV = MaSV;
	}
	
	public void setNganh(String Nganh) {
		this.Nganh = Nganh;
	}
	
	public void setKhoa(int Khoa) {
		this.Khoa = Khoa;
	}
	
	@Override
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		super.nhap();
		System.out.print("Ma sv: ");
		this.MaSV = sc.nextLine();
		System.out.print("Nganh: ");
		this.Nganh = sc.nextLine();
		System.out.print("Khoa: ");
		this.Khoa = sc.nextInt();
	}
	
	@Override
	public void xuat() {
		super.xuat();
		System.out.printf("%20s %20s %10s\n",this.MaSV,this.Nganh,this.Khoa);
	}
}
