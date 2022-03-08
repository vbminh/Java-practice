package bai5;

import java.text.SimpleDateFormat;
import java.util.*;

public class ThucPham {
	private String Mahang;
	private String Tenhang;
	private float Dongia;
	private Date NSX,HSD;
	
	public ThucPham() {
		
	}
	
	public ThucPham(String Mahang,String Tenhang,float Dongia,Date NSX,Date HSD) {
		this.Mahang = Mahang;
		this.Tenhang = Tenhang;
		this.Dongia = Dongia;
		this.NSX = NSX;
		this.HSD = HSD;
	}
	
	public void setMahang(String Mahang) {
		this.Mahang = Mahang;
	}
	
	public void setTenhang(String Tenhang) {
		this.Tenhang = Tenhang;
	}
	
	public void setDongia(float Dongia) {
		this.Dongia = Dongia;
	}
	
	public void setnSX(Date NSX) {
		this.NSX = NSX;
	}
	
	public void sethSD(Date HSD) {
		this.HSD = HSD;
	}
	
	public String getMahang() {
		return Mahang;
	}
	
	public String getTenhang() {
		return Tenhang;
	} 
	
	public float getDongia() {
		return Dongia;
	}
	
	public Date getNSX() {
		return NSX;
	}
	
	public Date getHSD() {
		return HSD;
	}
	
	public void setNSX(int year, int month, int day) {
		Calendar nsx = Calendar.getInstance();
		nsx.set(year,month-1,day);
		this.NSX = nsx.getTime();
	}
	
	public void setHSD(int year, int month, int day) {
		Calendar hsd = Calendar.getInstance();
		hsd.set(year, month-1, day);
		this.HSD = hsd.getTime();
	}
	
	
	public boolean checkma(boolean check) {
		if(Mahang == "" || this.Mahang.isEmpty())
			System.out.println("\nMa hang khong duoc de trong!");
		else 
			check = false;
		return check;
	}
	
	public boolean checkten(boolean check) {
		if(this.Tenhang.isEmpty())
			System.out.println("\nTen hang khong duoc bo trong!");
		else 
			check = false;
		return check;
	}
	
	public boolean checkgia(boolean check) {
		if(this.Dongia < 0)
			System.out.println("\nDon gia phai lon hon 0!");
		else
			check = false;
		return check;
	}
	
	public boolean checkNSX(boolean check) {
		Date today = new Date();
		today.getTime();
		SimpleDateFormat now = new SimpleDateFormat("dd/MM/yyyy");
		String st = now.format(today);
		if(this.getNSX().compareTo(today) > 0 )
			System.out.println("\nNSX khong duoc lon hon ngay hien tai.");
		else
			check = false;
		return check;
	}
	
	 public boolean HSD(boolean check) {
	        if (this.getNSX().compareTo(this.getHSD()) < 0) {
	            check = false;
	        } else {
	            System.out.println("Han su dung khong duoc nho hon ngay san xuat.");
	        }
	        return check;
	    }
	
	public long daysBetween(Date d1, Date d2) {
		return (long) (d1.getTime() - d2.getTime()) / (1000 * 60 * 60 * 24);
	}
	
	public void checkHSD() {
		Date today = new Date();
		today.getTime();
		SimpleDateFormat now = new SimpleDateFormat("dd/MM/yyyy");
		String st = now.format(today);
		if(this.getHSD().compareTo(today) < 0) {
			System.out.println("\nHom nay la ngay " + st + ". Thuc pham da qua han su dung " + daysBetween(today,getHSD()) + " ngay.");
		}
		else
			System.out.print("\nHom nay la ngay " + st + ". Thuc phan van con han su dung." );
	}
	
	public void input() {
		boolean check = true;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.print("Nhap ma hang: ");
			this.Mahang = sc.nextLine();
		}while(this.checkma(check));
		
		do {
			System.out.print("Nhap ten hang: ");
			this.Tenhang = sc.nextLine();
		} while(this.checkten(check));
		
		do {
			System.out.print("Nhap gia: ");
			this.Dongia = sc.nextFloat();
		} while(this.checkgia(check));
		
		do {
			System.out.print("Nhap ngay san xuat(nam thang ngay): ");
			this.setNSX(sc.nextInt(), sc.nextInt(), sc.nextInt());
		} while(this.checkNSX(check));
		do {
			System.out.print("Nhap han su dung(nam thang ngay): ");
			this.setHSD(sc.nextInt(), sc.nextInt(), sc.nextInt());
		} while(this.HSD(check));
	}
	
	public void output() {
		SimpleDateFormat si = new SimpleDateFormat("dd/MM/yyyy");
		String str1 = si.format(NSX);
		String str2 = si.format(HSD);
		System.out.println("\nMa hang: " + this.Mahang);
		System.out.println("Ten hang: " + this.Tenhang);
		System.out.println("Don gia: " + this.Dongia);
		System.out.println("Ngay san xuat: " + str1);
		System.out.println("Han su dung: " + str2);
		System.out.println("\nKet qua kiem tra: ");
		checkHSD();
		getNSX();
	}
}
