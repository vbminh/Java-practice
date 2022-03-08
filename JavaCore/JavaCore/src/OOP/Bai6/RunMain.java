package OOP.Bai6;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class RunMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean flag = true;
		String choice;
		
		List<Vehicles> list = new ArrayList<Vehicles>();
		try {
			System.out.println("\t=======Menu=======");
			System.out.println("1. Nhập dữ liệu" + 
								"\n2. HIển thị dữ liệu" + 
								"\n3. Tìm kiếm theo id" +
								"\n4. Tìm kiếm theo maker" +
								"\n5. Sắp xếp theo price" +
								"\n6. Sắp xếp theo year" +
								"\n7. Kết thúc");
			
			do {
				do {
					System.out.print("Lựa chọn của bạn: ");
					choice = sc.nextLine();
					
					if(!choice.equals("1") && !choice.equals("2") && !choice.equals("3") &&
							!choice.equals("4") && !choice.equals("5") && !choice.equals("6") && !choice.equals("7"))
						System.out.println("Lựa chọn không chính xác. Hãy chọn lại");
					
				}while(!choice.equals("1") && !choice.equals("2") && !choice.equals("3") &&
						!choice.equals("4") && !choice.equals("5") && !choice.equals("6") && !choice.equals("7"));
				
				@SuppressWarnings("unused")
				String enter;
				
				switch (choice) {
				case "1": {
					System.out.println("1. Nhập car" + "\n2. Nhập truck" + "\n3. Quay lại");
					String choice1;
					Boolean flag1 = true;
					
					do {
						do {
							System.out.print("Bạn chọn: ");
							choice1 = sc.nextLine();
							
							if(!choice1.equals("1") && !choice1.equals("2") && !choice1.equals("3"))
									System.out.println("Lựa chọn không hợp lệ. Hãy chọn lại");
						
						} while (!choice1.equals("1") && !choice1.equals("2") && !choice1.equals("3"));
						
						int index1;
						switch (choice1) {
						case "1": {
							String opt = "";
							while (!opt.equals("n")) {
								String id;
								do {
									System.out.print("id: ");
									id = sc.nextLine();
									Vehicles ve = new Vehicles(id);
									index1 = list.indexOf(ve);
									
									if(index1 != -1)
										System.out.println("id này đã tồn tại. Hãy nhập lại");
								}while(index1 != -1);
								
								System.out.print("maker: ");
								String maker = sc.nextLine();
								
								System.out.print("model: ");
								String model = sc.nextLine();
								
								int year, yearOfNow;
								do {
									System.out.print("year: ");
									year = sc.nextInt();
									
									LocalDate now = LocalDate.now();
									yearOfNow = now.getYear();
									
									if((yearOfNow - year) < 0)
										System.out.println("Năm không được lớn hơn năm hiện tại. Hãy nhập lại");
								}while((yearOfNow - year) < 0);
								
								double price;
								do {
									System.out.print("price: ");
									price = sc.nextDouble();
									
									if(price < 0)
										System.out.println("Giá không được nhỏ hơn 0. Hãy nhập lại");
								}while(price < 0);
								
								sc.nextLine();
								System.out.print("color: ");
								String color = sc.nextLine();
								
								list.add(new Car(id,maker,model,year,price,color));
								
								System.out.print("Nhấn \"n\" để két thúc nhập ");
								opt = sc.nextLine();
							}
							
							flag1 = true;
							break;
						}
						case "2": {
							String opt = "";
							while (!opt.equals("n")) {
								String id;
								do {
									System.out.print("id: ");
									id = sc.nextLine();
									Vehicles ve = new Vehicles(id);
									index1 = list.indexOf(ve);
									
									if(index1 != -1)
										System.out.println("id này đã tồn tại. Hãy nhập lại");
								}while(index1 != -1);
								
								System.out.print("maker: ");
								String maker = sc.nextLine();
								
								System.out.print("model: ");
								String model = sc.nextLine();
								
								int year, yearOfNow;
								do {
									System.out.print("year: ");
									year = sc.nextInt();
									
									LocalDate now = LocalDate.now();
									yearOfNow = now.getYear();
									
									if((yearOfNow - year) < 0)
										System.out.println("Năm không được lớn hơn năm hiện tại. Hãy nhập lại");
								}while((yearOfNow - year) < 0);
								
								double price;
								do {
									System.out.print("price: ");
									price = sc.nextDouble();
									
									if(price < 0)
										System.out.println("Giá không được nhỏ hơn 0. Hãy nhập lại");
								}while(price < 0);
								
								int truckload;
								do {
									System.out.print("truckload: ");
									truckload = sc.nextInt();
									
									if(truckload < 0)
										System.out.println("Tải trọng không được nhỏ hơn 0. Hãy nhập lại");
								}while(truckload < 0);
								
								list.add(new Truck(id,maker,model,year,price,truckload));
								
								sc.nextLine();
								System.out.print("Nhấn \"n\" để két thúc nhập ");
								opt = sc.nextLine();
							}
							
							flag1 = true;
							break;
						}
						
						case "3": {
							flag1 = false;
							break;
						}
}
					}while(flag1);
					
					System.out.print("Nhấn \"enter\" để tiếp tục");
					enter = sc.nextLine();
					flag = true;
					break;
				}
				
				case "2": {
					if(list.size() > 0) {
						System.out.println("Hiển thị danh sách:");
						System.out.println(String.format("%5s %7s %7s %7s %7s %5s %7s","id","maker","model","year","price","color","truckload"));
						
						for(Vehicles item : list) {
							System.out.println(item);
						}
					}
					else
						System.out.println("Chưa có xe nào trong danh sách. Hãy thêm mới");
					
					System.out.print("Nhấn \"enter\" để tiếp tục");
					enter = sc.nextLine();
					flag = true;
					break;
				}
				
				case "3": {
					if(list.size() > 0) {
						System.out.println("Nhập id bạn muốn tìm kiếm: ");
						String id = sc.nextLine();
						Vehicles ve = new Vehicles(id);
						int index3 = list.indexOf(ve);
						if(index3 != -1) {
							System.out.println(String.format("%5s %7s %7s %7s %7s %5s %7s","id","maker","model","year","price","color","truckload"));
							System.out.println(list.get(index3));
						}
						else
							System.out.println("Không tồn tại id này trong danh sách");
					}
					else
						System.out.println("Chưa có xe nào trong danh sách. Hãy thêm mới");
					
					System.out.print("Nhấn \"enter\" để tiếp tục");
					enter = sc.nextLine();
					flag = true;
					break;
				}
				
				case "4": {
					if(list.size() > 0) {
						System.out.print("Nhập maker bạn muốn tìm: ");
						String maker = sc.nextLine();
						List<Vehicles> list2 = new ArrayList<Vehicles>();
						for(Vehicles item : list) {
							if(item.getMaker().equals(maker))
								list2.add(item);
						}
						
						if(list2.size() > 0) {
							System.out.println(String.format("%5s %7s %7s %7s %7s %5s %7s","id","maker","model","year","price","color","truckload"));
							
							for(Vehicles item : list2 ) {
								System.out.println(item);
							}
						}
						else
							System.out.println("Không tồn tại xe nào có maker này trong danh sách");
					}
					else
						System.out.println("Chưa có xe nào trong danh sách. Hãy thêm mới");
					
					System.out.print("Nhấn \"enter\" để tiếp tục");
					enter = sc.nextLine();
					flag = true;
					break;
				}
				
				case "5": {
					if(list.size() > 0) {
						System.out.println("Danh sách trước khi sắp xếp: ");
						System.out.println(String.format("%5s %7s %7s %7s %7s %5s %7s","id","maker","model","year","price","color","truckload"));
						
						for(Vehicles item : list) {
							System.out.println(item);
						}
						Collections.sort(list,(Vehicles o1, Vehicles o2) -> {
							return o1.getPrice() > o2.getPrice()? 1 : -1;
						});
						
						System.out.println("Danh sách sau khi sắp xếp: ");
						System.out.println(String.format("%5s %7s %7s %7s %7s %5s %7s","id","maker","model","year","price","color","truckload"));
						
						list.forEach(item -> System.out.println(item));
					}
					else
						System.out.println("Chưa có xe nào trong danh sách. Hãy thêm mới");
					
					System.out.print("Nhấn \"enter\" để tiếp tục");
					enter = sc.nextLine();
					flag = true;
					break;
				}
				
				case "6": {
					if(list.size() > 0) {
						System.out.println("Danh sách trước khi sắp xếp: ");
						System.out.println(String.format("%5s %7s %7s %7s %7s %5s %7s","id","maker","model","year","price","color","truckload"));
						
						for(Vehicles item : list) {
							System.out.println(item);
						}
						Collections.sort(list,(Vehicles o1, Vehicles o2) -> {
							return o1.getYear() > o2.getYear()? 1 : -1;
						});
						
						System.out.println("Danh sách sau khi sắp xếp: ");
						System.out.println(String.format("%5s %7s %7s %7s %7s %5s %7s","id","maker","model","year","price","color","truckload"));
						
						list.forEach(item -> System.out.println(item));
					}
					else
						System.out.println("Chưa có xe nào trong danh sách. Hãy thêm mới");
					
					System.out.print("Nhấn \"enter\" để tiếp tục");
					enter = sc.nextLine();
					flag = true;
					break;
				}
				
				case "7": {
					System.out.print("Hẹn gặp lại");
					flag = false;
					break;
				}
				}
			}while(flag);
		}
		catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
		sc.close();
	}

}
