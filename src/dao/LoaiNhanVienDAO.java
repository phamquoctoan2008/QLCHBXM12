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
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import obj.LoaiNV;


/**
 *
 * @author phamq
 */
public class LoaiNhanVienDAO {
     Connection conn;
    PreparedStatement prs;
    
    public LoaiNhanVienDAO(){
        this.conn = new DBConnection().getConn();
    }
    
    public ArrayList<LoaiNV> getListLoaiNV (){
        ArrayList<LoaiNV> listLoaiNV = new ArrayList<>();
        try {
            PreparedStatement ps = conn.prepareStatement("select tenLoai "
                                                      + "from LoaiNV");
            ResultSet res = ps.executeQuery();
            while (res.next()) {
                LoaiNV loainv = new LoaiNV();
              
                loainv.setTenLoai(res.getString("tenLoai"));
         
                listLoaiNV.add(loainv);
            }
        } catch (Exception e) {
             Logger.getLogger(LoaiXeDAO.class.getName()).log(Level.SEVERE, null, e);
        }
        return listLoaiNV;
    } 
}
