package JAVA8;

import java.time.LocalDate;

public class Demo {
	public static void main(String[] args) {
		LocalDate now = LocalDate.now();
		System.out.println("Thoi gian hien tai: " + now.toString());
		System.out.println("Ngay trong thang hien tai: " + now.getDayOfMonth());
		System.out.println("Thang hien tai: " + now.getMonth());
		System.out.println("Nam hien tai: " + now.getYear());
		System.out.println("Ngay trong nam hien tai: " + now.getDayOfYear());
	}
}




