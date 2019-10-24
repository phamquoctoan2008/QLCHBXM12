package obj;

public class LoaiNV {
	private int maLoaiNV;
	private String tenLoai;
	public LoaiNV() {
		super();
		// TODO Auto-generated constructor stub
	}

    public LoaiNV(int maLoaiNV, String tenLoai) {
        this.maLoaiNV = maLoaiNV;
        this.tenLoai = tenLoai;
    }

    public int getMaLoaiNV() {
        return maLoaiNV;
    }

    public void setMaLoaiNV(int maLoaiNV) {
        this.maLoaiNV = maLoaiNV;
    }

    public String getTenLoai() {
        return tenLoai;
    }

    public void setTenLoai(String tenLoai) {
        this.tenLoai = tenLoai;
    }
	
	
}
