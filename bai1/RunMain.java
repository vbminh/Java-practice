package bai1;

import java.util.Scanner;

public class RunMain {

	public static void main(String[] args) {
		HCN a = new HCN(4,6);
		System.out.println("Chu vi HCN a la: " + a.Chuvi());
		System.out.println("Dien tich HCN a la: " + a.Dientich());

		Scanner sc = new Scanner(System.in);
		HCN b = new HCN();
		System.out.println("Nhap do dai cac canh cua HCN b:");
		System.out.print("Nhap chieu dai: ");
		b.setD(sc.nextDouble());
		System.out.print("Nhap chieu rong: ");
		b.setR(sc.nextDouble());
		System.out.println("\nChu vi cua HCN b la: " + b.Chuvi());
		System.out.println("Dien tich cua HCN b la: " + b.Dientich());
	}

}
