package OOP.Bai4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RunMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<ThisinhA> list = new ArrayList<ThisinhA>();
		String opt = "";
		Boolean flag = true;
		
		try {
			System.out.println("\t======Thí sinh======");
			System.out.println("1. Nhập thông tin 1 thí sinh" + 
								"\n2. Hiển thị danh sách các thí sinh" +
								"\n3. Hiển thị các sinh viên theo tổng điểm" +
								"\n4. Hiển thị các sinh viên theo địa chỉ" +
								"\n5. Tìm kiếm theo số báo danh" +
								"\n6. Kết thúc chương trình");
			
			do {
				@SuppressWarnings("unused")
				String enter = "";
				
				do {
					System.out.print("Nhập lựa chọn của bạn: ");
					opt = sc.nextLine();
					
					if(!opt.equals("1") && !opt.equals("2") && !opt.equals("3") &&
						!opt.equals("4") && !opt.equals("5") && !opt.equals("6"))
						System.out.println("Lựa chọn không chính xác. Hãy nhập lại");
					
				}while(!opt.equals("1") && !opt.equals("2") && !opt.equals("3") &&
						!opt.equals("4") && !opt.equals("5") && !opt.equals("6"));
				
				
				switch (opt) {
				case "1": {
					System.out.println("Nhập thông tin 1 thí sinh:");
					int index;
					String masv = "";
					do {
						System.out.print("Nhập mã thí sinh: ");
						masv = sc.nextLine();
						
						ThisinhA ts = new ThisinhA(masv);
						index = list.indexOf(ts);
						
						if(index != -1)
							System.out.println("Mã thí sinh này đã tồn tại. Hãy nhập lại");
					}while(index != -1);
					
					System.out.print("Nhập tên thí sinh: ");
					String tensv = sc.nextLine();
					
					System.out.print("Nhập địa chỉ: ");
					String diachi = sc.nextLine();
					
					System.out.print("Nhập điểm toán: ");
					double diemToan = sc.nextDouble();
					while (diemToan < 0 || diemToan > 10) {
						System.out.println("Điểm không hợp lệ. Hãy nhập lại");
						System.out.print("Nhập điểm toán: ");
						diemToan = sc.nextDouble();
					}
					
					System.out.print("Nhập điểm lý: ");
					double diemLy = sc.nextDouble();
					while (diemLy < 0 || diemLy > 10) {
						System.out.println("Điểm không hợp lệ. Hãy nhập lại");
						System.out.print("Nhập điểm lý: ");
						diemLy = sc.nextDouble();
					}
					
					System.out.print("Nhập điểm hóa: ");
					double diemHoa = sc.nextDouble();
					while (diemHoa < 0 || diemHoa > 10) {
						System.out.println("Điểm không hợp lệ. Hãy nhập lại");
						System.out.print("Nhập điểm hoá: ");
						diemHoa = sc.nextDouble();
					}
					
					System.out.print("Nhập điểm ưu tiên: ");
					double diemUT = sc.nextDouble();
					while (diemUT < 0 || diemUT > 2) {
						System.out.println("Điểm ưu tiên không hợp lệ. Hãy nhập lại");
						System.out.print("Nhập điểm ưu tiên: ");
						diemUT = sc.nextDouble();
					}
					
					list.add(new ThisinhA(masv,tensv,diachi,diemToan,diemLy,diemHoa,diemUT));
					
					System.out.print("Nhấn \"enter\" để tiếp tục");
					sc.nextLine();
					enter = sc.nextLine();
					flag = true;
					break;
				}
				case "2": {
					System.out.println("Hiển thị danh sách các thí sinh:");
					if(list.size() > 0) {
						System.out.println(String.format("%5s %15s %10s %5s %5s %5s %10s %10s","Mã","Tên","Địa chỉ","Toán","Lý","Hóa","Điểm UT","Tổng điểm"));
						for(ThisinhA item : list)
							System.out.println(item);
					}
					else
						System.out.println("Chưa có thí sinh nào trong danh sách. Hãy chọn thêm mới");
					
					System.out.print("Nhấn \"enter\" để tiếp tục");
					enter = sc.nextLine();
					flag = true;
					break;
				}
				case "3": {
					System.out.println("Hiển thị danh sách các thí sinh theo tổng điểm:");
					double tdiem = 0;
					do {
						System.out.print("Nhập tổng điểm: ");
						tdiem = sc.nextDouble();
						if(tdiem < 0 || tdiem > 32)
							System.out.println("Tổng điểm phải lớn hơn 0 và nhỏ hơn 32. Hãy nhập lại");
					}while(tdiem < 0 || tdiem > 32);
					
					List<ThisinhA> list2 = new ArrayList<ThisinhA>();
					for(ThisinhA item : list) {
						if(item.TongDiem() >= tdiem)
							list2.add(item);
					}
					
					if(list2.size() > 0) {
						System.out.println(String.format("%5s %15s %10s %5s %5s %5s %10s %10s","Mã","Tên","Địa chỉ","Toán","Lý","Hóa","Điểm UT","Tổng điểm"));
						for(ThisinhA item : list2)
							System.out.println(item);
					}
					else
						System.out.println("Không có thí sinh nào có tổng điểm >= " + tdiem);
					
					System.out.print("Nhấn \"enter\" để tiếp tục");
					sc.nextLine();
					enter = sc.nextLine();
					flag = true;
					break;
				}
				case "4": {
					System.out.println("Hiển thị danh sách các thí sinh theo địa chỉ:");
					String dchi = sc.nextLine();
					
					List<ThisinhA> list2 = new ArrayList<ThisinhA>();
					for(ThisinhA item : list) {
						if(item.getDiaChi().equals(dchi))
							list2.add(item);
					}
					
					if(list2.size() > 0) {
						System.out.println(String.format("%5s %15s %10s %5s %5s %5s %10s %10s","Mã","Tên","Địa chỉ","Toán","Lý","Hóa","Điểm UT","Tổng điểm"));
						for(ThisinhA item : list2)
							System.out.println(item);
					}
					else
						System.out.println("Không có thí sinh nào có địa chỉ là \"" + dchi +"\"");
					
					System.out.print("Nhấn \"enter\" để tiếp tục");
					sc.nextLine();
					enter = sc.nextLine();
					flag = true;
					break;
				}
				case "5": {
					System.out.println("Tìm thí sinh:");
					
					System.out.print("Nhập mã thí sinh: ");
					String id = sc.nextLine();
					
					
					List<ThisinhA> list2 = new ArrayList<ThisinhA>();
					for(ThisinhA item : list) {
						if(item.getMaSv().equals(id))
							list2.add(item);
					}
					
					if(list2.size() > 0) {
						System.out.println(String.format("%5s %15s %10s %5s %5s %5s %10s %10s","Mã","Tên","Địa chỉ","Toán","Lý","Hóa","Điểm UT","Tổng điểm"));
						for(ThisinhA item : list2)
							System.out.println(item);
					}
					else
						System.out.println("Không có thí sinh nào có mã " + id);
					
					System.out.print("Nhấn \"enter\" để tiếp tục");
					sc.nextLine();
					enter = sc.nextLine();
					flag = true;
					break;
				}
				case "6": {
					System.out.print("Hẹn gặp lại!!");
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
