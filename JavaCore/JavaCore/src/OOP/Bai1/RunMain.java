package OOP.Bai1;

import java.util.Scanner;

public class RunMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhập thông tin:");
		System.out.print("Nhập mã: ");
		String id = sc.nextLine();
		System.out.print("Nhập tên: ");
		String name = sc.nextLine();
		System.out.print("Nhập tuổi: ");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.print("Nhập email: ");
		String email = sc.nextLine();
		System.out.print("Nhập địa chỉ: ");
		String address = sc.nextLine();
		
		Person pr = new Person(id,name,age,email,address);
		System.out.print(pr.checkAge());
		sc.close();
	}

}
