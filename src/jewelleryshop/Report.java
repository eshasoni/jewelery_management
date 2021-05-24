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
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JRDesignQuery;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author my pc
 */
public class Report extends javax.swing.JFrame {

    /**
     * Creates new form Report
     */
    public Report() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        msaled1 = new org.jdesktop.swingx.JXDatePicker();
        msaled2 = new org.jdesktop.swingx.JXDatePicker();
        jLabel3 = new javax.swing.JLabel();
        ysales = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        mpurchased1 = new org.jdesktop.swingx.JXDatePicker();
        jLabel5 = new javax.swing.JLabel();
        mpurchased2 = new org.jdesktop.swingx.JXDatePicker();
        jLabel6 = new javax.swing.JLabel();
        ypurchase = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("Jewellery Report");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 43, 140, 42));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setText("Dealer Report");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 103, 140, 42));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Sales Report", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11), new java.awt.Color(51, 51, 51))); // NOI18N
        jPanel1.setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Select Dates To Generate Monthly Sales Report");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("TO");

        msaled2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                msaled2ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Enter Year to Generate Yearly Sales Report");

        ysales.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ysales.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ysalesKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(msaled1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(msaled2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(ysales, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(msaled1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(msaled2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(ysales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 175, -1, -1));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Purchase Report", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 255, 255)), "Purchase Report", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
        jPanel3.setOpaque(false);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Select Dates To Generate Monthly Purchase Report");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("TO");

        mpurchased2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mpurchased2ActionPerformed(evt);
            }
        });
        mpurchased2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                mpurchased2KeyReleased(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Enter Year to Generate Yearly Purchase Report");

        ypurchase.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ypurchase.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ypurchaseKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(mpurchased1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(mpurchased2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(ypurchase, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel4)
                .addGap(31, 31, 31)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(mpurchased1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mpurchased2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(jLabel6)
                .addGap(26, 26, 26)
                .addComponent(ypurchase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(518, 175, -1, -1));

        jLabel7.setBackground(new java.awt.Color(255, 255, 204));
        jLabel7.setOpaque(true);
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(-7, 0, 900, 490));

        jMenu1.setText("File");

        jMenuItem1.setText("Home");
        jMenuItem1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenuItem1MousePressed(evt);
            }
        });
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         try{
        Class.forName("com.mysql.jdbc.Driver");
           
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jshop","root","1234");
                JasperDesign j = JRXmlLoader.load("C:\\Users\\Desktop\\Desktop\\Project\\JewelleryShop\\src\\jewelleryshop\\Jewellery.jrxml");
                //C:\Users\Desktop\Desktop\jewelleryshop
                String q = "select * from jewellery ";
                
                JRDesignQuery uq = new JRDesignQuery();
                uq.setText(q);
                j.setQuery(uq);
                JasperReport jrp = JasperCompileManager.compileReport(j);
                JasperPrint jp = JasperFillManager.fillReport(jrp , null,con);
                JasperViewer.viewReport(jp, rootPaneCheckingEnabled);
               
            
        } 
        catch (Exception ex) {
            
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void msaled2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_msaled2ActionPerformed
       Date s = msaled1.getDate();
        DateFormat d = new SimpleDateFormat("yyyy-MM-dd");
        String d1 = d.format(s);
        Date s2 = msaled2.getDate();
       
        String d2= d.format(s2);
        float s1=0;
     try{
        Class.forName("com.mysql.jdbc.Driver");
         
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jshop","root","1234");

                PreparedStatement stm = con.prepareStatement("select grandtotal from bill where date between '"+d1+"' and '"+d2+"' ");
              ResultSet rs = stm.executeQuery();
              while (rs.next())
              {
              System.out.println(rs.getString("grandtotal"));
               s1 =s1+Float.parseFloat(rs.getString("grandtotal"));
              }    
        } 
        catch (Exception ex) {
           
        }
        try{
        Class.forName("com.mysql.jdbc.Driver");
            System.out.println(s1);
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jshop","root","1234");
                JasperDesign j = JRXmlLoader.load("C:\\Users\\Desktop\\Desktop\\Project\\JewelleryShop\\src\\jewelleryshop\\Sales.jrxml");
                String q = "select * from bill where date between '"+d1+"' and '"+d2+"' ";
                HashMap p = new HashMap();
                p.put("grandtotal", Float.toString(s1));
                JRDesignQuery uq = new JRDesignQuery();
                uq.setText(q);
                j.setQuery(uq);
                JasperReport jrp = JasperCompileManager.compileReport(j);
                JasperPrint jp = JasperFillManager.fillReport(jrp , p,con);
                JasperViewer.viewReport(jp, rootPaneCheckingEnabled);
               
            
        } 
        catch (Exception ex) {
            
        }
    }//GEN-LAST:event_msaled2ActionPerformed

    private void ysalesKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ysalesKeyReleased
        if(ysales.getText().length()==4) 
        {
             float s1=0;
        try{
        Class.forName("com.mysql.jdbc.Driver");
         
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jshop","root","1234");

                PreparedStatement stm = con.prepareStatement("select * from bill where date LIKE '"+ysales.getText()+"-%-%' ");
              ResultSet rs = stm.executeQuery();
              while (rs.next())
              {
              System.out.println(rs.getString("grandtotal"));
               s1 =s1+Float.parseFloat(rs.getString("grandtotal"));
               
              }
              System.out.println(s1);
        } 
        catch (Exception ex) {
           
        }
        try{
        Class.forName("com.mysql.jdbc.Driver");
           
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jshop","root","1234");
                JasperDesign j = JRXmlLoader.load("C:\\Users\\Desktop\\Desktop\\Project\\JewelleryShop\\src\\jewelleryshop\\Sales.jrxml");
                String q = "select * from bill where date LIKE '"+ysales.getText()+"-%-%'";
                System.out.println(q+"\n"+s1);
                HashMap p = new HashMap();
                p.put("grandtotal", Float.toString(s1));
                JRDesignQuery uq = new JRDesignQuery();
                uq.setText(q);
                j.setQuery(uq);
                JasperReport jrp = JasperCompileManager.compileReport(j);
                JasperPrint jp = JasperFillManager.fillReport(jrp , p,con);
                JasperViewer.viewReport(jp, rootPaneCheckingEnabled);
               
            
        } 
        catch (Exception ex) {
            
        }
        }
        
       
    }//GEN-LAST:event_ysalesKeyReleased

    private void mpurchased2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mpurchased2KeyReleased
         
    }//GEN-LAST:event_mpurchased2KeyReleased

    private void mpurchased2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mpurchased2ActionPerformed
        Date s = mpurchased1.getDate();
        DateFormat d = new SimpleDateFormat("yyyy-MM-dd");
        String d1 = d.format(s);
        Date s2 = mpurchased2.getDate();
       
        String d2= d.format(s2);
        float s1=0;
     try{
        Class.forName("com.mysql.jdbc.Driver");
         
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jshop","root","1234");

                PreparedStatement stm = con.prepareStatement("select grandtotal from purchase where date between '"+d1+"' and '"+d2+"' ");
              ResultSet rs = stm.executeQuery();
              while (rs.next())
              {
              System.out.println(rs.getString("grandtotal"));
               s1 =s1+Float.parseFloat(rs.getString("grandtotal"));
              }    
        } 
        catch (Exception ex) {
           
        }
        try{
        Class.forName("com.mysql.jdbc.Driver");
            System.out.println(s1);
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jshop","root","1234");
                JasperDesign j = JRXmlLoader.load("C:\\Users\\Desktop\\Desktop\\Project\\JewelleryShop\\src\\jewelleryshop\\PurchaseReport.jrxml");
                String q = "select * from purchase where date between '"+d1+"' and '"+d2+"' ";
                HashMap p = new HashMap();
                p.put("grandtotal", Float.toString(s1));
                JRDesignQuery uq = new JRDesignQuery();
                uq.setText(q);
                j.setQuery(uq);
                JasperReport jrp = JasperCompileManager.compileReport(j);
                JasperPrint jp = JasperFillManager.fillReport(jrp , p,con);
                JasperViewer.viewReport(jp, rootPaneCheckingEnabled);
               
            
        } 
        catch (Exception ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_mpurchased2ActionPerformed

    private void ypurchaseKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ypurchaseKeyReleased
         if(ypurchase.getText().length()==4) 
        {
             float s1=0;
        try{
        Class.forName("com.mysql.jdbc.Driver");
         
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jshop","root","1234");

                PreparedStatement stm = con.prepareStatement("select * from purchase where date LIKE '"+ypurchase.getText()+"-%-%' ");
              ResultSet rs = stm.executeQuery();
              while (rs.next())
              {
              System.out.println(rs.getString("grandtotal"));
               s1 =s1+Float.parseFloat(rs.getString("grandtotal"));
               
              }
              System.out.println(s1);
        } 
        catch (Exception ex) {
           
        }
        try{
        Class.forName("com.mysql.jdbc.Driver");
           
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jshop","root","1234");
                JasperDesign j = JRXmlLoader.load("C:\\Users\\Desktop\\Desktop\\Project\\JewelleryShop\\src\\jewelleryshop\\PurchaseReport.jrxml");
                String q = "select * from purchase where date LIKE '"+ypurchase.getText()+"-%-%'";
                System.out.println(q+"\n"+s1);
                HashMap p = new HashMap();
                p.put("grandtotal", Float.toString(s1));
                JRDesignQuery uq = new JRDesignQuery();
                uq.setText(q);
                j.setQuery(uq);
                JasperReport jrp = JasperCompileManager.compileReport(j);
                JasperPrint jp = JasperFillManager.fillReport(jrp , p,con);
                JasperViewer.viewReport(jp, rootPaneCheckingEnabled);
               
            
        } 
        catch (Exception ex) {
            
        }
        }
    }//GEN-LAST:event_ypurchaseKeyReleased

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem1MousePressed
       Home h = new Home();
       h.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_jMenuItem1MousePressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       try{
        Class.forName("com.mysql.jdbc.Driver");
           
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jshop","root","1234");
                JasperDesign j = JRXmlLoader.load("C:\\Users\\Desktop\\Desktop\\Project\\JewelleryShop\\src\\jewelleryshop\\Dealer.jrxml");
                //C:\Users\Desktop\Desktop\jewelleryshop
                String q = "select * from Dealer ";
                
                JRDesignQuery uq = new JRDesignQuery();
                uq.setText(q);
                j.setQuery(uq);
                JasperReport jrp = JasperCompileManager.compileReport(j);
                JasperPrint jp = JasperFillManager.fillReport(jrp , null,con);
                JasperViewer.viewReport(jp, rootPaneCheckingEnabled);
               
            
        } 
        catch (Exception ex) {
            
        }
     
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Report().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private org.jdesktop.swingx.JXDatePicker mpurchased1;
    private org.jdesktop.swingx.JXDatePicker mpurchased2;
    private org.jdesktop.swingx.JXDatePicker msaled1;
    private org.jdesktop.swingx.JXDatePicker msaled2;
    private javax.swing.JTextField ypurchase;
    private javax.swing.JTextField ysales;
    // End of variables declaration//GEN-END:variables
}