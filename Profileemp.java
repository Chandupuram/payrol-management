/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date; 
/**
 *
 * @author devis
 */
public class Profileemp extends javax.swing.JFrame {

    /**
     * Creates new form Profileemp
     */
    public Profileemp() {
        
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        epid = new javax.swing.JLabel();
        fname = new javax.swing.JLabel();
        lname = new javax.swing.JLabel();
        phno = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        desg = new javax.swing.JLabel();
        addr = new javax.swing.JLabel();
        bpay = new javax.swing.JLabel();
        sdate = new javax.swing.JLabel();
        accno = new javax.swing.JLabel();
        pan = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(159, 197, 249));
        jPanel1.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(249, 211, 159));
        jPanel2.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Emp ID:");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(50, 90, 50, 15);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("First name:");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(50, 130, 70, 15);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Last name:");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(50, 170, 70, 15);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel4.setText("mobile no:");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(50, 210, 60, 13);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Email  ID:");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(50, 250, 70, 15);
        jPanel2.add(jLabel6);
        jLabel6.setBounds(51, 294, 0, 0);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Desgination:");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(50, 300, 90, 15);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Address:");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(50, 350, 70, 15);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("Basic pay:");
        jPanel2.add(jLabel11);
        jLabel11.setBounds(360, 170, 70, 15);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("Start date:");
        jPanel2.add(jLabel12);
        jLabel12.setBounds(360, 220, 80, 10);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setText("Acc Number:");
        jPanel2.add(jLabel13);
        jLabel13.setBounds(360, 260, 90, 20);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setText("PAN:");
        jPanel2.add(jLabel14);
        jLabel14.setBounds(370, 300, 50, 15);

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/profile(2).png"))); // NOI18N
        jPanel2.add(jLabel15);
        jLabel15.setBounds(340, 10, 100, 90);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 51, 51));
        jButton1.setText("BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(400, 390, 110, 40);

        epid.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel2.add(epid);
        epid.setBounds(170, 80, 150, 30);

        fname.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel2.add(fname);
        fname.setBounds(170, 114, 150, 30);

        lname.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel2.add(lname);
        lname.setBounds(170, 150, 150, 30);

        phno.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel2.add(phno);
        phno.setBounds(170, 194, 150, 30);

        email.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel2.add(email);
        email.setBounds(170, 240, 150, 30);

        desg.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel2.add(desg);
        desg.setBounds(170, 284, 150, 30);

        addr.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel2.add(addr);
        addr.setBounds(170, 350, 130, 30);

        bpay.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel2.add(bpay);
        bpay.setBounds(450, 160, 140, 30);

        sdate.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel2.add(sdate);
        sdate.setBounds(450, 200, 150, 30);

        accno.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel2.add(accno);
        accno.setBounds(450, 244, 150, 30);

        pan.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel2.add(pan);
        pan.setBounds(460, 290, 140, 30);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(20, 10, 638, 480);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(718, 566));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        try{
           String id =String.valueOf(employeeid.empid).toString();
            Connector c = new Connector();
           String  sql = "select * from employee_info where employee_info.emp_id='"+id+"'";
          
            ResultSet rs =c.s.executeQuery(sql);
            while(rs.next()){
                String add1 =rs.getString("emp_id");
                epid.setText(add1);
                String add2 =rs.getString("first_name");
                fname.setText(add2);
                String add3 =rs.getString("last_name");
                lname.setText(add3);
                String add4 =rs.getString("phno");
                phno.setText(add4);
                String add5 =rs.getString("email");
                email.setText(add5);
                String add6 =rs.getString("designation");
                desg.setText(add6);
                String add7 =rs.getString("basic_pay");
                bpay.setText(add7);
                String add8 =rs.getString("address");
                addr.setText(add8);
                String add15=rs.getString("startdate");
                sdate.setText(add15);
                String add12 =rs.getString("accno");
                accno.setText(add12);
                String add13 =rs.getString("pan");
                pan.setText(add13);
                        
                
                
            }
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_formWindowActivated

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        //back button
        employeehome eh = new employeehome();
        eh.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Profileemp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Profileemp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Profileemp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Profileemp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Profileemp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel accno;
    private javax.swing.JLabel addr;
    private javax.swing.JLabel bpay;
    private javax.swing.JLabel desg;
    private javax.swing.JLabel email;
    private javax.swing.JLabel epid;
    private javax.swing.JLabel fname;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lname;
    private javax.swing.JLabel pan;
    private javax.swing.JLabel phno;
    private javax.swing.JLabel sdate;
    // End of variables declaration//GEN-END:variables
}