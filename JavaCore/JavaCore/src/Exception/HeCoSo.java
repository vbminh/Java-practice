package Exception;
import java.util.*;

public class HeCoSo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;
		Boolean flag = true;
		try {
			do {
				do {
					System.out.println("\n1. Doi tu he 10" + "\n2. Doi sang he 10" + "\n3. Thoát");
					System.out.print("Your choice: ");
					choice = sc.nextInt();
					if(choice < 1 && choice > 3)
						System.out.println("Ban hay chon mot lua chon");
				}while(choice < 1 && choice > 3);
				
				int n, B;
				switch(choice) {
				case 1:
					do {
						System.out.print("\nNhap so ban muon doi: ");
						n = sc.nextInt();
						if(n < 0)
							System.out.println("Ban can nhap mot so nguyen duong. Hay nhap lai");
					} while(n < 0);
					
					do {
						System.out.print("Nhap he co so ban muon doi: ");
						B = sc.nextInt();
						if(B != 2 && B != 16)
							System.out.println("Ban can nhap he co so 2 hoac 16. Hay nhap lai");
					}while(B != 2 && B != 16);
					
					if(B == 2) {
						int a = n;
						List<Integer> list = new ArrayList<Integer>();
						while (n > 0) {
							list.add(n % 2);
							n = n / 2;
						}
						Collections.reverse(list);
						System.out.print("\nSo " + a + " doi sang he co so 2: ");
						for(int i : list) {
							System.out.print(i);
						}
						System.out.println();
					}
					if(B == 16) {
						int a = n;
						List<Integer> list = new ArrayList<Integer>();
						while (n > 0) {
							list.add(n % 16);
							n = n / 16;
						}
						Collections.reverse(list);
						System.out.print("\nSo " + a + " doi sang he co so 16: ");
						for(int i : list) {
							if(i == 10) System.out.print("A");
							else if(i == 11) System.out.print("B");
							else if(i == 12) System.out.print("C");
							else if(i == 13) System.out.print("D");
							else if(i == 14) System.out.print("E");
							else if(i == 15) System.out.print("F");
							else System.out.print(i);
						}
						System.out.println();
					}
					
					flag = true;
					break;
				case 2:
					do {
						System.out.print("Nhap he co so ban muon doi: ");
						B = sc.nextInt();
						if(B != 2 && B != 16)
							System.out.println("Ban can nhap he co so 2 hoac 16. Hay nhap lai");
					}while(B != 2 && B != 16);
					
					int check;
					if(B == 2) {
						String str1;
						int[] arr;
						int result = 0;
						sc.nextLine();
						do {
							check = 0;
							System.out.print("\nNhập số bạn muốn đổi: ");
							str1 = sc.nextLine();
							char[] chr = new char[str1.length()];
							chr = str1.toCharArray();
							arr = new int[str1.length()];
							for(int i = 0; i < str1.length(); i++) {
								arr[i] = Integer.parseInt(String.valueOf(chr[i]));
								if(arr[i] != 0 && arr[i] != 1) {
									System.out.println("Bạn cần nhập đúng kiểu dữ liệu. Hãy nhập lại!!!");
									check++;
								}
							}
						} while(check != 0);
						
						for(int i = 0; i < arr.length; i++) {
							result += arr[i] * Math.pow(2,(arr.length - 1 - i));			
						}
						System.out.println("\nSố " + str1 + " đổi thành số ở hệ thập phân là: " + result);
					}
					
					if(B == 16) {
						String str1;
						int[] arr;
						int result = 0;
						sc.nextLine();
						
						System.out.print("\nNhập số bạn muốn đổi: ");
						str1 = sc.nextLine();
						char[] chr = new char[str1.length()];
						chr = str1.toCharArray();
						String[] str2 = new String[str1.length()];
						for(int i = 0; i < str1.length(); i++) {
							str2[i] = Character.toString(chr[i]);
						}
						
						for(int i = 0; i < str2.length; i++ ) {
							if(str2[i] == "A") str2[i] = "10";
							else if(str2[i] == "B") str2[i] = "11";
							else if(str2[i] == "C") str2[i] = "12";
							else if(str2[i] == "D") str2[i] = "13";
							else if(str2[i] == "E") str2[i] = "14";
							else if(str2[i] == "F") str2[i] = "15";
						}
						for(int i = 0; i < str2.length; i++ ) {
							System.out.print(str2[i] + " ");
						}
						arr = new int[str1.length()];
						for(int i = 0; i < str1.length(); i++) {
							arr[i] = Integer.parseInt(str2[i]);
						}
						
						for(int i = 0; i < arr.length; i++) {
							result += arr[i] * Math.pow(16,(arr.length - 1 - i));			
						}
						System.out.println("\nSố " + str1 + " đổi thành số ở hệ thập phân là: " + result);
					}
					flag = true;
					break;
				case 3:
					flag = false;
					System.out.print("\nSee you later");
					break;
				}
			}while(flag);
		}
		catch(InputMismatchException e) {
			System.out.print("\nHay chon mot lua chon");
		}
		sc.close();
	}
	
}
