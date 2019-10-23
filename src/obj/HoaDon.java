package obj;

import java.util.Date;

public class HoaDon {
	private int soLuongMua;
	private int chietKhau;
	private Date ngayThanhToan;
	public HoaDon() {
		super();
		// TODO Auto-generated constructor stub
	}
	public HoaDon(int soLuongMua, int chietKhau, Date ngayThanhToan) {
		super();
		this.soLuongMua = soLuongMua;
		this.chietKhau = chietKhau;
		this.ngayThanhToan = ngayThanhToan;
	}
	public int getSoLuongMua() {
		return soLuongMua;
	}
	public void setSoLuongMua(int soLuongMua) {
		this.soLuongMua = soLuongMua;
	}
	public int getChietKhau() {
		return chietKhau;
	}
	public void setChietKhau(int chietKhau) {
		this.chietKhau = chietKhau;
	}
	public Date getNgayThanhToan() {
		return ngayThanhToan;
	}
	public void setNgayThanhToan(Date ngayThanhToan) {
		this.ngayThanhToan = ngayThanhToan;
	}
	@Override
	public String toString() {
		return "HoaDon [soLuongMua=" + soLuongMua + ", chietKhau=" + chietKhau + ", ngayThanhToan=" + ngayThanhToan
				+ "]";
	}
}
