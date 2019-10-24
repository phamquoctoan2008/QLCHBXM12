/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obj;

/**
 *
 * @author phamq
 */
public class HinhThucThanhToan {
    private int maHinhThucThanhToan;
    private String tenHinhThucThanhToan;

    public HinhThucThanhToan(int maHinhThucThanhToan, String tenHinhThucThanhToan) {
        this.maHinhThucThanhToan = maHinhThucThanhToan;
        this.tenHinhThucThanhToan = tenHinhThucThanhToan;
    }

    public HinhThucThanhToan() {
    }

    public int getMaHinhThucThanhToan() {
        return maHinhThucThanhToan;
    }

    public void setMaHinhThucThanhToan(int maHinhThucThanhToan) {
        this.maHinhThucThanhToan = maHinhThucThanhToan;
    }

    public String getTenHinhThucThanhToan() {
        return tenHinhThucThanhToan;
    }

    public void setTenHinhThucThanhToan(String tenHinhThucThanhToan) {
        this.tenHinhThucThanhToan = tenHinhThucThanhToan;
    }
    
    
    
}
