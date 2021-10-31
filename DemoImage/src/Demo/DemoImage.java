package Demo;

import java.util.*;

public class DemoImage {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = "Nguyen Ha Trang";
		String name;
		
		System.out.print("\nNhap ten ngiu ban: ");
		do {
			name = sc.nextLine();
			if(str.compareTo(name) != 0) {
				System.out.print("\nNhap sai roit(>.<)Nhap lai nao: ");
				name = sc.nextLine();
			}
		}while(str.compareTo(name) != 0);
		
		
		
		

	}

}
