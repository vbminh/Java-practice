package bai3;

import java.util.*;

public class Vehicle {
	private String Maxe;
	private String Tenxe;
	private String Chuxe;
	private float GiaTri;
	private float DungTich;
	
	public Vehicle() {
		
	}
	
	public Vehicle(String Maxe,String Tenxe,String Chuxe,float GiaTri,float DungTich) {
		this.Maxe = Maxe;
		this.Tenxe = Tenxe;
		this.Chuxe = Chuxe;
		this.GiaTri = GiaTri;
		this.DungTich = DungTich;
	}
	
	public void setMaxe(String Maxe) {
		this.Maxe = Maxe;
	}
	
	public void setTenxe(String Tenxe) {
		this.Tenxe = Tenxe;
	}
	
	public void setChuxe(String Chuxe) {
		this.Chuxe = Chuxe;
	}
	
	public void setGiaTri(float GiaTri) {
		this.GiaTri = GiaTri;
	}
	
	public void setDungTich(float DungTich) {
		this.DungTich = DungTich;
	}
	
	public String getMaxe() {
		return Maxe;
	}
	
	public String getTenxe() {
		return Tenxe;
	}
	
	public String getChuxe() {
		return Chuxe;
	}
	
	public float getGiaTri() {
		return GiaTri;
	}
	
	public float getDungTich() {
		return DungTich;
	}
	
	public float Thue() {
		return (float) ((boolean) (this.DungTich < 100)?(0.01*this.GiaTri):((this.DungTich < 200)?(0.03*this.GiaTri):(0.05*this.GiaTri)));
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Ma xe: ");
		this.Maxe = sc.nextLine();
		System.out.print("Ten xe: ");
		this.Tenxe = sc.nextLine();
		System.out.print("Chu xe: ");
		this.Chuxe = sc.nextLine();
		System.out.print("Gia tri: ");
		this.GiaTri = sc.nextFloat();
		System.out.print("Dung tich: ");
		this.DungTich = sc.nextFloat();
	}
	
	public void xuat() {
		System.out.printf("\n%10s %20s %20s %10s %10s %10s",this.Maxe,this.Tenxe,this.Chuxe,this.GiaTri,this.DungTich,this.Thue());
	}
}
