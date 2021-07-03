package String;

import java.util.Scanner;

public class ConcatString {
	private String str1;
	private String str2;
	
	public ConcatString() {
		
	}
	
	public ConcatString(String str1, String str2) {
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
		System.out.print("Nhap chuoi thu nhat: ");
		this.str1 = sc.nextLine();
		System.out.print("Nhap chuoi thu hai: ");
		this.str2 = sc.nextLine();
	}
	
	public void Concat() {
		System.out.print("\nChuoi [" + str1 + "] sau khi noi them chuoi [" + str2 + "] la: " + str1.concat(str2));
	}
	public static void main(String[] args) {
		ConcatString str = new ConcatString();
		
		str.nhap();
		str.Concat();

	}

}
