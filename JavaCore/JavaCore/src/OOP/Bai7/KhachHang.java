package OOP.Bai7;

public class KhachHang {
	private String maKH;
	private String hoTen;
	private String gioiTinh;
	private String ngaySinh;
	private int soLuongMua;
	private double donGia;
	
	protected String getMaKH() {
		return maKH;
	}

	protected void setMaKH(String maKH) {
		this.maKH = maKH;
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

	protected String getNgaySinh() {
		return ngaySinh;
	}

	protected void setNgaySinh(String ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	protected int getSoLuongMua() {
		return soLuongMua;
	}

	protected void setSoLuongMua(int soLuongMua) {
		this.soLuongMua = soLuongMua;
	}

	protected double getDonGia() {
		return donGia;
	}

	protected void setDonGia(double donGia) {
		this.donGia = donGia;
	}

	public KhachHang() {
		
	}

	public KhachHang(String maKH) {
		this.maKH = maKH;
	}

	public KhachHang(String maKH, String hoTen, String gioiTinh, String ngaySinh, int soLuongMua, double donGia) {
		this.maKH = maKH;
		this.hoTen = hoTen;
		this.gioiTinh = gioiTinh;
		this.ngaySinh = ngaySinh;
		this.soLuongMua = soLuongMua;
		this.donGia = donGia;
	}
	
	public double TongTien() {
		return soLuongMua * donGia;
	}
	
	@Override
	public boolean equals(Object obj) {
		KhachHang kh = (KhachHang)obj;
		return this.maKH.equals(kh.maKH);
	}

	@Override
	public String toString() {
		return String.format("%5s %10s %10s %10s %10s %10s %10s %10s",this.maKH, this.hoTen, this.gioiTinh, this.ngaySinh, this.soLuongMua, this.donGia, "Không",TongTien());
	}
}
