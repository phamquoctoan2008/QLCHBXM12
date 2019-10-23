/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import connect.DBConnection;
import form.Form_Xe;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import obj.KhachHang;
import obj.MauXe;

/**
 *
 * @author phamq
 */
public class MauXeDAO {
    Connection conn;
    PreparedStatement prs;
    
    public MauXeDAO(){
        this.conn = new DBConnection().getConn();
    }
       
    public boolean themMauXe(MauXe xe) {
         
          try {
            PreparedStatement ps = conn.prepareStatement("insert into MauXe (maLoaiXe,tenMauXe,nuocSX,mauSac,giaXe,soLuongXe) Values(?,?,?,?,?,?)");
            ps.setInt(1, xe.getMaLoaiXe());
            ps.setString(2, xe.getTenMauXe());
            ps.setString(3, xe.getNuocSX());
            ps.setString(4, xe.getMauSac());
            ps.setBigDecimal(5, xe.getGia());
            ps.setInt(6, xe.getSoluong());
            return ps.executeUpdate() > 0;
        } catch (SQLException e) { 
            e.printStackTrace();
            return false;
        }
     }
    
     public ArrayList<MauXe> getListMauXe() {
        ArrayList<MauXe> listMauXe = new ArrayList<>();
        try {
            PreparedStatement ps = conn.prepareStatement("select * from MauXe");
            ResultSet res = ps.executeQuery();
            while (res.next()) {
                MauXe mauxe = new MauXe();
                mauxe.setMaMauXe(res.getInt("maMauXe"));
                mauxe.setMaLoaiXe(res.getInt("maLoaiXe"));
                mauxe.setTenMauXe(res.getString("tenMauXe"));
                mauxe.setNuocSX(res.getString("nuocSX"));
                mauxe.setMauSac(res.getString("mauSac"));
                mauxe.setGia(res.getBigDecimal("giaXe"));
                mauxe.setSoluong(res.getInt("soLuongXe"));
                listMauXe.add(mauxe);

            }
        } catch (SQLException ex) {
            Logger.getLogger(MauXeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listMauXe;

    }
     
     
     public ArrayList<MauXe> getListTenMauXe (){
        ArrayList<MauXe> tenMauXes = new ArrayList<>();
        try {
            PreparedStatement ps = conn.prepareStatement("select tenMauXe "
                                                      + "from MauXe");
            ResultSet res = ps.executeQuery();
            while (res.next()) {
                MauXe tenMauXe = new MauXe();
                tenMauXe.setTenMauXe(res.getString("tenMauXe"));
                tenMauXes.add(tenMauXe);
            }
        } catch (Exception e) {
             Logger.getLogger(MauXeDAO.class.getName()).log(Level.SEVERE, null, e);
        }
        return tenMauXes;
    } 
     
     
      public ArrayList<MauXe> getListMauSacXeByName (String tenmauxe){
        ArrayList<MauXe> mauSacXes = new ArrayList<>();
        try {
            PreparedStatement ps = conn.prepareStatement("select mauSac "
                                                      + "from MauXe "
                                                      + "where tenMauXe = ?");
            ps.setString(1, tenmauxe );
            ResultSet res = ps.executeQuery();
            while (res.next()) {
                MauXe mauSac = new MauXe();
                mauSac.setMauSac(res.getString("mauSac"));
                mauSacXes.add(mauSac);
            }
        } catch (Exception e) {
             Logger.getLogger(MauXeDAO.class.getName()).log(Level.SEVERE, null, e);
        }
        return mauSacXes;
    } 
    
      
     public MauXe getMauXeByName (String tenmauxe){
        MauXe maMauXe = new MauXe();
        try {
         PreparedStatement ps = conn.prepareStatement("Select * from MauXe where tenMauXe = ?");
         ps.setString(1, tenmauxe);
         ResultSet res = ps.executeQuery();
         while (res.next()){
             maMauXe.setMaMauXe(res.getInt("maMauXe"));
             maMauXe.setTenMauXe(res.getString("tenMauXe"));
             maMauXe.setMauSac(res.getString("mauSac"));
         }
        } catch (Exception e) {
            Logger.getLogger(MauXeDAO.class.getName()).log(Level.SEVERE, null, e);
        }
        return maMauXe;
        
    }
     
     public MauXe getMauXeById (int mauxe){
        MauXe mauXe = new MauXe();
        try{
            PreparedStatement ps = conn.prepareStatement("select * from MauXe where maMauXe = ?");
            ps.setInt(1, mauxe);
            ResultSet res = ps.executeQuery();
            while(res.next()){
                mauXe.setMauSac(res.getString("mauSac"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(MauXeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return mauXe;
    }
}
