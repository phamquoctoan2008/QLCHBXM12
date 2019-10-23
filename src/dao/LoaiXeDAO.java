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
import obj.LoaiXe;
import java.sql.ResultSet;
import java.util.logging.Logger;
import java.util.logging.Level;

/**
 *
 * @author phamq
 */
public class LoaiXeDAO {
    Connection conn;
    PreparedStatement prs;
    
    public LoaiXeDAO(){
        
        this.conn = new DBConnection().getConn();
    }
        
    public ArrayList<LoaiXe> getListTenLoaiXe (){
        ArrayList<LoaiXe> listTenLoaiXe = new ArrayList<>();
        try {
            PreparedStatement ps = conn.prepareStatement("select tenLoaiXe "
                                                      + "from LoaiXe");
            ResultSet res = ps.executeQuery();
            while (res.next()) {
                LoaiXe loaixe = new LoaiXe();
              
                loaixe.setTenLoaiXe(res.getString("tenLoaiXe"));
         
                listTenLoaiXe.add(loaixe);
            }
        } catch (Exception e) {
             Logger.getLogger(LoaiXeDAO.class.getName()).log(Level.SEVERE, null, e);
        }
        return listTenLoaiXe;
    } 
    
    public LoaiXe getLoaiXeByName (String tenloaixe){
        LoaiXe maloaixe = new LoaiXe();
        try {
         PreparedStatement ps = conn.prepareStatement("Select * from LoaiXe where tenLoaiXe = ?");
         ps.setString(1, tenloaixe);
         ResultSet res = ps.executeQuery();
         while (res.next()){
             maloaixe.setMaLoaiXe(res.getInt("maLoaiXe"));       
         }
        } catch (Exception e) {
            Logger.getLogger(LoaiXeDAO.class.getName()).log(Level.SEVERE, null, e);
        }
        return maloaixe;
        
    }
    
    public LoaiXe getLoaiXeByID (int maloaixe){
        LoaiXe loaixe = new LoaiXe();
        try {
         PreparedStatement ps = conn.prepareStatement("Select * from LoaiXe where maLoaiXe = ?");
         ps.setInt(1, maloaixe);
         ResultSet res = ps.executeQuery();
         while (res.next()){
             loaixe.setMaLoaiXe(res.getInt("maLoaiXe"));
             loaixe.setTenLoaiXe(res.getString("tenLoaiXe"));
         }
        } catch (Exception e) {
            Logger.getLogger(LoaiXeDAO.class.getName()).log(Level.SEVERE, null, e);
        }
        return loaixe;
        
    }
}
