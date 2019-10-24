package obj;


import java.util.Date;

public class HopDong {
	private int maHopDong;
        private NhanVien nhanVien;
        private HoaDon hoaDon;
	private Date ngayLapHD;
	private HinhThucThanhToan hinhThucThanhToan;
        private String hanTraGop;

    public HopDong() {
    }

    public HopDong(int maHopDong, NhanVien nhanVien, HoaDon hoaDon, Date ngayLapHD, HinhThucThanhToan hinhThucThanhToan, String hanTraGop) {
        this.maHopDong = maHopDong;
        this.nhanVien = nhanVien;
        this.hoaDon = hoaDon;
        this.ngayLapHD = ngayLapHD;
        this.hinhThucThanhToan = hinhThucThanhToan;
        this.hanTraGop = hanTraGop;
    }

    public int getMaHopDong() {
        return maHopDong;
    }

    public void setMaHopDong(int maHopDong) {
        this.maHopDong = maHopDong;
    }

    public NhanVien getNhanVien() {
        return nhanVien;
    }

    public void setNhanVien(NhanVien nhanVien) {
        this.nhanVien = nhanVien;
    }

    public HoaDon getHoaDon() {
        return hoaDon;
    }

    public void setHoaDon(HoaDon hoaDon) {
        this.hoaDon = hoaDon;
    }

    public Date getNgayLapHD() {
        return ngayLapHD;
    }

    public void setNgayLapHD(Date ngayLapHD) {
        this.ngayLapHD = ngayLapHD;
    }

    public HinhThucThanhToan getHinhThucThanhToan() {
        return hinhThucThanhToan;
    }

    public void setHinhThucThanhToan(HinhThucThanhToan hinhThucThanhToan) {
        this.hinhThucThanhToan = hinhThucThanhToan;
    }

    public String getHanTraGop() {
        return hanTraGop;
    }

    public void setHanTraGop(String hanTraGop) {
        this.hanTraGop = hanTraGop;
    }
        
        
}
