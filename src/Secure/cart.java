/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Secure;
import static Secure.custlogin.name1;
import static Secure.custlogin.pas;
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
public class cart extends javax.swing.JFrame {

    /**
     * Creates new form cart
     */
    public cart() {
        initComponents();
        fetch();
        function();
    }
    public cart(int id1) {
        initComponents();
        fetch();
        function();
        we(id1);
    }
    public static int id;
 public static String pas;
    public static String name1,exp;
    public static int pri,qua;
    public void we(int id1){
            id=id1;
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
        tabel1 = new javax.swing.JTable();
        back = new javax.swing.JButton();
        check = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        tp = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(236, 237, 51));
        setForeground(new java.awt.Color(250, 241, 12));

        tabel1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Product_name", "Price", "Quantity", "Total Price"
            }
        ));
        tabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabel1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabel1);

        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        check.setText("Check Out");
        check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkActionPerformed(evt);
            }
        });

        jButton2.setText("Remove product");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setText("Total Price");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addComponent(jLabel1)
                        .addGap(36, 36, 36)
                        .addComponent(tp, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2)
                    .addComponent(check, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(check))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(back, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(tp, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(54, 54, 54))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new custlogin().setVisible(true);
    }//GEN-LAST:event_backActionPerformed
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {                                     
        // TODO add your handling code here:
        System.out.println("temp="+qua);
        
    }     
    private void checkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkActionPerformed
        // TODO add your handling code here:
       try{
        String send=null,t=null;
        int temp=0,qua=0,tot=0;
        String now=null;
        Connection conn;    
        ResultSet rs;
        conn = Login.guicon();
        PreparedStatement stmt;
        PreparedStatement stmt1;
        String query1="select name,prid,quantity,total_price,date(now()) from cart";
        String query2="insert into orders(pid,prid,quantity,total_price,sale_date) values(?,?,?,?,?)";
        stmt=conn.prepareStatement(query1);
        stmt1=conn.prepareStatement(query2);
        rs=stmt.executeQuery();
        send="Name\tQuantity\tTotal Price\n";
        while(rs.next())
        {
            t=rs.getString("name");
            temp=rs.getInt("prid");
            qua=rs.getInt("quantity");
            tot=rs.getInt("total_price");
            now=rs.getString("date(now())");
            send=send+t+"\t"+(qua)+"\t\t"+(tot)+"\n";
            stmt1.setInt(1,id);
            stmt1.setInt(2,temp);
            stmt1.setInt(3,qua);
            stmt1.setInt(4,tot);
            stmt1.setString(5,now);
            stmt1.executeUpdate();
        }
        String a,b,x,y;
        a="kaustu0007@gmail.com";
        String to="kaustubh.pimparkar@viit.ac.in";
        b="jackandgill123";
        y=send;
        
        x="Order details";
        Newclass1.Mail(to,b,a,x,y);
        
        JOptionPane.showMessageDialog(null, "Email sent successfully");
       
           
           
            PreparedStatement stmt3;
            String query="truncate table cart";
            stmt3=conn.prepareStatement(query);
            stmt3.executeUpdate();
            JOptionPane.showMessageDialog(null, "Product(s) ordered successfully");
           
        
         
       }catch (SQLException ex) {
            Logger.getLogger(custlogin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_checkActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        try{
            int temp=0;
            Connection conn;    
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
            System.out.println("temp="+temp);
            temp=temp+qua;
            System.out.println("qua="+qua);
            System.out.println("temp="+temp);
            query="update product set quantity=? where p_name=?";
            stmt=conn.prepareStatement(query);
            stmt.setInt(1, temp);
            stmt.setString(2, name1);
            stmt.executeUpdate();
            
             query="delete from cart where name=?";
             stmt=conn.prepareStatement(query);
             stmt.setString(1, name1);
             stmt.executeUpdate();
             function();
             fetch();
            JOptionPane.showMessageDialog(null, "Product removed Successfully from the Cart");
        }catch (SQLException ex) {
            Logger.getLogger(custlogin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void tabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabel1MouseClicked
        // TODO add your handling code here:
        int selectedRow=tabel1.getSelectedRow();
        DefaultTableModel model=(DefaultTableModel)tabel1.getModel();
        name1=(model.getValueAt(selectedRow, 0).toString());
        pri=Integer.parseInt(model.getValueAt(selectedRow, 1).toString());
        qua=Integer.parseInt(model.getValueAt(selectedRow, 3).toString());
        exp=(model.getValueAt(selectedRow, 3).toString());
    }//GEN-LAST:event_tabel1MouseClicked

    void function()
    {
        try{
            String mystring=null;
         int tot=0;
         ResultSet rs=null;
         Connection conn=null;
         conn=Login.guicon();
         String q="call weat()";
         PreparedStatement stmt=null;
         stmt=conn.prepareStatement(q);
         rs=stmt.executeQuery();
         while(rs.next())
         tot=rs.getInt("te");
         mystring=Integer.toString(tot);
         tp.setText(mystring);
        }catch (SQLException ex) {
         Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
    }
        }
        
    public void fetch()
        {
         try{
         ResultSet rs=null;
         Connection conn=null;
         conn=Login.guicon();
         String q="select * from cart";
         PreparedStatement stmt=null;
         stmt=conn.prepareStatement(q);
         rs=stmt.executeQuery();
         tabel1.setModel(DbUtils.resultSetToTableModel(rs));
        }
         catch (SQLException ex) {
         Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
    }
    }
    
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
            java.util.logging.Logger.getLogger(cart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cart().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JButton check;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabel1;
    private javax.swing.JLabel tp;
    // End of variables declaration//GEN-END:variables
}
