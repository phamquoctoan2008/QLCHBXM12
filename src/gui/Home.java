/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import form.Form_ChonLoaiNV_SuaNV;
import form.Form_ChonLoaiNV_ThemNV;
import form.Form_HopDong;
import form.Form_KhachHang;
import form.Form_NhanVien;
import form.Form_PhieuNhanXet;
import form.Form_Sua_HopDong;
import form.Form_Sua_KhachHang;
import form.Form_Sua_PNX;
import form.Form_Tao_HopDong;
import form.Form_Tao_PNX;

import form.Form_Them_NhanVien_HanhChanh;
import form.Form_Them_Xe;
import form.Form_ThongKe_TonKho;
import form.Form_ThongKe_XeBan;
import form.Form_Xe;
import gui.menuItem.MenuItem;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.Action;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author phamq
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     * 
     * 
     */
    
    
    
    
    @Override
    public void setResizable(boolean resizable) {
        super.setResizable(resizable); //To change body of generated methods, choose Tools | Templates.
    }

    public Home() {
        initComponents();
        
        
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        execute();
    }
    
    
    private void execute() {
        
        ImageIcon iconHome = new ImageIcon(getClass().getResource("/images/icon_home_36px.png"));
        ImageIcon iconNhanVien = new ImageIcon(getClass().getResource("/images/icon_nhanvien_36px.png"));
        ImageIcon iconPhieuNhanXet = new ImageIcon(getClass().getResource("/images/icon_phieunhanxet_36px.png"));
        ImageIcon iconHopDong = new ImageIcon(getClass().getResource("/images/icon_hopdong_36px.png"));
        ImageIcon iconTimKiem = new ImageIcon(getClass().getResource("/images/icon_timkiem_36px.png"));
        ImageIcon iconKhachHang = new ImageIcon(getClass().getResource("/images/icon_nhanvien_36px.png"));
        
        
        
        // menu Nhan Vien 
        ImageIcon iconDanhSachNV = new ImageIcon(getClass().getResource("/images/icon_danhsach_24px.png"));
        ImageIcon iconThemNV = new ImageIcon(getClass().getResource("/images/icon_nhanvien_add_24px.png"));
        ImageIcon iconSuaNV = new ImageIcon(getClass().getResource("/images/icon_nhanvien_sua_24px.png"));
        ImageIcon iconXoaNV = new ImageIcon(getClass().getResource("/images/icon_nhanvien_xoa_24px.png"));
        
        MenuItem menuNhanVien_danhsachNV = new MenuItem(iconDanhSachNV,"Danh Sách nhân viên",new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                jPanel_noidung.removeAll();
                jPanel_noidung.add(new Form_NhanVien());
                jPanel_noidung.repaint();
                jPanel_noidung.validate();
            }
        },false);
        MenuItem menuNhanVien_themNV = new MenuItem(iconThemNV,"Thêm Nhân Viên",new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                Form_ChonLoaiNV_ThemNV formthemnv = new Form_ChonLoaiNV_ThemNV();        
                formthemnv.setVisible(true);
                formthemnv.pack();
                formthemnv.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                formthemnv.setResizable(false);
                formthemnv.setLocationRelativeTo(null);
            }
        },false);
        MenuItem menuNhanVien_suaNV = new MenuItem(iconSuaNV,"Sửa Nhân Viên",new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                Form_ChonLoaiNV_SuaNV formsuanv = new Form_ChonLoaiNV_SuaNV();        
                formsuanv.setVisible(true);
                formsuanv.pack();
                formsuanv.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                formsuanv.setResizable(false);
                formsuanv.setLocationRelativeTo(null);
            }
        },false);
        MenuItem menuNhanVien_xoaNV = new MenuItem(iconXoaNV,"Xóa Nhân Viên",null,false);
        
        
        // Menu Khach Hang
        ImageIcon iconDanhSachKH = new ImageIcon(getClass().getResource("/images/icon_danhsach_24px.png"));
        ImageIcon iconThemKH = new ImageIcon(getClass().getResource("/images/icon_nhanvien_add_24px.png"));
        ImageIcon iconSuaKH = new ImageIcon(getClass().getResource("/images/icon_nhanvien_sua_24px.png"));
        ImageIcon iconXoaKH = new ImageIcon(getClass().getResource("/images/icon_nhanvien_xoa_24px.png"));
        
        MenuItem menuKhachHang_danhsachKH = new MenuItem(iconDanhSachKH,"Danh Sách Khách Hàng",new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                jPanel_noidung.removeAll();
                jPanel_noidung.add(new Form_KhachHang());
                jPanel_noidung.repaint();
                jPanel_noidung.validate();
            }
        },false);
        MenuItem menuKhachHang_themKH = new MenuItem(iconThemKH,"Thêm Khách Hàng",new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                Form_KhachHang formKH = new Form_KhachHang();
                formKH.showDialogThemKhachHang();
            }
        },false);
        MenuItem menuKhachHang_suaKH = new MenuItem(iconSuaKH,"Sửa Khách Hàng",new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                Form_Sua_KhachHang formsuakh = new Form_Sua_KhachHang();
                formsuakh.setVisible(true);
                formsuakh.pack();
                formsuakh.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                formsuakh.setResizable(false);
                formsuakh.setLocationRelativeTo(null);
                
            }
        },false);
        MenuItem menuKhachHang_xoaKH = new MenuItem(iconXoaKH,"Xóa Khách Hàng",null,false);
        
        // Menu Tim Kiem
        ImageIcon iconTimKiemNV = new ImageIcon(getClass().getResource("/images/icon_timkiem_nhanvien_24px.png"));
        ImageIcon iconTimKiemKH = new ImageIcon(getClass().getResource("/images/icon_timkiem_nhanvien_24px.png"));
        ImageIcon iconTimKiemHopDong = new ImageIcon(getClass().getResource("/images/icon_timkiem_hopdong_24px.png"));
        ImageIcon iconTimKiemPhieuNhanXet = new ImageIcon(getClass().getResource("/images/icon_timkiem_phieunhanxet_24px.png"));
        
        MenuItem menuTimKiem_NV = new MenuItem(iconTimKiemNV,"Tìm Nhân Viên",null,false);
        MenuItem menuTimKiem_KH = new MenuItem(iconTimKiemKH,"Tìm Khách Hàng",null,false);
        MenuItem menuTimKiem_HopDong = new MenuItem(iconTimKiemHopDong,"Tìm Hợp Đồng",null,false);
        MenuItem menuTImKien_PhieuNhanXet = new MenuItem(iconTimKiemPhieuNhanXet,"Tìm Phiếu Nhận Xét",null,false);
        
        // Menu Nha Cung cap
        
        ImageIcon iconNCC = new ImageIcon(getClass().getResource("/images/icon_nhacungcap_36px.png"));
        ImageIcon iconDanhSachNCC = new ImageIcon(getClass().getResource("/images/icon_danhsach_24px.png"));
        
         MenuItem menuNCC_danhsachNCC = new MenuItem(iconDanhSachNCC,"Danh Sách Nhà Cung Cấp",null,false);
        MenuItem menuNCC = new MenuItem(iconNCC,"Nhà Cung Cấp", null,false, menuNCC_danhsachNCC);
        
        // Menu Hop Dong
        ImageIcon iconDanhSachHopDong = new ImageIcon(getClass().getResource("/images/icon_danhsach_24px.png"));
        ImageIcon icontaoHopDong = new ImageIcon(getClass().getResource("/images/icon_hopdong_add_24px.png"));
        ImageIcon iconsuaHopDong = new ImageIcon(getClass().getResource("/images/icon_hopdong_sua_24px.png"));
        ImageIcon iconHoaDon = new ImageIcon(getClass().getResource("/images/icon_hoadon_24px.png"));
        
        MenuItem menuHopDong_danhsach = new MenuItem(iconDanhSachHopDong,"Danh Sách Hợp Đồng",new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                jPanel_noidung.removeAll();
                jPanel_noidung.add(new Form_HopDong());
                jPanel_noidung.repaint();
                jPanel_noidung.validate();
            }
        },false);
        MenuItem menuHopDong_taoHD = new MenuItem(icontaoHopDong,"Tạo Hợp Đồng",new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                Form_Tao_HopDong formtaohd = new Form_Tao_HopDong();
                formtaohd.setVisible(true);
                formtaohd.pack();
                formtaohd.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                formtaohd.setResizable(false);
                formtaohd.setLocationRelativeTo(null);
            }
        },false);
        MenuItem menuHopDong_suaHD = new MenuItem(iconsuaHopDong,"Sửa Hợp Đồng",new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                Form_Sua_HopDong formsuahd = new Form_Sua_HopDong();
                formsuahd.setVisible(true);
                formsuahd.pack();
                formsuahd.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                formsuahd.setResizable(false);
                formsuahd.setLocationRelativeTo(null);
            }
        },false);
        MenuItem menuHopDong_hoadon = new MenuItem(iconHoaDon,"Xuất Hóa Đơn",null,false);
        
        
        // Menu Phieu Nhan Xet
        ImageIcon iconPhieuNhanXet_Them = new ImageIcon(getClass().getResource("/images/icon_phieunhanxet_add_24px.png"));
        ImageIcon iconPhieuNhanXet_Sua = new ImageIcon(getClass().getResource("/images/icon_phieunhanxet_sua_24px.png"));
        ImageIcon iconDanhSachPhieuNhanXet = new ImageIcon(getClass().getResource("/images/icon_danhsach_24px.png"));
        
        MenuItem menuPhieuNhanXet_Them = new MenuItem(iconPhieuNhanXet_Them,"Tạo Phiếu Nhận Xét",new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                Form_Tao_PNX formtaopnx = new Form_Tao_PNX();
                formtaopnx.setVisible(true);
                formtaopnx.pack();
                formtaopnx.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                formtaopnx.setResizable(false);
                formtaopnx.setLocationRelativeTo(null);
            }
        },false);
        MenuItem menuPhieuNhanXet_Sua = new MenuItem(iconPhieuNhanXet_Sua,"Sửa Phiếu Nhận Xét",new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                Form_Sua_PNX formsuapnx = new Form_Sua_PNX();
                formsuapnx.setVisible(true);
                formsuapnx.pack();
                formsuapnx.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                formsuapnx.setResizable(false);
                formsuapnx.setLocationRelativeTo(null);
            }
        },false);
        MenuItem menuPhieuNhanXet_danhsach = new MenuItem(iconDanhSachPhieuNhanXet,"Danh Sách Phiếu Nhận Xét",new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
               jPanel_noidung.removeAll();
               jPanel_noidung.add(new Form_PhieuNhanXet());
               jPanel_noidung.repaint();
               jPanel_noidung.validate();
            }
        },false);
        
        // Menu Thong Ke
        ImageIcon iconThongKe = new ImageIcon(getClass().getResource("/images/icon_thongke_36px.png"));
        ImageIcon iconThongKe_xeban = new ImageIcon(getClass().getResource("/images/icon_thongke_nam_24px.png"));
        ImageIcon iconThongKe_tonkho = new ImageIcon(getClass().getResource("/images/icon_thongke_quy_24px.png"));
        
        MenuItem menuThongKe_xeban = new MenuItem(iconThongKe_xeban,"Thống kê xe bán",new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
               jPanel_noidung.removeAll();
               jPanel_noidung.add(new Form_ThongKe_XeBan());
               jPanel_noidung.repaint();
               jPanel_noidung.validate();
            }
        },false);
        MenuItem menuThongKe_tonkho = new MenuItem(iconThongKe_tonkho,"Thống kê xe tồn kho",new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
               jPanel_noidung.removeAll();
               jPanel_noidung.add(new Form_ThongKe_TonKho());
               jPanel_noidung.repaint();
               jPanel_noidung.validate();
            }
        },false);
        
        
        // Menu Xe
        ImageIcon iconXe = new ImageIcon(getClass().getResource("/images/icon_xemoto_36px.png"));
        ImageIcon iconXe_themXe = new ImageIcon(getClass().getResource("/images/icon_xe_add_24px.png")); 
        ImageIcon iconXe_suaXe = new ImageIcon(getClass().getResource("/images/icon_sua_xe_24px.png"));
        ImageIcon iconDanhSachXe = new ImageIcon(getClass().getResource("/images/icon_danhsach_24px.png"));
        
        
        MenuItem menuThemXe = new MenuItem(iconXe_themXe,"Thêm Thông Tin Xe",new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                Form_Them_Xe formthemxe = new Form_Them_Xe();
                formthemxe.setVisible(true);
                formthemxe.pack();
                formthemxe.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                formthemxe.setResizable(false);
                formthemxe.setLocationRelativeTo(null);
            }
        },false);
        MenuItem menuDanhSachXe = new MenuItem(iconDanhSachXe,"Danh Sách Xe",new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
               jPanel_noidung.removeAll();
               jPanel_noidung.add(new Form_Xe());
               jPanel_noidung.repaint();
               jPanel_noidung.validate();
            }
        },false);
        
                
        MenuItem menuHome = new MenuItem(iconHome,"Home",new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                jPanel_noidung.removeAll();      
                jPanel_noidung.add(new Mainhome());
                jPanel_noidung.repaint();
                jPanel_noidung.revalidate();
            }
        },false);
        
        MenuItem menuXe = new MenuItem(iconXe,"Xe",null,false,menuDanhSachXe,menuThemXe);
        MenuItem menuNhanVien = new MenuItem(iconNhanVien,"Nhân viên",null,false,menuNhanVien_danhsachNV,menuNhanVien_themNV);
        MenuItem menuHopDong = new MenuItem(iconHopDong,"Hợp Đồng",null,false,menuHopDong_danhsach,menuHopDong_hoadon);
        MenuItem menuKhachHang = new MenuItem(iconKhachHang,"Khách Hàng",null,false,menuKhachHang_danhsachKH,menuKhachHang_themKH,menuHopDong_taoHD);
        MenuItem menuPhieuNhanXet = new MenuItem(iconPhieuNhanXet,"Phiếu Nhận Xét",null,false,menuPhieuNhanXet_danhsach,menuPhieuNhanXet_Them);
        MenuItem menuTimKiem = new MenuItem(iconTimKiem,"Tìm Kiếm",null,false,menuTimKiem_NV,menuTimKiem_KH,menuTimKiem_HopDong,menuTImKien_PhieuNhanXet);
        MenuItem menuThongKe = new MenuItem(iconThongKe,"Thống Kê",null,false,menuThongKe_xeban,menuThongKe_tonkho);
        addMenu(menuHome,menuXe,menuNCC,menuNhanVien,menuKhachHang,menuHopDong,menuPhieuNhanXet,menuTimKiem,menuThongKe);
    }
    
    private void addMenu(MenuItem... menu){
        for(int i = 0 ; i < menu.length ; i++){
            jPanel_Menus.add(menu[i]);
            ArrayList<MenuItem> subMenu = menu[i].getSubMenu();
            for(MenuItem m : subMenu){
                addMenu(m);
            }
                
        }
       jPanel_Menus.revalidate();
    }

    
    
    
    private void showDefaultMenu() {
        jPanel_noidung.add(new Mainhome());
        jPanel_noidung.repaint();
        jPanel_noidung.revalidate();
        jPanel_noidung.setBackground(Color.LIGHT_GRAY);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel_tieude = new javax.swing.JLabel();
        jPanel_menu = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel_Menus = new javax.swing.JPanel();
        jPanel_noidung = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quản Lý Cửa Hàng Bán Xe Máy");
        setPreferredSize(new java.awt.Dimension(980, 540));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(102, 153, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel_tieude.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel_tieude.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_tieude.setText("Quản Lý Cửa Hàng Bán Xe Máy");
        jLabel_tieude.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel_tieude.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(357, 357, 357)
                .addComponent(jLabel_tieude, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(250, 250, 250))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel_tieude, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(23, 23, 23))
        );

        jPanel_menu.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 2, new java.awt.Color(0, 0, 0)));

        jScrollPane1.setBorder(null);

        jPanel_Menus.setBackground(new java.awt.Color(153, 255, 255));
        jPanel_Menus.setLayout(new javax.swing.BoxLayout(jPanel_Menus, javax.swing.BoxLayout.Y_AXIS));
        jScrollPane1.setViewportView(jPanel_Menus);

        javax.swing.GroupLayout jPanel_menuLayout = new javax.swing.GroupLayout(jPanel_menu);
        jPanel_menu.setLayout(jPanel_menuLayout);
        jPanel_menuLayout.setHorizontalGroup(
            jPanel_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)
        );
        jPanel_menuLayout.setVerticalGroup(
            jPanel_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 463, Short.MAX_VALUE)
        );

        jPanel_noidung.setBackground(new java.awt.Color(255, 204, 102));
        jPanel_noidung.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel_menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel_noidung, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel_menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel_noidung, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel_tieude;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel_Menus;
    private javax.swing.JPanel jPanel_menu;
    private javax.swing.JPanel jPanel_noidung;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
