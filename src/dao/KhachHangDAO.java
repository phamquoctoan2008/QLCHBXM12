package dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import connect.DBConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import obj.KhachHang;

public class KhachHangDAO {

    Connection conn;
    PreparedStatement prs;

    public KhachHangDAO() {
        this.conn = new DBConnection().getConn();
    }

    public boolean themKH(KhachHang kh) {
        try {
            PreparedStatement ps = conn.prepareStatement("insert into KhachHang (hoTen,diaChi,cmnd,sdt) Values(?,?,?,?)");
            ps.setString(1, kh.getHoTen());
            ps.setString(2, kh.getDiaChi());
            ps.setString(3, kh.getCmnd());
            ps.setString(4, kh.getSdt());
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return false;
        }
    }

    public ArrayList<KhachHang> getListKh() {
        ArrayList<KhachHang> listKH = new ArrayList<>();
        try {
            PreparedStatement ps = conn
                    .prepareStatement("select *from KhachHang");
            ResultSet res = ps.executeQuery();
            while (res.next()) {
                KhachHang kh = new KhachHang();
                kh.setMaKH(res.getInt("maKH"));
                kh.setHoTen(res.getString("hoTen"));
                kh.setDiaChi(res.getString("diaChi"));
                kh.setCmnd(res.getString("cmnd"));
                kh.setSdt(res.getString("sdt"));
                listKH.add(kh);
            }
        } catch (SQLException ex) {
            Logger.getLogger(KhachHangDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listKH;

    }
    public boolean delete(int maKH) {
        try {
            PreparedStatement ps = conn.prepareStatement("delete from KhachHang where maKH =?");
            ps.setInt(1, maKH);
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            return false;
        }
    }
    
    
     public boolean updates (KhachHang kh){
        try{
        PreparedStatement ps = conn.prepareStatement("update KhachHang set hoTen=?,diaChi=?,cmnd=?,sdt=? " +
                                                        "where maKH=?");
            ps.setString(1, kh.getHoTen());
            ps.setString(2, kh.getDiaChi());
            ps.setString(3, kh.getCmnd());
            ps.setString(4, kh.getSdt());
            ps.setInt(5, kh.getMaKH());
          return ps.executeUpdate() > 0;
            
        } catch (Exception e) {
             e.printStackTrace();
            return false;
        }
    }
    public ArrayList<KhachHang> searchKHByName (String hoTen){
       ArrayList<KhachHang> listsearchKH = new ArrayList<>();
        try {
            PreparedStatement ps = conn
                    .prepareStatement(" select *from KhachHang where hoTen like ?");
            ps.setString(1, hoTen);
            ResultSet res = ps.executeQuery();
            while (res.next()) {
                KhachHang khtim = new KhachHang();
                khtim.setMaKH(res.getInt("maKH"));
                khtim.setHoTen(res.getString("hoTen"));
                khtim.setDiaChi(res.getString("diaChi"));
                khtim.setCmnd(res.getString("cmnd"));
                khtim.setSdt(res.getString("sdt"));
                listsearchKH.add(khtim);

            }
        } catch (SQLException ex) {
            Logger.getLogger(KhachHangDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listsearchKH;

    }
    public ArrayList<KhachHang> searchKHByPhone (String sdt){
       ArrayList<KhachHang> listsearchKH = new ArrayList<>();
        try {
            PreparedStatement ps = conn
                    .prepareStatement(" select *from KhachHang where sdt=?");
            ps.setString(1, sdt);
            ResultSet res = ps.executeQuery();
            while (res.next()) {
                KhachHang khtim = new KhachHang();
                khtim.setMaKH(res.getInt("maKH"));
                khtim.setHoTen(res.getString("hoTen"));
                khtim.setDiaChi(res.getString("diaChi"));
                khtim.setCmnd(res.getString("cmnd"));
                khtim.setSdt(res.getString("sdt"));
                listsearchKH.add(khtim);

            }
        } catch (SQLException ex) {
            Logger.getLogger(KhachHangDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listsearchKH;

    }
    
     public KhachHang findKhachHangById(int maKh){
        KhachHang kh=null;
        try{
        PreparedStatement ps = conn
                    .prepareStatement("select *from KhachHang where maKH=?");
            ps.setInt(1, maKh);
            ResultSet res = ps.executeQuery();
            while (res.next()) {
                kh=new KhachHang();
                kh.setMaKH(res.getInt("maKH"));
                kh.setHoTen(res.getString("hoTen"));
                kh.setDiaChi(res.getString("diaChi"));
                kh.setCmnd(res.getString("cmnd"));
                kh.setSdt(res.getString("sdt"));
                
            }
        } catch (Exception e) {
            return kh= null;
        }
        
        return kh;
    }
    
}
