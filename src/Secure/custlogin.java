/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Secure;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author abc
 */
public class custlogin extends javax.swing.JFrame {
    /**
     * Creates new form custlogin
     */
    public custlogin() {
        initComponents();
        fetch();
        cust_name.setText(pas);
    } 
    
    public custlogin(String para,int id)
    {
           initComponents();
           fetch();
           cust_name.setText(para);
           we(para);
           we1(id);
    }
    public static int id1;
    public static String pas;
    public static String name1,exp;
    public static int pri;
    public void we(String par){
            pas=par;
    }
    public void we1(int id12)
    {
            id1=id12;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cust_name = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        add = new javax.swing.JButton();
        quan = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        log = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Product Name", "Price", "Quantity", "Expiry"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("Sitka Small", 2, 18)); // NOI18N
        jLabel1.setText("Customer Login Panel");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Welcome,");

        cust_name.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Enter Quantity");

        add.setText("Add To Cart");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        quan.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        quan.setText("0");

        jButton2.setText("Go To Cart");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        log.setText("Log Out");
        log.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logActionPerformed(evt);
            }
        });

        jButton1.setText("Update Profile");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cust_name, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                                .addComponent(quan, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(log, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                    .addComponent(cust_name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(quan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(add)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(log)
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new cart(id1).setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int selectedRow=jTable1.getSelectedRow();
        DefaultTableModel model=(DefaultTableModel)jTable1.getModel();
        name1=(model.getValueAt(selectedRow, 0).toString());
        pri=Integer.parseInt(model.getValueAt(selectedRow, 1).toString());
        exp=(model.getValueAt(selectedRow, 3).toString());
    }//GEN-LAST:event_jTable1MouseClicked

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        // TODO add your handling code here:
        int flag=0,flag1=0,temp=0;
        int qu;
        qu=Integer.parseInt(quan.getText());
        Connection conn;
        if(qu<=0)
        {
            JOptionPane.showMessageDialog(null, "Please enter a valid value");
        }
        else{
        try{
        conn = Login.guicon();
        ResultSet rs;
        PreparedStatement stmt;
        String query="Select name,price,quantity from cart";
        stmt=conn.prepareStatement(query);
        rs=stmt.executeQuery();
        while(rs.next())
        {
           if(name1.equals(rs.getString("name")))
           {
               flag=1;
               temp=rs.getInt("quantity");
               System.out.println(temp);
           }
        }
        }catch (SQLException ex) {
            Logger.getLogger(custlogin.class.getName()).log(Level.SEVERE, null, ex);
           
        }
        if(flag==1)
        {
            try{
            conn = Login.guicon();
            PreparedStatement stmt;
            String query="Update cart set quantity=? where name=?";
            stmt=conn.prepareStatement(query);
            temp=temp+qu;
            stmt.setInt(1, temp);
            stmt.setString(2, name1);
            stmt.executeUpdate();
            flag1=1;
            }catch (SQLException ex) {
            Logger.getLogger(custlogin.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else{
        try {
             int temp1=0;
             ResultSet rs;
             conn = Login.guicon();
             PreparedStatement stmt;
             PreparedStatement stmt1;
             String q="select prid from product where p_name=?";
             stmt1=conn.prepareStatement(q);
             stmt1.setString(1, name1);
             rs=stmt1.executeQuery();
             while(rs.next())
                 temp1=rs.getInt("prid");
             String query="Insert into cart(name,prid,price,quantity) values(?,?,?,?)";
             stmt=conn.prepareStatement(query);
             stmt.setString(1, name1);
             stmt.setInt(3, pri);
             stmt.setInt(2,temp1);
             stmt.setInt(4, qu);
             
             stmt.executeUpdate();
             flag1=1;
        }catch (SQLException ex) {
            Logger.getLogger(custlogin.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        if(flag1==1)
        {
            try{
                
            ResultSet rs;
            conn = Login.guicon();
            PreparedStatement stmt;
            String query="select quantity from product where p_name=?";
            stmt=conn.prepareStatement(query);
            stmt.setString(1, name1);
            rs=stmt.executeQuery();
            while(rs.next())
            {
                temp=rs.getInt("quantity");
            }
            temp=temp-qu;
            query="update product set quantity=? where p_name=?";
            stmt=conn.prepareStatement(query);
            stmt.setInt(1, temp);
            stmt.setString(2, name1);
            stmt.executeUpdate();
            fetch();
            JOptionPane.showMessageDialog(null, "Product Added Successfully to the Cart");
        }catch (SQLException ex) {
            Logger.getLogger(custlogin.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        }
    }//GEN-LAST:event_addActionPerformed

    private void logActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logActionPerformed
        // TODO add your handling code here:
        try { 
            Connection conn;
            conn = Login.guicon();
            PreparedStatement stmt;
            String query="truncate table cart";
            stmt=conn.prepareStatement(query);
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Logged out Successfully");
            this.setVisible(false);
            new Login().setVisible(true);
        }catch (SQLException ex) {
            Logger.getLogger(custlogin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_logActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         this.setVisible(false);
        try {
            new updateprofile(id1).setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(custlogin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
     public void fetch()
        {
         try{
         ResultSet rs=null;
         Connection conn=null;
         conn=Login.guicon();
         String q="select p_name,price,quantity,man_date,exp_date from product";
         PreparedStatement stmt=null;
         stmt=conn.prepareStatement(q);
         rs=stmt.executeQuery();
         jTable1.setModel(DbUtils.resultSetToTableModel(rs));
        }
         catch (SQLException ex) {
         Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
    }
    }
    
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
            java.util.logging.Logger.getLogger(custlogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(custlogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(custlogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(custlogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new custlogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JLabel cust_name;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton log;
    private javax.swing.JTextField quan;
    // End of variables declaration//GEN-END:variables
}
