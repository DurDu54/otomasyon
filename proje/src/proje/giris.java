
package proje;

import java.sql.DriverManager;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
import java.sql.*;



public class giris extends javax.swing.JFrame {
/*?useUnicode=true&useLegacyDatetimeCoder=false&serverTimezon=Turkey*/

    public giris() {
        initComponents();
        setLocationRelativeTo(null);
        TabloDoldur();
    }
    private final String JDBC_DRIVER= "com.mysql.cj.jdbc.Driver";
    private final String DOMAIN_NAME= "127.0.0.1:3306";
    private final String DB_NAME ="proje?useUnicode=true&useLegacyDatetimeCode=false&serverTimezone=Turkey";
    private final String DB_URL ="jdbc:mysql://"+DOMAIN_NAME+"/"+DB_NAME;
    private final String USER="root";
    private final String PASS="1234";
    private Connection conn=null;
//jdbc:mysql://127.0.0.1:3306/?user=root
    public Statement baglantıac() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        conn=DriverManager.getConnection(DB_URL, USER, PASS);
        return conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
    }
    public void baglantıkapat() throws Exception {
        conn.close();
    }
    private void TabloDoldur() {
        Connection conn =null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn=DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println("bağlandı");
            String sql="select * from mallar";
            System.out.println("işlendi");
            PreparedStatement pstmt=conn.prepareStatement(sql);
            ResultSet rs= pstmt.executeQuery();
            jTable4.setModel(DbUtils.resultSetToTableModel(rs));
            System.out.println("tabloyageçti");
            conn.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        urunadı = new javax.swing.JTextField();
        urunmiktar = new javax.swing.JTextField();
        tarih = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable2);

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ürün Adı", "Ürün Miktarı", "Alış Tarihi"
            }
        ));
        jScrollPane3.setViewportView(jTable3);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Ürünün Adı:");

        jLabel2.setText("Ürün Miktarı (kg):");

        jButton1.setText("Ürün Ekle");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Ürünü Bitir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Ürün Sat veya Ekle");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Temizle");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel3.setText("Alış Tarihi (GG/AA):");

        urunmiktar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                urunmiktarActionPerformed(evt);
            }
        });

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Ürün Adı", "Ürün Miktarı ( Kg)", "Alış Tarihi (GG/AA"
            }
        ));
        jTable4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTable4MousePressed(evt);
            }
        });
        jScrollPane4.setViewportView(jTable4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(83, 83, 83)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(urunmiktar, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(urunadı, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tarih, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jButton1)
                        .addGap(74, 74, 74)
                        .addComponent(jButton3)
                        .addGap(82, 82, 82)
                        .addComponent(jButton2)
                        .addGap(0, 29, Short.MAX_VALUE)))
                .addGap(37, 37, 37)
                .addComponent(jButton4)
                .addGap(48, 48, 48))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(urunadı, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(urunmiktar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tarih, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(jButton2))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void urunmiktarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_urunmiktarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_urunmiktarActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String ad=urunadı.getText();
        String miktar=urunmiktar.getText();
        String tarh=tarih.getText();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //17.10   
        String ad=urunadı.getText();
        String miktar=urunmiktar.getText();
        String tarh=tarih.getText();
        urunek(ad , miktar , tarh);
    }//GEN-LAST:event_jButton1ActionPerformed
public void urunek(String ad , String miktar , String tarh){
        try {
            Statement st = baglantıac();
            System.out.println("burdasın bağlandı");
            String sql= "INSERT INTO proje.mallar (" +
                "'" + ad + "', " +
                "'" + miktar + "', " +
                "'" + tarh + "');";
            System.out.println(sql);
            st.executeQuery(sql);
            TabloDoldur();
            baglantıkapat();
            JOptionPane.showMessageDialog(null," Kayıt başarıyla eklendi");
        } catch (Exception e) {
           JOptionPane.showConfirmDialog(null," Kayıt eklenemedi","",JOptionPane.PLAIN_MESSAGE);

        }
    }
    
    private void jTable4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable4MousePressed
        urunadı.setText(jTable4.getValueAt(jTable4.getSelectedRow(), 0).toString());
        urunmiktar.setText(jTable4.getValueAt(jTable4.getSelectedRow(), 1).toString());
        tarih.setText(jTable4.getValueAt(jTable4.getSelectedRow(), 2).toString());
    }//GEN-LAST:event_jTable4MousePressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String ad= jTable4.getValueAt(jTable4.getSelectedRow(), 0).toString();
        KayıtSil(ad);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
    urunadı.setText(" ");
    urunmiktar.setText(" ");
    tarih.setText(" ");
    }//GEN-LAST:event_jButton4ActionPerformed
    public void KayıtSil(String ad){
        
        try {
            Statement st = baglantıac();
            st.executeUpdate("Delete FROM proje.mallar where adı"+ad);
            baglantıkapat();
            TabloDoldur();
            JOptionPane.showMessageDialog(null, "Seçilen kayıt silindi");
        } catch (Exception e) {
        JOptionPane.showConfirmDialog(null, "Seçilen kayıt silinemedi","",JOptionPane.PLAIN_MESSAGE);
        }
    }
    
    public static void main(int a) {
                try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(giris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(giris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(giris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(giris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new giris().setVisible(true);
            
            }
        });
    }

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTextField tarih;
    private javax.swing.JTextField urunadı;
    private javax.swing.JTextField urunmiktar;
    // End of variables declaration//GEN-END:variables

    
}
