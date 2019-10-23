package obj;


import java.util.Date;

public class HopDong {
	private int HopDong;
	private Date ngayLapHD;
	public HopDong() {
		super();
		// TODO Auto-generated constructor stub
	}
	public HopDong(int hopDong, Date ngayLapHD) {
		super();
		HopDong = hopDong;
		this.ngayLapHD = ngayLapHD;
	}
	public int getHopDong() {
		return HopDong;
	}
	public void setHopDong(int hopDong) {
		HopDong = hopDong;
	}
	public Date getNgayLapHD() {
		return ngayLapHD;
	}
	public void setNgayLapHD(Date ngayLapHD) {
		this.ngayLapHD = ngayLapHD;
	}
	@Override
	public String toString() {
		return "HopDong [HopDong=" + HopDong + ", ngayLapHD=" + ngayLapHD + "]";
	}
}
