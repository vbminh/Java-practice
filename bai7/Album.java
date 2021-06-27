package bai7;

import java.util.*;

public class Album {
	private String Ten;
	private String Ngay;
	private ArrayList<CD> x = new ArrayList<>();
	private int n;
	
	public Album() {
		
	}
	
	public Album(String Ten,String Ngay,ArrayList<CD> x, int n) {
		this.Ten = Ten;
		this.Ngay = Ngay;
		this.x = x;
		this.n = n;
	}
	
	public void setTen(String Ten) {
		this.Ten = Ten;
	}
	
	public void setNgay(String Ngay) {
		this.Ngay = Ngay;
	}
	public void setX(ArrayList<CD> x) {
		this.x = x;
	}
	
	public void setN(int n) {
		this.n = n;
	}
	
	public String getTen() {
		return Ten;
	}
	
	public String getNgay() {
		return Ngay;
	}
	
	public ArrayList<CD> getX() {
		return x;
	}
	
	public int getN() {
		return n;
	}
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		int a;
		boolean flag = true;
		do {
			System.out.println("Ban chon lam gi: ");
			System.out.println("1. Tao moi album ");
			System.out.println("2. Xuat thong tin album ");
			System.out.println("3. Tong so luong bai hat ");
			System.out.println("4. Tong gia thanh ");
			System.out.println("5. Sap xep danh sach giam dan theo gia thanh ");
			System.out.println("6. Sap xep danh sach tang dan theo tua CD ");
			System.out.println("Nhap so khac de thoat ");
			a = sc.nextInt();
			
			switch(a) {
			case 1:
				System.out.print("Nhap ten album: ");
				sc.nextLine();
				this.Ten = sc.nextLine();
				System.out.print("Nhap ngay phat hanh: ");
				this.Ngay = sc.nextLine();
				System.out.print("\nNhap so dia CD: ");
				this.n = sc.nextInt();
				for(int i = 0; i < n; i++) {
					System.out.println("Nhap thong tin CD thu " + (i + 1));
					CD tmp = new CD();
					tmp.input();
					x.add(tmp);
				}
				break;
			case 2:
				System.out.println("\n\t======ALBUM======\n");
				System.out.println("Ten album: " + this.Ten);
				System.out.println("Ngay phat hanh: " + this.Ngay);
				System.out.println("Danh sach CD:");
				System.out.printf("%10s %10s %15s %10s %10s","Ma CD","Tua CD","Ca sy","So bh","Gia thanh");
				for(CD i : x)
					i.output();
				System.out.println("\nTong so CD: " + n);
				break;
			case 3:
				int sum = 0;
				for(int i = 0; i < n; i++)
					sum += x.get(i).getSobh();
				System.out.println("\nTong so bai hat trong album la: " + sum);
				break;
			case 4:
				int tong = 0;
				for(int i = 0; i < n; i++)
					tong += x.get(i).getGia();
				System.out.println("\nTong gia thanh cua album la: " + tong);
				break;
			case 5:
				for(int i = 0; i < n; i++)
					for(int j = i + 1; j < n; j++)
						if(x.get(i).getGia() < x.get(j).getGia()) {
							CD tmp = x.get(i);
							x.set(i,x.get(j));
							x.set(j, tmp);
						}
				System.out.println("Sap xep thanh cong. Nhan 2 de kiem lai");
				break;
			case 6:
				for(int i = 0; i < n; i++)
					for(int j = i + 1; j < n; j++)
						if(x.get(i).getTuaCD().compareTo(x.get(i).getTuaCD()) > 0) {
							CD tmp = x.get(i);
							x.set(i,x.get(j));
							x.set(j,tmp);
						}
				System.out.println("Sap xep thanh cong. Nhan 2 de kiem lai");
				break;
			default:
				System.out.println("\nBye!!!");
				flag = false;
				break;
			}
		}while(flag);
	}
}
