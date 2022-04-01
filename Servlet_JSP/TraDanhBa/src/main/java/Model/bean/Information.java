package Model.bean;

public class Information {
	private String MaTB;
	private String TenTB;
	private String SDT;
	private String DiaChi;
	
	public Information() {
		// TODO Auto-generated constructor stub
	}

	public Information(String maTB, String tenTB, String sDT, String diaChi) {
		super();
		MaTB = maTB;
		TenTB = tenTB;
		SDT = sDT;
		DiaChi = diaChi;
	}

	public String getMaTB() {
		return MaTB;
	}

	public void setMaTB(String maTB) {
		MaTB = maTB;
	}

	public String getTenTB() {
		return TenTB;
	}

	public void setTenTB(String tenTB) {
		TenTB = tenTB;
	}

	public String getSDT() {
		return SDT;
	}

	public void setSDT(String sDT) {
		SDT = sDT;
	}

	public String getDiaChi() {
		return DiaChi;
	}

	public void setDiaChi(String diaChi) {
		DiaChi = diaChi;
	}
	
}
