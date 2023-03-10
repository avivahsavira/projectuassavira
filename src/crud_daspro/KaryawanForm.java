package crud_daspro;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
//package crud_daspro;
import crud_daspro.Koneksi;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author avivah savira
 */
public class KaryawanForm extends javax.swing.JFrame {

    private boolean databaru;
    private final Koneksi koneksi = new Koneksi();

    /**
     * Creates new form KaryawanForm
     */
    public KaryawanForm() {
        initComponents();
        getData();
        databaru = true;
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
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txt_nama = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_id_karyawan = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txt_nik = new javax.swing.JTextField();
        txt_jabatan = new javax.swing.JTextField();
        txt_no_hp = new javax.swing.JTextField();
        txt_alamat = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        btn_new = new javax.swing.JButton();
        btn_save = new javax.swing.JButton();
        btn_delete = new javax.swing.JButton();
        btn_exit = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel4.setText("ID karyawan");

        txt_nama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_namaActionPerformed(evt);
            }
        });

        jLabel5.setText("Nama");

        txt_id_karyawan.setEditable(false);
        txt_id_karyawan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_id_karyawanActionPerformed(evt);
            }
        });

        jLabel6.setText("NIK");

        jLabel3.setText("Jabatan");

        jLabel2.setText("No HP");

        jLabel1.setText("Alamat");

        txt_nik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nikActionPerformed(evt);
            }
        });

        txt_jabatan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_jabatanActionPerformed(evt);
            }
        });

        txt_no_hp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_no_hpActionPerformed(evt);
            }
        });

        txt_alamat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_alamatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(txt_id_karyawan, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(52, 52, 52)
                        .addComponent(txt_nama))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(1, 1, 1)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_alamat)
                            .addComponent(txt_jabatan)
                            .addComponent(txt_nik)
                            .addComponent(txt_no_hp)))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_id_karyawan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txt_nik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_jabatan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_no_hp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_alamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(204, 153, 255));

        btn_new.setText("NEW");
        btn_new.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_newActionPerformed(evt);
            }
        });

        btn_save.setText("SAVE");
        btn_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saveActionPerformed(evt);
            }
        });

        btn_delete.setText("DELETE");
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });

        btn_exit.setText("EXIT");
        btn_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_exitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(btn_save)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_delete)
                .addGap(17, 17, 17))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_exit)
                    .addComponent(btn_new))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(7, Short.MAX_VALUE)
                .addComponent(btn_new)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_delete)
                    .addComponent(btn_save))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_exit)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID Karyawan", "Nama Karyawan", "NIK", "Jabatan", "No HP", "Alamat"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 802, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 28, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_jabatanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_jabatanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_jabatanActionPerformed

    private void getData() {
        try {
            Connection conn = koneksi.getKoneksi();
            Statement stm = conn.createStatement();
            ResultSet result = stm.executeQuery("select * from crud_uas");

            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

            // reset data tabel
            model.setRowCount(0);

            while (result.next()) {
                String id = result.getString("id");
                String nama = result.getString("nama");
                String nik = result.getString("nik");
                String jabatan = result.getString("jabatan");
                String no = result.getString("no_hp");
                String alamat = result.getString("alamat");

                model.addRow(new Object[]{id, nama, nik, jabatan, no, alamat});
            }
        } catch (SQLException ex) {
            Logger.getLogger(KaryawanForm.class.getName()).log(java.util.logging.Level.SEVERE,null, ex);
        }
    }
    private void txt_namaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_namaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_namaActionPerformed

    private void txt_alamatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_alamatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_alamatActionPerformed

    private void txt_no_hpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_no_hpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_no_hpActionPerformed

    private void txt_nikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nikActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nikActionPerformed

    private void txt_id_karyawanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_id_karyawanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_id_karyawanActionPerformed

    private void btn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveActionPerformed
        // tombol save

        if (databaru) {
            try {
                String sql = "INSERT INTO crud_uas VALUES ('%s', '%s', '%s', '%s', '%s', '%s')";

                sql = String.format(
                        sql,
                        txt_id_karyawan.getText(),
                        txt_nama.getText(),
                        txt_nik.getText(),
                        txt_jabatan.getText(),
                        txt_no_hp.getText(),
                        txt_alamat.getText()                        
//                        txt_jabatan.getText(),
//                        txt_nik.getText(),
//                        txt_nama.getText(),
//                        txt_id_karyawan.getText(),
//                        txt_alamat.getText(),
//                        txt_no_hp.getText()
                );

                Connection conn = koneksi.getKoneksi();
                PreparedStatement pst = conn.prepareStatement(sql);

                pst.execute();

                JOptionPane.showMessageDialog(null, "Berhasil disimpan");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Gagal disimpan" + ex);
            }
        } else {
            try {
                String sql = "UPDATE INTO crud_uas SET nama='%s', nik='%s', jabatan='%s', no_hp='%s', alamat='%s' WHERE id='%s'";

                sql = String.format(
                        sql,
                       //txt_id_karyawan.getText(),
                        txt_nama.getText(),
                        txt_nik.getText(),
                        txt_jabatan.getText(),
                        txt_no_hp.getText(),
                        txt_alamat.getText(),
                        txt_id_karyawan.getText()
//                        txt_nik.getText(),
//                        txt_nama.getText(),
//                        txt_id_karyawan.getText(),
//                        txt_alamat.getText(),
//                        txt_no_hp.getText(),
//                        txt_jabatan.getText()
                );

                Connection conn = koneksi.getKoneksi();
                PreparedStatement pst = conn.prepareStatement(sql);

                pst.execute();

                JOptionPane.showMessageDialog(null, "Berhasil diedit");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Gagal diedit" + ex);
            }
        }

        getData();
    }//GEN-LAST:event_btn_saveActionPerformed

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
        try {
            String sql = "DELETE FROM crud_uas WHERE id='" + txt_id_karyawan.getText() + "'";

            Connection conn = koneksi.getKoneksi();
            PreparedStatement pst = conn.prepareStatement(sql);

            pst.execute();

            JOptionPane.showMessageDialog(null, "Berhasil dihapus");
            
            getData();
            //btn_newActionPerformed(null);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Gagal dihapus" + ex);
        }
    }//GEN-LAST:event_btn_deleteActionPerformed

    private void btn_newActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_newActionPerformed

        if (databaru) {
            try {
                String sql = "INSERT INTO crud_uas VALUES ('%s', '%s', '%s', '%s', '%s', '%s')";

                sql = String.format(
                        sql,
                        txt_id_karyawan.getText(),
                        txt_nama.getText(),
                        txt_nik.getText(),
                        txt_jabatan.getText(),
                        txt_no_hp.getText(),
                        txt_alamat.getText()
//                        txt_jabatan.getText(),
//                        txt_nik.getText(),
//                        txt_nama.getText(),
//                        txt_id_karyawan.getText(),
//                        txt_alamat.getText(),
//                        txt_no_hp.getText()
                );

                Connection conn = koneksi.getKoneksi();
                PreparedStatement pst = conn.prepareStatement(sql);

                pst.execute();

                JOptionPane.showMessageDialog(null, "Berhasil disimpan");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Gagal disimpan" + ex);
            }
        } else {
            try {
                String sql = "UPDATE INTO crud_uas SET nama='%s', nik='%s', jabatan='%s', no_hp='%s', alamat='%s' WHERE id='%s'";

                sql = String.format(
                        sql,
                        //txt_id_karyawan.getText(),
                        txt_nama.getText(),
                        txt_nik.getText(),
                        txt_jabatan.getText(),
                        txt_no_hp.getText(),
                        txt_alamat.getText(),
                        txt_id_karyawan.getText()
//                        txt_nik.getText(),
//                        txt_nama.getText(),
//                        txt_id_karyawan.getText(),
//                        txt_alamat.getText(),
//                        txt_no_hp.getText(),
//                        txt_jabatan.getText()
                );

                Connection conn = koneksi.getKoneksi();
                PreparedStatement pst = conn.prepareStatement(sql);

                pst.execute();

                JOptionPane.showMessageDialog(null, "Berhasil diedit");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Gagal diedit" + ex);
            }
        }

        getData();
        // tombol new 

        databaru = true;

        txt_jabatan.setText("");
        txt_nik.setText("");
        txt_nama.setText("");
        txt_id_karyawan.setText("");
        txt_alamat.setText("");
        txt_no_hp.setText("");
    }//GEN-LAST:event_btn_newActionPerformed

    private void btn_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_exitActionPerformed
        dispose();
    }//GEN-LAST:event_btn_exitActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        try {
            databaru = false;

            int row = jTable1.getSelectedRow();
            String id_karyawan = jTable1.getModel().getValueAt(row, 0).toString();

            Connection conn = koneksi.getKoneksi();
            Statement stm = conn.createStatement();
            ResultSet sql = stm.executeQuery("SELECT * FROM crud_uas WHERE id='" + id_karyawan + "'");

            if (sql.next()) {
                txt_id_karyawan.setText(sql.getString("id"));
                txt_nama.setText(sql.getString("nama"));
                txt_nik.setText(sql.getString("nik"));
                txt_jabatan.setText(sql.getString("jabatan"));
                txt_no_hp.setText(sql.getString("no_hp"));
                txt_alamat.setText(sql.getString("alamat"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(KaryawanForm.class.getName()).log(java.util.logging.Level.SEVERE,null, ex);
        }
    }//GEN-LAST:event_jTable1MouseClicked

//    private void getData() {
//         try {
//             Connection conn = koneksi.getKoneksi();
//             Statement stm = conn.createStatement();
//             ResultSet result = stm.executeQuery("select * from crud_uas");
//             
//             DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
//             
//             //reset data tabel
//             model.setRowCount(0);
//             
//             while(result.next()) {
//                 String id = result.getString("id");
//                 String nama = result.getString("nama");
//                 String nik = result.getString("nik");
//                 String jabatan = result.getString("jabatan");
//                 String no = result.getString("no_hp");
//                 String alamat = result.getString("alamat");
//                 
//                 model.addRow(new Object[] {id, nama, nik, jabatan, no, alamat}); 
//             }
//         } catch (SQLException ex) {
//             Logger.getLogger(KaryawanForm.class.getName()).log(Level.SEVERE, null, ex);
//         }
//     }
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
            java.util.logging.Logger.getLogger(KaryawanForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KaryawanForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KaryawanForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KaryawanForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KaryawanForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_exit;
    private javax.swing.JButton btn_new;
    private javax.swing.JButton btn_save;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txt_alamat;
    private javax.swing.JTextField txt_id_karyawan;
    private javax.swing.JTextField txt_jabatan;
    private javax.swing.JTextField txt_nama;
    private javax.swing.JTextField txt_nik;
    private javax.swing.JTextField txt_no_hp;
    // End of variables declaration//GEN-END:variables
}
