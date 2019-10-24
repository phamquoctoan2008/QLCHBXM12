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
import obj.HoaDon;

/**
 *
 * @author phamq
 */
public class HoaDonDAO {

    Connection conn;
    PreparedStatement prs;

    public HoaDonDAO() {
        this.conn = new DBConnection().getConn();
    }

    public HoaDon getHoaDonByID(int maHD) {
        HoaDon hoadon = null;
        try {
            PreparedStatement ps = conn
                    .prepareStatement("select * from HoaDon where maHD = ?");
            ps.setInt(1, maHD);
            ResultSet res = ps.executeQuery();
            hoadon = new HoaDon();
            while (res.next()) {
                hoadon.setChietKhau(res.getInt("maMauXe"));
                hoadon.setNgayThanhToan(res.getDate("ngayThanhToan"));
                hoadon.setSoLuongMua(res.getInt("soLuongMua"));
            }
        } catch (Exception e) {
            return hoadon = null;
        }

        return hoadon;
    }
}
