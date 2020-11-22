/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GiaoDien;

import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import DAO.DichVuDAO;
import DAO.MatHangDAO;
import Entity.DichVu;
import Entity.MatHang;
import LopTienIch.Auth;
import LopTienIch.MsgBox;

/**
 *
 * @author admin
 */
public class QLMatHang extends javax.swing.JInternalFrame {

    /**
     * Creates new form QLMatHang2
     */
    public QLMatHang() {
        initComponents();
        init();
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
        jLabel2 = new javax.swing.JLabel();
        cboLoaiDichVu = new javax.swing.JComboBox<>();
        tab = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtTenMH = new javax.swing.JTextField();
        txtSoLuong = new javax.swing.JTextField();
        txtMaMH = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnMoi = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        rdoconhang = new javax.swing.JRadioButton();
        rdohethang = new javax.swing.JRadioButton();
        lblLoaiDichVu = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblMatHang = new javax.swing.JTable();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("QUẢN LÝ MẶT HÀNG");

        jLabel2.setText("Loại dịch vụ");

        cboLoaiDichVu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1" }));

        jLabel3.setText("Loai dịch vụ");

        jLabel4.setText("Mã mặt hàng");

        jLabel5.setText("Tên mặt hàng");

        jLabel6.setText("Số Lượng");

        jLabel7.setText("Trạng Thái");

        btnThem.setBackground(new java.awt.Color(51, 153, 255));
        btnThem.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/them.png"))); // NOI18N
        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnSua.setBackground(new java.awt.Color(51, 153, 255));
        btnSua.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/suanv.png"))); // NOI18N
        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnMoi.setBackground(new java.awt.Color(51, 153, 255));
        btnMoi.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnMoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/moi.png"))); // NOI18N
        btnMoi.setText("Mới");
        btnMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMoiActionPerformed(evt);
            }
        });

        btnXoa.setBackground(new java.awt.Color(51, 153, 255));
        btnXoa.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/xoanv.png"))); // NOI18N
        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem)
                    .addComponent(btnSua)
                    .addComponent(btnXoa)
                    .addComponent(btnMoi))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        rdoconhang.setSelected(true);
        rdoconhang.setText("Còn Hàng");
        rdoconhang.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        rdohethang.setText("Hết Hàng");

        lblLoaiDichVu.setForeground(new java.awt.Color(255, 51, 51));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGap(56, 56, 56)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtMaMH, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 551, Short.MAX_VALUE)
                                    .addComponent(txtTenMH, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtSoLuong, javax.swing.GroupLayout.Alignment.LEADING))
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblLoaiDichVu, javax.swing.GroupLayout.PREFERRED_SIZE, 551, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rdoconhang)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rdohethang, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblLoaiDichVu, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtMaMH, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtTenMH, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(rdoconhang, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rdohethang, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        tab.addTab("Thông Tin", jPanel1);

        tblMatHang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Mã dịch vụ", "Mã mặt hàng", "Tên mặt hàng", "Số lượng", "Trạng thái"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblMatHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblMatHangMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblMatHang);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 572, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tab.addTab("Danh Sách", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(180, 180, 180)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cboLoaiDichVu, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(tab, javax.swing.GroupLayout.PREFERRED_SIZE, 601, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboLoaiDichVu, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tab, javax.swing.GroupLayout.PREFERRED_SIZE, 525, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        insert();
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        update();
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMoiActionPerformed
        clearForm();
    }//GEN-LAST:event_btnMoiActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        delete();
    }//GEN-LAST:event_btnXoaActionPerformed

    private void tblMatHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMatHangMouseClicked
       if (evt.getClickCount() == 1) {
            this.row = tblMatHang.getSelectedRow();
            this.edit();
        }
    }//GEN-LAST:event_tblMatHangMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMoi;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JComboBox<String> cboLoaiDichVu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblLoaiDichVu;
    private javax.swing.JRadioButton rdoconhang;
    private javax.swing.JRadioButton rdohethang;
    private javax.swing.JTabbedPane tab;
    private javax.swing.JTable tblMatHang;
    private javax.swing.JTextField txtMaMH;
    private javax.swing.JTextField txtSoLuong;
    private javax.swing.JTextField txtTenMH;
    // End of variables declaration//GEN-END:variables

    MatHangDAO dao = new MatHangDAO();
    DichVuDAO dvdao = new DichVuDAO();
    int row = -1;
    private void init() {

        this.fillComboBoxTable();        
    }

    private void fillComboBoxTable() {
        DefaultComboBoxModel model = (DefaultComboBoxModel) cboLoaiDichVu.getModel();
        model.removeAllElements();
        List<DichVu> list = dvdao.selectAll();
        for (DichVu dv : list) {
            model.addElement(dv);
        }
    }

    void fillTable() {
        DefaultTableModel model = (DefaultTableModel) tblMatHang.getModel();
        model.setRowCount(0);
        try {
            DichVu dichvu = (DichVu) cboLoaiDichVu.getSelectedItem();
            List<MatHang> list = dao.selectByDichVu(dichvu.getMaDV());
            for (MatHang mh : list) {
                Object[] row = {
                    mh.getMaDV(),
                    mh.getMaMH(),                    
                    mh.getTenMH(),
                    mh.getSoLuong(),                    
                    mh.getTrangThai() ? "Con hang" : "het hang"
                };
                model.addRow(row);
            }
        } catch (Exception e) {
            MsgBox.alert(this, "Lỗi truy vấn dữ liệu");
        }
    }

    void chonDichVu() {
        DichVu dichvu = (DichVu) cboLoaiDichVu.getSelectedItem();        
            lblLoaiDichVu.setText(dichvu.getLoaiDV());            
            this.fillTable();
            this.row = -1;
            this.updateStatus();
            tab.setSelectedIndex(1);
        
    }

    private void updateStatus() {
        boolean edit = (this.row >= 0);        
        //Trạng thái form
        btnThem.setEnabled(!edit);
        btnSua.setEnabled(edit);
        btnXoa.setEnabled(edit);        
    }

    void edit() {
        String mamh = (String) tblMatHang.getValueAt(this.row, 0);
        MatHang mh = dao.selectById(mamh);
        this.setForm(mh);
        tab.setSelectedIndex(0);
        this.updateStatus();

    }
    private void delete() {
        DefaultTableModel model = (DefaultTableModel) tblMatHang.getModel();
        if (!Auth.isManager()) {
            MsgBox.alert(this, "Bạn không có quyền xóa");
        } else {
            String makh = (String) model.getValueAt(0, 0);

            if (MsgBox.confirm(this, "Bạn thật sự muốn xóa Dịch vụ này?")) {
                try {
                    dao.delete(makh);
                    this.fillTable();
                    this.clearForm();
                    MsgBox.alert(this, "Xóa thành công");

                } catch (Exception e) {
                    e.printStackTrace();
                    MsgBox.alert(this, "Xóa thất bại");
                }
            }

        }
    }
    
    void clearForm() {
        lblLoaiDichVu.setText(null);
        txtMaMH.setText(null);
        txtTenMH.setText(null);
        txtSoLuong.setText(null);               
        rdoconhang.setSelected(false);
        rdohethang.setSelected(false);
        this.row = -1;
        this.updateStatus();

    }

    private void insert() {
        MatHang mh = getForm();
        try {
            dao.insert(mh);
            this.fillTable();
            this.clearForm();
            MsgBox.alert(this, "Cập nhập thành công");
        } catch (Exception e) {
            e.printStackTrace();
            MsgBox.alert(this, "Cập nhập thất bại");
        }
    }
    
    void update() {
        MatHang mh = getForm();
        try {
            dao.update(mh);
            this.fillTable();
            this.clearForm();
            MsgBox.alert(this, "Cập nhập thành công");
        } catch (Exception e) {
            e.printStackTrace();
            MsgBox.alert(this, "Cập nhập thất bại");
        }

    }

    private MatHang getForm() {
        MatHang mh = new MatHang();
        DichVu dichvu = (DichVu) cboLoaiDichVu.getSelectedItem();               
        mh.setMaDV(dichvu.getMaDV());
        mh.setMaMH(cboLoaiDichVu.getToolTipText());
        mh.setTenMH(txtTenMH.getText());
        mh.setSoLuong(Integer.valueOf(txtSoLuong.getText()));
        mh.setTrangThai(rdoconhang.isSelected());
        
        return mh;
    }
    
    void setForm(MatHang mh) {
        cboLoaiDichVu.setToolTipText(String.valueOf(mh.getMaMH()));
        cboLoaiDichVu.setSelectedItem(dvdao.findById(mh.getMaDV()));
        txtMaMH.setText(mh.getMaMH());
        txtTenMH.setText(mh.getTenMH());        
        txtSoLuong.setText(String.valueOf(mh.getSoLuong()));        
        rdoconhang.setSelected(mh.getTrangThai());
        rdohethang.setSelected(!mh.getTrangThai());
        
    }
}
