package CTDL;

import java.util.LinkedList;
import java.util.Queue;

public class QueueList {

	public static void main(String[] args) {
		Queue<Integer> num = new LinkedList<>();
		
		System.out.println("Them phan tu");
		num.offer(1);
		num.offer(2);
		num.offer(5);
		num.offer(7);
		num.offer(0);
		
		System.out.println("Queue: " + num);
		
		System.out.println("Truy cap phan tu: " + num.peek());

		System.out.println("Loai bo hang doi: " + num.remove());
		
		System.out.println("Sau khi loai bo: " + num);
	}

}
