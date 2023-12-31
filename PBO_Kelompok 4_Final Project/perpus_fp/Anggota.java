/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.perpus_fp;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author USER
 */
public class Anggota extends javax.swing.JFrame {
    public DefaultTableModel tabModel;

    public Anggota() {
        initComponents();
        judul();
        connect();
        ScaleImage();
        background();

    }

    public void judul() {
        Object[] judul = { "ID Anggota", "Username", "Password" };
        tabModel = new DefaultTableModel(null, judul);
        jTable1.setModel(tabModel);
    }

    public void connect() {
        try {
            Connection conn = DatabaseConnection.getConnection();
            // ambil list buku dari database
            tabModel.getDataVector().removeAllElements();
            tabModel.fireTableDataChanged();
            String sql = "SELECT * FROM user";
            java.sql.Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {

                String id = rs.getString("id_user");
                String username = rs.getString("username");
                String password = rs.getString("password");
                String[] data = { id, username, password };
                tabModel.addRow(data);

            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Ya error awkoawokwaoawko" + e.getMessage(), "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    // file:/C:/01_Privacy/_SCHOOL_/Semester%204%20(2023)/PBO/Code/Perpus_FP/src/main/java/image/image%201.png
    public void ScaleImage() {
        // java.awt.Image icon = new
        // javax.swing.ImageIcon(getClass().getResource("/image/profile-user.png")).getImage();
        // java.awt.Image resizedIcon = icon.getScaledInstance(32, 32,
        // java.awt.Image.SCALE_SMOOTH);
        // jLabel1.setIcon(new javax.swing.ImageIcon(resizedIcon));
        // jLabel1.setPreferredSize(new java.awt.Dimension(32, 32));

        // ImageIcon icon = new ImageIcon("C:/01_Privacy/_SCHOOL_/Semester 4
        // (2023)/PBO/Code/Perpus_FP/src/main/java/image/image 1.png");
        // Image img = icon.getImage();
        // Image imgScale = img.getScaledInstance(600, 400,Image.SCALE_SMOOTH);
        // ImageIcon scaledIcon = new ImageIcon(imgScale);
        // jLabel1.setIcon(scaledIcon);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(242, 229, 208));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("UPN \"Veteran Jawa Timur\"");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(240, 70, 290, 60);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel3.setText("Giri Pustaka");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(290, 30, 200, 60);

        jPanel3.setBackground(new java.awt.Color(226, 201, 164));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("List Anggota");

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setBackground(new java.awt.Color(242, 229, 208));
        jTable1.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID Anggota", "Username", "Password"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setGridColor(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(80);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
        }

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 588, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(234, 234, 234))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3);
        jPanel3.setBounds(90, 130, 600, 370);

        jPanel2.setBackground(new java.awt.Color(242, 229, 208));
        jPanel2.setLayout(new java.awt.BorderLayout());
        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 110, 800, 390);

        jButton2.setBackground(new java.awt.Color(226, 201, 164));
        jButton2.setFont(new java.awt.Font("Humnst777 Lt BT", 1, 18)); // NOI18N
        jButton2.setText("HOME");
        jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(30, 30, 90, 40);

        jButton3.setBackground(new java.awt.Color(226, 201, 164));
        jButton3.setFont(new java.awt.Font("Humnst777 Lt BT", 1, 18)); // NOI18N
        jButton3.setText("Tambah");
        jButton3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(620, 30, 90, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        TambahUser TambahUserFrame = new TambahUser();
        TambahUserFrame.setVisible(true);
        TambahUserFrame.pack();
        TambahUserFrame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_jButton2ActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jButton2MouseClicked
        Menu MenuFrame = new Menu();
        MenuFrame.setVisible(true);
        MenuFrame.pack();
        MenuFrame.setLocationRelativeTo(null);
        this.dispose();
    }// GEN-LAST:event_jButton2MouseClicked

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    private void background() {
        // Memuat gambar dari file
        // Memuat gambar dari file
        ImageIcon imageIcon = new ImageIcon(
                "C:/01_Privacy/_SCHOOL_/Semester 4 (2023)/PBO/Code/Perpus_FP/src/main/java/image/image 1.png");

        // Membuat label dengan gambar sebagai ikon
        JLabel backgroundLabel = new JLabel() {
            @Override
            public void paintComponent(Graphics g) {
                super.paintComponent(g);
                // Menggambar gambar sebagai latar belakang
                g.drawImage(imageIcon.getImage(), 0, 0, getWidth(), getHeight(), this);
            }
        };

        // Mengatur tata letak label menggunakan LayoutManager yang sesuai
        // Misalnya, jika Anda menggunakan JPanel, Anda dapat menggunakan layout manager
        // seperti BorderLayout, FlowLayout, atau sebagainya
        jPanel2.setLayout(new BorderLayout());

        // Menambahkan label ke panel atau komponen lainnya
        jPanel2.add(backgroundLabel, BorderLayout.CENTER);

    }
}
