package Exception;
import java.util.*;

public class Giaithua {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		try {
			do {
				System.out.print("Nhap n: ");
				n = sc.nextInt();
				if(n < 0)
					System.out.print("\nBan phai nhap vao mot so nguyen duong. Hay nhap lai");
			}while(n < 0);
			
			System.out.print("\nGiai thua cua so " + n + " la: " + gt(n));
		}
		catch(InputMismatchException e) {
			System.out.print("\nBan can nhap mot so nguyen duong");
		}
		sc.close();
	}

	private static int gt(int n) {
		int sum;
		if(n == 0 || n == 1) sum = 1;
		else sum = gt(n-1) * n;
		return sum;
	}
}
