package OOP.Bai2;

import java.util.Scanner;

public class RunMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nhập bán kính đường tròn: ");
		double r = sc.nextDouble();
		
		Circle c = new Circle(r);
		System.out.print("\nDiện tích hình trón bán kính " + r + " là: " + c.Area());
		System.out.print("\nChu vi hình trón bán kính " + r + " là: " + c.Perimeter());
		sc.close();
	}

}
