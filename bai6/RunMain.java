package bai6;

public class RunMain {

	public static void main(String[] args) {
		LopHoc KTPM = new LopHoc();
		System.out.println("Nhap thong tin lop hoc:");
		KTPM.input();
		KTPM.arrange();
		System.out.println("\n\nIn thong tin:");
		KTPM.output();
	}

}
