package Exception;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PhuongThuc {
	//kiểm tra số nguyên tố
	public static boolean isPrime(int n) {
		if(n <= 1) return false;
		for(int i = 2; i < n; i++) {
			if(n % i == 0)
				return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<Integer> list = new ArrayList<Integer>();
		System.out.println("Nhập các phần tử của mảng: ");
		try {
			String choice = "";
			while (!choice.equals("e")) {
				System.out.print("Nhập giá trị phần tử: ");
				int item = sc.nextInt();
				list.add(item);
				System.out.print("\nNhấn \"e\" để kết thúc nhập ");
				sc.nextLine();
				choice = sc.nextLine();
			}
			System.out.print("\nMảng số nguyên vừa nhập là: ");
			for(int i : list) {
				System.out.print(i + "  ");
			}
			System.out.print("\nCác số nguyên tố trong mảng là: ");
			for(int i : list) {
				if(isPrime(i)) {
					System.out.print(i + "  ");
				}
			}
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		sc.close();
	}

}
