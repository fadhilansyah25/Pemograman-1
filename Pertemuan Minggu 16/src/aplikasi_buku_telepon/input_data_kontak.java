/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasi_buku_telepon;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Fadhilansyah25
 */
public class input_data_kontak extends javax.swing.JFrame {
private Connection con_FadilArdiansyah;
private Statement stat_FadilArdiansyah;
private ResultSet res_FadilArdiansyah;
private String t_FadilArdiansyah;
    /**
     * Creates new form input_data_kontak
     */
    public input_data_kontak() {
        initComponents();
        koneksi();
        kosongkan();
        status();
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
        id_kontakTextField = new javax.swing.JTextField();
        nama_kontakTextField = new javax.swing.JTextField();
        no_kontakTextField = new javax.swing.JTextField();
        alamat_TextField = new javax.swing.JTextField();
        Simpan_Button = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        statusComboBox = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("ID Kontak");

        jLabel2.setText("Nama Kontak");

        jLabel3.setText("No Kontak");

        jLabel4.setText("Alamat");

        id_kontakTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_kontakTextFieldActionPerformed(evt);
            }
        });

        Simpan_Button.setText("Simpan");
        Simpan_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Simpan_ButtonActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setText("Input data kontak");

        jLabel6.setText("Status");

        statusComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Keluarga", "Teman", "Kenalan", "Rekan Kerja" }));
        statusComboBox.setSelectedIndex(-1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(93, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(89, 89, 89))
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Simpan_Button)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(id_kontakTextField)
                            .addComponent(nama_kontakTextField)
                            .addComponent(no_kontakTextField)
                            .addComponent(alamat_TextField, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(statusComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(id_kontakTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nama_kontakTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(no_kontakTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(alamat_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(statusComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(Simpan_Button)
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Simpan_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Simpan_ButtonActionPerformed
        try {
            stat_FadilArdiansyah.executeUpdate("insert into data_kontak values ("
            +"'"+id_kontakTextField.getText()+"',"
            +"'"+nama_kontakTextField.getText()+"',"
            +"'"+no_kontakTextField.getText()+"',"
            +"'"+alamat_TextField.getText()+"',"
            +"'"+statusComboBox.getSelectedItem() +"')");
            kosongkan();
            JOptionPane.showMessageDialog(null, "Berhasil menyimpan data");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Perintah salah : "+e);
        }
    }//GEN-LAST:event_Simpan_ButtonActionPerformed

    private void id_kontakTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_kontakTextFieldActionPerformed
        try {
            res_FadilArdiansyah = stat_FadilArdiansyah.executeQuery("select * from data_kontak where"
                    +"id_kontak='"+id_kontakTextField.getText()+"'");
            while (res_FadilArdiansyah.next()) {
                {nama_kontakTextField.setText(res_FadilArdiansyah.getString("nama_kontak")); 
                no_kontakTextField.setText(res_FadilArdiansyah.getString("no_kontak"));
                alamat_TextField.setText(res_FadilArdiansyah.getString("alamat"));
                statusComboBox.setSelectedItem(res_FadilArdiansyah.getString("status"));}
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }//GEN-LAST:event_id_kontakTextFieldActionPerformed

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
            java.util.logging.Logger.getLogger(input_data_kontak.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(input_data_kontak.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(input_data_kontak.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(input_data_kontak.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new input_data_kontak().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Simpan_Button;
    private javax.swing.JTextField alamat_TextField;
    private javax.swing.JTextField id_kontakTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField nama_kontakTextField;
    private javax.swing.JTextField no_kontakTextField;
    private javax.swing.JComboBox<String> statusComboBox;
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
        id_kontakTextField.requestFocus();
        statusComboBox.setSelectedIndex(-1);
    }

    private void status() {
        statusComboBox.setSelectedIndex(-1);
    }
}
