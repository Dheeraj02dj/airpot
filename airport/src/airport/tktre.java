/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package airport;

import static airport.Ticket.jTextField1;
import static airport.Ticket.jTextField2;
import static airport.Ticket.jTextField3;
import static airport.Ticket.jTextField6;
import static airport.Ticket.jTextField8;
import static airport.ap.jTable1ap;
import static airport.tktre.dj1;
import java.awt.Color;
import java.awt.Toolkit;
import java.text.MessageFormat;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author CX0140TX
 */
public class tktre extends javax.swing.JFrame {

    /** Creates new form tktr */
     public tktre() {
      //this.setUndecorated(true);
     // this.setAlwaysOnTop(true);
      this.setResizable(false);
      this.setVisible(true);
      initComponents();
      Toolkit tk=Toolkit.getDefaultToolkit();
              
              int xsize =(int) tk.getScreenSize().getWidth();
              int ysize =(int) tk.getScreenSize().getWidth();
              
              this.setSize(xsize,ysize);
              
                dj1.setBackground(new Color(0,0,0,0));
              ((DefaultTableCellRenderer) dj1.getDefaultRenderer(Object.class)).setBackground(new Color(0,0,0,0));
             // jTable1ap.setGridColor(Color.white);
              dj1.setForeground(Color.black);
             //jScrollPane1 scrollPane =new jScrollPanel(jTable1ap);
              jScrollPane1.setBackground(new Color(0,0,0,0));
              jScrollPane1.setOpaque(false);
              dj1.setOpaque(false);
              ((DefaultTableCellRenderer) dj1.getDefaultRenderer(Object.class)).setOpaque(false);
              jScrollPane1.getViewport().setOpaque(false);
              
            //  jTable1ap.setShowGrid(true);
     }   
              
              
             
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        dj1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        dj1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        dj1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ticket num", "P_id", "FlightNo", "airpotId", "Seatclass", "Price"
            }
        ));
        dj1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dj1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(dj1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(460, 260, 920, 400);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton2.setText("Print");
        jButton2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(680, 780, 130, 50);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(990, 790, 130, 50);

        jLabel1.setFont(new java.awt.Font("Sitka Heading", 1, 40)); // NOI18N
        jLabel1.setText("Ticket Details");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(800, 90, 250, 51);

        jLabel2.setIcon(new javax.swing.ImageIcon("E:\\pics\\pexels-photo-1309644.jpeg")); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 1920, 1270);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dj1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dj1MouseClicked
        DefaultTableModel model=(DefaultTableModel)dj1.getModel();
        int selectedRowIndex=dj1.getSelectedRow();
        jTextField1.setText(model.getValueAt(selectedRowIndex,0).toString());
        jTextField2.setText(model.getValueAt(selectedRowIndex,1).toString());
        jTextField8.setText(model.getValueAt(selectedRowIndex,2).toString());
        jTextField3.setText(model.getValueAt(selectedRowIndex,3).toString());
        jTextField6.setText(model.getValueAt(selectedRowIndex,4).toString());
    }//GEN-LAST:event_dj1MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        MessageFormat header=new MessageFormat("TICKET DETAILS");

        MessageFormat footer=new MessageFormat("page{0,number,integer}");
        try{
            dj1.print(JTable.PrintMode.NORMAL,header,footer);

        }catch(java.awt.print.PrinterException e){
            System.err.format("Cannot print %s%n",e.getMessage());
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Ticket s=new Ticket();
        s.setVisible(true);
        dispose();
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
            java.util.logging.Logger.getLogger(tktre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tktre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tktre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tktre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tktre().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTable dj1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    public static javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

}
