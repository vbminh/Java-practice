package OOP.Bai8;

import java.util.function.Function;

public class NhanVienBanHang extends NhanVien{
	private int soLuongBan;
	
	public NhanVienBanHang(String maNV) {
		super(maNV);
	}
	
	public NhanVienBanHang(String maNV, String hoTen, String gioiTinh, String ngayTuyenDung, int soLuongBan) {
		super(maNV,hoTen,gioiTinh,ngayTuyenDung);
		this.soLuongBan = soLuongBan;
	}

	protected int getSoLuongBan() {
		return soLuongBan;
	}

	protected void setSoLuongBan(int soLuongBan) {
		this.soLuongBan = soLuongBan;
	}
	
	Function<Integer, Integer> tienHoaHong = x -> {
		int hoaHong;
			if(x < 100)	hoaHong = 1000;
			else if(x < 500) hoaHong = 3000;
			else hoaHong = 5000;
			return hoaHong;
	};
	
	@Override
	public String toString() {
		//ghi đè toString() của lớp NhanVien
		return String.format("%5s %10s %10s %15s %15s %15S",this.getMaNV(),this.getHoTen(),this.getGioiTinh(),this.getNgayTuyenDung(),this.soLuongBan,tienHoaHong.apply(soLuongBan));
	}
	
}
