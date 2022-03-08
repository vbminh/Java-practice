package OOP.Bai6;

import java.util.Scanner;

public class Truck extends Vehicles {
	private int truckload;
	
	public Truck() {
		
	}
	
	public Truck(String id, String maker, String model, 
				int year, double price, int truckload) {
		super(id, maker, model, year, price);
		this.truckload = truckload;
	}
	
	@Override
	public void input() {
		Scanner sc = new Scanner(System.in);
		super.input();
		System.out.print("truckload: ");
		truckload = sc.nextInt();
		sc.close();
	}
	
	@Override
	public void output() {
		super.output();
		System.out.println("truckload: " + truckload);
	}
	
	@Override
	public String toString() {
		return super.toString() + String.format("%5s %7s", "-", this.truckload);
	}
}
