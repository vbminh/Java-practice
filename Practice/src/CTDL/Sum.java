package CTDL;

import java.util.Scanner;

public class Sum {
	
	public static int Sum(int[] arr) {
		int sum = 0;
		for(int i = 0; i < arr.length; i++)
			sum += arr[i];
		return sum;
	}
	
	public static void main(String[] args) {
		int[] arr;
		int n;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap mang so nguyen ");
		
		System.out.print("\nNhap so luong phan tu: ");
		n = sc.nextInt();
		
		arr = new int[n];
		for(int i = 0; i < n; i++) {
			System.out.print("Nhap phan tu thu " + (i + 1) + ": ");
			arr[i] = sc.nextInt();
		}
		
		System.out.println("\nTong " + n + " so trong mang la: " + Sum(arr));
	}

}
