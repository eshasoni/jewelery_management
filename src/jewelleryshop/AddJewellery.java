/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jewelleryshop;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author my pc
 */
public class AddJewellery extends javax.swing.JFrame {
Connection conn=null;
ResultSet rs=null;
PreparedStatement pst=null;

    public AddJewellery() {
        initComponents();
        conn = db.java_db();
        qty.setEnabled(false);
        getMaxId();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jid = new javax.swing.JTextField();
        metal = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        weight = new javax.swing.JTextField();
        cur1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        otype = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        cur3 = new javax.swing.JLabel();
        qty = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Ornament Type :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 193, 109, 22));

        jid.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        getContentPane().add(jid, new org.netbeans.lib.awtextra.AbsoluteConstraints(223, 161, 97, -1));

        metal.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        metal.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Gold", "Silver", "Platinum", "Bronze" }));
        metal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                metalActionPerformed(evt);
            }
        });
        getContentPane().add(metal, new org.netbeans.lib.awtextra.AbsoluteConstraints(223, 232, 97, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Ornament Made Of:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 230, -1, 22));

        weight.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        weight.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                weightKeyReleased(evt);
            }
        });
        getContentPane().add(weight, new org.netbeans.lib.awtextra.AbsoluteConstraints(223, 259, 97, -1));

        cur1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cur1.setText("Ornament Weight (Kg):");
        getContentPane().add(cur1, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 258, -1, 22));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Jewellery Id :");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 160, 90, 22));

        otype.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        getContentPane().add(otype, new org.netbeans.lib.awtextra.AbsoluteConstraints(223, 194, 97, -1));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setText("Add To DataBase");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 353, -1, -1));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton2.setText("Update details");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 353, -1, -1));

        cur3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cur3.setText("Quantity :");
        getContentPane().add(cur3, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 286, 115, 22));

        qty.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        qty.setText("0");
        qty.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                qtyKeyReleased(evt);
            }
        });
        getContentPane().add(qty, new org.netbeans.lib.awtextra.AbsoluteConstraints(223, 287, 97, -1));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton3.setText("Delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 387, 129, -1));

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton4.setText("Home");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 387, 115, -1));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Add Jewellery Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N
        jPanel1.setOpaque(false);

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton5.setText("Clear");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(jButton5)
                .addContainerGap(147, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(296, Short.MAX_VALUE)
                .addComponent(jButton5)
                .addGap(20, 20, 20))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 330, 360));

        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTable1.setBackground(new java.awt.Color(255, 255, 204));
        jTable1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTable1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.setGridColor(new java.awt.Color(255, 255, 204));
        jTable1.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(405, 160, -1, 120));

        jLabel1.setBackground(new java.awt.Color(255, 255, 204));
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-6, 0, 900, 560));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    void getMaxId(){
    try{
      
       
            String sql= "select MAX(jid)+1 from jewellery";
            pst=conn.prepareStatement(sql);              
            rs= pst.executeQuery();
            while(rs.next()){
            jid.setText(rs.getString(1));
            tabDisplay();
        
        }
      
    }   catch (Exception ex) {  
        }
    }
    
    public void tabDisplay()
    {
     try
     { 
                  
                    
                                String sql ="select * from jewellery ";
                                pst=conn.prepareStatement(sql);     
             
                                rs = pst.executeQuery();
                                jTable1.setModel(DbUtils.resultSetToTableModel(rs)); 
         }
         catch(Exception e){
        JOptionPane.showMessageDialog(rootPane, e);
    }
    }
    
     void loadData()
    {
        
          
            DefaultTableModel m1 = (DefaultTableModel) jTable1.getModel();
        jid.setEditable(false);
        int rowindex = jTable1.getSelectedRow();
        
            jid.setText(m1.getValueAt(rowindex, 0).toString());
            otype.setText(m1.getValueAt(rowindex, 1).toString());
            metal.setSelectedItem(m1.getValueAt(rowindex, 2).toString());
          weight.setText(m1.getValueAt(rowindex, 3).toString());
          qty.setText(m1.getValueAt(rowindex, 4).toString());
     
        
        
    }
    private void metalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_metalActionPerformed
        
    }//GEN-LAST:event_metalActionPerformed

    private void weightKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_weightKeyReleased
        
    }//GEN-LAST:event_weightKeyReleased

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Home h =new Home();
        h.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try
        {
            String sql= "insert into jewellery values(?,?,?,?,?)";
                  System.out.println(conn);
                 
            pst=conn.prepareStatement(sql);
            pst.setInt(1, Integer.parseInt(jid.getText()));
            pst.setString(2, otype.getText());
            pst.setString(3, metal.getSelectedItem().toString());
            pst.setString(4, weight.getText());
            pst.setString(5, qty.getText());
            pst.execute();
            JOptionPane.showMessageDialog(null,"Added To DataBase");
            int p = JOptionPane.showConfirmDialog(null, "Do You Want to add Purchase details?","Add Quantity",JOptionPane.YES_NO_OPTION);
            if(p==0)
            {
                Purchase pr = new Purchase();
                pr.setVisible(true);
                this.dispose();
            }
            tabDisplay();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Check The Data Entered");
        }
            
    }//GEN-LAST:event_jButton1ActionPerformed

    private void qtyKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_qtyKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_qtyKeyReleased

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try
        {
            String sql= "update jewellery set otype ='"+otype.getText()+"' ,ometal ='"+metal.getSelectedItem().toString()+"' , weight='"+weight.getText()+"' , qty = '"+ qty.getText()+"' where jid = '"+jid.getText()+"'";
                  System.out.println(conn);
                 
            pst=conn.prepareStatement(sql);
            pst.setInt(1, Integer.parseInt(jid.getText()));
            pst.setString(2, otype.getText());
            pst.setString(3, metal.getSelectedItem().toString());
            pst.setString(4, weight.getText());
            pst.setString(5, qty.getText());
            pst.execute();
            JOptionPane.showMessageDialog(null,"Added To DataBase");
            
            clear();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try{
              
      
                     pst = conn.prepareStatement("delete  from jewellery where  jid =?");
        pst.setString(1,jid.getText());
       
        pst.executeUpdate();
        JOptionPane.showMessageDialog(rootPane, "Successfully Deleted");
        clear();
         
        
                
    }catch(Exception e){
        JOptionPane.showMessageDialog(rootPane, e);
    } 
    }//GEN-LAST:event_jButton3ActionPerformed
    void clear()
    {
        otype.setText("");
        otype.setText("");
        otype.setText("");
        tabDisplay();
        getMaxId();
    }
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        loadData();
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
      clear();
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(AddJewellery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddJewellery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddJewellery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddJewellery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddJewellery().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cur1;
    private javax.swing.JLabel cur3;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jid;
    private javax.swing.JComboBox metal;
    private javax.swing.JTextField otype;
    private javax.swing.JTextField qty;
    private javax.swing.JTextField weight;
    // End of variables declaration//GEN-END:variables
}
