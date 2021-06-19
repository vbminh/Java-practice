package ass2;

import java.util.*;

public class LopHoc {
	private String MaLH;
	private String TenLH;
	private String NgayMo;
	private ArrayList<SinhVien> x = new ArrayList<>();
	private int n;
	private Nguoi GiaoVien;
	
	public LopHoc() {
		
	}
	
	public LopHoc(String MaLH,String TenLH,String NgayMo,ArrayList<SinhVien> x,int n,Nguoi GiaoVien) {
		this.MaLH = MaLH;
		this.TenLH = TenLH;
		this.NgayMo = NgayMo;
		this.x = x;
		this.n = n;
		this.GiaoVien = GiaoVien;
	}
	
	public String getMaLH() {
		return MaLH;
	}
	
	public String getTenLH() {
		return TenLH;
	}
	
	public String getNgayMo() {
		return NgayMo;
	}
	
	public ArrayList<SinhVien> getX() {
		return x;
	}
	
	public int getN() {
		return n;
	}
	
	public Nguoi getGiaoVien() {
		return GiaoVien;
	}
	
	public void setMaLH(String MaLH) {
		this.MaLH = MaLH;
	}
	
	public void setTenLH(String TenLH) {
		this.TenLH = TenLH;
	}
	
	public void setNgayMo(String NgayMo) {
		this.NgayMo = NgayMo;
	}
	
	public void setX(ArrayList<SinhVien> x) {
		this.x = x;
	}
	
	public void setN(int n) {
		this.n = n;
	}
	
	public void setGiaoVien(Nguoi GiaoVien) {
		this.GiaoVien = GiaoVien;
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Ma LH: ");
		this.MaLH = sc.nextLine();
		System.out.print("Ten LH: ");
		this.TenLH = sc.nextLine();
		System.out.print("Ngay mo: ");
		this.NgayMo = sc.nextLine();
		System.out.println("Nhap thong tin giao vien:");
		this.GiaoVien = new Nguoi();
		GiaoVien.nhap();
		System.out.print("Nhap so sinh vien: ");
		this.n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			SinhVien temp = new SinhVien();
			System.out.println("Nhap thong tin sinh vien thu " + i + 1);
			temp.nhap();
			x.add(temp);
		}
	}
	
	public void xuat() {
		System.out.println("\t============================");
		System.out.println("Ma lop hoc: " + this.MaLH);
		System.out.println("Ten lop hoc: " + this.TenLH);
		System.out.println("Ngay mo: " + this.NgayMo);
		System.out.printf("%30s %15s %30s %20s %20s %10s\n","Ho ten","Ngay sinh","Que quan","Ma sv","Nganh","Khoa");
		for(int i = 0; i < x.size(); i++) {
			x.get(i).xuat();
		}
		System.out.println("Giao vien:");
		System.out.printf("%30s %15s %30s\n","Ho ten","Ngay sinh","Que quan");
		GiaoVien.xuat();
	}
	
	public void sap() {
		for(int i = 0; i < x.size(); i++)
			for(int j = i +1; j < x.size(); j++)
				if(x.get(i).getKhoa() > x.get(j).getKhoa()) {
					SinhVien temp = x.get(i);
					x.set(i,x.get(j));
					x.set(j,temp);
					
				}
	}
}
