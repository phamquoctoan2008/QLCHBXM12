/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form;

import java.util.List;

/**
 *
 * @author phamq
 */
public class Form_NhaCungCap extends javax.swing.JPanel {

    /**
     * Creates new form Form_NhaCungCap
     */
    public Form_NhaCungCap() {
        initComponents();
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField_tim_nhacungcap = new javax.swing.JTextField();
        jButton_tim_nhacungcap = new javax.swing.JButton();
        jButton_xoa_nhacungcap = new javax.swing.JButton();
        jButton_sua_nhacungcap = new javax.swing.JButton();
        jButton_them_nhacungcap = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_dsNCC = new javax.swing.JTable();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Danh Sách Nhà Cung Cấp");

        jButton_tim_nhacungcap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_search_24px.png"))); // NOI18N
        jButton_tim_nhacungcap.setText("Tìm Kiếm");
        jButton_tim_nhacungcap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_tim_nhacungcapMouseClicked(evt);
            }
        });

        jButton_xoa_nhacungcap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_delete_sign_24px_1.png"))); // NOI18N
        jButton_xoa_nhacungcap.setText("Xoá Nhà Cung Cấp");
        jButton_xoa_nhacungcap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_xoa_nhacungcapActionPerformed(evt);
            }
        });

        jButton_sua_nhacungcap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_edit_calendar_24px.png"))); // NOI18N
        jButton_sua_nhacungcap.setText("Sửa Nhà Cung Cấp");
        jButton_sua_nhacungcap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_sua_nhacungcapMouseClicked(evt);
            }
        });

        jButton_them_nhacungcap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_add_24px.png"))); // NOI18N
        jButton_them_nhacungcap.setText("Thêm Nhà Cung Cấp");
        jButton_them_nhacungcap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_them_nhacungcapMouseClicked(evt);
            }
        });

        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder("Danh Sách Nhà Cung Cấp"));

        jTable_dsNCC.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTable_dsNCC.setShowGrid(true);
        jScrollPane1.setViewportView(jTable_dsNCC);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 191, Short.MAX_VALUE)
                        .addComponent(jTextField_tim_nhacungcap, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_tim_nhacungcap))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton_them_nhacungcap)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_sua_nhacungcap)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_xoa_nhacungcap))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jTextField_tim_nhacungcap, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_tim_nhacungcap, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_xoa_nhacungcap)
                    .addComponent(jButton_sua_nhacungcap)
                    .addComponent(jButton_them_nhacungcap))
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 802, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 436, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 802, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 436, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_tim_nhacungcapMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_tim_nhacungcapMouseClicked
        // TODO add your handling code here:
//        String phone = jTextField_tim_nhacungcap.getText();
//        if (Validator.validatePhone(jTextField_tim_nhacungcap)) {
//            List<KhachHang> listtim = khdao.searchKHByPhone(phone);
//            showlisttimKH(listtim);
//        }
    }//GEN-LAST:event_jButton_tim_nhacungcapMouseClicked

    private void jButton_xoa_nhacungcapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_xoa_nhacungcapActionPerformed
        // TODO add your handling code here:
//        try {
//            int r = this.jTable_dsNCC.getSelectedRow();
//            if (r == -1) {
//                JOptionPane.showMessageDialog(null, "Bạn Phải Chọn Khách Hàng Cần Xóa");
//            } else {
//                int result = JOptionPane.showConfirmDialog(null, "Bạn Có Muốn Xóa", "Xóa Khách Hàng", JOptionPane.YES_NO_OPTION);
//
//                if (result == JOptionPane.YES_OPTION) {
//
//                    String khachhang = this.jTable_dsNCC.getValueAt(r, 0).toString();
//                    if (khdao.delete(Integer.parseInt(khachhang))) {
//                        JOptionPane.showMessageDialog(null, "Xóa Khách Hàng Thành Công!!");
//
//                    } else {
//                        JOptionPane.showMessageDialog(null, "Lỗi");
//                    }
//                }
//            }
//        } catch (Exception e) {
//
//        }
//        showlistKH();
    }//GEN-LAST:event_jButton_xoa_nhacungcapActionPerformed

    private void jButton_sua_nhacungcapMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_sua_nhacungcapMouseClicked
//        int r = jTable_dsNCC.getSelectedRow();
//        if (r == -1) {
//            JOptionPane.showMessageDialog(null, "Bạn Phải Chọn Khách Hàng Cần Cập Nhật");
//        } else {
//
//            String makh = jTable_dsNCC.getValueAt(r, 0).toString();
//            khachhang = khdao.findKhachHangById(Integer.parseInt(makh));
//            jTextField_Dialog_hoten_Suakh.setText(khachhang.getHoTen());
//            jTextField_Dialog_diachi_Suakh.setText(khachhang.getDiaChi());
//            jTextField_Dialog_cmnd_Suakh.setText(khachhang.getCmnd());
//            jTextField_Dialog_sdt_Suakh.setText(khachhang.getSdt());
//            jDialog_Sua_KhachHang.setVisible(true);
//            jDialog_Sua_KhachHang.pack();
//            jDialog_Sua_KhachHang.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
//            jDialog_Sua_KhachHang.setResizable(false);
//            jDialog_Sua_KhachHang.setLocationRelativeTo(null);
//
//        }
    }//GEN-LAST:event_jButton_sua_nhacungcapMouseClicked

    private void jButton_them_nhacungcapMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_them_nhacungcapMouseClicked
//        showDialogThemKhachHang();
    }//GEN-LAST:event_jButton_them_nhacungcapMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_sua_nhacungcap;
    private javax.swing.JButton jButton_them_nhacungcap;
    private javax.swing.JButton jButton_tim_nhacungcap;
    private javax.swing.JButton jButton_xoa_nhacungcap;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_dsNCC;
    private javax.swing.JTextField jTextField_tim_nhacungcap;
    // End of variables declaration//GEN-END:variables
}