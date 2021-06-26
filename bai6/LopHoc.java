package bai6;

import java.util.*;

public class LopHoc {
	private String Malop;
	private String Tenlop;
	private String Giaovien;
	private ArrayList<SinhVien> x = new ArrayList<>();
	private int n;
	
	public LopHoc() {
		
	}
	
	public LopHoc(String Malop,String Tenlop,String Giaovien,ArrayList<SinhVien> x,int n) {
		this.Malop = Malop;
		this.Tenlop = Tenlop;
		this.Giaovien = Giaovien;
		this.x = x;
		this.n = n;
	}
	
	public void setMalop(String Malop) {
		this.Malop = Malop;
	}
	
	public void setTenlop(String Tenlop) {
		this.Tenlop = Tenlop;
	}
	
	public void setGiaovien(String Giaovien) {
		this.Giaovien = Giaovien;
	}
	
	public void setX(ArrayList<SinhVien> x) {
		this.x = x;
	}
	
	public void setN(int n) {
		this.n = n;
	}
	
	public String getMalop() {
		return Malop;
	}
	
	public String getTenlop() {
		return Tenlop;
	}
	
	public String getGiaovien() {
		return Giaovien;
	}
	
	public ArrayList<SinhVien> getX() {
		return x;
	}
	
	public int getN() {
		return n;
	}
	
	public boolean checkMalop(boolean check) {
		if(this.Malop.isEmpty())
			System.out.print("\nMa lop khong duoc bo trong");
		else
			check = false;
		return check;
	}
	
	public boolean checkTenlop(boolean check) {
		if(Tenlop.isEmpty())
			System.out.print("\nTen lop khong duoc bo trong");
		else
			check = false;
		return check;
	}
	
	public boolean checkGiaovien(boolean check) {
		if(Giaovien.isEmpty())
			System.out.print("\nTen giao vien khong duoc bo trong");
		else
			check = false;
		return check;
	}
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		boolean check = true;
		
		do {
			System.out.print("Nhap ma lop: ");
			this.Malop = sc.nextLine();
		}while(this.checkMalop(check));
		
		do {
			System.out.print("Nhap ten lop: ");
			this.Tenlop = sc.nextLine();
		}while(this.checkTenlop(check));
		
		do {
			System.out.print("Nhap ten giao vien: ");
			this.Giaovien = sc.nextLine();
		}while(this.checkGiaovien(check));
		
		System.out.print("Nhap so sinh vien: ");
		this.n = sc.nextInt();
		for(int i = 0; i  <n; i++) {
			SinhVien tmp = new SinhVien();
			System.out.println("Nhap thong tin sinh vien thu " + (i+1));
			tmp.input();
			x.add(tmp);
		}
	}
	
	public void arrange() {
		for(int i = 0; i < n; i++)
			for(int j = i + 1; j < n; j++)
				if(x.get(i).getMasv() > x.get(j).getMasv()) {
					SinhVien tmp = x.get(i);
					x.set(i,x.get(j));
					x.set(j, tmp);
				}
	}
	
	public void output() {
		System.out.println("\n\t=======Thong tin Lop Hoc=======\n");
		System.out.println("Ma lop: " + Malop);
		System.out.println("Ten lop: " + Tenlop);
		System.out.println("Giao vien: " + Giaovien);
		System.out.println("Danh sach sinh vien: ");
		System.out.printf("\n%10s %15s %15s %15s","Ma SV","Ten SV","Dia chi","SDT");
		for(SinhVien i : x)
			i.output();
	}
}
