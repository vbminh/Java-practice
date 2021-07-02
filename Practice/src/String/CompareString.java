package String;

import java.util.Scanner;

public class CompareString {
	private String str1;
	private String str2;
	
	public CompareString() {
	}
	
	public CompareString(String str1,String str2) {
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
	
	public void Compare() {
		if(str1.compareTo(getStr2()) < 0)
			System.out.println("Chuoi [" + str1 + "] ngan hon chuoi [" + str2 + "]");
		else {
			if(str1.compareTo(getStr2()) == 0)
				System.out.println("Chuoi [" + str1 + "] bang chuoi [" + str2 + "]");
			else
				System.out.println("Chuoi [" + str1 + "] dai hon chuoi [" + str2 + "]");
		}
	}
	
	public static void main(String[] args) {
		CompareString str1 = new CompareString();
		
		str1.nhap();
		System.out.println();
		str1.Compare();
	}

}
