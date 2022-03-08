package OOP.Bai5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RunMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String choice = "";
		Boolean flag = true;
		
		List<Student> list = new ArrayList<Student>();
		try {
			System.out.println("\t======Sinh Viên======");
			System.out.println("1. Thêm một sinh viên" +
								"\n2. Hiển thị danh sách sinh viên" +
								"\n3. Tìm kiếm sinh viên theo id" +
								"\n4. Tìm kiếm sinh viên theo address" +
								"\n5. Xóa một sinh viên" + 
								"\n6. Kết thúc chương trình");
			
			do {
				do {
					System.out.print("Lựa chọn của bạn: ");
					choice= sc.nextLine();
					
					if(!choice.equals("1") && !choice.equals("2") && !choice.equals("3")
						&& !choice.equals("4") && !choice.equals("5") && !choice.equals("6"))
						System.out.println("Lựa chọn không hợp lệ. Hãy chọn lại");
				}while(!choice.equals("1") && !choice.equals("2") && !choice.equals("3")
						&& !choice.equals("4") && !choice.equals("5") && !choice.equals("6"));
				
				@SuppressWarnings("unused")
				String enter;
				
				switch(choice) {
				case "1": {
					System.out.println("Thêm một sinh viên: ");
					int index = 0;
					int id;
					do {
						System.out.print("id: ");
						id = sc.nextInt();
						Student sv = new Student(id);
						index = list.indexOf(sv);
						if(index != -1)
							System.out.println("Mã sinh viên này đã tồn tại.Hãy nhập lại");
					}while(index != -1);
					
					System.out.print("name: ");
					sc.nextLine();
					String name = sc.nextLine();
					
					System.out.print("address: ");
					String address = sc.nextLine();
					
					byte math, physics;
					do {
						System.out.print("math: ");
						math = sc.nextByte();
						if(math < 0 || math > 10)
							System.out.println("Điểm không hợp lệ. Hãy nhập lại");
					}while(math < 0 || math > 10);
					
					do {
						System.out.print("physics: ");
						physics = sc.nextByte();
						if(physics < 0 || physics > 10)
							System.out.println("Điểm không hợp lệ. Hãy nhập lại");
					}while(physics < 0 || physics > 10);
					
					Student std = new Student(id, name, address, math, physics);
					list.add(std);
					
					System.out.print("Nhấn \"enter\" để tiếp tục");
					sc.nextLine();
					enter = sc.nextLine();
					flag = true;
					break;
				}
				case "2": {
					if(list.size() > 0) {
						System.out.println("Hiển thị danh sách: ");
						System.out.println(String.format("%5s %10s %10s %5s %5s %5s",
								"id", "name","address","math","physics","total"));
						for(Student item : list) {
							System.out.println(item);
						}
					}
					else
						System.out.println("Chưa có sinh viên nào trong danh sách. Hãy thêm mới");
					
					System.out.print("Nhấn \"enter\" để tiếp tục");
					enter = sc.nextLine();
					flag = true;
					break;
				}
				case "3": {
					if(list.size() > 0) {
						System.out.println("Tìm kiếm sinh viên: ");
						System.out.print("Nhập mã sv bạn muốn tìm: ");
						int id = sc.nextInt();
						Student sv = new Student(id);
						int index = list.indexOf(sv);
						if(index != -1) {
							System.out.println(String.format("%5s %10s %10s %5s %5s %5s",
									"id", "name","address","math","physics","total"));
							
							System.out.println(list.get(index));
						}
						else
							System.out.println("Không tồn tại sv này trong danh sách");
						}
					else
						System.out.println("Chưa có sinh viên nào trong danh sách. Hãy thêm mới");
					
					System.out.print("Nhấn \"enter\" để tiếp tục");
					sc.nextLine();
					enter = sc.nextLine();
					flag = true;
					break;
				}
				case "4": {
					if(list.size() > 0) {
						System.out.println("Tìm kiếm sinh viên: ");
						System.out.print("Nhập địa chỉ bạn muốn tìm: ");
						String address = sc.nextLine();
						List<Student> list2 = new ArrayList<Student>();
						for(Student item : list) {
							if(item.getAddress().equals(address))
								list2.add(item);
						}
						if(list2.size() > 0) {
							System.out.println(String.format("%5s %10s %10s %5s %5s %5s",
									"id", "name","address","math","physics","total"));
							
							for(Student item : list2) {
								System.out.println(item);
							}
						}
						else
							System.out.println("Không tồn tại sv này trong danh sách");
						}
					else
						System.out.println("Chưa có sinh viên nào trong danh sách. Hãy thêm mới");
					
					System.out.print("Nhấn \"enter\" để tiếp tục");
					enter = sc.nextLine();
					flag = true;
					break;
				}
				case "5": {
					if(list.size() > 0) {
						System.out.println("Xóa sinh viên: ");
						System.out.print("Nhập mã sv bạn muốn xóa: ");
						int id = sc.nextInt();
						Student sv = new Student(id);
						int index = list.indexOf(sv);
						if(index != -1) {
							list.remove(index);
							System.out.println(String.format("%5s %10s %10s %5s %5s %5s",
									"id", "name","address","math","physics","total"));
							
							for(Student item : list) {
								System.out.println(item);
							}
						}
						else
							System.out.println("Không tồn tại sv này trong danh sách");
						}
					else
						System.out.println("Chưa có sinh viên nào trong danh sách. Hãy thêm mới");
					
					System.out.print("Nhấn \"enter\" để tiếp tục");
					sc.nextLine();
					enter = sc.nextLine();
					flag = true;
					break;
				}
				case "6": {
					System.out.print("Hẹn gặp lại");
					flag = false;
					break;
				}
				}
			}while(flag);
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		sc.close();
	}

}
