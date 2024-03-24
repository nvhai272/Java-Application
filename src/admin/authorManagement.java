/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package admin;

import dao.AuthorDAO;
import dao.BookDAO;
import dao.DateConverter;
import exception.ApplicationException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import login_signup.SignUp;
import model.Author;
import model.NewOrUpdateAuthor;
import org.bson.types.ObjectId;

/**
 *
 * @author sukay
 */
public class authorManagement extends javax.swing.JFrame {

    private BookDAO bookDAO = new BookDAO();
    private AuthorDAO authorDAO = new AuthorDAO();
    private DateConverter dateConverter = new DateConverter();

    private DefaultTableModel tblModel = new DefaultTableModel();

    private Map<Integer, Author> authorTableRowIndxWithAuthorId = new HashMap<>();

    /**
     * Creates new form
     */
    public authorManagement() {
//        this.authorTableRowIndxWithAuthorId = new HashMap<>();
        initComponents();
        tblModel.addColumn("STT");
        tblModel.addColumn("Name");
        tblModel.addColumn("Email");
        tblModel.addColumn("Phone");
        tblModel.addColumn("Dob");
        tblModel.addColumn("QuantityBook");

        tableAuthor.setModel(tblModel);
        tableAuthor.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tableAuthor.getColumnModel().getColumn(0).setPreferredWidth(50);
        tableAuthor.getColumnModel().getColumn(1).setPreferredWidth(200);
        tableAuthor.getColumnModel().getColumn(2).setPreferredWidth(200);
        tableAuthor.getColumnModel().getColumn(3).setPreferredWidth(200);
        tableAuthor.getColumnModel().getColumn(4).setPreferredWidth(200);
        tableAuthor.getColumnModel().getColumn(5).setPreferredWidth(200);

        loadAllAuthors();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel9 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        nameAu = new app.bolivia.swing.JCTextField();
        jLabel20 = new javax.swing.JLabel();
        phoneAu = new app.bolivia.swing.JCTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        emailAu = new app.bolivia.swing.JCTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        DOB = new app.bolivia.swing.JCTextField();
        addAu = new rojerusan.RSMaterialButtonRectangle();
        updateAu = new rojerusan.RSMaterialButtonRectangle();
        deleteAu = new rojerusan.RSMaterialButtonRectangle();
        cl = new rojerusan.RSMaterialButtonRectangle();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableAuthor = new rojeru_san.complementos.RSTableMetro();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel9.setBackground(new java.awt.Color(0, 102, 255));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel12.setBackground(new java.awt.Color(255, 0, 51));
        jPanel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel12MouseClicked(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Verdana", 0, 20)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adminIcons/adminIcons/icons8-undo-48 (1).png"))); // NOI18N
        jLabel19.setText("Back");
        jLabel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel19MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel19)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel9.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel11.setBackground(new java.awt.Color(0, 102, 255));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nameAu.setBackground(new java.awt.Color(0, 102, 255));
        nameAu.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        nameAu.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        nameAu.setPlaceholder("Enter Name...");
        jPanel11.add(nameAu, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, 310, -1));

        jLabel20.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Name");
        jPanel11.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        phoneAu.setBackground(new java.awt.Color(0, 102, 255));
        phoneAu.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        phoneAu.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        phoneAu.setPlaceholder("Enter Phone No...");
        jPanel11.add(phoneAu, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, 310, -1));

        jLabel24.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Phone No");
        jPanel11.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Date of Birth");
        jPanel11.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, -1, -1));

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AddNewBookIcons/AddNewBookIcons/icons8-calendar-26.png"))); // NOI18N
        jPanel11.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, -1, -1));

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AddNewBookIcons/AddNewBookIcons/icons8_Moleskine_26px.png"))); // NOI18N
        jPanel11.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Email");
        jPanel11.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, -1, -1));

        emailAu.setBackground(new java.awt.Color(0, 102, 255));
        emailAu.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        emailAu.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        emailAu.setPlaceholder("Enter Email...");
        jPanel11.add(emailAu, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 490, 310, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AddNewBookIcons/AddNewBookIcons/icons8-email-26.png"))); // NOI18N
        jPanel11.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 500, -1, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AddNewBookIcons/AddNewBookIcons/icons8_Contact_26px.png"))); // NOI18N
        jPanel11.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        DOB.setBackground(new java.awt.Color(0, 102, 255));
        DOB.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        DOB.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        DOB.setPlaceholder("Enter Date of Birth...");
        DOB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DOBActionPerformed(evt);
            }
        });
        jPanel11.add(DOB, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 390, 310, -1));

        addAu.setBackground(new java.awt.Color(255, 0, 51));
        addAu.setText("ADD");
        addAu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addAuActionPerformed(evt);
            }
        });
        jPanel11.add(addAu, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 580, 180, -1));

        updateAu.setBackground(new java.awt.Color(255, 0, 0));
        updateAu.setText("UPDATE");
        updateAu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateAuActionPerformed(evt);
            }
        });
        jPanel11.add(updateAu, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 690, 180, -1));

        deleteAu.setBackground(new java.awt.Color(255, 0, 51));
        deleteAu.setText("DELETE");
        deleteAu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteAuActionPerformed(evt);
            }
        });
        jPanel11.add(deleteAu, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 580, 180, -1));

        cl.setBackground(new java.awt.Color(255, 0, 51));
        cl.setText("CLEAR");
        cl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clActionPerformed(evt);
            }
        });
        jPanel11.add(cl, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 690, 180, -1));

        jPanel9.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 960));

        getContentPane().add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 940));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tableAuthor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tableAuthor.setRowHeight(40);
        tableAuthor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableAuthorMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableAuthor);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 1040, 790));

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 51));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AddNewBookIcons/AddNewBookIcons/icons8-author-100_1.png"))); // NOI18N
        jLabel1.setText("AUTHOR MANAGEMENT");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 51, 51));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 393, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 100, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 0, 1160, 870));

        setSize(new java.awt.Dimension(1479, 854));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tableAuthorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableAuthorMouseClicked
        // TODO add your handling code here:
        int selectedRow = tableAuthor.getSelectedRow();
        Author auFromTable = this.authorTableRowIndxWithAuthorId.get(selectedRow);
        Author author = this.authorDAO.findAuthorById(auFromTable.getId());
        nameAu.setText(author.getName());
        phoneAu.setText(author.getPhoneNo());
        DOB.setText(DateConverter.DateFormat(author.getDob().toString()));
        emailAu.setText(author.getEmail());
    }//GEN-LAST:event_tableAuthorMouseClicked

    private void jLabel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseClicked
        // TODO add your handling code here:
        admin ad = new admin();
        ad.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel19MouseClicked

    private void jPanel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel12MouseClicked
        // TODO add your handling code here:
        admin ad = new admin();
        ad.setVisible(true);
        dispose();
    }//GEN-LAST:event_jPanel12MouseClicked

    private void DOBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DOBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DOBActionPerformed

    private void updateAuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateAuActionPerformed
        // TODO add your handling code here:
        int selectedRow = tableAuthor.getSelectedRow();
        if (selectedRow == 0) {
            return;
        }
        try {
            ObjectId id = authorTableRowIndxWithAuthorId.get(selectedRow).getId();
            NewOrUpdateAuthor author = updateAuthorFromSelectedRow(selectedRow);
            if (authorDAO.updateAuthor(id, author)) {
                this.loadAllAuthors();
                nameAu.setText("");
                emailAu.setText("");
                phoneAu.setText("");
                DOB.setText("");

                JOptionPane.showMessageDialog(null, "Cập nhật thành công");
            } else {
                JOptionPane.showMessageDialog(null, "Không thể cập nhật");
            }
        } catch (ApplicationException ex) {
            JOptionPane.showMessageDialog(null, "Thông tin vẫn thế");
        }
    }//GEN-LAST:event_updateAuActionPerformed

    private void addAuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addAuActionPerformed
        // TODO add your handling code here:
        NewOrUpdateAuthor author = new NewOrUpdateAuthor();
        String dobText = DOB.getText();
        String name = nameAu.getText();
        String email = emailAu.getText();
        String phone = phoneAu.getText();

        if (name.isEmpty() || dobText.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Tên và ngày sinh tác giả không được để trống!");
        } else {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            Date dobDate;
            try {
                dobDate = dateFormat.parse(dobText);
            } catch (ParseException e) {
                JOptionPane.showMessageDialog(null, "Nhập đúng định dạng ngày sinh: dd/MM/yyyy");
                return;
            }

            if (!email.isEmpty() && !phone.isEmpty()) {
                Author existedUser = authorDAO.findAuthorByPhoneNoAndEmail(phone, email);
                if (existedUser != null || !SignUp.Validator.isValidEmail(email)) {
                    JOptionPane.showMessageDialog(null, "Email có thể chưa đúng hoặc thông tin số điện thoại, email đã tồn tại");
                } else {

                    addNewAuthor(name, email, phone, dobDate);
                }
            } else if (email.isEmpty() && !phone.isEmpty()) {
                Author existedUserPhone = authorDAO.findAuthorByPhoneNo(phone);
                if (existedUserPhone != null) {
                    JOptionPane.showMessageDialog(null, "Thông tin số điện thoại đã tồn tại");
                } else {

                    addNewAuthor(name, email, phone, dobDate);
                }
            } else if (!email.isEmpty() && phone.isEmpty()) {
                Author existedUserEmail = authorDAO.findAuthorByEmail(email);
                if (existedUserEmail != null || !SignUp.Validator.isValidEmail(email)) {
                    JOptionPane.showMessageDialog(null, "Thông tin email đã tồn tại hoặc chưa đúng định ");
                } else {

                    addNewAuthor(name, email, phone, dobDate);
                }
            } else {
                // Thêm tác giả mới khi cả email và số điện thoại đều trống
                addNewAuthor(name, email, phone, dobDate);
            }
        }
    }//GEN-LAST:event_addAuActionPerformed

    private void clActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clActionPerformed
        // TODO add your handling code here:
        this.loadAllAuthors();
        nameAu.setText("");
        emailAu.setText("");
        phoneAu.setText("");
        DOB.setText("");
    }//GEN-LAST:event_clActionPerformed

    private void deleteAuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteAuActionPerformed
        // TODO add your handling code here:
        int selectedRow = tableAuthor.getSelectedRow();
        if (selectedRow < 0) {
            return;
        }
        try {
            ObjectId authorId = authorTableRowIndxWithAuthorId.get(selectedRow).getId();

            if (authorDAO.authorHasBooks(authorId)) {
                JOptionPane.showMessageDialog(null, "Tác giả có sách nên không thể xóa  ");
            } else {
                authorDAO.deleteAuthor(authorId);
                this.loadAllAuthors();
                nameAu.setText("");
                emailAu.setText("");
                phoneAu.setText("");
                DOB.setText("");
                JOptionPane.showMessageDialog(null, "Xóa tác giả thành công ");

            }
        } catch (ApplicationException ex) {
            JOptionPane.showMessageDialog(null, "Lỗi khi xóa tác giả!");
        }
    }//GEN-LAST:event_deleteAuActionPerformed

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
            java.util.logging.Logger.getLogger(authorManagement.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(authorManagement.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(authorManagement.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(authorManagement.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new authorManagement().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private app.bolivia.swing.JCTextField DOB;
    private rojerusan.RSMaterialButtonRectangle addAu;
    private rojerusan.RSMaterialButtonRectangle cl;
    private rojerusan.RSMaterialButtonRectangle deleteAu;
    private app.bolivia.swing.JCTextField emailAu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private app.bolivia.swing.JCTextField nameAu;
    private app.bolivia.swing.JCTextField phoneAu;
    private rojeru_san.complementos.RSTableMetro tableAuthor;
    private rojerusan.RSMaterialButtonRectangle updateAu;
    // End of variables declaration//GEN-END:variables
 private void loadAllAuthors() {
        SwingUtilities.invokeLater(() -> {
            while (tblModel.getRowCount() > 0) {
                tblModel.removeRow(0);
            }
            List<Author> list = authorDAO.findAllAuthors();

            int idx = 0;

            for (Author b : list) {
                String email = (b.getEmail().isEmpty()) ? "Chưa có" : b.getEmail();
                String phone = (b.getPhoneNo().isEmpty()) ? "Chưa có" : b.getPhoneNo();
                Object[] row = {
                    idx,
                    b.getName(),
                    email,
                    phone,
                    DateConverter.DateFormat(b.getDob().toString()),
                    authorDAO.countBookOfAuthor(b.getId())
                //Dem so sach cua tac gia roi hien ra day ...
                };
                tblModel.addRow(row);
                authorTableRowIndxWithAuthorId.put(idx++, b);
            }
        });
    }

    private NewOrUpdateAuthor updateAuthorFromSelectedRow(int selectedRow) {
        NewOrUpdateAuthor author = new NewOrUpdateAuthor();
        author.setName(nameAu.getText());
        author.setEmail(emailAu.getText());
        author.setPhoneNo(phoneAu.getText());

        String dobText = DOB.getText();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date dobDate = null;
        try {
            dobDate = dateFormat.parse(dobText);
        } catch (ParseException e) {
        }
        author.setDob(dobDate);
        return author;
    }

    private void addNewAuthor(String name, String email, String phone, Date dobDate) {
        NewOrUpdateAuthor author = new NewOrUpdateAuthor();
        author.setName(name);
        author.setEmail(email);
        author.setPhoneNo(phone);
        author.setDob(dobDate);
        if (authorDAO.addNewAuthor(author)) {
            this.loadAllAuthors();
            nameAu.setText("");
            emailAu.setText("");
            phoneAu.setText("");
            DOB.setText("");
            JOptionPane.showMessageDialog(null, "Thêm thành công");
        } else {
            JOptionPane.showMessageDialog(null, "Có lỗi xảy ra khi thêm");
        }
    }
}
