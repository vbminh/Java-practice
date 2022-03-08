package Exception;
import java.util.*;

public class Danhsach {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<Integer> list = new ArrayList<Integer>();
		try {
			String opt = "";
			while(opt.equals("e") == false) {
				System.out.print("Nhập giá trị của phần tử: ");
				int n = sc.nextInt();
				list.add(n);
				sc.nextLine();
				System.out.print("Nhập \"e\" để kết thúc	");
				opt = sc.nextLine();
				System.out.println();
			}
			System.out.println("\nDanh sách số nguyên vừa nhập là:");
			for(int item : list) {
				System.out.print(item + " ");
			}
			System.out.println("\nCác số chẵn trong danh sách là:");
			for(int item : list) {
				if(item % 2 == 0)
					System.out.print(item + " ");
			}
			System.out.println("\nCác số lẻ trong danh sách là:");
			for(int item : list) {
				if(item % 2 != 0)
					System.out.print(item + " ");
			}
			System.out.println("\nCác số nguyên tố trong danh sách là:");
			for(int item : list) {
				if(kiemTraSoNguyenTo(item))
					System.out.print(item + " ");
			}
		}
		catch(InputMismatchException e) {
			System.out.println("\nHãy nhập vào danh sách số nguyên");
		}
		sc.close();
	}
	public static boolean kiemTraSoNguyenTo(int n) {
		if(n < 1)               
			return false;
		for(int i = 2; i < n; i++) {
			if(n % i == 0)
				return false;
		}
		return true;
	}
}
