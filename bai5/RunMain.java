package bai5;

public class RunMain {

	public static void main(String[] args) {
		ThucPham Meat = new ThucPham();
		System.out.println("Nhap thong tin thuc pham can kiem tra:");
		Meat.input();
		System.out.println("\n\t=======THUC PHAM=======\n");
		Meat.output();
	}

}
