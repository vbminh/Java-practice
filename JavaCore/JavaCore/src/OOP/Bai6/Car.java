package OOP.Bai6;

import java.util.Scanner;

public class Car extends Vehicles {
	private String color;
	
	public Car() {
		
	}
	
	public Car(String id, String maker, String model,
				int year, double price, String color) {
		super(id, maker, model, year, price);
		this.color = color;
	}
	
	@Override
	public void input() {
		Scanner sc = new Scanner(System.in);
		super.input();
		System.out.print("color: ");
		color = sc.nextLine();
		sc.close();
	}
	
	@Override
	public void output() {
		super.output();
		System.out.println("color: " + color);
	}
	
	@Override
	public String toString() {
		return super.toString() + String.format("%5s %7s",this.color,"-");
	}
}
