package Exception;
import java.util.*;

public class Mang {
	
	public static int TimMax(int[] arr) {
		int max = arr[0];
		for(int i = 0; i < arr.length; i++ ) {
			if(arr[i] > max)
				max = arr[i];
		}
		return max;
	}
	public static int TimMin(int[] arr) {
		int min = arr[0];
		for(int i = 0; i < arr.length; i++ ) {
			if(arr[i] < min)
				min = arr[i];
		}
		return min;
	}
	public static int TinhTong(int[] arr) {
		int sum = 0;
		for(int i = 0; i < arr.length; i++ ) {
			sum += arr[i];
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr;
		int n;
		try {
			System.out.println("\t=====Mảng số nguyên=====");
			do {
				System.out.print("Nhập số phần tử của mảng: ");
				n = sc.nextInt();
				if(n < 0) 
					System.out.println("Số phần tử mảng không hợp lệ. Hãy nhập lại");
			}while(n < 0);
			
			arr = new int[n];
			for(int i = 0; i < n; i++) {
				System.out.print("Nhập phần tử thứ " + i + " : ");
				arr[i] = sc.nextInt();
			}
			
			System.out.print("\nMảng vừa nhập là: ");
			for(int i = 0; i < n; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.print("\nSố lớn nhất trong mảng là: " + TimMax(arr));
			System.out.print("\nSố nhỏ nhất trong mảng là: " + TimMin(arr));
			System.out.print("\nTổng các số trong mảng là: " + TinhTong(arr));
			
			sc.close();
		}
		catch (Exception e) {
			System.out.print("\nBạn phải nhập vào mảng số nguyên");
		}
	}

}
