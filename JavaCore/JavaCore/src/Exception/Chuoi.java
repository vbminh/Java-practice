package Exception;
import java.util.*;

public class Chuoi {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str;
		try {
			System.out.print("Nhập vào một chuỗi: ");
			str  = sc.nextLine();
			
			int choice;
			boolean flag = true;
			
			do {
				System.out.println("\n1. Hiển thị mỗi kí tự trong chuỗi trên 1 dòng" + "\n2. Hiển thị mỗi kí tự trong chuỗi trên 1 dòng, bỏ space" + "\n3. Hiển thị số lần xuất hiện của mỗi kí tự trong chuỗi");
				System.out.print("\nYour choice: ");
				choice = sc.nextInt();
				switch (choice) {
				case 1: {
					char[] ch = str.toCharArray();
					for(int i = 0; i < ch.length; i++)
						System.out.println(ch[i]);
					System.out.print("Nhấn \"Enter\" để tiếp tục");
					sc.nextLine();
					@SuppressWarnings("unused")
					String enter =sc.nextLine();
					flag = true;
					break;
				}
				case 2: {
					str = str.replaceAll(" ","");
					char[] ch = str.toCharArray();
					for(int i = 0; i < ch.length; i++)
						System.out.println(ch[i]);
					
					System.out.print("Nhấn \"Enter\" để tiếp tục");
					sc.nextLine();
					@SuppressWarnings("unused")
					String enter =sc.nextLine();
					flag = true;
					break;
				}
				case 3: {
					HashMap<Character, Integer> CountCharInString = new HashMap<Character, Integer>();
					char[] ch = str.toCharArray();
					
					for(char c : ch) {
						if(CountCharInString.containsKey(c)) {
							CountCharInString.put(c, CountCharInString.get(c) + 1);
						}
						else
							CountCharInString.put(c, 1);
					}
					System.out.println("Số lần xuất hiện của các kí tự trong chuỗi: \n" + CountCharInString);
					
					System.out.print("Nhấn \"Enter\" để tiếp tục");
					sc.nextLine();
					@SuppressWarnings("unused")
					String enter =sc.nextLine();
					flag = true;
					break;
				}
				
				default:
					System.out.print("\n Lựa chọn không chính xác. Thoát chương trình");
					flag = false;
					break;
				}
			}while(flag);
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		sc.close();
	}

}
