package obj;

import java.math.BigDecimal;

public class MauXe {
	private int maMauXe;
        private int maLoaiXe;
	private String nuocSX;
	private String tenMauXe;
	private int soluong;
	private BigDecimal gia;
	private String mauSac;
	public MauXe() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MauXe(int maMauXe, int maLoaiXe ,String nuocSX, String tenMauXe, int soluong, BigDecimal gia, String mauSac) {
		super();
		this.maMauXe = maMauXe;
                this.maLoaiXe = maLoaiXe;
		this.nuocSX = nuocSX;
		this.tenMauXe = tenMauXe;
		this.soluong = soluong;
		this.gia = gia;
		this.mauSac = mauSac;
	}
	public int getMaMauXe() {
		return maMauXe;
	}
	public void setMaMauXe(int maMauXe) {
		this.maMauXe = maMauXe;
	}
        public int getMaLoaiXe() {
		return maLoaiXe;
	}
	public void setMaLoaiXe(int maLoaiXe) {
		this.maLoaiXe = maLoaiXe;
	}
	public String getNuocSX() {
		return nuocSX;
	}
	public void setNuocSX(String nuocSX) {
		this.nuocSX = nuocSX;
	}
	public String getTenMauXe() {
		return tenMauXe;
	}
	public void setTenMauXe(String tenMauXe) {
		this.tenMauXe = tenMauXe;
	}
	public int getSoluong() {
		return soluong;
	}
	public void setSoluong(int soluong) {
		this.soluong = soluong;
	}
	public BigDecimal getGia() {
		return gia;
	}
	public void setGia(BigDecimal gia) {
		this.gia = gia;
	}
	public String getMauSac() {
		return mauSac;
	}
	public void setMauSac(String mauSac) {
		this.mauSac = mauSac;
	}
	@Override
	public String toString() {
		return "MauXe [maMauXe=" + maMauXe + ", nuocSX=" + nuocSX + ", tenMauXe=" + tenMauXe + ", soluong=" + soluong
				+ ", gia=" + gia + ", mauSac=" + mauSac + "]";
	}
}
