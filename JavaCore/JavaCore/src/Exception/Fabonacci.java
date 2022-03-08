package Exception;
import java.util.*;

public class Fabonacci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		try {
			do {
				System.out.print("Nhap so nguyen n: ");
				n = sc.nextInt();
				if(n <= 0)
					System.out.println("Ban phai nhap mot so nguyen duong. Hay nhap lai!");
			}while(n <= 0);
			
			System.out.println("\n" + n + " so fabonacci dau tien la: ");
			for(int i = 0; i < n; i++) {
				if(i == (n - 1))
					System.out.print(fabonacci(i));
				else
				System.out.print(fabonacci(i) + ", ");
			}
		}
		catch(InputMismatchException e) {
			System.out.print("Ban phai nhap mot so nguyen duong ");
		}
		sc.close();
	}

	private static int fabonacci(int n) {
		int sum = 0;
		if(n == 0)
			sum = 0;
		else if(n == 1) 
			sum = 1;
		else 
			sum = fabonacci(n - 1) + fabonacci(n - 2);
		return sum;
		
	}
}
