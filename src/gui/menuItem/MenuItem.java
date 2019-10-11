/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.menuItem;

import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.Icon;

/**
 *
 * @author phamq
 */
public class MenuItem extends javax.swing.JPanel {

    /**
     * Creates new form MenuItem
     */
    
    private final ArrayList<MenuItem> subMenu = new ArrayList<>();
    private ActionListener act ;
    public MenuItem(Icon icon, String menuName,ActionListener act, MenuItem... subMenu) {
        initComponents();
        
        jLabel_icon.setIcon(icon);
        jLabel_danhmuc.setText(menuName);
        if(act != null){
            this.act=act;
        }
        this.setSize(new Dimension(Integer.MAX_VALUE,45));
        this.setMaximumSize(new Dimension(Integer.MAX_VALUE,45));
        this.setMinimumSize(new Dimension(Integer.MAX_VALUE,45));
        for(int i=0;i<subMenu.length;i++){
            this.subMenu.add(subMenu[i]);
            subMenu[i].setVisible(false);
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jLabel_icon = new javax.swing.JLabel();
        jLabel_danhmuc = new javax.swing.JLabel();

        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });

        jLabel_danhmuc.setText("Danh mục");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_icon, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel_danhmuc, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_danhmuc, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                    .addComponent(jLabel_icon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents
private boolean showing = false;
    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        // TODO add your handling code here:
        if(showing){
            hideMenu();
            showing = false;
        }else{
            showMemu();
            showing = true;
        }
        if(act != null){
            act.actionPerformed(null);
        }
    }//GEN-LAST:event_formMousePressed

    
    private void showMemu (){
        new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<subMenu.size(); i++){
                    subMenu.get(i).setVisible(true);
                    sleep();
                }
            }
        }).start();
    }
    
    private void hideMenu(){
         new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=subMenu.size()-1; i>=0; i--){
                    subMenu.get(i).setVisible(false);
                    sleep();
                }
            }
        }).start();
    }
    
    private void sleep(){
        try {
            Thread.sleep(20);
        } catch (Exception e) {
        }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel_danhmuc;
    private javax.swing.JLabel jLabel_icon;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the subMenu
     */
    public ArrayList<MenuItem> getSubMenu() {
        return subMenu;
    }
}