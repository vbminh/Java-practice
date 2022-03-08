package bai4;

import java.util.Scanner;

public class RunMain {
	public static void main(String[] args) {
		Bank BIDV = new Bank();
		Scanner sc = new Scanner(System.in);
		Boolean flag = true;
		int a;
		do {
			System.out.println("\nMoi ban chon:");
			System.out.println("1. Tao moi thong tin khach hang");
			System.out.println("2. In thong tin");
			System.out.println("3. Nap tien");
			System.out.println("4. Rut tien");
			System.out.println("5. Dao han");
			System.out.println("6. Chuyen tien");
			System.out.println("Nhap so khac de thoat");
			
			a = sc.nextInt();
			
			switch (a) {
			case 1:
				BIDV.nhap();
				break;
			case 2:
				BIDV.xuat();
				break;
			case 3:
				BIDV.naptien();
				break;
			case 4:
				BIDV.ruttien();
				break;
			case 5:
				BIDV.daohan();
				break;
			case 6:
				BIDV.chuyentien();
				break;
			default:
				System.out.print("\nBye!!!");
				flag = false;
				break;
			}
		}while(flag);
	}
}
