package bai7;

import java.util.*;

public class CD {
	private int MaCD;
	private String TuaCD;
	private String Casy;
	private int Sobh;
	private float Gia;
	
	public CD() {
		
	}
	
	public CD(int MaCD,String TuaCD,String Casy,int Sobh,float Gia) {
		this.MaCD = MaCD;
		this.TuaCD = TuaCD;
		this.Casy = Casy;
		this.Sobh = Sobh;
		this.Gia = Gia;
	}
	
	public void setMaCD(int MaCD) {
		this.MaCD = MaCD;
	}
	
	public void setTuaCD(String TuaCD) {
		this.TuaCD = TuaCD;
	}
	
	public void setCasy(String Casy) {
		this.Casy = Casy;
	}
	
	public void setSobh(int Sobh) {
		this.Sobh = Sobh;
	}
	
	public void setGia(float Gia) {
		this.Gia = Gia;
	}
	
	public int getMaCD() {
		return MaCD;
	}
	
	public String getTuaCD() {
		return TuaCD;
	}
	
	public String getCasy() {
		return Casy;
	}
	
	public int getSobh() {
		return Sobh;
	}
	
	public float getGia() {
		return Gia;
	}
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		boolean check = true;
		System.out.print("Nhap ma CD: ");
		this.MaCD = sc.nextInt();
		sc.nextLine();
		System.out.print("Nhap tua CD: ");
		this.TuaCD = sc.nextLine();
		System.out.print("Nhap ten ca sy: ");
		this.Casy = sc.nextLine();
		System.out.print("Nhap so bai hat: ");
		this.Sobh = sc.nextInt();
		System.out.print("Nhap gia thanh: ");
		this.Gia = sc.nextFloat();
	}
	
	public void output() {
		System.out.printf("\n%10s %10s %15s %10s %10s",this.MaCD,this.TuaCD,this.Casy,this.Sobh,this.Gia);
	}
}
