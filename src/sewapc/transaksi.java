/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package sewapc;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javax.print.attribute.Size2DSyntax.MM;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * @author ACER
 */
public class transaksi extends javax.swing.JInternalFrame {
      int nilai1,kali;
    private String[] JudulKolom={"ID Transaksi","Tanggal","Nama Pelanggan","ID Komputer","Mulai","Selesai","Durasi","Bayar"};
    private int[]LebarKolom ={100,100,100,100,100,100,100,100};
    private String SQL="SELECT * FROM transaksi";
    String dateChooser;
    public void tampilPilihan() {
        java.sql.Statement st;
        java.sql.Connection con;
        java.sql.ResultSet rs;
        try {
            con = java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/db_sewa_pc", "root", "");
            st = con.createStatement();
            String s = "select * from pelanggan";
            rs = st.executeQuery(s);
            while (rs.next()) {
                cbNamapelanggan.addItem(rs.getString(2));
            }
            String a = "select * from komputer";
            rs = st.executeQuery(a);
            while (rs.next()) {
                cbIdkomp.addItem(rs.getString(1));
            }
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR" + e.getMessage());
                }
    }
    public void tanggal(){
        Date ys=new Date();
        SimpleDateFormat s=new SimpleDateFormat("dd-MM-yyyy H:mm");
        tfTanggal.setText(s.format(ys));
    }

    public transaksi() {
        initComponents();
        
        new configdb().setJudulTabel(tbltransaksi, JudulKolom);
        new configdb().tampilTabel(tbltransaksi, JudulKolom, SQL);
        new configdb().setLebarKolomTabel(tbltransaksi, LebarKolom);
        tampilPilihan();
        tanggal();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        tfNotransaksi = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tfTanggal = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        tfDurasi = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        tfBayar = new javax.swing.JTextField();
        cbNamapelanggan = new javax.swing.JComboBox<>();
        cbIdkomp = new javax.swing.JComboBox<>();
        tfMulai = new javax.swing.JFormattedTextField();
        tfSelesai = new javax.swing.JFormattedTextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbltransaksi = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        tfSearch = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        btnSave = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnCetak = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();

        setMinimumSize(new java.awt.Dimension(827, 660));
        setPreferredSize(new java.awt.Dimension(827, 660));

        jPanel1.setBackground(new java.awt.Color(0, 102, 153));
        jPanel1.setMinimumSize(new java.awt.Dimension(730, 580));
        jPanel1.setPreferredSize(new java.awt.Dimension(730, 580));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 1, 30)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("TRANSAKSI");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, -1, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Form Transaksi", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Black", 1, 12))); // NOI18N

        tfNotransaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNotransaksiActionPerformed(evt);
            }
        });
        tfNotransaksi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfNotransaksiKeyReleased(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("No Transaksi");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("ID Komputer");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Tanggal");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Nama Pelanggan");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Mulai");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("Selesai");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setText("Durasi");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setText("Bayar");

        tfBayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfBayarActionPerformed(evt);
            }
        });

        cbNamapelanggan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih" }));

        cbIdkomp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih" }));

        tfMulai.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd/MM/yyy"))));
        tfMulai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfMulaiActionPerformed(evt);
            }
        });

        tfSelesai.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd/MM/yyy"))));
        tfSelesai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfSelesaiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel6))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel5))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel2)))
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cbIdkomp, javax.swing.GroupLayout.Alignment.TRAILING, 0, 209, Short.MAX_VALUE)
                    .addComponent(tfTanggal, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tfNotransaksi, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cbNamapelanggan, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(tfDurasi, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                    .addComponent(tfSelesai, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfMulai, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfBayar))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfNotransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(tfMulai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel5))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tfTanggal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tfSelesai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel6))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfDurasi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(cbNamapelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbIdkomp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfBayar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jLabel10)))
                .addGap(28, 28, 28))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 690, 190));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tabel Data Transaksi", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Black", 1, 12))); // NOI18N

        tbltransaksi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID Transaksi", "Tanggal", "Nama Pelanggan", "ID Komputer", "Mulai", "Selesai", "Durasi"
            }
        ));
        tbltransaksi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbltransaksiMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbltransaksi);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 680, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, 690, 160));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Search", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Black", 1, 12))); // NOI18N

        tfSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfSearchKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tfSearch, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(tfSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 4, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, -1, 50));

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Action", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Black", 1, 12))); // NOI18N

        btnSave.setBackground(javax.swing.UIManager.getDefaults().getColor("window"));
        btnSave.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnSave.setForeground(new java.awt.Color(0, 102, 153));
        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Save-icon (1).png"))); // NOI18N
        btnSave.setText("SAVE");
        btnSave.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnClear.setBackground(javax.swing.UIManager.getDefaults().getColor("window"));
        btnClear.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnClear.setForeground(new java.awt.Color(0, 102, 153));
        btnClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Windows-Close-Program-icon (1).png"))); // NOI18N
        btnClear.setText("CLEAR");
        btnClear.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnDelete.setBackground(javax.swing.UIManager.getDefaults().getColor("window"));
        btnDelete.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(0, 102, 153));
        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/trash-icon (1).png"))); // NOI18N
        btnDelete.setText("DELETE");
        btnDelete.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnCetak.setBackground(javax.swing.UIManager.getDefaults().getColor("window"));
        btnCetak.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnCetak.setForeground(new java.awt.Color(0, 102, 153));
        btnCetak.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Actions-document-print-icon (1).png"))); // NOI18N
        btnCetak.setText("CETAK");
        btnCetak.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCetak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCetakActionPerformed(evt);
            }
        });

        btnUpdate.setBackground(javax.swing.UIManager.getDefaults().getColor("window"));
        btnUpdate.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(0, 102, 153));
        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Apps-system-software-update-icon (1).png"))); // NOI18N
        btnUpdate.setText("UPDATE");
        btnUpdate.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(btnCetak, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCetak, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 690, 80));

        btnExit.setBackground(javax.swing.UIManager.getDefaults().getColor("window"));
        btnExit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnExit.setForeground(new java.awt.Color(153, 0, 0));
        btnExit.setText("EXIT");
        btnExit.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        jPanel1.add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 19, 80, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 814, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 625, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfNotransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNotransaksiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNotransaksiActionPerformed

    private void tfBayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfBayarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfBayarActionPerformed

    private void tbltransaksiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbltransaksiMouseClicked
        // TODO add your handling code here:
        int row = tbltransaksi.getSelectedRow();
        tfNotransaksi.setText(tbltransaksi.getModel().getValueAt(row,0).toString());
        cbNamapelanggan.setSelectedItem(tbltransaksi.getModel().getValueAt(row,2).toString());
        cbIdkomp.setSelectedItem(tbltransaksi.getModel().getValueAt(row,3).toString());
        tfMulai.setText(tbltransaksi.getModel().getValueAt(row,4).toString());
        tfSelesai.setText(tbltransaksi.getModel().getValueAt(row,5).toString());
        tfDurasi.setText(tbltransaksi.getModel().getValueAt(row,6).toString());
        tfBayar.setText(tbltransaksi.getModel().getValueAt(row,7).toString());

    }//GEN-LAST:event_tbltransaksiMouseClicked

    private void tfSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfSearchKeyReleased
        // TODO add your handling code here:
        String SQLCari ="SELECT*FROM transaksi WHERE no_transaksi LIKE'%"+tfSearch.getText()+"%' OR nama_pelanggan LIKE '%"+tfSearch.getText()+"%'";
        new configdb().setJudulTabel(tbltransaksi, JudulKolom);
        new configdb().tampilTabel(tbltransaksi, JudulKolom, SQLCari);
        new configdb().setLebarKolomTabel(tbltransaksi, LebarKolom);
    }//GEN-LAST:event_tfSearchKeyReleased

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        String a,b;
        a = (String)cbNamapelanggan.getSelectedItem();
        b = (String)cbIdkomp.getSelectedItem();
        String[] Fieldnya ={"no_transaksi","tgl_transaksi","nama_pelanggan","id_komputer","mulai","selesai","durasi","bayar"};
        String[] Valuenya = {tfNotransaksi.getText(),tfTanggal.getText(),a,b,tfMulai.getText(),tfSelesai.getText(),tfDurasi.getText(),tfBayar.getText()};
        if ( new configdb().DuplikasiPrimeryKey("transaksi","no_transaksi",tfNotransaksi.getText()))
        {
            JOptionPane.showMessageDialog(null,"ID Pelanggan Sudah Ada");
        }else{
            new configdb().Simpan("transaksi",Fieldnya, Valuenya);
            JOptionPane.showMessageDialog(null,"Data transaksi berhasil di Simpan");
            new configdb().setJudulTabel(tbltransaksi, JudulKolom);
            new configdb().tampilTabel(tbltransaksi, JudulKolom, SQL);
            new configdb().setLebarKolomTabel(tbltransaksi, LebarKolom);
        }
        // Mengosongkan kolom input setelah operasi penambahan data
        tfNotransaksi.setText("");
        cbNamapelanggan.setSelectedItem("Pilih");   
        cbIdkomp.setSelectedItem("Pilih");
        tfMulai.setText("");
        tfSelesai.setText("");
        tfDurasi.setText("");
        tfBayar.setText("");
        // Mengaktifkan tombol-tombol tertentu setelah operasi penambahan data
        btnUpdate.setEnabled(true);
        btnDelete.setEnabled(true);
        btnCetak.setEnabled(true);
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        tfNotransaksi.setText("");
        tfMulai.setText("");
        tfSelesai.setText("");
        tfDurasi.setText("");
        tfBayar.setText("");
        cbNamapelanggan.setSelectedIndex(0);
        cbIdkomp.setSelectedIndex(0);
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        String a,b;
        a = (String)cbNamapelanggan.getSelectedItem();
        b = (String)cbIdkomp.getSelectedItem();
        String[] Fieldnya ={"no_transaksi","tgl_transaksi","nama_pelanggan","id_komputer","mulai","selesai","durasi","bayar"};
        String[] Valuenya = {tfNotransaksi.getText(),tfTanggal.getText(),a,b,tfMulai.getText(),tfSelesai.getText(),tfDurasi.getText(),tfBayar.getText()};
        new configdb().Hapus("transaksi","no_transaksi",tfNotransaksi.getText());
        JOptionPane.showMessageDialog(null,"Data transaksi berhasil dihapus");
        new configdb().setJudulTabel(tbltransaksi, JudulKolom);
        new configdb().tampilTabel(tbltransaksi, JudulKolom, SQL);
        new configdb().setLebarKolomTabel(tbltransaksi, LebarKolom);
        
        // Mengosongkan kolom input setelah operasi penghapusan data
        tfNotransaksi.setText("");
        cbNamapelanggan.setSelectedItem("Pilih");   
        cbIdkomp.setSelectedItem("Pilih");
        tfMulai.setText("");
        tfSelesai.setText("");
        tfDurasi.setText("");
        tfBayar.setText("");
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnCetakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCetakActionPerformed
        // TODO add your handling code here:
        new configdb().tampilLaporan("src/laporan/transaksi.jrxml","SELECT * FROM transaksi");
    }//GEN-LAST:event_btnCetakActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        String a,b;
        a = (String)cbNamapelanggan.getSelectedItem();
        b = (String)cbIdkomp.getSelectedItem();
        String[] Fieldnya ={"no_transaksi","nama_pelanggan","id_komputer","mulai","selesai","durasi","bayar"};
        String[] Valuenya = {tfNotransaksi.getText(),a,b,tfMulai.getText(),tfSelesai.getText(),tfDurasi.getText(),tfBayar.getText()};
        new configdb().Ubah("transaksi","no_transaksi",tfNotransaksi.getText(), Fieldnya, Valuenya);
        JOptionPane.showMessageDialog(null,"Data transaksi berhasil diperbaharui");
        new configdb().setJudulTabel(tbltransaksi, JudulKolom);
        new configdb().tampilTabel(tbltransaksi, JudulKolom, SQL);
        new configdb().setLebarKolomTabel(tbltransaksi, LebarKolom);
        
        // Mengosongkan kolom input setelah operasi update data
        tfNotransaksi.setText("");
        cbNamapelanggan.setSelectedItem("Pilih");   
        cbIdkomp.setSelectedItem("Pilih");
        tfMulai.setText("");
        tfSelesai.setText("");
        tfDurasi.setText("");
        tfBayar.setText("");
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void tfNotransaksiKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfNotransaksiKeyReleased
        // TODO add your handling code here:
        if (tfNotransaksi.getText().length()>0){
            // Jika ya (tfId tidak kosong):
            // Menonaktifkan beberapa tombo
            btnUpdate.setEnabled(false);
            btnDelete.setEnabled(false);
            btnCetak.setEnabled(false);                   
        }else{
            // Jika tidak (tfId kosong):
            // Mengaktifkan beberapa tombol
            btnUpdate.setEnabled(true);
            btnDelete.setEnabled(true);
            btnCetak.setEnabled(true);            
        }
    }//GEN-LAST:event_tfNotransaksiKeyReleased

    private void tfMulaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfMulaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfMulaiActionPerformed

    private void tfSelesaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfSelesaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfSelesaiActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCetak;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cbIdkomp;
    private javax.swing.JComboBox<String> cbNamapelanggan;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
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
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbltransaksi;
    private javax.swing.JTextField tfBayar;
    private javax.swing.JTextField tfDurasi;
    private javax.swing.JFormattedTextField tfMulai;
    private javax.swing.JTextField tfNotransaksi;
    private javax.swing.JTextField tfSearch;
    private javax.swing.JFormattedTextField tfSelesai;
    private javax.swing.JTextField tfTanggal;
    // End of variables declaration//GEN-END:variables
}
