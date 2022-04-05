import java.util.Scanner;

public class TamGiac {
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Nhập độ dài 3 cạnh: ");
		System.out.print("a = ");
		double a = sc.nextDouble();
		System.out.print("b = ");
		double b = sc.nextDouble();
		System.out.print("c = ");
		double c = sc.nextDouble();
		
		if(!checkTG(a, b, c))
			System.out.println("Đây không phải là tam giác");
		else {
			if(checkTGV(a, b, c))
				System.out.println("Đây là tam giác vuông");
			else if(a == b && b == c && a == c)
				System.out.println("Đây là tam giác đều");
			else if(checkTGC(a, b, c))
				System.out.println("Đây là tam giác cân");
			else
				System.out.println("Đây là tam giác thường");
		}
	}
	
	private static boolean checkTG(double a, double b, double c) {
		if(a <= 0 || b <= 0 || c <= 0) {
			System.out.println("Độ dài các cạnh phải lớn hơn 0");
			return false;
		}
		if(a + b > c && a + c > b && b + c > 0)
			return true;
		
		return false;
	}
	
	private static boolean checkTGV(double a, double b, double c) {
		if(Math.pow(a, 2) == Math.pow(b, 2) + Math.pow(c, 2)||Math.pow(c, 2) == Math.pow(b, 2) + Math.pow(a, 2)
			||Math.pow(b, 2) == Math.pow(a, 2) + Math.pow(c, 2))
			return true;
		return false;
	}

	private static boolean checkTGC(double a, double b, double c) {
		if(a == b || b == c || c == a)
			return true;
		return false;
	}
}
