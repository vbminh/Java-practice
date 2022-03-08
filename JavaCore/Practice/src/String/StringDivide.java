package String;

import java.util.Scanner;

public class StringDivide {
	private String str;
	
	public StringDivide() {
		
	}
	
	public StringDivide(String str) {
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
	
	public void Divide() {
		String regex;
		int limit;
		
		str = str.trim();
		Scanner sc = new Scanner(System.in);
		System.out.print("Phan gioi boi: ");
		regex = sc.nextLine();
		System.out.print("Gioi han so chuoi: ");
		limit = sc.nextInt();
		
		String[] a = str.split(regex, limit);
		System.out.println("\nChuoi [" + str + "] bi tach thanh " + a.length + " chuoi: ");
		for(int i = 0; i < a.length; i++)
			System.out.println("[" + a[i] + "]");
	}
	public static void main(String[] args) {
		StringDivide str = new StringDivide();
		
		str.input();
		str.Divide();
	}

}
