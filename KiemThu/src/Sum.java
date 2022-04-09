import java.util.Scanner;

public class Sum {
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.print("Nhap n: ");
		int n = sc.nextInt();
		int m = 0;
		int T = 0;
		while(n != 0) {
			m = n % 10;
			T += m;
			n /= 10;
		}
		
		System.out.println("Tong cac so hang cua " + n + " la: " + T);
		if(T % 2 == 0)
			System.out.println("Tong chan");
		else
			System.out.println("Tong le");
	}
}
