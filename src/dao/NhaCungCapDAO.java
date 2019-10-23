/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import connect.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import obj.NhaCungCap;

/**
 *
 * @author phamq
 */
public class NhaCungCapDAO {
    Connection conn;
    PreparedStatement prs;
    
    public NhaCungCapDAO(){
        this.conn = new DBConnection().getConn();
    }
    
     public ArrayList<NhaCungCap> getListTenNhaCungCap (){
        ArrayList<NhaCungCap> listTenNhaCungCap = new ArrayList<>();
        try {
            PreparedStatement ps = conn.prepareStatement("select tenNCC "
                                                      + "from NhaCungCap");
            ResultSet res = ps.executeQuery();
            while (res.next()) {
                NhaCungCap ncc = new NhaCungCap();
              
                ncc.setTenNCC(res.getString("tenNCC"));
         
                listTenNhaCungCap.add(ncc);
            }
        } catch (Exception e) {
             Logger.getLogger(NhaCungCapDAO.class.getName()).log(Level.SEVERE, null, e);
        }
        return listTenNhaCungCap;
    } 
    
    public NhaCungCap getNhaCungCapByName (String tenncc){
        NhaCungCap ncc = new NhaCungCap();
        try {
         PreparedStatement ps = conn.prepareStatement("Select * from NhaCungCap where tenNCC = ?");
         ps.setString(1, tenncc);
         ResultSet res = ps.executeQuery();
         while (res.next()){
             ncc.setMaNCC(res.getInt("maNCC"));
             ncc.setTenNCC(res.getString("tenNCC"));
         }
        } catch (Exception e) {
            Logger.getLogger(NhaCungCapDAO.class.getName()).log(Level.SEVERE, null, e);
        }
        return ncc;
    } 
    
      public NhaCungCap getNhaCungCapByID (int mancc){
        NhaCungCap ncc = new NhaCungCap();
        try {
         PreparedStatement ps = conn.prepareStatement("Select * from NhaCungCap where maNCC = ?");
         ps.setInt(1, mancc);
         ResultSet res = ps.executeQuery();
         while (res.next()){
             ncc.setMaNCC(res.getInt("maNCC"));
             ncc.setTenNCC(res.getString("tenNCC"));
         }
        } catch (Exception e) {
            Logger.getLogger(NhaCungCapDAO.class.getName()).log(Level.SEVERE, null, e);
        }
        return ncc;
    }
      
      public boolean themKH(NhaCungCap ncc) {
        try {
            PreparedStatement ps = conn.prepareStatement("insert into NhaCungCap (tenNCC) Values(?)");
            ps.setString(1, ncc.getTenNCC());        
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return false;
        }
    }
    
}
