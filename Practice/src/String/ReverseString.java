package String;

import java.util.Scanner;

public class ReverseString {
	private String str;
	
	public ReverseString() {
		
	}
	
	public ReverseString(String str) {
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
	
	public void Reverse() {
		StringBuffer st = new StringBuffer(str);
		st.reverse();
		System.out.print("\nChuoi [" + str + "] sau khi dao la: " + st);
	}
	public static void main(String[] args) {
		ReverseString str = new ReverseString();
		
		str.input();
		str.Reverse();

	}

}
