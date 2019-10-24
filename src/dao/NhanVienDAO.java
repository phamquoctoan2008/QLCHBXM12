/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import connect.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import obj.LoaiNV;
import obj.NhanVien;
import obj.NhanVienHanhChinh;
import obj.NhanVienKyThuat;

/**
 *
 * @author nguye
 */
public class NhanVienDAO {

    Connection conn;
    PreparedStatement prs;

    public NhanVienDAO() {
        this.conn = new DBConnection().getConn();
    }

    public boolean delete(int maNV) {
        try {
            PreparedStatement ps = conn.prepareStatement("delete from NhanVien where maNV =?");
            ps.setInt(1, maNV);
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean themNVHC(NhanVienHanhChinh nvhc) {

        try {
            PreparedStatement ps = conn.prepareStatement("insert into NhanVien (hoTen,diaChi,sdt,chucVu,phongBan,trinhDoHocvan,maLoaiNV) Values(?,?,?,?,?,?,1)");
            ps.setString(1, nvhc.getHoTen());
            ps.setString(2, nvhc.getDiaChi());
            ps.setString(3, nvhc.getSdt());
            ps.setString(4, nvhc.getChucVu());
            ps.setString(5, nvhc.getPhongBan());
            ps.setString(6, nvhc.getTrinhDoHocVan());
//            ps.setString(7,nvhc.getTaiKhoan().getTaiKhoan());
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return false;
        }
    }

    public boolean themNVKT(NhanVienKyThuat nvkt) {
        try {
            PreparedStatement ps = conn.prepareStatement("insert into NhanVien (hoTen,diaChi,sdt,bacTho,namKinhNghiem,maLoaiNV) Values(?,?,?,?,?,2)");
            ps.setString(1, nvkt.getHoTen());
            ps.setString(2, nvkt.getDiaChi());
            ps.setString(3, nvkt.getSdt());
            ps.setString(4, nvkt.getBacTho());
            ps.setInt(5, nvkt.getNamKinhNghiem());
            //         ps.setString(6,nvkt.getTaiKhoan().getTaiKhoan());
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return false;
        }
    }

    public ArrayList<NhanVien> getListNV() {
        ArrayList<NhanVien> listNV = new ArrayList<>();
        try {
            PreparedStatement ps = conn
                    .prepareStatement("select nv.maNV,nv.hoTen,nv.diaChi,nv.sdt,nv.maLoaiNV,loai.tenLoai from NhanVien nv , LoaiNV loai Where nv.maLoaiNV=loai.maLoaiNV");
            ResultSet res = ps.executeQuery();
            while (res.next()) {
                NhanVien nv = new NhanVien();
                nv.setMaNV(res.getInt("maNV"));
                nv.setHoTen(res.getString("hoTen"));
                nv.setDiaChi(res.getString("diaChi"));
                nv.setSdt(res.getString("sdt"));
                int maLoai = res.getInt("maLoaiNV");
                LoaiNhanVienDAO loainvdao = new LoaiNhanVienDAO();
                LoaiNV loai = loainvdao.getLoaiNVByID(maLoai);
                nv.setLoaiNV(loai);
                listNV.add(nv);
            }
        } catch (SQLException ex) {
            Logger.getLogger(KhachHangDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listNV;

    }

    public ArrayList<NhanVienKyThuat> getListNVKT() {
        ArrayList<NhanVienKyThuat> listNVKT = new ArrayList<>();
        try {
            PreparedStatement ps = conn
                    .prepareStatement("select maNV,hoTen,diaChi,sdt,bacTho,namKinhNghiem,nv.maLoaiNV \n"
                            + "from NhanVien nv join LoaiNV loai on nv.maLoaiNV=loai.maLoaiNV   \n"
                            + "where loai.maLoaiNV = 2");
            ResultSet res = ps.executeQuery();
            while (res.next()) {
                NhanVienKyThuat nvkt = new NhanVienKyThuat();
                nvkt.setMaNV(res.getInt("maNV"));
                nvkt.setHoTen(res.getString("hoTen"));
                nvkt.setDiaChi(res.getString("diaChi"));
                nvkt.setSdt(res.getString("sdt"));
                nvkt.setBacTho(res.getString("bacTho"));
                nvkt.setNamKinhNghiem(res.getInt("namKinhNghiem"));
                LoaiNhanVienDAO loainvdao = new LoaiNhanVienDAO();
                LoaiNV loai = loainvdao.getLoaiNVByID(res.getInt("maLoaiNV"));
                nvkt.setLoaiNV(loai);
                listNVKT.add(nvkt);
            }
        } catch (SQLException ex) {
            Logger.getLogger(KhachHangDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listNVKT;
    }

    public ArrayList<NhanVienHanhChinh> getListNVHC() {
        ArrayList<NhanVienHanhChinh> listNVHC = new ArrayList<>();
        try {
            PreparedStatement ps = conn
                    .prepareStatement("select maNV,hoTen,diaChi,sdt,chucVu,phongBan,trinhDoHocvan,loai.maLoaiNV\n"
                            + "from NhanVien nv join LoaiNV loai on nv.maLoaiNV=loai.maLoaiNV  \n"
                            + "where loai.maLoaiNV = 1");
            ResultSet res = ps.executeQuery();
            while (res.next()) {
                NhanVienHanhChinh nvhc = new NhanVienHanhChinh();
                nvhc.setMaNV(res.getInt("maNV"));
                nvhc.setHoTen(res.getString("hoTen"));
                nvhc.setDiaChi(res.getString("diaChi"));
                nvhc.setSdt(res.getString("sdt"));
                nvhc.setChucVu(res.getString("chucVu"));
                nvhc.setPhongBan(res.getString("phongBan"));
                nvhc.setTrinhDoHocVan(res.getString("trinhDoHocvan"));
                LoaiNhanVienDAO loainvdao = new LoaiNhanVienDAO();
                LoaiNV loai = loainvdao.getLoaiNVByID(res.getInt("maLoaiNV"));
                nvhc.setLoaiNV(loai);

                listNVHC.add(nvhc);

            }
        } catch (SQLException ex) {
            Logger.getLogger(KhachHangDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listNVHC;

    }
}
