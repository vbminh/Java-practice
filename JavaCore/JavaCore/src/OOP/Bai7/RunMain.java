package OOP.Bai7;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class RunMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String choice;
		
		List<KhachHang> list = new ArrayList<KhachHang>();
		try {
			do {
				System.out.println("\t=====Quản lý khách hàng=====");
				System.out.println("1. Nhập thông tin" + "\n2. Hiển thị danh sách" + "\n3. Sắp xếp danh sách" + "\n4. Thoát");
				
				do {
					System.out.print("Bạn chọn: ");
					choice = sc.nextLine();
					
					if(!choice.equals("1") && !choice.equals("2")
						&& !choice.equals("3") && !choice.equals("4"))
						System.out.println("Lựa chọn không hợp lệ. Hãy chọn lại");
					
				}while(!choice.equals("1") && !choice.equals("2")
						&& !choice.equals("3") && !choice.equals("4"));

				@SuppressWarnings("unused")
				String enter;

				switch (choice) {
				case "1": {
					String choice1;
					do {
						System.out.println("1. Khách hàng" + "\n2. Khách hàng thân thiết" + "\n	Chọn 0 để quay lại");
						do {
							System.out.print("Bạn chọn: ");
							choice1 = sc.nextLine();
							
							if(!choice1.equals("1") && !choice1.equals("2") && !choice1.equals("0"))
								System.out.println("Lựa chọn không hợp lệ. Hãy chọn lại");
						}while(!choice1.equals("1") && !choice1.equals("2") && !choice1.equals("0"));
						
						switch (choice1) {
						case "1": {
							System.out.println("Nhập thông tin khách hàng:");
							String opt = "";
							while (!opt.equals("n")) {
								int index;
								String id;
								do {
									System.out.print("Nhập mã khách hàng: ");
									id = sc.nextLine();
									
									KhachHang kh = new KhachHang(id);
									index = list.indexOf(kh);
									
									if(index != -1)
										System.out.println("Không được trùng mã khách hàng. Hãy nhập lại");
								}while(index != -1);
								
								System.out.print("Nhập họ tên: ");
								String name = sc.nextLine();
								
								String sex;
								do {
									System.out.print("Nhập giới tính: ");
									sex = sc.nextLine();
									
									if(!sex.toUpperCase().equals("NAM") && !sex.toUpperCase().equals("NỮ"))
										System.out.println("Giới tính không hợp lệ. Hãy nhập lại");
								}while(!sex.toUpperCase().equals("NAM") && !sex.toUpperCase().equals("NỮ"));
								
								DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
								LocalDate now = LocalDate.now();
								
								String birthday;
								LocalDate birth;
								do {
									System.out.print("Nhập ngày sinh: ");
									birthday = sc.nextLine();
									birth = LocalDate.parse(birthday, dtf);
									
									if(now.isBefore(birth))
										System.out.println("Ngày sinh phải nhỏ hơn ngày hiện tại. Hãy nhập lại");
								}while(now.isBefore(birth));
								
								int num;
								do {
									System.out.print("Nhập số lượng mua: ");
									num = sc.nextInt();
									
									if(num < 0)
										System.out.println("Số lượng mua phải lớn hơn 0. Hãy nhập lại");
								}while(num <= 0);
								
								double price;
								do {
									System.out.print("Nhập đơn giá: ");
									price = sc.nextDouble();
									
									if(price < 0)
										System.out.println("Đơn giá phải lớn hơn 0. Hãy nhập lại");
								}while(price < 0);
								
								list.add(new KhachHang(id, name, sex, birthday,num, price));
								
								System.out.print("Nhập \"n\" để kết thúc nhập ");
								sc.nextLine();
								opt = sc.nextLine();
							}

							break;
						}
						
						case "2": {
							System.out.println("Nhập thông tin khách hàng thân thiết:");
							String opt = "";
							while (!opt.equals("n")) {
								int index;
								String id;
								do {
									System.out.print("Nhập mã khách hàng: ");
									id = sc.nextLine();
									
									KhachHang kh = new KhachHang(id);
									index = list.indexOf(kh);
									
									if(index != -1)
										System.out.println("Không được trùng mã khách hàng. Hãy nhập lại");
								}while(index != -1);
								
								System.out.print("Nhập họ tên: ");
								String name = sc.nextLine();
								
								String sex;
								do {
									System.out.print("Nhập giới tính: ");
									sex = sc.nextLine();
									
									if(!sex.toUpperCase().equals("NAM") && !sex.toUpperCase().equals("NỮ"))
										System.out.println("Giới tính không hợp lệ. Hãy nhập lại");
								}while(!sex.toUpperCase().equals("NAM") && !sex.toUpperCase().equals("NỮ"));
								
								DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
								LocalDate now = LocalDate.now();
								
								String birthday;
								LocalDate birth;
								do {
									System.out.print("Nhập ngày sinh: ");
									birthday = sc.nextLine();
									birth = LocalDate.parse(birthday, dtf);
									
									if(now.isBefore(birth))
										System.out.println("Ngày sinh phải nhỏ hơn ngày hiện tại. Hãy nhập lại");
								}while(now.isBefore(birth));
								
								int num;
								do {
									System.out.print("Nhập số lượng mua: ");
									num = sc.nextInt();
									
									if(num < 0)
										System.out.println("Số lượng mua phải lớn hơn 0. Hãy nhập lại");
								}while(num <= 0);
								
								double price;
								do {
									System.out.print("Nhập đơn giá: ");
									price = sc.nextDouble();
									
									if(price < 0)
										System.out.println("Đơn giá phải lớn hơn 0. Hãy nhập lại");
								}while(price < 0);
								
								list.add(new KhachHangThanThiet(id, name, sex, birthday,num, price));
								
								System.out.print("Nhập \"n\" để kết thúc nhập ");
								sc.nextLine();
								opt = sc.nextLine();
							}
							
							break;
						}
						}
					}while(!choice1.equals("0"));
				
					break;
				}

				case "2": {
					if(list.size() > 0) {
						System.out.println("Hiển thị danh sách:");
						System.out.println(String.format("%5s %10s %10s %10s %10s %10s %10s %10s","Mã KH", "Họ tên", "Giới tính", "Ngày sinh",
								"Số lượng mua", "Đơn giá", "Giảm giá","Tổng tiền"));
						list.forEach(item -> System.out.println(item));
					}
					else
						System.out.println("Chưa có khách hàng nào trong danh sách. Hãy thêm mới");
					
					
					System.out.print("Nhấn \"enter\" để tiếp tục");
					enter = sc.nextLine();
					break;
				}
				
				case "3": {
					if(list.size() > 0) {
						System.out.println("Danh sách trước khi sắp xếp: ");
						System.out.println(String.format("%5s %10s %10s %10s %10s %10s %10s %10s","Mã KH", "Họ tên", "Giới tính", "Ngày sinh",
								"Số lượng mua", "Đơn giá", "Giảm giá","Tổng tiền"));
						list.forEach(item -> System.out.println(item));
						
						Collections.sort(list, (KhachHang kh1, KhachHang kh2) -> {
							if(kh1.getDonGia() == kh2.getDonGia()) {
								return kh1.getSoLuongMua() > kh2.getSoLuongMua()? 1 : -1;
							}
							return kh1.getDonGia() > kh2.getDonGia()? 1 : -1;
						});
						
						System.out.println("Danh sách sau khi sắp xếp: ");
						System.out.println(String.format("%5s %10s %10s %10s %10s %10s %10s %10s","Mã KH", "Họ tên", "Giới tính", "Ngày sinh",
								"Số lượng mua", "Đơn giá", "Giảm giá","Tổng tiền"));
						list.forEach(item -> System.out.println(item));
					}
					else
						System.out.println("Chưa có khách hàng nào trong danh sách. Hãy thêm mới");
					
					System.out.print("Nhấn \"enter\" để tiếp tục");
					enter = sc.nextLine();
					break;
				}
				
				case "4": {
					System.out.print("Hẹn gặp lại");
					break;
				}
				}
			}while(!choice.equals("4"));
		}
		catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
		sc.close();
	}

    public static boolean isDigit(String input) {
        if (input == null || input.length() < 0)
            return false;
        // empty -> false
        input = input.trim();
        if ("".equals(input))
            return false;
        if (input.startsWith("-")) {
            return input.substring(1).matches("[0-9]*");
        } else {
            return input.matches("[0-9]*");
        }
    }
}
