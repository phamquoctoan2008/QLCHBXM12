package obj;

public class LoaiXe {
	private int maLoaiXe;
	private String tenLoaiXe;
	public LoaiXe() {
		super();
		// TODO Auto-generated constructor stub
	}
	public LoaiXe(int maLoaiXe, String tenLoaiXe) {
		super();
		this.maLoaiXe = maLoaiXe;
		this.tenLoaiXe = tenLoaiXe;
	}
	public int getMaLoaiXe() {
		return maLoaiXe;
	}
	public void setMaLoaiXe(int maLoaiXe) {
		this.maLoaiXe = maLoaiXe;
	}
	public String getTenLoaiXe() {
		return tenLoaiXe;
	}
	public void setTenLoaiXe(String tenLoaiXe) {
		this.tenLoaiXe = tenLoaiXe;
	}
	@Override
	public String toString() {
		return "LoaiXe [maLoaiXe=" + maLoaiXe + ", tenLoaiXe=" + tenLoaiXe + "]";
	}
	

}