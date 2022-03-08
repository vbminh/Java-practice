package String;

import java.util.Scanner;

public class UpperCaseString {
	private String str;
	
	public UpperCaseString() {
		
	}
	
	public UpperCaseString(String str) {
		this.str = str;
	}
	
	public void setStr(String str) {
		this.str = str;
	}
	
	public String getStr() {
		return str;
	}
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap chuoi: ");
		str = sc.nextLine();
	}
	
	public void UpperCase() {
		System.out.print("\nChuoi [" + str + "] sau khi in hoa: " + str.toUpperCase());
	}
	public static void main(String[] args) {
		UpperCaseString str = new UpperCaseString();
		
		str.input();
		str.UpperCase();

	}

}
