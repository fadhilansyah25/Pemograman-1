/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasi_database_mahasiwa;
import java.sql.*;
import javax.swing.JOptionPane;
 /*
 * @author Fadhilansyah25
 */
public class Hapus_dataMahasiswa extends javax.swing.JFrame {
private Connection con_FadilArdiansyah;
private Statement stat_FadilArdiansyah;
private ResultSet res_FadilArdianysah;
    /**
     * Creates new form Input_dataMahasiswa
     */
    public Hapus_dataMahasiswa() {
        initComponents();
        koneksi();
        kosongkan();
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
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        nim_TextField = new javax.swing.JTextField();
        nama_TextField = new javax.swing.JTextField();
        telepon_TextField = new javax.swing.JTextField();
        jurusan_ComboBox = new javax.swing.JComboBox<>();
        TTL_TextField = new javax.swing.JTextField();
        jenis_kelaminComboBox = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        alamat_TextArea = new javax.swing.JTextArea();
        agama_ComboBox = new javax.swing.JComboBox<>();
        Hapus_Button = new javax.swing.JButton();
        clear_Button = new javax.swing.JButton();
        kembali_Button = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Entry Data Mahasiswa");

        jLabel1.setText("NIM");

        jLabel2.setText("Nama");

        jLabel3.setText("Telepon");

        jLabel4.setText("Jurusan");

        jLabel5.setText("TTL");

        jLabel6.setText("Jenis Kelamin");

        jLabel7.setText("Alamat");

        jLabel8.setText("Agama");

        nim_TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nim_TextFieldActionPerformed(evt);
            }
        });

        jurusan_ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Teknik  Informatika", "Teknik Elektro", "Akuntansi", "Manajemen", "Teknik Sipil" }));
        jurusan_ComboBox.setSelectedIndex(-1);

        jenis_kelaminComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Laki-Laki", "Perempuan" }));
        jenis_kelaminComboBox.setSelectedIndex(-1);

        alamat_TextArea.setColumns(20);
        alamat_TextArea.setRows(5);
        jScrollPane1.setViewportView(alamat_TextArea);

        agama_ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Islam", "Kristen", "Hindu", "Budha", "Konghuchu", "Lain-Lain" }));
        agama_ComboBox.setSelectedIndex(-1);

        Hapus_Button.setText("Hapus");
        Hapus_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Hapus_ButtonActionPerformed(evt);
            }
        });

        clear_Button.setText("Clear");
        clear_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear_ButtonActionPerformed(evt);
            }
        });

        kembali_Button.setText("Kembali");
        kembali_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kembali_ButtonActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel9.setText("Entry Data Mahasiswa");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Hapus_Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(clear_Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(kembali_Button))
                    .addComponent(jurusan_ComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TTL_TextField)
                    .addComponent(jenis_kelaminComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addComponent(agama_ComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nama_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(telepon_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nim_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(102, 102, 102))
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nim_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nama_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(telepon_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jurusan_ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(TTL_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jenis_kelaminComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(agama_ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Hapus_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clear_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kembali_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nim_TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nim_TextFieldActionPerformed
        // TODO add your handling code here:
        try {
            res_FadilArdianysah = stat_FadilArdiansyah.executeQuery("select * from datamahasiswa where"+" nim='"+nim_TextField.getText()+"'");
            while (res_FadilArdianysah.next()) {
                nama_TextField.setText(res_FadilArdianysah.getString("nama"));
                telepon_TextField.setText(res_FadilArdianysah.getString("telepon"));
                jurusan_ComboBox.setSelectedItem(res_FadilArdianysah.getString("jurusan"));
                TTL_TextField.setText(res_FadilArdianysah.getString("TTL"));
                jenis_kelaminComboBox.setSelectedItem(res_FadilArdianysah.getString("jenis_kelamin"));
                alamat_TextArea.setText(res_FadilArdianysah.getString("alamat"));
                agama_ComboBox.setSelectedItem(res_FadilArdianysah.getString("agama"));
            }
        } catch (Exception e) {
            //TODO: handle exception
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_nim_TextFieldActionPerformed
    
    private void clear_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear_ButtonActionPerformed
        kosongkan();
    }//GEN-LAST:event_clear_ButtonActionPerformed

    private void kembali_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kembali_ButtonActionPerformed
        dispose();
    }//GEN-LAST:event_kembali_ButtonActionPerformed

    private void Hapus_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Hapus_ButtonActionPerformed
        // TODO add your handling code here:
        int ok_FadilArdiansyah = JOptionPane.showConfirmDialog(null, "Yakin ingin menghapus data ini?", "Hapus Data", JOptionPane.YES_NO_CANCEL_OPTION);
        if (ok_FadilArdiansyah == 0) {
            try {
                String Sql_FadilArdiansyah = "delete from datamahasiswa where nim ='"+nim_TextField.getText()+"'";
                PreparedStatement st_FadilArdiansyah = con_FadilArdiansyah.prepareStatement(Sql_FadilArdiansyah);
                st_FadilArdiansyah.executeUpdate();
                JOptionPane.showMessageDialog(null, "Hapus Data Sukses");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Hapus Data Gagal"+e);
            }
        }
    }//GEN-LAST:event_Hapus_ButtonActionPerformed
    
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
            java.util.logging.Logger.getLogger(Hapus_dataMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Hapus_dataMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Hapus_dataMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Hapus_dataMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Hapus_dataMahasiswa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Hapus_Button;
    private javax.swing.JTextField TTL_TextField;
    private javax.swing.JComboBox<String> agama_ComboBox;
    private javax.swing.JTextArea alamat_TextArea;
    private javax.swing.JButton clear_Button;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jenis_kelaminComboBox;
    private javax.swing.JComboBox<String> jurusan_ComboBox;
    private javax.swing.JButton kembali_Button;
    private javax.swing.JTextField nama_TextField;
    private javax.swing.JTextField nim_TextField;
    private javax.swing.JTextField telepon_TextField;
    // End of variables declaration//GEN-END:variables

    private void koneksi() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con_FadilArdiansyah = DriverManager.getConnection("jdbc:mysql://127.0.0.1/databasemahasiswa", "root", "");
            stat_FadilArdiansyah =con_FadilArdiansyah.createStatement();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    private void kosongkan() {
        nim_TextField.setText("");
        nama_TextField.setText("");
        telepon_TextField.setText("");
        jurusan_ComboBox.setSelectedIndex(-1);
        TTL_TextField.setText("");
        jenis_kelaminComboBox.setSelectedIndex(-1);
        alamat_TextArea.setText("");
        agama_ComboBox.setSelectedIndex(-1);
    }
}
