package bai3;

import java.util.*;

public class RunMain {

	public static void main(String[] args) {
		Tax tax = new Tax();
		Scanner sc = new Scanner(System.in);
		int choose;
		Boolean flag = true;
		do {
			System.out.println("Moi ban chon:");
			System.out.println("1. Tao moi");
			System.out.println("2. Xuat thong tin");
			System.out.println("Nhap so khac de thoat");
			choose = sc.nextInt();
			switch(choose) {
			case 1:
				System.out.println("\n\t=====Nhap thong tin======");
				tax.nhap();
				break;
			case 2:
				tax.xuat();
				break;
			default:
				System.out.print("\nBye");
				flag = false;
				break;
			}
		}while(flag);
	}

}
