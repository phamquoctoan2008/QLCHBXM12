package obj;

public class LoaiNV {
	private int loaiNV;
	private String TenLoai;
	public LoaiNV() {
		super();
		// TODO Auto-generated constructor stub
	}
	public LoaiNV(int loaiNV, String tenLoai) {
		super();
		this.loaiNV = loaiNV;
		TenLoai = tenLoai;
	}
	public int getLoaiNV() {
		return loaiNV;
	}
	public void setLoaiNV(int loaiNV) {
		this.loaiNV = loaiNV;
	}
	public String getTenLoai() {
		return TenLoai;
	}
	public void setTenLoai(String tenLoai) {
		TenLoai = tenLoai;
	}
	@Override
	public String toString() {
		return "LoaiNV [loaiNV=" + loaiNV + ", TenLoai=" + TenLoai + "]";
	}
	
}
