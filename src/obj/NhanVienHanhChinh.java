package obj;

public class NhanVienHanhChinh extends NhanVien {
	private String chucVu;
	private String phongBan;
	private String trinhDoHocVan;
        
	public NhanVienHanhChinh() {
		super();
		// TODO Auto-generated constructor stub
	}

    public NhanVienHanhChinh(LoaiNV LoaiNV, int maNV, String hoTen, String diaChi, String sdt, TaiKhoan taiKhoan) {
        super(LoaiNV, maNV, hoTen, diaChi, sdt, taiKhoan);
    }


    public NhanVienHanhChinh(int maNV, String hoTen, String diaChi, String sdt, LoaiNV LoaiNV) {
        super(maNV, hoTen, diaChi, sdt, LoaiNV);
    }
	
	public NhanVienHanhChinh(String chucVu, String phongBan, String trinhDoHocVan) {
		super();
		this.chucVu = chucVu;
		this.phongBan = phongBan;
		this.trinhDoHocVan = trinhDoHocVan;
	}
	public String getChucVu() {
		return chucVu;
	}
	public void setChucVu(String chucVu) {
		this.chucVu = chucVu;
	}
	public String getPhongBan() {
		return phongBan;
	}
	public void setPhongBan(String phongBan) {
		this.phongBan = phongBan;
	}
	public String getTrinhDoHocVan() {
		return trinhDoHocVan;
	}
	public void setTrinhDoHocVan(String trinhDoHocVan) {
		this.trinhDoHocVan = trinhDoHocVan;
	}
	@Override
	public String toString() {
		return "NhanVienHanhChinh [chucVu=" + chucVu + ", phongBan=" + phongBan + ", trinhDoHocVan=" + trinhDoHocVan
				+ "]";
	}
	
}
