package String;

import java.util.Scanner;

public class SearchString {
	private String str1;
	private String str2;
	
	public SearchString() {
		
	}
	
	public SearchString(String str1, String str2) {
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
		System.out.print("Nhap tu can tim kiem: ");
		this.str2 = sc.nextLine();
	}
	
	public void search() {
		if(str1.indexOf(str2) == -1)
			System.out.println("\nKhong tim thay chu [" + str2 + "] trong chuoi [" + str1 + "]");
		else
			System.out.print("\nVi tri cua tu [" + str2 + "] trong chuoi [" + str1 + "] la: " + str1.indexOf(str2));
	}
	public static void main(String[] args) {
		SearchString str = new SearchString();
		
		str.nhap();
		str.search();

	}

}
