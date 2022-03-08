package ass2;

import java.util.*;

public class Nguoi {
	private String Hoten;
	private String NgaySinh;
	private String QueQuan;
	
	public Nguoi() {
		
	}
	
	public Nguoi(String Hoten,String NgaySinh,String QueQuan) {
		this.Hoten = Hoten;
		this.NgaySinh = NgaySinh;
		this.QueQuan = QueQuan;
	}
	
	public String getHoten() {
		return Hoten;
	}
	
	public String getNgaySinh() {
		return NgaySinh;
	}
	
	public String getQueQuan() {
		return QueQuan;
	}
	
	public void setHoten(String Hoten) {
		this.Hoten = Hoten;
	}
	
	public void setNgaySinh(String NgaySinh) {
		this.NgaySinh = NgaySinh;
	}
	
	public void setQueQuan(String QueQuan) {
		this.QueQuan = QueQuan;
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Ho ten: ");
		this.Hoten = sc.nextLine();
		System.out.print("Ngay sinh: ");
		this.NgaySinh = sc.nextLine();
		System.out.print("Que quan: ");
		this.QueQuan = sc.nextLine();
	}
	
	public void xuat() {
		System.out.printf("%30s %15s %30s",this.Hoten,this.NgaySinh,this.QueQuan);
	}
}
