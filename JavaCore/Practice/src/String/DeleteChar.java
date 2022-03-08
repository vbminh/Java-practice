package String;

import java.util.Scanner;

public class DeleteChar {
	private String str;
	private String x;
	
	public DeleteChar() {
		
	}
	
	public DeleteChar(String str, String x) {
		this.str = str;
		this.x = x;
	}
	
	public void setStr(String str) {
		this.str = str;
	}
	
	public void setX(String x) {
		this.x = x;
	}
	
	public String getStr() {
		return str;
	}
	
	public String getX() {
		return x;
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap chuoi: ");
		str = sc.nextLine();
		System.out.print("Nhap ki tu muon xoa: ");
		x = sc.nextLine();
	}
	
	public void delete() {
		System.out.println("\nChuoi sau khi xoa ki tu " + x + ": " + str.replace(x,""));
	}
	public static void main(String[] args) {
		DeleteChar str = new DeleteChar();
		
		str.nhap();
		str.delete();

	}

}
