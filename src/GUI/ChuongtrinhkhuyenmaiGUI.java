/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import BLL.ChuongtrinhkhuyenmaiBLL;
import DTO.ChuongtrinhkhuyenmaiDTO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
public class ChuongtrinhkhuyenmaiGUI extends javax.swing.JInternalFrame {

    ChuongtrinhkhuyenmaiBLL ctkmBLL = new ChuongtrinhkhuyenmaiBLL();
    private ArrayList<ChuongtrinhkhuyenmaiDTO> listCTKM;
    DefaultTableModel model;
    public ChuongtrinhkhuyenmaiGUI() {
        initComponents();
         try {
            UIManager.setLookAndFeel(new com.jtattoo.plaf.graphite.GraphiteLookAndFeel());
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(ChuongtrinhkhuyenmaiGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        listCTKM = ctkmBLL.getAllCTKMDTO();
        model = (DefaultTableModel) tblchuongtrinhkm.getModel();
        model.setColumnIdentifiers(new Object[]{
            "STT", "Mã KM", "Tên CT", "Thời gian bắt đầu ", "Thời gian kết thúc", "Loại chương trình", "Nội dung giảm giá"
        });
        showTable();
        tblchuongtrinhkm.setRowSorter(new TableRowSorter<TableModel>(model));
        cbTimkiem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateFilter();
            }
        });
        txtTimkiem.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent de) {
                updateFilter();
            }

            @Override
            public void removeUpdate(DocumentEvent de) {
                updateFilter();
            }

            @Override
            public void changedUpdate(DocumentEvent de) {
                updateFilter();
            }
        });
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
        jPanel3 = new javax.swing.JPanel();
        tblchuongtrinhkhuyenmai = new javax.swing.JScrollPane();
        tblchuongtrinhkm = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtMaKM = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtTenCT = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtLoaiCT = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtNdgg = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtNgayBD = new com.toedter.calendar.JDateChooser();
        txtNgayKT = new com.toedter.calendar.JDateChooser();
        jPanel6 = new javax.swing.JPanel();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        txtTimkiem = new javax.swing.JTextField();
        cbTimkiem = new javax.swing.JComboBox<>();

        setTitle("Chương trình khuyến mãi");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CHƯƠNG TRÌNH KHUYẾN MÃI");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông tin chương trình khuyến mãi", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 15), new java.awt.Color(255, 0, 0))); // NOI18N

        tblchuongtrinhkm.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblchuongtrinhkm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblchuongtrinhkmMouseClicked(evt);
            }
        });
        tblchuongtrinhkhuyenmai.setViewportView(tblchuongtrinhkm);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(tblchuongtrinhkhuyenmai, javax.swing.GroupLayout.PREFERRED_SIZE, 788, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tblchuongtrinhkhuyenmai, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel2.setText("Mã KM :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel3.setText("Tên chương trình KM :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel4.setText("Loại chương trình KM:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel5.setText("Nội dung giảm giá :");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel6.setText("Thời gian bắc đầu :");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel7.setText("Thời gian kết thúc :");

        txtNgayBD.setDateFormatString(" yyyy/MM/dd");

        txtNgayKT.setDateFormatString("yyyy/MM/dd");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNgayBD, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtLoaiCT, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtMaKM, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtTenCT, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(txtNdgg, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtNgayKT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(txtMaKM, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtTenCT, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtLoaiCT, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtNdgg, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45))
                            .addComponent(txtNgayBD, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNgayKT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 23, Short.MAX_VALUE))
        );

        btnThem.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/them.png"))); // NOI18N
        btnThem.setText("Thêm ");
        btnThem.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnSua.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/sua.png"))); // NOI18N
        btnSua.setText("Sửa");
        btnSua.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnXoa.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/xoa.png"))); // NOI18N
        btnXoa.setText("Xóa");
        btnXoa.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnReset.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnReset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/refresh.png"))); // NOI18N
        btnReset.setText("Reset");
        btnReset.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnThem, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(btnSua, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnReset, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                        .addComponent(btnXoa, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)))
                .addContainerGap())
        );

        cbTimkiem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mã Khuyến mãi", "Tên chương trình", "Loại chương trình", "Thời gian bắt đầu", "Thời gian kết thúc" }));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(cbTimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbTimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 public int kt() {
        Date ht = new Date();
        Date bd = txtNgayBD.getDate();
        Date kt = txtNgayKT.getDate();
        int fag = 1;
        if (txtMaKM.getText().length() == 0 || txtLoaiCT.getText().length() == 0 || txtNdgg.getText().length() == 0
                || txtTenCT.getText().length() == 0) {
            fag = 0;
        } else if (bd.before(ht)) {
            fag = 0;
        } else if (kt.before(bd)) {
            fag = 0;
        }
        return fag;
    }
    private void tblchuongtrinhkmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblchuongtrinhkmMouseClicked
        int i = tblchuongtrinhkm.getSelectedRow();
        txtMaKM.setText(tblchuongtrinhkm.getModel().getValueAt(i, 1).toString());
        txtMaKM.setEditable(false);
        txtTenCT.setText(tblchuongtrinhkm.getModel().getValueAt(i, 2).toString());
        txtLoaiCT.setText(tblchuongtrinhkm.getModel().getValueAt(i, 5).toString());
        try {
            Date date = new SimpleDateFormat("yyyy-MM-dd").parse((String) model.getValueAt(i, 3));
            txtNgayBD.setDate(date);
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        try {
            Date date1 = new SimpleDateFormat("yyyy-MM-dd").parse((String) model.getValueAt(i, 4));
            txtNgayKT.setDate(date1);
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        txtNdgg.setText(tblchuongtrinhkm.getModel().getValueAt(i, 6).toString());
        txtMaKM.setEditable(false);
        btnThem.setEnabled(false);
    }//GEN-LAST:event_tblchuongtrinhkmMouseClicked

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        if (kt() == 1) {
            ChuongtrinhkhuyenmaiDTO ctkmDTO = new ChuongtrinhkhuyenmaiDTO();
            ctkmDTO.setMaKM(txtMaKM.getText());
            ctkmDTO.setTenCT(txtTenCT.getText());
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String date = sdf.format(txtNgayBD.getDate());
            String date2 = sdf.format(txtNgayKT.getDate());
            ctkmDTO.setNgayBD(date);
            ctkmDTO.setNgayKT(date2);
            ctkmDTO.setLoaiCT(txtLoaiCT.getText());
            ctkmDTO.setNdGG(txtNdgg.getText());
             for (ChuongtrinhkhuyenmaiDTO sp : listCTKM) {
                if (sp.getMaKM().equals(txtMaKM.getText())) {
                    JOptionPane.showMessageDialog(rootPane, "Đã tồn tại mã khuyến mãi này");
                    return;
                }
            }
            try {
                if (ctkmBLL.addCTKMDTO(ctkmDTO)) {
                    JOptionPane.showMessageDialog(rootPane, "Thêm thành công");
                    listCTKM.add(ctkmDTO);
                    showResult();
                    reset();
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Thêm không thành công ");
                }
            } catch (NullPointerException e) {
                JOptionPane.showMessageDialog(rootPane, "Thêm không thành công ");
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Thông tin bạn nhập chưa đủ hoặc bị sai:");
            reset();
        }
    }//GEN-LAST:event_btnThemActionPerformed
public int kt1() {
        Date ht = new Date();
        Date bd = txtNgayBD.getDate();
        Date batdau = ctkmBLL.layngayBD(txtMaKM.getText());
        Date kt = txtNgayKT.getDate();
        int fag = 1;
        if (txtLoaiCT.getText().length() == 0 || txtNdgg.getText().length() == 0
                || txtTenCT.getText().length() == 0) {
            fag = 0;
        } else if (batdau.before(ht) || bd.before(ht)) {
            fag = 0;
        } else if (kt.before(bd)) {
            fag = 0;
        }
        return fag;
    }
    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        if (kt1() == 1) {
            int selectedIndex = tblchuongtrinhkm.getSelectedRow();
            if (listCTKM.size() == 0) {
                JOptionPane.showMessageDialog(rootPane,
                    "Hãy nhập thêm Khuyến mãi rồi sửa");
            } else if (selectedIndex == -1) {
                JOptionPane.showMessageDialog(rootPane,
                    "Hãy chọn dòng có thông tin  cần sửa rồi ấn sửa");
            } else {
                ChuongtrinhkhuyenmaiDTO ctkmDTO = new ChuongtrinhkhuyenmaiDTO();
                ctkmDTO.setMaKM(txtMaKM.getText());
                txtMaKM.setEditable(false);
                ctkmDTO.setTenCT(txtTenCT.getText());
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                String date = sdf.format(txtNgayBD.getDate());
                String date2 = sdf.format(txtNgayKT.getDate());
                ctkmDTO.setNgayBD(date);
                ctkmDTO.setNgayKT(date2);
                ctkmDTO.setLoaiCT(txtLoaiCT.getText());
                ctkmDTO.setNdGG(txtNdgg.getText());
                try {
                    if (ctkmBLL.suaCTKMDTO(ctkmDTO)) {
                        JOptionPane.showMessageDialog(rootPane, "Sửa thành công !");
                        model.setRowCount(0);
                        listCTKM = ctkmBLL.getAllCTKMDTO();
                        showTable();
                        reset();
                    } else {
                        JOptionPane.showMessageDialog(rootPane, "Sửa không thành công 123");
                    }
                } catch (NullPointerException e) {
                    JOptionPane.showMessageDialog(rootPane, "Sửa không thành công ");
                }
            }
            btnThem.setEnabled(true);
        } else {
            JOptionPane.showMessageDialog(rootPane, "Lỗi không nhập đủ thông tin hoặc sửa chương trình trước hôm nay ");
        }
    }//GEN-LAST:event_btnSuaActionPerformed
 public int kt3() {
        int fag = 1;
        Date ht = new Date();
        Date bd = txtNgayBD.getDate();
        Date batdau = ctkmBLL.layngayBD(txtMaKM.getText());
        Date kt = txtNgayKT.getDate();
        if (batdau.before(ht)) {
            fag = 0;
        }
        return fag;
    }
    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        if (kt3() == 1) {
            int removeIndex = tblchuongtrinhkm.getSelectedRow();
            if (removeIndex == -1) {
                JOptionPane.showMessageDialog(rootPane,
                    "Hãy chọn một dòng rồi ấn nút xóa");
            } else if (listCTKM.size() == 0) {
                JOptionPane.showMessageDialog(rootPane,
                    "Không có thông tin  nào để xóa");
            } else {
                ChuongtrinhkhuyenmaiDTO ctkmDTO = new ChuongtrinhkhuyenmaiDTO();
                ctkmDTO.setMaKM(txtMaKM.getText());
                if (ctkmBLL.xoaCTKMDTO(ctkmDTO)) {
                    if (JOptionPane.showConfirmDialog(this, "Delete chương trình KM ?", "Confirm",
                        JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                    model.setRowCount(0);
                    listCTKM = new ChuongtrinhkhuyenmaiBLL().getAllCTKMDTO();
                    showTable();
                }
                reset();
            } else {
                JOptionPane.showMessageDialog(rootPane, "Xóa không thành công ");
            }
        }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Chương trình này vẫn còn tồn tại không được xóa");
        }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        reset();
    }//GEN-LAST:event_btnResetActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JComboBox<String> cbTimkiem;
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
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane tblchuongtrinhkhuyenmai;
    private javax.swing.JTable tblchuongtrinhkm;
    private javax.swing.JTextField txtLoaiCT;
    private javax.swing.JTextField txtMaKM;
    private javax.swing.JTextField txtNdgg;
    private com.toedter.calendar.JDateChooser txtNgayBD;
    private com.toedter.calendar.JDateChooser txtNgayKT;
    private javax.swing.JTextField txtTenCT;
    private javax.swing.JTextField txtTimkiem;
    // End of variables declaration//GEN-END:variables
 private void showTable() {
        model.setRowCount(0);
        int i = 1;
        for (ChuongtrinhkhuyenmaiDTO ctkmDTO : listCTKM) {
            model.addRow(new Object[]{
                i++, ctkmDTO.getMaKM(), ctkmDTO.getTenCT(), ctkmDTO.getNgayBD(), ctkmDTO.getNgayKT(), ctkmDTO.getLoaiCT(),
                ctkmDTO.getNdGG()
            });
        }
    }

    private void showResult() {
        int i = listCTKM.size();
        ChuongtrinhkhuyenmaiDTO ctkmDTO = listCTKM.get(listCTKM.size() - 1);
        model.addRow(new Object[]{
            i++, ctkmDTO.getMaKM(), ctkmDTO.getTenCT(), ctkmDTO.getNgayBD(), ctkmDTO.getNgayKT(), ctkmDTO.getLoaiCT(),
            ctkmDTO.getNdGG()});
    }

    private void reset() {
        txtMaKM.setText("");
        txtLoaiCT.setText("");
        txtNdgg.setText("");
        txtNgayBD.setDate(new Date());
        txtNgayKT.setDate(new Date());
        txtTenCT.setText("");
        btnThem.setEnabled(true);
        txtMaKM.setEditable(true);
    }

    protected void updateFilter() {
        Object selected = cbTimkiem.getSelectedItem();
        TableRowSorter<TableModel> sorter = (TableRowSorter<TableModel>) tblchuongtrinhkm.getRowSorter();
        String text = "(?i)" + txtTimkiem.getText();
        if ("Nothing".equals(selected)) {
            sorter.setRowFilter(null);
        } else {
            int col = -1;
            if ("Mã khuyến mãi".equals(selected)) {
                col = 1;
            } else if ("Tên chương trình".equals(selected)) {
                col = 2;
            } else if ("Loại chương trình".equals(selected)) {
                col = 5;
            } else if ("Thời gian bắt đầu".equals(selected)) {
                col = 3;
            } else if ("Thời gian kết thúc".equals(selected)) {
                col = 4;
            }
            sorter.setRowFilter(RowFilter.regexFilter(text, col));
        }
    }
}