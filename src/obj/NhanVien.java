package obj;

import java.io.Serializable;

public class NhanVien implements Serializable {
        private LoaiNV LoaiNV;
	private int maNV;
	private String hoTen;
	private String diaChi;
	private String sdt;
        private TaiKhoan taiKhoan;

    public NhanVien(LoaiNV LoaiNV, int maNV, String hoTen, String diaChi, String sdt, TaiKhoan taiKhoan) {
        this.LoaiNV = LoaiNV;
        this.maNV = maNV;
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.sdt = sdt;
        this.taiKhoan = taiKhoan;
    }

    public TaiKhoan getTaiKhoan() {
        return taiKhoan;
    }

    public void setTaiKhoan(TaiKhoan taiKhoan) {
        this.taiKhoan = taiKhoan;
    }
        

   
	public NhanVien() {
		super();
		// TODO Auto-generated constructor stub
	}
	public NhanVien(int maNV, String hoTen, String diaChi, String sdt,LoaiNV LoaiNV) {
		super();
		this.maNV = maNV;
		this.hoTen = hoTen;
		this.diaChi = diaChi;
		this.sdt = sdt;
                this.LoaiNV=LoaiNV;
	}

    public LoaiNV getLoaiNV() {
        return LoaiNV;
    }

    public void setLoaiNV(LoaiNV LoaiNV) {
        this.LoaiNV = LoaiNV;
    }
        
	public int getMaNV() {
		return maNV;
	}
	public void setMaNV(int maNV) {
		this.maNV = maNV;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public String getSdt() {
		return sdt;
	}
	public void setSdt(String sdt) {
		this.sdt = sdt;
	}
	@Override
	public String toString() {
		return "NhanVien [maNV=" + maNV + ", hoTen=" + hoTen + ", diaChi=" + diaChi + ", sdt=" + sdt + "]";
	}

}
