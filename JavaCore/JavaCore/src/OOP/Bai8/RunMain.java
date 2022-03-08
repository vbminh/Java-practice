package OOP.Bai8;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RunMain {
	
	static List<NhanVien> list = new ArrayList<NhanVien>();
	static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		String choice;
		
		try {
			do {
				System.out.println("\t====Quản lý nhân viên====");
				System.out.printf("%s\n%s\n%s\n%s\n","1. Thêm nhân viên","2. Hiển thị danh sách nhân viên","3. Sắp xếp danh sách nhân viên","4. Thoát");
				//Check if choice is corrected
				do {
					System.out.print("Bạn chọn: ");
					choice = sc.nextLine();
					
					if(!choice.equals("1") && !choice.equals("2") && !choice.equals("3") && !choice.equals("4"))
						System.out.println("Lựa chọn không hợp lệ. Hãy chọn lại");
					
				}while(!choice.equals("1") && !choice.equals("2") && !choice.equals("3") && !choice.equals("4"));
				//Control menu
				switch (choice) {
				//input
				case "1": {
					String choice1;
					do {
						System.out.printf("%s\n%s\n%s\n","1. Nhân viên","2. Nhân viên bán hàng","\tChọn 0 để quay lai");
						//Check if choice1 is corrected
						do {
							System.out.print("Bạn chọn: ");
							choice1 = sc.nextLine();
							
							if(!choice1.equals("1") && !choice1.equals("2") && !choice1.equals("0"))
								System.out.println("Lựa chọn không hợp lệ. Hãy chọn lại");
							
						}while(!choice1.equals("1") && !choice1.equals("2") && !choice1.equals("0"));
						//Control sub-menu
						switch (choice1) {
						//input NV
						case "1": {
							System.out.println("Nhập thông tin Nhân viên: ");
							String opt = "";
							while (!opt.equals("n")) {
								NhanVien nv = inputNV();
								list.add(nv);
								System.out.print("Nhấn \"n\" nếu bạn không tạo thêm nv nào nữa ");
								opt = sc.nextLine();
							}
							
							break;
						}
						//input NVBH
						case "2": {
							System.out.println("Nhập thông tin Nhân viên hợp đồng: ");
							list.forEach(item -> System.out.println(item));
							break;
						}
						}
						
					}while(!choice1.equals("0"));
					
					break;
				}
				//output
				case "2": {
					
					break;
				}
				//sort
				case "3": {
					
					break;
				}
				//close
				case "4": {
					System.out.println("Hẹn gặp lại");
					break;
				}
				}
			}while(!choice.equals("4"));
		}
		catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}

	}
	
	public static NhanVien inputNV() {
		System.out.print("Nhập mã nv: ");
		String id = sc.nextLine();
		NhanVien nv = new NhanVien(id);
		if(list.indexOf(id)!= -1) {
			System.out.print("Mã nhân viên này đã tồn tại. Hãy nhập lại: ");
			id = sc.nextLine();
		}
		
		System.out.print("Nhập tên nv: ");
		String name = sc.nextLine();
		
		System.out.print("Nhập giới tính: ");
		String sex = sc.nextLine();
		
		LocalDate now = LocalDate.now();
		String dates;
		do {
			System.out.println("Nhập ngày tuyển dụng:  ");
			System.out.print("Ngày: ");
			String day = sc.nextLine();
			if(isDigit(day))
			{
				if(Integer.parseInt(day) < 0 || Integer.parseInt(day) > 31)
				{
					System.out.print("Ngày không hợp lệ. Hãy nhập lại: ");
					day = sc.nextLine();
				}
			}
			else
			{
				System.out.print("Ngày không hợp lệ. Hãy nhập lại: ");
				day = sc.nextLine();
			}
			System.out.print("Tháng: ");
			String month = sc.nextLine();
			if(isDigit(month))
			{
				if(Integer.parseInt(month) < 0 || Integer.parseInt(month) > 12)
				{
					System.out.print("Tháng không hợp lệ. Hãy nhập lại: ");
					month = sc.nextLine();
				}
			}
			else
			{
				System.out.print("Tháng không hợp lệ. Hãy nhập lại: ");
				month = sc.nextLine();
			}
			
			System.out.print("Năm: ");
			String year = sc.nextLine();
			if(isDigit(year))
			{
				if(Integer.parseInt(year) < 0 || (now.getYear() - Integer.parseInt(year) < 0))
				{
					System.out.print("Năm không hợp lệ. Hãy nhập lại: ");
					year = sc.nextLine();
				}
			}
			else
			{
				System.out.print("Năm không hợp lệ. Hãy nhập lại: ");
				year = sc.nextLine();
			}
			
			dates = day + "/" + month + "/" + year;
			if(now.isBefore(LocalDate.parse(dates, dtf))) 
				System.out.println("Ngày tuyển dụng không được lớn hơn ngày hiện tại . Hãy nhập lại: ");
		}while(now.isBefore(LocalDate.parse(dates, dtf)));
		return new NhanVien(id,name,sex,dates);
	}
	
	public static boolean isDigit(String str) {
		if(str == null || str.length() == 0)
			return false;
		for(char c : str.toCharArray())
			if(c < '0' || c > '9')
				return false;
		return true;
	}
}
