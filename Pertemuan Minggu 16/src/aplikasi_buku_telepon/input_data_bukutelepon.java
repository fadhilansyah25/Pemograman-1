/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasi_buku_telepon;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Fadhilansyah25
 */
public class input_data_bukutelepon extends javax.swing.JFrame {
private Connection con_FadilArdiansyah;
private Statement stat_FadilArdiansyah;
private ResultSet res_FadilArdiansyah;
    /**
     * Creates new form input_data_bukutelepon
     */
    public input_data_bukutelepon() {
        initComponents();
        koneksi();
        kosongkan();
        status();
        tabel();
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        id_kontakTextField = new javax.swing.JTextField();
        nama_kontakTextField = new javax.swing.JTextField();
        no_kontakTextField = new javax.swing.JTextField();
        alamat_TextField = new javax.swing.JTextField();
        StatusComboBox = new javax.swing.JComboBox<>();
        Simpan_Button = new javax.swing.JButton();
        Refresh_Button = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        hapusButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("ID Kontak");

        jLabel2.setText("Nama Kontak");

        jLabel3.setText("No. Kontak");

        jLabel4.setText("Alamat");

        jLabel5.setText("Status");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setText("Input Data Kontak");

        id_kontakTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_kontakTextFieldActionPerformed(evt);
            }
        });

        StatusComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Keluarga", "Teman", "Kenalan", "Rekan Kerja" }));
        StatusComboBox.setSelectedIndex(-1);

        Simpan_Button.setText("Simpan");
        Simpan_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Simpan_ButtonActionPerformed(evt);
            }
        });

        Refresh_Button.setText("Refresh");
        Refresh_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Refresh_ButtonActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Muhammad Fadil Ardiansyah");

        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(Table);

        hapusButton.setText("Hapus");
        hapusButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(StatusComboBox, javax.swing.GroupLayout.Alignment.LEADING, 0, 154, Short.MAX_VALUE)
                                            .addComponent(alamat_TextField, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(no_kontakTextField, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(nama_kontakTextField, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(id_kontakTextField, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addGap(32, 32, 32)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(Simpan_Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(hapusButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(18, 18, 18)
                                        .addComponent(Refresh_Button))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(17, 17, 17)
                                        .addComponent(jLabel6))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(148, 148, 148)
                                .addComponent(jLabel7)))
                        .addGap(0, 46, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(id_kontakTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Simpan_Button)
                    .addComponent(Refresh_Button))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nama_kontakTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hapusButton))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(no_kontakTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(alamat_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(StatusComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Simpan_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Simpan_ButtonActionPerformed
        // TODO add your handling code here:
        try {
            stat_FadilArdiansyah.executeUpdate("insert into data_kontak values ("
            +"'"+id_kontakTextField.getText()+"',"
            +"'"+nama_kontakTextField.getText()+"',"
            +"'"+no_kontakTextField.getText()+"',"
            +"'"+alamat_TextField.getText()+"',"
            +"'"+StatusComboBox.getSelectedItem()+"')");
            kosongkan();
            JOptionPane.showMessageDialog(null, "Berhasil Menyimpan Data");
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, "Perintah Salah"+e);
        }
    }//GEN-LAST:event_Simpan_ButtonActionPerformed

    private void id_kontakTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_kontakTextFieldActionPerformed
        // TODO add your handling code here:
        try {
            res_FadilArdiansyah = stat_FadilArdiansyah.executeQuery("select * from data_kontak where"
                    +"id_kontak='"+id_kontakTextField.getText()+"'");
            while (res_FadilArdiansyah.next()) {
                {nama_kontakTextField.setText(res_FadilArdiansyah.getString("nama_kontak")); 
                no_kontakTextField.setText(res_FadilArdiansyah.getString("no_kontak"));
                alamat_TextField.setText(res_FadilArdiansyah.getString("alamat"));
                StatusComboBox.setSelectedItem(res_FadilArdiansyah.getString("status"));}
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }//GEN-LAST:event_id_kontakTextFieldActionPerformed

    private void Refresh_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Refresh_ButtonActionPerformed
        // TODO add your handling code here:
        try {
            tabel();
            JOptionPane.showMessageDialog(null, "Tabel Berhasil di Refresh");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Tabel Gagal di Refresh"+e);
        }
    }//GEN-LAST:event_Refresh_ButtonActionPerformed

    private void hapusButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusButtonActionPerformed
        // TODO add your handling code here:
        int ok_Fadil_Ardiansyah = JOptionPane.showConfirmDialog(null, "Yakin ingin menghapus data ini", "Hapus Data", JOptionPane.YES_NO_CANCEL_OPTION);
        if (ok_Fadil_Ardiansyah == 0) {
            try {
                String sql_FadilArdiansyah = "delete from data_kontak where id_kontak='"+id_kontakTextField.getText()+"'";
                PreparedStatement st_FadilArdiansyah = con_FadilArdiansyah.prepareStatement(sql_FadilArdiansyah);
                st_FadilArdiansyah.executeUpdate();
                JOptionPane.showMessageDialog(null, "Hapus Data sukses");   
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Hapus Data Gagal"+e);
            }
        }
    }//GEN-LAST:event_hapusButtonActionPerformed

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
            java.util.logging.Logger.getLogger(input_data_bukutelepon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(input_data_bukutelepon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(input_data_bukutelepon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(input_data_bukutelepon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new input_data_bukutelepon().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Refresh_Button;
    private javax.swing.JButton Simpan_Button;
    private javax.swing.JComboBox<String> StatusComboBox;
    private javax.swing.JTable Table;
    private javax.swing.JTextField alamat_TextField;
    private javax.swing.JButton hapusButton;
    private javax.swing.JTextField id_kontakTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nama_kontakTextField;
    private javax.swing.JTextField no_kontakTextField;
    // End of variables declaration//GEN-END:variables

    private void koneksi() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con_FadilArdiansyah = DriverManager.getConnection("jdbc:mysql://127.0.0.1/database_kontak", "root", "");
            stat_FadilArdiansyah = con_FadilArdiansyah.createStatement();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    private void kosongkan() {
        id_kontakTextField.setText("");
        nama_kontakTextField.setText("");
        no_kontakTextField.setText("");
        alamat_TextField.setText("");
        StatusComboBox.setSelectedIndex(-1);
    }

    private void status() {
        StatusComboBox.setSelectedIndex(-1);
    }

    private void tabel() {
        DefaultTableModel t_FadilArdiansyah = new DefaultTableModel();
        t_FadilArdiansyah.addColumn("ID");
        t_FadilArdiansyah.addColumn("Nama");
        t_FadilArdiansyah.addColumn("No Kontak");
        t_FadilArdiansyah.addColumn("alamat");
        t_FadilArdiansyah.addColumn("Status");
        Table.setModel(t_FadilArdiansyah);
        try {
            res_FadilArdiansyah = stat_FadilArdiansyah.executeQuery("select * from data_kontak");
            while (res_FadilArdiansyah.next()) {
                t_FadilArdiansyah.addRow(new Object[]
                {
                    res_FadilArdiansyah.getString("id_kontak"),
                    res_FadilArdiansyah.getString("nama_kontak"),
                    res_FadilArdiansyah.getString("no_kontak"),
                    res_FadilArdiansyah.getString("alamat"),
                    res_FadilArdiansyah.getString("status")    
                });
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}