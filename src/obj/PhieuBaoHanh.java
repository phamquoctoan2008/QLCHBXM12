package obj;

public class PhieuBaoHanh {
	private int  maPBH;
	private int thoiGianBH;
	public int getMaPBH() {
		return maPBH;
	}
	public void setMaPBH(int maPBH) {
		this.maPBH = maPBH;
	}
	public int getThoiGianBH() {
		return thoiGianBH;
	}
	public void setThoiGianBH(int thoiGianBH) {
		this.thoiGianBH = thoiGianBH;
	}
	public PhieuBaoHanh() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PhieuBaoHanh(int maPBH, int thoiGianBH) {
		super();
		this.maPBH = maPBH;
		this.thoiGianBH = thoiGianBH;
	}
	@Override
	public String toString() {
		return "PhieuBaoHanh [maPBH=" + maPBH + ", thoiGianBH=" + thoiGianBH + "]";
	}
}
