package OOP.Bai6;

import java.util.Scanner;

public class Vehicles {
	private String id;
	private String maker;
	private String model;
	private int year;
	private double price;
	
	protected String getId() {
		return id;
	}

	protected void setId(String id) {
		this.id = id;
	}

	protected String getMaker() {
		return maker;
	}

	protected void setMaker(String maker) {
		this.maker = maker;
	}

	protected String getModel() {
		return model;
	}

	protected void setModel(String model) {
		this.model = model;
	}

	protected int getYear() {
		return year;
	}

	protected void setYear(int year) {
		this.year = year;
	}

	protected double getPrice() {
		return price;
	}

	protected void setPrice(double price) {
		this.price = price;
	}

	public Vehicles() {
		
	}

	public Vehicles(String id) {
		this.id = id;
	}

	public Vehicles(String id, String maker, String model, int year, double price) {
		this.id = id;
		this.maker = maker;
		this.model = model;
		this.year = year;
		this.price = price;
	}
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("id: ");
		id = sc.nextLine();
		System.out.print("maker: ");
		maker = sc.nextLine();
		System.out.print("model: ");
		model = sc.nextLine();
		System.out.print("year: ");
		year = sc.nextInt();
		System.out.print("price: ");
		price = sc.nextInt();
		sc.close();
	}
	
	public void output() {
		System.out.println("id: " + id);
		System.out.println("maker: " + maker);
		System.out.println("model: " + model);
		System.out.println("year: " + year);
		System.out.println("price: " + price);
	}
	
	@Override
	public boolean equals(Object obj) {
		Vehicles ve = (Vehicles)obj;
		return this.id.equals(ve.id);
	}
	
	@Override
	public String toString() {
		return String.format("%5s %7s %7s %7s %7s", this.id, this.maker, this.model, this.year, this.price);
	}
	
}
