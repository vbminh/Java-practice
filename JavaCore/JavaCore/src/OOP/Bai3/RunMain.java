package OOP.Bai3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RunMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<Student> list = new ArrayList<Student>();
		
		System.out.println("Nhập thông tin sinh viên: ");
		
		String choice = "";
		while (!choice.equals("e")) {
			System.out.print("Nhập mã sv: ");
			String id = sc.nextLine();
			System.out.print("Nhập tên sv: ");
			String name = sc.nextLine();
			double mark = 0;
			do {
				System.out.print("Nhập điểm: ");
				mark = sc.nextDouble();
				if(mark < 0 || mark > 10)
					System.out.println("Điểm của sinh viên không hợp lệ. Hãy nhập lại");
			}while(mark < 0 || mark > 10);
			
			list.add(new Student(id,name,mark));
			System.out.print("Nhấn \"e\" để kết thúc nhập ");
			sc.nextLine();
			choice = sc.nextLine();
		}
		
		System.out.println("\nDanh sách sv vừa nhập: ");
		System.out.println(String.format("%5s %10s %5s %5s","Mã sv","Tên sv","Điểm","Học bổng"));
		for(Student std : list) {
			System.out.println(std);
		}
		
		sc.close();
	}

}
