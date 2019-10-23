package obj;

import java.time.LocalDateTime;

public class PhieuNhanXet {
	private String liDoBaoHanh;
	private String tenLinhKien;
	private boolean loiDoKhachHang;
	private double giaTien;
	private LocalDateTime ngayLayPhieu;
	public PhieuNhanXet() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PhieuNhanXet(String liDoBaoHanh, String tenLinhKien, boolean loiDoKhachHang, double giaTien,
			LocalDateTime ngayLayPhieu) {
		super();
		this.liDoBaoHanh = liDoBaoHanh;
		this.tenLinhKien = tenLinhKien;
		this.loiDoKhachHang = loiDoKhachHang;
		this.giaTien = giaTien;
		this.ngayLayPhieu = ngayLayPhieu;
	}
	public String getLiDoBaoHanh() {
		return liDoBaoHanh;
	}
	public void setLiDoBaoHanh(String liDoBaoHanh) {
		this.liDoBaoHanh = liDoBaoHanh;
	}
	public String getTenLinhKien() {
		return tenLinhKien;
	}
	public void setTenLinhKien(String tenLinhKien) {
		this.tenLinhKien = tenLinhKien;
	}
	public boolean isLoiDoKhachHang() {
		return loiDoKhachHang;
	}
	public void setLoiDoKhachHang(boolean loiDoKhachHang) {
		this.loiDoKhachHang = loiDoKhachHang;
	}
	public double getGiaTien() {
		return giaTien;
	}
	public void setGiaTien(double giaTien) {
		this.giaTien = giaTien;
	}
	public LocalDateTime getNgayLayPhieu() {
		return ngayLayPhieu;
	}
	public void setNgayLayPhieu(LocalDateTime ngayLayPhieu) {
		this.ngayLayPhieu = ngayLayPhieu;
	}
	@Override
	public String toString() {
		return "PhieuNhanXet [liDoBaoHanh=" + liDoBaoHanh + ", tenLinhKien=" + tenLinhKien + ", loiDoKhachHang="
				+ loiDoKhachHang + ", giaTien=" + giaTien + ", ngayLayPhieu=" + ngayLayPhieu + "]";
	}
	
	
}
