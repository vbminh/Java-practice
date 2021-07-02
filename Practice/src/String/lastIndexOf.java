package String;

import java.util.Scanner;

public class lastIndexOf {
	private String str1;
	private String str2;
	
	public lastIndexOf() {
		
	}
	
	public lastIndexOf(String str1,String str2) {
		this.str1 = str1;
		this.str2 = str2;
	}
	
	public void setStr1(String str1) {
		this.str1 = str1;
	}
	
	public void setStr2(String str2) {
		this.str2 = str2;
	}
	
	public String getStr1() {
		return str1;
	}
	
	public String getStr2() {
		return str2;
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap chuoi: ");
		this.str1 = sc.nextLine();
		System.out.print("Nhap chuoi can tim kiem: ");
		this.str2 = sc.nextLine();
	}
	
	public void lastIndex() {
		if(str1.lastIndexOf(str2) == -1)
			System.out.print("\nKhong tim thay chuoi [" + str2 + "] trong chuoi [" + str1 + "]");
		else
			System.out.println("\nVi tri cua chuoi [" + str2 + "] trong chuoi ["  + str1 + "] la: " + str1.lastIndexOf(str2));
	}
	
	public static void main(String[] args) {
		lastIndexOf str = new lastIndexOf();
		
		str.nhap();
		str.lastIndex();

	}

}
