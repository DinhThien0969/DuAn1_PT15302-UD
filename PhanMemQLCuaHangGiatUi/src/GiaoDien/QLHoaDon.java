/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GiaoDien;

import DAO.HoaDonDAO;
import DAO.NhanVienDAO;
import DAO.MatHangDAO;
import DAO.DichVuDAO;
import DAO.KhachHangDAO;
import Entity.DichVu;
import Entity.HoaDon;
import Entity.KhachHang;
import Entity.MatHang;
import Entity.NhanVien;
import LopTienIch.Auth;
import LopTienIch.MsgBox;
import LopTienIch.XDate;
import java.util.List;
import static javax.print.DocFlavor.BYTE_ARRAY.PDF;
import static javax.print.DocFlavor.INPUT_STREAM.PDF;
import javax.swing.table.DefaultTableModel;
import de.vogella.itext.write.PDF;
import java.sql.Date;

/**
 *
 * @author admin
 */
public class QLHoaDon extends javax.swing.JInternalFrame {

    /**
     * Creates new form QLHoaDon2
     */
    PDF pdf;

    public QLHoaDon() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        tab = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        txttenkhtable = new javax.swing.JTextField();
        btnTimkiem = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblhoadon = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnMoi = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtdiachi = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txttenmathang = new javax.swing.JTextField();
        txttenkh = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtsoluong = new javax.swing.JTextField();
        txtsdt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtnvnhan = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        rcbdatt = new javax.swing.JRadioButton();
        rcbchuatt = new javax.swing.JRadioButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtngaytra = new javax.swing.JTextField();
        txtngaynhan = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtthanhtien = new javax.swing.JTextField();
        btnIn = new javax.swing.JButton();
        txtDonGia = new javax.swing.JTextField();
        txtDichVu = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtMaHD = new javax.swing.JTextField();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("QUẢN LÍ HÓA ĐƠN");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setText("Tên khách hàng:");

        btnTimkiem.setText("Tìm kiếm");

        tblhoadon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã HĐ", "Tên khách hàng", "SĐT", "Địa chỉ", "Mặt hàng", "Số lượng", "Dịch vụ", "Đơn giá", "NV nhận", "Trạng thái", "Ngày nhận", "Ngày trả", "Thành tiền"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblhoadon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblhoadonMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblhoadon);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jLabel15)
                .addGap(18, 18, 18)
                .addComponent(txttenkhtable, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(btnTimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(338, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txttenkhtable, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 504, Short.MAX_VALUE)
                .addContainerGap())
        );

        tab.addTab("Danh sách hóa đơn", jPanel2);

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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnXoa)
                    .addComponent(btnMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSua)
                    .addComponent(btnThem))
                .addGap(24, 24, 24))
        );

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Tên khách hàng");

        txtdiachi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdiachiActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Địa chỉ");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Tên mặt hàng");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Số điện thoại");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Số lượng ");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Dịch vụ ");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Đơn giá");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Nhân viên nhận");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Trạng thái");

        buttonGroup1.add(rcbdatt);
        rcbdatt.setText("Đã thanh toán");

        buttonGroup1.add(rcbchuatt);
        rcbchuatt.setText("Chưa thanh toán");
        rcbchuatt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rcbchuattActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Ngày nhận");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("Ngày trả");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("Thành tiền");

        btnIn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnIn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8_print_50px.png"))); // NOI18N
        btnIn.setText("In hóa đơn");
        btnIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setText("Ma HD");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addGap(348, 348, 348)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel9)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel11)
                                            .addGap(50, 50, 50)
                                            .addComponent(rcbdatt)
                                            .addGap(29, 29, 29)
                                            .addComponent(rcbchuatt))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(121, 121, 121)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txtthanhtien, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE)
                                                .addComponent(txtngaytra)))))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(355, 355, 355)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel4)
                                .addComponent(jLabel8))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtMaHD, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel12)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtngaynhan, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel14)))
                        .addGap(433, 433, 433))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnIn, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(147, 147, 147))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtdiachi)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtnvnhan, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txttenmathang, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDichVu, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtsoluong, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDonGia, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 20, Short.MAX_VALUE)
                        .addComponent(txttenkh, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(79, 79, 79)
                        .addComponent(txtsdt, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(42, 42, 42))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txttenkh, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtsdt, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtdiachi, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txttenmathang, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtsoluong, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDonGia, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDichVu, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(rcbdatt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rcbchuatt, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtnvnhan, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13)
                            .addComponent(txtngaytra, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtngaynhan, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtthanhtien, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel16)
                                .addComponent(txtMaHD, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(9, 9, 9)))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(105, 105, 105))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnIn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(129, 129, 129))))
        );

        tab.addTab("Thông tin hóa đơn", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(290, 290, 290)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tab)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tab, javax.swing.GroupLayout.PREFERRED_SIZE, 631, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblhoadonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblhoadonMouseClicked
        // TODO add your handling code here:
//        if (evt.getClickCount() == 1) {
//            this.row = tblhoadon.getSelectedRow();
//            this.edit();
//        }
        if (evt.getClickCount() == 1) {
            int row = tblhoadon.getSelectedRow();
            dodulieulentext(row);
            tab.setSelectedIndex(1);
        }
    }//GEN-LAST:event_tblhoadonMouseClicked

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        try {
            
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        //update();
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMoiActionPerformed
        clearForm();
    }//GEN-LAST:event_btnMoiActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
//        delete();
    }//GEN-LAST:event_btnXoaActionPerformed

    private void txtdiachiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdiachiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdiachiActionPerformed

    private void rcbchuattActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rcbchuattActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rcbchuattActionPerformed

    private void btnInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInActionPerformed

        pdf = new PDF();
        //pdf.addMetaData("NEW PDF","Xuat ban boi: " + System.getProperty("user.name") + ", " + new Date());
        pdf.addItem("Ma Dich Vu:", txttenkh.getText());
        pdf.addItem("So Dien Thoai:", txtsdt.getText());
        pdf.addItem("Dia Chi:", txtdiachi.getText());
        pdf.addItem("Ten Mat Hang:", txttenmathang.getText());
        pdf.addItem("Dich Vu:", txtDichVu.getText());
        pdf.addItem("DOn Gia:", txtDonGia.getText());
        pdf.addItem("Nhan Vien Nhan:", txtnvnhan.getText());
        pdf.addItem("Trang Thai:", rcbdatt.getText());
        pdf.addItem("Ngay Nhan:", txtngaynhan.getText());
        pdf.addItem("Ngay Tra:", txtngaytra.getText());
        pdf.addItem("Thanh Tien:", txtthanhtien.getText());
        //pdf.addItem("Ma Hoa Don:", txtmahd.getText());
        pdf.closePFD();
        MsgBox.alert(this, "đã xuất hóa đơn thành công");
    }//GEN-LAST:event_btnInActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIn;
    private javax.swing.JButton btnMoi;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnTimkiem;
    private javax.swing.JButton btnXoa;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rcbchuatt;
    private javax.swing.JRadioButton rcbdatt;
    private javax.swing.JTabbedPane tab;
    private javax.swing.JTable tblhoadon;
    private javax.swing.JTextField txtDichVu;
    private javax.swing.JTextField txtDonGia;
    private javax.swing.JTextField txtMaHD;
    private javax.swing.JTextField txtdiachi;
    private javax.swing.JTextField txtngaynhan;
    private javax.swing.JTextField txtngaytra;
    private javax.swing.JTextField txtnvnhan;
    private javax.swing.JTextField txtsdt;
    private javax.swing.JTextField txtsoluong;
    private javax.swing.JTextField txttenkh;
    private javax.swing.JTextField txttenkhtable;
    private javax.swing.JTextField txttenmathang;
    private javax.swing.JTextField txtthanhtien;
    // End of variables declaration//GEN-END:variables

    HoaDonDAO dao = new HoaDonDAO();//Làm việc với bảng nhân viên
    NhanVienDAO daonv = new NhanVienDAO();
    MatHangDAO daomh = new MatHangDAO();
    KhachHangDAO daokh = new KhachHangDAO();
    DichVuDAO daodv = new DichVuDAO();

    int row = -1;///hàng được chọn hiện tại trên bảng

    private void init() {
        this.fillTableHoaDon();
        this.row = -1;
        this.updateStatus();
    }

    void fillTable() {
        DefaultTableModel model = (DefaultTableModel) tblhoadon.getModel();
        model.setRowCount(0);
        try {
            List<HoaDon> list = dao.selectAll();

            for (HoaDon nv : list) {
                Object[] row = {
                    nv.getMaHD(),
                    nv.getNgayNhan(),
                    nv.getNgayTra(),
                    nv.getTrangThai(),
                    nv.getThanhTien(),};
                model.addRow(row);
            }
        } catch (Exception e) {
            MsgBox.alert(this, "Lỗi truy vấn dữ liệu");
        }
    }

    void insert() {//Tạo ra một nhân viên từ thông tin trên form
        HoaDon hd = getForm();//Lấy Nhân viên từ form   
        //NhanVien nv=getForm();
        try {
            dao.insert(hd);//Tạo một nhân viên được lấy ra từ form
            this.fillTableHoaDon();//Cập nhật, đổ lại dữ liệu lên bảng
            MsgBox.alert(this, "Thêm mới thành công");
            this.clearForm();//Làm lại form

        } catch (Exception e) {
            e.printStackTrace();
            MsgBox.alert(this, "Thêm mới thất bại");
        }

    }
//    void update() {
//        HoaDon nv = getForm();
//        try {
//            dao.update(nv);
//            fillTable();
//            clearForm();
//            MsgBox.alert(this, "Cập nhật thành công");
//        } catch (Exception e) {
//            MsgBox.alert(this, "Cập nhật thất bại");
//        }
//    }
//
//    void delete() {
//        if (Auth.isManager()) {//kiểm tra xem có phải là trưởng phòng hay không
//            //Nếu là trưởng phòng thì..
//            String manv = txtnvnhan.getText();//lấy mã nhân viên
//            if (manv.equals(Auth.user.getMaNV())) {//kiểm tra mã nhân viên có trùng với mã nhân viên lấy bên trên hay không
//                MsgBox.alert(this, "Bạn không được xóa chính bạn");//nếu trùng thì thông báo...
//            } //trường hợp còn lại
//            else if (MsgBox.confirm(this, "Bạn thực sự muốn xóa nhân viên này")) {
//                try {
//                    dao.delete(manv);//xóa nhân viên từ mã nhân viên được lấy bên trên
//                    this.fillTable();//Cập nhật, đổ lại dữ liệu lên bảng
//                    this.clearForm();//Làm lại form
//                    MsgBox.alert(this, "Xóa thành công");
//                } catch (Exception e) {
//                    e.printStackTrace();
//                    MsgBox.alert(this, "Xóa thất bại");
//                }
//            }
//
//        } else {
//            MsgBox.alert(this, "Bạn không có quyền xóa nhân viên");//Trưởng phòng mới đc xóa
//        }
//    }

    void clearForm() {//xóa trắng form       
        txttenkh.setText(null);
        txtsdt.setText(null);
        txtdiachi.setText(null);
        txttenmathang.setText(null);
        txtsoluong.setText(null);
        txtnvnhan.setText(null);
        rcbchuatt.setSelected(false);
        txtngaynhan.setText(null);
        txtngaytra.setText(null);
        txtthanhtien.setText(null);
        txtDichVu.setText(null);
        txtDonGia.setText(null);
        txtMaHD.setText(null);
        this.row = -1;
        this.updateStatus();

    }

    void updateStatus() {//Cập nhật trạng thái 
        boolean edit = (this.row >= 0);
        //Trạng thái form
        txtnvnhan.setEditable(!edit);
        btnThem.setEnabled(!edit);
        btnSua.setEnabled(edit);
        btnXoa.setEnabled(edit);

    }

    void fillTableHoaDon() {
        DefaultTableModel model = (DefaultTableModel) tblhoadon.getModel();
        model.setRowCount(0);
        List<Object[]> list = dao.getHoaDon();
        for (Object[] row : list) {
            model.addRow(row);
        }
    }

    private void dodulieulentext(int row) {
        if (row < 0) {
            return;
        }
        txtMaHD.setText(tblhoadon.getValueAt(row, 0).toString());
        txttenkh.setText(tblhoadon.getValueAt(row, 1).toString());
        txtsdt.setText(tblhoadon.getValueAt(row, 2).toString());
        txtdiachi.setText(tblhoadon.getValueAt(row, 3).toString());
        txttenmathang.setText(tblhoadon.getValueAt(row, 4).toString());
        txtthanhtien.setText(tblhoadon.getValueAt(row, 12).toString());
        txtDichVu.setText(tblhoadon.getValueAt(row, 6).toString());
        txtDonGia.setText(tblhoadon.getValueAt(row, 7).toString());
        txtnvnhan.setText(tblhoadon.getValueAt(row, 8).toString());
        txtsoluong.setText(tblhoadon.getValueAt(row, 5).toString());
        txtngaynhan.setText(tblhoadon.getValueAt(row, 10).toString());
        txtngaytra.setText(tblhoadon.getValueAt(row, 11).toString());
        boolean trangthai = Boolean.parseBoolean(tblhoadon.getValueAt(row, 5).toString());
        if (trangthai) {
            rcbchuatt.setSelected(true);
        }
        rcbdatt.setSelected(true);

    }

    private HoaDon getForm() {

        HoaDon hd = new HoaDon();
        MatHang mh = new MatHang();
        NhanVien nv = new NhanVien();
        KhachHang kh = new KhachHang();
        DichVu dv = new DichVu();
//        DichVu dichvu = (DichVu) cboLoaiDichVu.getSelectedItem();
//        mh.setMaDV(dichvu.getMaDV());       
        hd.setThanhTien(Double.valueOf(txtthanhtien.getText()));
        hd.setNgayNhan(XDate.toDate(txtngaynhan.getText()));
        hd.setNgayTra(XDate.toDate(txtngaytra.getText()));
        //hd.setMaHD(Integer.valueOf(txtMaHD.getText()));
        //hd.setTrangThai(rcbdatt.getSelected());
        
        mh.setTenMH(txttenmathang.getText());
        //mh.setDonVi(Double.valueOf(txtDonVi.getText()));
        mh.setSoLuong(Integer.valueOf(txtsoluong.getText()));       
        mh.setDonVi(Double.valueOf(txtDonGia.getText()));
        mh.setDonGia(Double.valueOf(txtDonGia.getText()));
        mh.setTrangThai(rcbdatt.isSelected());
       //nhân viên
       nv.setTenNV(txtnvnhan.getText());
       //nv.setSDT(txtsdt.getText());
       

        return hd;
    }
}

