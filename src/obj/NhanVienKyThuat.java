package obj;

public class NhanVienKyThuat extends NhanVien{
	private String bacTho;
	private int namKinhNghiem;
	public NhanVienKyThuat() {
		super();
		// TODO Auto-generated constructor stub
	}

    public NhanVienKyThuat(LoaiNV LoaiNV, int maNV, String hoTen, String diaChi, String sdt, TaiKhoan taiKhoan) {
        super(LoaiNV, maNV, hoTen, diaChi, sdt, taiKhoan);
    }

        public NhanVienKyThuat(int maNV, String hoTen, String diaChi, String sdt, LoaiNV LoaiNV) {
            super(maNV, hoTen, diaChi, sdt, LoaiNV);
        }
	
	public NhanVienKyThuat(String bacTho, int namKinhNghiem) {
		super();
		this.bacTho = bacTho;
		this.namKinhNghiem = namKinhNghiem;
	}
	public String getBacTho() {
		return bacTho;
	}
	public void setBacTho(String bacTho) {
		this.bacTho = bacTho;
	}
	public int getNamKinhNghiem() {
		return namKinhNghiem;
	}
	public void setNamKinhNghiem(int namKinhNghiem) {
		this.namKinhNghiem = namKinhNghiem;
	}
	@Override
	public String toString() {
		return "NhanVienKyThuat [bacTho=" + bacTho + ", namKinhNghiem=" + namKinhNghiem + "]";
	}
	
}
