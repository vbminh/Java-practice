package OOP.Bai4;

public class ThisinhA {
	private String maSv;
	private String tenSv;
	private String diaChi;
	private double diemToan;
	private double diemLy;
	private double diemHoa;
	private double diemUT;
	private double tongDiem;
	
	public ThisinhA(String maSv) {
		super();
		this.maSv = maSv;
	}

	public ThisinhA(String maSv, String tenSv, String diaChi, double diemToan, double diemLy, double diemHoa,
			double diemUT) {
		super();
		this.maSv = maSv;
		this.tenSv = tenSv;
		this.diaChi = diaChi;
		this.diemToan = diemToan;
		this.diemLy = diemLy;
		this.diemHoa = diemHoa;
		this.diemUT = diemUT;
	}

	protected String getMaSv() {
		return maSv;
	}

	protected void setMaSv(String maSv) {
		this.maSv = maSv;
	}

	protected String getTenSv() {
		return tenSv;
	}

	protected void setTenSv(String tenSv) {
		this.tenSv = tenSv;
	}

	protected String getDiaChi() {
		return diaChi;
	}

	protected void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	protected double getDiemToan() {
		return diemToan;
	}

	protected void setDiemToan(double diemToan) {
		this.diemToan = diemToan;
	}

	protected double getDiemLy() {
		return diemLy;
	}

	protected void setDiemLy(double diemLy) {
		this.diemLy = diemLy;
	}

	protected double getDiemHoa() {
		return diemHoa;
	}

	protected void setDiemHoa(double diemHoa) {
		this.diemHoa = diemHoa;
	}

	protected double getDiemUT() {
		return diemUT;
	}

	protected void setDiemUT(double diemUT) {
		this.diemUT = diemUT;
	}

	public double TongDiem() {
		tongDiem = diemToan + diemLy + diemHoa + diemUT;
		return tongDiem;
	}

	@Override
	public String toString() {
		return String.format("%5s %15s %10s %5s %5s %5s %10s %10s",maSv,tenSv,diaChi,diemToan,diemLy,diemHoa,diemUT,TongDiem());
	}

	@Override
	public boolean equals(Object obj) {
		ThisinhA ts = (ThisinhA)obj;
		return this.maSv.equals(ts.maSv);
	}
}
