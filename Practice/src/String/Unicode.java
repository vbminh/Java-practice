package String;

import java.util.Scanner;


public class Unicode {
	private String str;
	
	public Unicode() {
		
	}
	
	public Unicode(String str) {
		this.str = str;
	}
	
	public void setStr(String str) {
		this.str = str;
	}
	
	public String getStr() {
		return str;
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap chuoi: ");
		str = sc.nextLine();
	}
	
	public void StringUnicode() {
		int x;
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap vi tri can tra ve ki tu ma hoa: ");
		x = sc.nextInt();
		
		System.out.print("\nKi tu vi tri thu " + x + " trong chuoi [" + str + "] co ma Unicode la: " + str.codePointBefore(x));
	}
	
	public static void main(String[] args) {
		Unicode str = new Unicode();
		
		str.nhap();
		str.StringUnicode();

	}

}
