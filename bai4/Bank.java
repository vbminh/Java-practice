package bai4;

import java.util.*;

public class Bank {
	private ArrayList<Account> x = new ArrayList<>();
	private int n;
	
	public Bank() {
		
	}
	
	public Bank(ArrayList<Account> x, int n) {
		this.x = x;
		this.n = n;
	}
	
	public void setX(ArrayList<Account> x) {
		this.x = x;
	}
	
	public void setN(int n) {
		this.n = n;
	}
	
	public ArrayList<Account> getX() {
		return x;
	}
	
	public int getN() {
		return n;
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap so luong khach hang: ");
		this.n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			System.out.println("Nhap thong tin khach hang thu " + (i + 1));
			Account temp = new Account();
			temp.nhap();
			x.add(temp);
		}
	}
	
	public void xuat() {
		System.out.printf("\n%15s %15s %10s","STK","Ten tai khoan","So du");
		for(Account i : x)
			i.xuat();
	}
	
	public void naptien() {
		long s;
		Scanner sc = new Scanner(System.in);
		System.out.print("\nNhap stk can nap tien: ");
		s = sc.nextLong();
		for(Account i : x) {
			if(s == i.getSTK()) { 
				i.Naptien();
				break;
			}
		}
	}
	
	public void ruttien() {
		long s;
		Scanner sc = new Scanner(System.in);
		System.out.print("\nNhap stk can rut tien: ");
		s = sc.nextLong();
		for(Account i : x) {
			if(s == i.getSTK()) {
				i.Ruttien();
				break;
			}
		}
	}
	
	public void daohan() {
		long s;
		Scanner sc = new Scanner(System.in);
		System.out.print("\nNhap stk can dao han: ");
		s = sc.nextLong();
		for(Account i : x) {
			if(s == i.getSTK()) {
				i.Daohan();
				break;
			}
		}
	}
	
	public void chuyentien() {
		long s, Stknhan;
		double tienchuyen;
		String Tennh;
		int a;
		Scanner sc = new Scanner(System.in);
		System.out.print("\nNhap stk can chuyen tien: ");
		s = sc.nextLong();
		for(Account i : x) {
			if(s == i.getSTK()) {
				System.out.println("Moi ban chon: ");
				System.out.println("1. Chuyen tien cung ngan hang" + "\n2. Chuyen tien khac ngan hang" + "\nNhap so khac de thoat");
				a = sc.nextInt();
				sc.nextLine();
				switch (a) {
				case 1: 
					System.out.print("Nhap so tai khoan thu huong: ");
					Stknhan = sc.nextLong();
					System.out.print("Nhap so tien muon chuyen: ");
					do {
						tienchuyen = sc.nextDouble();
						if(tienchuyen > i.getSotien())
							System.out.println("\nSo du tai khoan khong du. Moi nhap lai: ");
						else {
							if(tienchuyen < 500) {
								i.setSotien((i.getSotien()-tienchuyen-2));
								System.out.println("\nBan vua chuyen thanh cong " + tienchuyen + " den stk: " + Stknhan + ". So du: " + i.getSotien());
							}
							else {
								i.setSotien((i.getSotien()-tienchuyen-5));
								System.out.println("\nBan vua chuyen thanh cong " + tienchuyen + " den stk: " + Stknhan + ". So du: " + i.getSotien());
								
							}
							for(Account j : x) {
								if(Stknhan == j.getSTK())
									j.setSotien((j.getSotien()+tienchuyen));
							}
						}
					}while(tienchuyen > i.getSotien());
					break;
				case 2:
					System.out.print("Nhap ten ngan hang: ");
					Tennh = sc.nextLine();
					System.out.print("Nhap so tai khoan thu huong: ");
					Stknhan = sc.nextLong();
					System.out.print("Nhap so tien muon chuyen: ");
					do {
						tienchuyen = sc.nextDouble();
						if(tienchuyen > i.getSotien())
							System.out.println("\nSo du tai khoan khong du. Moi nhap lai: ");
						else {
							if(tienchuyen < 500) {
								i.setSotien((i.getSotien()-tienchuyen-5));
								System.out.println("\nBan vua chuyen thanh cong " + tienchuyen + " den stk: " + Stknhan + ". So du: " + i.getSotien());
							}
							else {
								i.setSotien((i.getSotien()-tienchuyen-5));
								System.out.println("\nBan vua chuyen thanh cong " + tienchuyen + " den stk: " + Stknhan + ". So du: " + i.getSotien());
							}
						}
					}while(tienchuyen > i.getSotien());
					break;
				default:
					System.out.println("\nBye");
					break;
				}
			}
			else 
				System.out.println("\nSo tai khoan khong dung.");
			}
		}
	}
