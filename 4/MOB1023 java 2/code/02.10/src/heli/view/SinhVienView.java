/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package heli.view;

import heli.model.SinhVien;
import heli.service.QuanLySinhVien;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author longsuwu
 */
public class SinhVienView extends javax.swing.JFrame {

    /**
     * Creates new form SinhVienView
     */
    
    QuanLySinhVien qlsv = new QuanLySinhVien();
    
    public SinhVienView() {
        initComponents();
    }
    
    void loadDataTable(ArrayList<SinhVien> svList) {
        DefaultTableModel tableModel = (DefaultTableModel) tblSinhVien.getModel();
        tableModel.setRowCount(0);
        
        for (SinhVien sv : svList) {
            tableModel.addRow(new Object[]{
                sv.getID(),
                sv.getHoTen(),
                sv.getGioiTinh(),
                sv.getLopHoc(),
                sv.getTrangThai(),
            });
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSinhVien = new javax.swing.JTable();
        txtID = new javax.swing.JTextField();
        btnLoadData = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtHoTen = new javax.swing.JTextField();
        btnThem = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtTrangThai = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        rdNam = new javax.swing.JRadioButton();
        rdNu = new javax.swing.JRadioButton();
        cboLopHoc = new javax.swing.JComboBox<>();
        btnXoa = new javax.swing.JButton();
        btnCapNhat = new javax.swing.JButton();
        btnWrite = new javax.swing.JButton();
        btnRead = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("ID");

        tblSinhVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Họ tên", "Giới tính", "Lớp học", "Trạng thái"
            }
        ));
        tblSinhVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSinhVienMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblSinhVien);

        btnLoadData.setText("Load Data");
        btnLoadData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLoadDataMouseClicked(evt);
            }
        });

        jLabel2.setText("Họ tên");

        btnThem.setText("Thêm");
        btnThem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnThemMouseClicked(evt);
            }
        });

        jLabel3.setText("Giới tính");

        jLabel4.setText("Lớp học");

        jLabel5.setText("Trạng thái");

        buttonGroup1.add(rdNam);
        rdNam.setText("Nam");

        buttonGroup1.add(rdNu);
        rdNu.setText("Nữ");

        cboLopHoc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chọn lớp học", "SD1801", "SD1802", "SD1803", "SD1804", "SD1805", "SD1806", "SD1807", "SD1808", "SD1809" }));

        btnXoa.setText("Xóa");
        btnXoa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnXoaMouseClicked(evt);
            }
        });

        btnCapNhat.setText("Cập nhật");
        btnCapNhat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCapNhatMouseClicked(evt);
            }
        });

        btnWrite.setText("Ghi file");
        btnWrite.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnWriteMouseClicked(evt);
            }
        });

        btnRead.setText("Đọc file");
        btnRead.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnReadMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnLoadData, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(txtHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(txtTrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnWrite, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cboLopHoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnCapNhat, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rdNam)
                                .addGap(51, 51, 51)
                                .addComponent(rdNu)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(405, 405, 405)
                        .addComponent(btnRead, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(42, 42, 42))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLoadData))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThem))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(rdNam)
                    .addComponent(rdNu)
                    .addComponent(btnXoa))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cboLopHoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCapNhat))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtTrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnWrite))
                .addGap(39, 39, 39)
                .addComponent(btnRead)
                .addGap(37, 37, 37)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoadDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoadDataMouseClicked
        // TODO add your handling code here:
        loadDataTable(qlsv.getList());
    }//GEN-LAST:event_btnLoadDataMouseClicked

    private void btnThemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThemMouseClicked
        // TODO add your handling code here:
        String ID = txtID.getText();
        String hoTen = txtHoTen.getText();
        String gioiTinh;
        String lopHoc = cboLopHoc.getSelectedItem().toString();
        String trangThai = txtTrangThai.getText();
        
        if (rdNam.isSelected()) {
            gioiTinh = "Nam";
        } else {
            gioiTinh = "Nu";
        }
        
        SinhVien sv = new SinhVien(ID, hoTen, gioiTinh, lopHoc, trangThai);
        
        String kq = qlsv.them(sv);
        JOptionPane.showMessageDialog(this, kq);
        
        loadDataTable(qlsv.getList());
    }//GEN-LAST:event_btnThemMouseClicked

    private void btnXoaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXoaMouseClicked
        // TODO add your handling code here:
        int row = tblSinhVien.getSelectedRow();
        String kq = qlsv.xoa(row);
        JOptionPane.showMessageDialog(this, kq);
        loadDataTable(qlsv.getList());
    }//GEN-LAST:event_btnXoaMouseClicked

    private void btnCapNhatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCapNhatMouseClicked
        // TODO add your handling code here:
        int row = tblSinhVien.getSelectedRow();
        SinhVien sv = qlsv.getList().get(row);
        
        String ID = txtID.getText();
        String hoTen = txtHoTen.getText();
        String gioiTinh;
        String lopHoc = cboLopHoc.getSelectedItem().toString();
        String trangThai = txtTrangThai.getText();
        
        if (rdNam.isSelected()) {
            gioiTinh = "Nam";
        } else {
            gioiTinh = "Nu";
        }
        
        SinhVien sivi = new SinhVien(ID, hoTen, gioiTinh, lopHoc, trangThai);
        
        String kq = qlsv.capNhat(row, sv);
        JOptionPane.showMessageDialog(this, kq);
        
        loadDataTable(qlsv.getList());
    }//GEN-LAST:event_btnCapNhatMouseClicked

    private void tblSinhVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSinhVienMouseClicked
        // TODO add your handling code here:
        int row = tblSinhVien.getSelectedRow();
        SinhVien sv = qlsv.getList().get(row);
        
        txtID.setText(sv.getID());
        txtHoTen.setText(sv.getHoTen());
        txtTrangThai.setText(sv.getTrangThai());
        
        if (sv.getGioiTinh().equals("Nam")) {
            rdNam.setSelected(true);
        } else {
            rdNu.setSelected(true);
        }
        
        cboLopHoc.setSelectedItem(sv.getLopHoc().toString());
    }//GEN-LAST:event_tblSinhVienMouseClicked

    private void btnWriteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnWriteMouseClicked
        // TODO add your handling code here:
        String path = "output.txt";
        ArrayList<SinhVien> file = new ArrayList<>();
        try {
            FileWriter fileWriter = new FileWriter(path);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            
            for (SinhVien sinhVien : file) {
                bufferedWriter.write(sinhVien.toString());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (Exception e) {
            System.out.println("Co loi xay ra: " + e.getMessage());
        }
    }//GEN-LAST:event_btnWriteMouseClicked

    private void btnReadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReadMouseClicked
        // TODO add your handling code here:
        loadDataTable(qlsv.docFile());
    }//GEN-LAST:event_btnReadMouseClicked

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
            java.util.logging.Logger.getLogger(SinhVienView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SinhVienView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SinhVienView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SinhVienView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SinhVienView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCapNhat;
    private javax.swing.JButton btnLoadData;
    private javax.swing.JButton btnRead;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnWrite;
    private javax.swing.JButton btnXoa;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cboLopHoc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rdNam;
    private javax.swing.JRadioButton rdNu;
    private javax.swing.JTable tblSinhVien;
    private javax.swing.JTextField txtHoTen;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtTrangThai;
    // End of variables declaration//GEN-END:variables
}
