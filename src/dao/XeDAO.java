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
import obj.Xe;
import obj.MauXe;

/**
 *
 * @author phamq
 */
public class XeDAO {
    Connection conn;
    PreparedStatement prs;
    
    public XeDAO(){
         this.conn = new DBConnection().getConn();
    }
    
     public ArrayList<Xe> getListXeBymaMauXe(int maMauXe) {
        ArrayList<Xe> listXes = new ArrayList<>();
        try {
            PreparedStatement ps = conn.prepareStatement("select * "
                                                       + "from Xe "
                                                       + "where maMauXe = ?");
            ps.setInt(1, maMauXe);
            ResultSet res = ps.executeQuery();           
            while (res.next()) {
                Xe xe = new Xe();
                xe.setMaXe(res.getInt("maXe"));
                xe.setSoKhung(res.getString("soKhung"));
                xe.setSoMay(res.getString("soMay"));                
                xe.setMaMauXe(res.getInt("maMauXe"));
                listXes.add(xe);
            }
        } catch (SQLException ex) {
            Logger.getLogger(XeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listXes;
    }  
     
     
    public boolean themXe(Xe xe) {
         
          try {
            PreparedStatement ps = conn.prepareStatement("insert into Xe (soKhung,soMay,maMauXe) Values(?,?,?)");
            ps.setString(1, xe.getSoKhung());
            ps.setString(2, xe.getSoMay());
            ps.setInt(3, xe.getMaMauXe());
          
            return ps.executeUpdate() > 0;
        } catch (SQLException e) { 
            e.printStackTrace();
            return false;
        }
     }
    
    
    public ArrayList<Xe> getListXe() {
        ArrayList<Xe> listXes = new ArrayList<>();
        try {
            PreparedStatement ps = conn.prepareStatement("select * "
                                                     + "from Xe");
            ResultSet res = ps.executeQuery();
            while (res.next()) {
                Xe xe = new Xe();
                xe.setMaXe(res.getInt("maXe"));
                xe.setSoKhung(res.getString("soKhung"));
                xe.setSoMay(res.getString("soMay"));
 //               xe.getMaMauXe().setMaMauXe(res.getInt("maMauXe"));
                xe.setMaMauXe(res.getInt("maMauXe"));
                listXes.add(xe);

            }
        } catch (SQLException ex) {
            Logger.getLogger(XeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listXes;

    }
    
    public boolean deleteXe(int maXe) {
        try {
            PreparedStatement ps = conn.prepareStatement("delete from Xe where maXe =?");
            ps.setInt(1, maXe);
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            return false;
        }
    }
}
