/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airport;

import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author CX0140TX
 */
public class login extends javax.swing.JFrame {

    
    Connection con=null;
    ResultSet rs=null;
    PreparedStatement pst=null;
    
    public login() {
      //this.setUndecorated(true);
      //Sthis.setAlwaysOnTop(true);
      this.setResizable(false);
      this.setVisible(true);
      initComponents();
      Toolkit tk=Toolkit.getDefaultToolkit();
              
              int xsize =(int) tk.getScreenSize().getWidth();
              int ysize =(int) tk.getScreenSize().getWidth();
              
              this.setSize(xsize,ysize);
  }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        password = new javax.swing.JPasswordField();
        username = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Yu Gothic", 1, 22)); // NOI18N
        jLabel1.setText("NAME:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(150, 150, 90, 30);

        jLabel2.setFont(new java.awt.Font("Yu Gothic", 1, 22)); // NOI18N
        jLabel2.setText("PASSWORD:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(150, 260, 140, 40);

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setFont(new java.awt.Font("Yu Gothic", 1, 20)); // NOI18N
        jButton1.setText("Login");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton1KeyPressed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(340, 360, 120, 40);

        reset.setBackground(new java.awt.Color(204, 204, 204));
        reset.setFont(new java.awt.Font("Yu Gothic", 1, 20)); // NOI18N
        reset.setText("Clear");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });
        getContentPane().add(reset);
        reset.setBounds(480, 360, 100, 40);

        password.setBackground(new java.awt.Color(204, 204, 204));
        password.setFont(new java.awt.Font("Yu Gothic", 1, 20)); // NOI18N
        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });
        password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passwordKeyPressed(evt);
            }
        });
        getContentPane().add(password);
        password.setBounds(340, 250, 240, 50);

        username.setBackground(new java.awt.Color(204, 204, 204));
        username.setFont(new java.awt.Font("Yu Gothic", 1, 20)); // NOI18N
        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });
        username.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                usernameKeyPressed(evt);
            }
        });
        getContentPane().add(username);
        username.setBounds(340, 140, 240, 50);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setText("ADMIN LOGIN");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(250, 50, 190, 40);

        jLabel3.setIcon(new javax.swing.ImageIcon("E:\\pics\\sukhoi_superjet_100_aircraft_smoke_dust_98001_1920x1080.jpg")); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 1920, 1080);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        
       try{
           Class.forName("java.sql.Driver");
           con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/login","root","root");
            String sql="Select * from logindeat where username=? and password=?";
           pst=con.prepareStatement(sql);
           pst.setString(1,username.getText());
           pst.setString(2,password.getText());
           rs=pst.executeQuery();
           if(rs.next())
           {
               JOptionPane.showMessageDialog(null,"Login Succesfully");
               
               home m=new home();
               m.setVisible(true);
               dispose();
               
              
           }else
           {
                JOptionPane.showMessageDialog(null,"Invalid username/password");
                 username.setText(null);
                 password.setText(null);
           }
           
       } catch (ClassNotFoundException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        
        } catch (SQLException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
         username.setText(null);
         password.setText(null);
    }//GEN-LAST:event_resetActionPerformed

    private void jButton1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton1KeyPressed
      
    }//GEN-LAST:event_jButton1KeyPressed

    private void passwordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordKeyPressed
    if(evt.getKeyCode()==KeyEvent.VK_ENTER)  {
       try{
           Class.forName("java.sql.Driver");
           con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/login","root","root");
            String sql="Select * from logindeat where username=? and password=?";
           pst=con.prepareStatement(sql);
           pst.setString(1,username.getText());
           pst.setString(2,password.getText());
           rs=pst.executeQuery();
           if(rs.next()){
               JOptionPane.showMessageDialog(null,"Login Succesfully ");
               new home().setVisible(true);
               dispose();
              
           }else
           {
                JOptionPane.showMessageDialog(null,"Invalid username/password");
                 username.setText(null);
                 password.setText(null);
           }
           
       } catch (Exception ex) {
       }
      
      }
    }//GEN-LAST:event_passwordKeyPressed

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

    private void usernameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usernameKeyPressed
    int key=evt.getKeyCode();
    if(key==10){
        password.requestFocus();
    }
    }//GEN-LAST:event_usernameKeyPressed

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameActionPerformed

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPasswordField password;
    private javax.swing.JButton reset;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
