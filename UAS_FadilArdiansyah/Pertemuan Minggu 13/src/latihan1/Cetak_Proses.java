/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan1;

/**
 *
 * @author Fadhilansyah25
 */
public class Cetak_Proses extends javax.swing.JFrame {
    String angka_FadilArdiansyah;
    double jumlah_FadilArdiansyah, angka1_FadilArdiansyah, angka2_FadilArdiansyah;
    int pilih_FadilArdiansyah
    /**
     * Creates new form Cetak_Proses
     */
    public Cetak_Proses() {
        initComponents();
        angka_FadilArdiansyah = "";
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
        satu_FadilArdiansyah = new javax.swing.JButton();
        dua_FadilArdiansyah = new javax.swing.JButton();
        tambah_FadilArdiansyah = new javax.swing.JButton();
        Hasil_FadilArdiansyah = new javax.swing.JButton();
        display_FadilArdiansyah = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        satu_FadilArdiansyah.setText("1");
        satu_FadilArdiansyah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                satu_FadilArdiansyahActionPerformed(evt);
            }
        });

        dua_FadilArdiansyah.setText("2");
        dua_FadilArdiansyah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dua_FadilArdiansyahActionPerformed(evt);
            }
        });

        tambah_FadilArdiansyah.setText("Tambah");
        tambah_FadilArdiansyah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambah_FadilArdiansyahActionPerformed(evt);
            }
        });

        Hasil_FadilArdiansyah.setText("Hasil");
        Hasil_FadilArdiansyah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Hasil_FadilArdiansyahActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(tambah_FadilArdiansyah, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(satu_FadilArdiansyah)
                                .addGap(18, 18, 18)
                                .addComponent(dua_FadilArdiansyah)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(Hasil_FadilArdiansyah, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(satu_FadilArdiansyah)
                    .addComponent(dua_FadilArdiansyah))
                .addGap(18, 18, 18)
                .addComponent(tambah_FadilArdiansyah)
                .addGap(18, 18, 18)
                .addComponent(Hasil_FadilArdiansyah)
                .addContainerGap(94, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(display_FadilArdiansyah, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 11, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(display_FadilArdiansyah, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void satu_FadilArdiansyahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_satu_FadilArdiansyahActionPerformed
        // TODO add your handling code here:
        angka_FadilArdiansyah += "1";
        display_FadilArdiansyah.setText(angka_FadilArdiansyah);
    }//GEN-LAST:event_satu_FadilArdiansyahActionPerformed

    private void dua_FadilArdiansyahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dua_FadilArdiansyahActionPerformed
        // TODO add your handling code here:
        angka_FadilArdiansyah += "2";
        display_FadilArdiansyah.setText(angka_FadilArdiansyah);
    }//GEN-LAST:event_dua_FadilArdiansyahActionPerformed

    private void tambah_FadilArdiansyahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambah_FadilArdiansyahActionPerformed
        // TODO add your handling code here:
        angka1_FadilArdiansyah = Double.parseDouble(angka_FadilArdiansyah);
        display_FadilArdiansyah.setText("+");
        angka_FadilArdiansyah = "";
        pilih_FadilArdiansyah = 1;
    }//GEN-LAST:event_tambah_FadilArdiansyahActionPerformed

    private void Hasil_FadilArdiansyahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Hasil_FadilArdiansyahActionPerformed
        // TODO add your handling code here:
        switch(pilih_FadilArdiansyah){
            case 1: 
                angka2_FadilArdiansyah = Double.parseDouble(angka_FadilArdiansyah);
                jumlah_FadilArdiansyah = angka1_FadilArdiansyah + angka2_FadilArdiansyah;
                angka_FadilArdiansyah = Double.toString(jumlah_FadilArdiansyah);
                display_FadilArdiansyah.setText(angka_FadilArdiansyah);
                break;
            default:
        }
    }//GEN-LAST:event_Hasil_FadilArdiansyahActionPerformed

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
            java.util.logging.Logger.getLogger(Cetak_Proses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cetak_Proses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cetak_Proses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cetak_Proses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cetak_Proses().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Hasil_FadilArdiansyah;
    private javax.swing.JTextField display_FadilArdiansyah;
    private javax.swing.JButton dua_FadilArdiansyah;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton satu_FadilArdiansyah;
    private javax.swing.JButton tambah_FadilArdiansyah;
    // End of variables declaration//GEN-END:variables
}
