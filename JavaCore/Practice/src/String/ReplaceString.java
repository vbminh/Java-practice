package String;

import java.util.Scanner;

public class ReplaceString {
	private String str1;
	private String str2;
	private String str3;
	
	public ReplaceString() {
		
	}
	
	public ReplaceString(String str1, String str2,String str3) {
		this.str1 = str1;
		this.str2 = str2;
		this.str3 = str3;
	}
	
	public void setStr1(String str1) {
		this.str1 = str1;
	}
	
	public void setStr2(String str2) {
		this.str2 = str2;
	}
	
	public void setStr3(String str3) {
		this.str3 = str3;
	}
	
	public String getStr1() {
		return str1;
	}
	
	public String getStr2() {
		return str2;
	}
	
	public String getStr3() {
		return str3;
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap chuoi: ");
		str1 = sc.nextLine();
		System.out.print("Nhap chuoi phu muon thay the: ");
		str2 = sc.nextLine();
		System.out.print("Nhap chuoi phu moi: ");
		str3 = sc.nextLine();
	}
	
	public void replace() {
		System.out.println("\nChuoi [" + str1 + "] sau khi thay the chuoi phu [" + str2 + "] bang chuoi phu [" + str3 + "] la : " + str1.replace(str2, str3));
	}
	public static void main(String[] args) {
		ReplaceString str = new ReplaceString();
		
		str.nhap();
		str.replace();

	}

}
