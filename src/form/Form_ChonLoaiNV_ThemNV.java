/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form;

import javax.swing.JFrame;

/**
 *
 * @author phamq
 */
public class Form_ChonLoaiNV_ThemNV extends javax.swing.JFrame {

    /**
     * Creates new form Form_ChonLoaiNV_ThemNV
     */
    public Form_ChonLoaiNV_ThemNV() {
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

        jLabel1 = new javax.swing.JLabel();
        jButton_ChonLoaiNV_NVHanhChanh_ = new javax.swing.JButton();
        jButton_ChonLoaiNV_NVKyThuat_ = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Thêm Nhân Viên");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Chọn Loại Nhân Viên");

        jButton_ChonLoaiNV_NVHanhChanh_.setText("Nhân Viên Hành Chánh");
        jButton_ChonLoaiNV_NVHanhChanh_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_ChonLoaiNV_NVHanhChanh_MouseClicked(evt);
            }
        });

        jButton_ChonLoaiNV_NVKyThuat_.setText("Nhân Viên Kỹ Thuật");
        jButton_ChonLoaiNV_NVKyThuat_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_ChonLoaiNV_NVKyThuat_MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(71, 71, 71))
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jButton_ChonLoaiNV_NVHanhChanh_)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(jButton_ChonLoaiNV_NVKyThuat_)
                .addGap(46, 46, 46))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_ChonLoaiNV_NVHanhChanh_, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_ChonLoaiNV_NVKyThuat_, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(58, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_ChonLoaiNV_NVHanhChanh_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_ChonLoaiNV_NVHanhChanh_MouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        Form_Them_NhanVien_HanhChanh formThemNVHC = new Form_Them_NhanVien_HanhChanh();
        formThemNVHC.setVisible(true);
        formThemNVHC.pack();
        formThemNVHC.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        formThemNVHC.setResizable(false);
        formThemNVHC.setLocationRelativeTo(null);
    }//GEN-LAST:event_jButton_ChonLoaiNV_NVHanhChanh_MouseClicked

    private void jButton_ChonLoaiNV_NVKyThuat_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_ChonLoaiNV_NVKyThuat_MouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        Form_Them_NV_KyThuat formThemNVKT = new Form_Them_NV_KyThuat();
        formThemNVKT.setVisible(true);
        formThemNVKT.pack();
        formThemNVKT.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        formThemNVKT.setResizable(false);
        formThemNVKT.setLocationRelativeTo(null);
    }//GEN-LAST:event_jButton_ChonLoaiNV_NVKyThuat_MouseClicked

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_ChonLoaiNV_NVHanhChanh_;
    private javax.swing.JButton jButton_ChonLoaiNV_NVKyThuat_;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}