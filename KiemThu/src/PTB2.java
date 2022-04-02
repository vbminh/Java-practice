import java.util.Scanner;

public class PTB2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("\t======Phuong trinh bac 2======");
			System.out.println("Nhap vao cac he so:");
			System.out.print("a = ");
			float a = sc.nextFloat();	
			System.out.print("b = ");
			float b = sc.nextFloat();
			System.out.print("c = ");
			float c = sc.nextFloat();
			sc.close();
			
			if(a == 0) {
				if(b == 0) {
					if(c == 0)
						System.out.println("Phuong trinh co vo so nghiem");
					else
						System.out.println("Phuong trinh vo nghiem");
				}
				else
					System.out.println("Phuong trinh co nghiem: x = " + (-c/b));				
			}
			else {
				float delta = (float) (Math.pow(b, 2) - 4*a*c);
				
				if(delta > 0) {
					System.out.println("\nPhuong trinh bac 2: " + a + "x^2 + " + b + "x + " + c + " = 0 co 2 nghiem phan biet:");
					System.out.print("x1 = " + (-b + Math.sqrt(delta))/(2*a) + "\tx2 = " + (-b - Math.sqrt(delta))/(2*a));
				}
				else if(delta == 0) {
					System.out.println("\nPhuong trinh bac 2: " + a + "x^2 + " + b + "x + " + c + " = 0 co nghiem kep:");
					System.out.print("x1 = x2 = " + (-b)/(2*a));
				}
				else 
					System.out.println("Phuong trinh vo nghiem");
			}
		}
		catch (Exception e) {
			System.out.println("Hay nhap vao mot so");
			e.printStackTrace();
		}

	}

}
