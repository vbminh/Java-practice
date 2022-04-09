import java.util.Scanner;

public class S {
	public static Scanner sc = new Scanner(System.in);
	
	public static boolean SoChinhPhuong(int n) {
		if(n < 1)
			return false;
		
		int i = (int) Math.sqrt(n);
		if(Math.pow(i, 2) == n)
			return true;
		else
			return false;
	}
	public static void main(String[] args) {
		System.out.println("Nhap n: ");
		int n = sc.nextInt();
		
		if(n < 1)
			System.out.println("Không có số chính phương nào nhỏ hơn 2");
		else {
			for(int i = 1; i < n; i++) {
				int j = (int) Math.sqrt(i);
				if(Math.pow(j, 2) == i)
					System.out.println(i + " ");
			}
		}
	}
}
