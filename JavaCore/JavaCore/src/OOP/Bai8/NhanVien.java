package OOP.Bai8;

public class NhanVien {
	private String maNV;
	private String hoTen;
	private String gioiTinh;
	private String ngayTuyenDung;
	
	public NhanVien() {
		
	}
	
	public NhanVien(String maNV) {
		this.maNV = maNV;
	}

	public NhanVien(String maNV, String hoTen, String gioiTinh, String ngayTuyenDung) {
		this.maNV = maNV;
		this.hoTen = hoTen;
		this.gioiTinh = gioiTinh;
		this.ngayTuyenDung = ngayTuyenDung;
	}

	protected String getMaNV() {
		return maNV;
	}

	protected void setMaNV(String maNV) {
		this.maNV = maNV;
	}

	protected String getHoTen() {
		return hoTen;
	}

	protected void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	protected String getGioiTinh() {
		return gioiTinh;
	}

	protected void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}

	protected String getNgayTuyenDung() {
		return ngayTuyenDung;
	}

	protected void setNgayTuyenDung(String ngayTuyenDung) {
		this.ngayTuyenDung = ngayTuyenDung;
	}
	
	@Override
	public boolean equals(Object obj) {
		// Check if id is duplicated
		NhanVien nv = (NhanVien)obj;
		return this.maNV.equals(nv.maNV);
	}
	
	@Override
	public String toString() {
		// print
		return String.format("%5s %10s %10s %15s %15s %15S",this.maNV,this.hoTen,this.gioiTinh,this.ngayTuyenDung,"-","-");
	}
}
