/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

/**
 *
 * @author devis
 */
import java.sql.*;
import javax.swing.*;

public class Leave extends javax.swing.JFrame {

    /**
     * Creates new form Leave
     */
    public Leave() {
        initComponents();
        id.setText(String.valueOf(employeeid.empid).toString());
        fname1.setText(String.valueOf(fname.fname1).toString());
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
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        empid = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        fname1 = new javax.swing.JTextField();
        days = new javax.swing.JTextField();
        fdate = new javax.swing.JTextField();
        tdate = new javax.swing.JTextField();
        reason = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(248, 250, 160));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(162, 160, 250));
        jPanel2.setLayout(null);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/resume.png"))); // NOI18N
        jPanel2.add(jLabel2);
        jLabel2.setBounds(340, 0, 70, 80);

        empid.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        empid.setText("Emp ID:");
        jPanel2.add(empid);
        empid.setBounds(80, 110, 70, 20);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("First name:");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(80, 160, 90, 17);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("From date:");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(80, 270, 90, 17);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("To Date:");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(80, 320, 70, 17);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Days: ");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(80, 220, 70, 17);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Reason:");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(80, 380, 60, 17);
        jPanel2.add(id);
        id.setBounds(220, 100, 140, 30);
        jPanel2.add(fname1);
        fname1.setBounds(220, 150, 140, 30);
        jPanel2.add(days);
        days.setBounds(220, 210, 140, 30);
        jPanel2.add(fdate);
        fdate.setBounds(220, 260, 140, 30);
        jPanel2.add(tdate);
        tdate.setBounds(220, 310, 140, 30);
        jPanel2.add(reason);
        reason.setBounds(220, 370, 140, 30);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(153, 255, 102));
        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(390, 395, 100, 40);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 51, 51));
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);
        jButton2.setBounds(720, 10, 67, 25);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(30, 20, 810, 450);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(17, 10, 0, 0);

        setSize(new java.awt.Dimension(942, 551));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        // adding text and other to db
        String d =days.getText();
        String fd = fdate.getText();
        String td = tdate.getText();
        String r = reason.getText();
        int id  = employeeid.empid;
        try {
            Connector c = new Connector();
            String sql = "insert into leaves(emp_id,days,from_date,to_date,reason) values ('"+id+"','"+d+"','"+fd+"','"+td+"','"+r+"')";
            c.s.execute(sql);
            JOptionPane.showMessageDialog(null,"appliedd successsfully");
            //JOptionPane.showMessageDialog () 
        }catch (Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        employeehome eh = new employeehome();
        eh.setVisible(true);
        this.dispose();
        
        
        
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
            java.util.logging.Logger.getLogger(Leave.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Leave.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Leave.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Leave.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Leave().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField days;
    private javax.swing.JLabel empid;
    private javax.swing.JTextField fdate;
    private javax.swing.JTextField fname1;
    private javax.swing.JTextField id;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField reason;
    private javax.swing.JTextField tdate;
    // End of variables declaration//GEN-END:variables
}
