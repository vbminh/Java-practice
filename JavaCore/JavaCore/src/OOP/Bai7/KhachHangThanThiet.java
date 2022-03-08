package OOP.Bai7;


public class KhachHangThanThiet extends KhachHang{
	public KhachHangThanThiet(String maKH, String hoTen, String gioiTinh, String ngaySinh, int soLuongMua, double donGia) {
		super(maKH,hoTen,gioiTinh,ngaySinh,soLuongMua,donGia);
	}
	
	@Override
	public double TongTien() {
		if(super.TongTien() <= 1000)
			return super.TongTien() - 0.1 * super.TongTien();
		return super.TongTien() - 0.2 * super.TongTien();
	}
	
	@Override
	public String toString() {
		return String.format("%5s %10s %10s %10s %10s %10s %10s %10s",getMaKH(), getHoTen(), getGioiTinh(), getNgaySinh(), getSoLuongMua(), getDonGia(),(super.TongTien() > 1000? "20%" : "10%"),TongTien());
	}
}
