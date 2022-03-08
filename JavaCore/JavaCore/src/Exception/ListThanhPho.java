package Exception;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ListThanhPho {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<String> list = new ArrayList<String>();
		System.out.println("Nhập vào danh sách thành phố: ");
		String choice = "";
		while (!choice.equals("e")) {
			System.out.print("Tên thành phố: ");
			String city = sc.nextLine();
			list.add(city);
			System.out.print("\nNhấn \"e\" để kết thúc nhập ");
			choice = sc.nextLine();
		}
		//Sd biểu thức Lamda sắp xếp tên các tp
		Collections.sort(list,(String s1, String s2) -> {
			return s1.compareTo(s2);
		});
		System.out.println("\nDanh sách các thành phố đã nhập: ");
		for(String item : list) {
			System.out.println(item);
		}
		
		System.out.print("\nNhập tên thành phố bạn muốn xóa: ");
		String cityDel = sc.nextLine();
		int index = list.indexOf(cityDel);
		if(index != -1) {
			list.remove(cityDel);
			System.out.println("\nDanh sách các thành phố sau khi xóa \"" + cityDel + "\": ");
			for(String item : list) {
				System.out.println(item);
			}
		}
		else
			System.out.println("\nKhông tồn tại thành phố \"" + cityDel + "\" trong danh sách");
		
		sc.close();
	}

}
