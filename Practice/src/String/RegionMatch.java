package String;

import java.util.Scanner;
	
public class RegionMatch {
	private String str1;
	private String str2;
	
	public RegionMatch() {
		
	}
	
	public RegionMatch(String str1, String str2) {
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
	
	public void RegionMatches() {
		int x, y, len;
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap vi tri bat dau khu vuc chuoi thu nhat: ");
		x = sc.nextInt();
		System.out.print("Nhap vi tri bat dau khu vuc chuoi thu hai: ");
		y = sc.nextInt();
		System.out.print("Nhap so ki tu can so sanh: ");
		len = sc.nextInt();
		
		System.out.print("\nSo khop cac khu vuc chuoi [" + str1 + "] va [" + str2 + "]: " +str1.regionMatches(x, str2, y, len));
	}
	
	public static void main(String[] args) {
		RegionMatch str = new RegionMatch();
		
		str.nhap();
		str.RegionMatches();

	}

}
