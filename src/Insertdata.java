
import java.awt.Color;
import java.awt.Image;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Insertdata extends javax.swing.JFrame {
java.sql.Connection conn = null;
ResultSet rs = null;
Statement st;
    /**
     * Creates new form Insertdata
     */
    public Insertdata() {
        initComponents();
        scaleImage();
        scaleImage1();
    }
        public Insertdata(String para){
        initComponents();
        scaleImage();
        scaleImage1();
        account.setText(para);
        jPanel2.setBackground(new Color(0,0,0,150));
    }
    public void scaleImage1(){
        ImageIcon icon = (ImageIcon) remove.getIcon();
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(add.getWidth(),add.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        add.setIcon(scaledIcon);
        preview.setIcon(scaledIcon);
        remove.setIcon(scaledIcon);
        reset.setIcon(scaledIcon);
        update.setIcon(scaledIcon);
        cancel.setIcon(scaledIcon);
    }
    public void scaleImage(){
        ImageIcon icon = (ImageIcon) jLabel1.getIcon();
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(jLabel1.getWidth(),jLabel1.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        jLabel1.setIcon(scaledIcon);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        datapc = new javax.swing.JLabel();
        reset = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        datacd = new javax.swing.JLabel();
        cdn = new javax.swing.JSpinner();
        preview = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        sleep = new javax.swing.JRadioButton();
        remove = new javax.swing.JButton();
        shutdown = new javax.swing.JRadioButton();
        cancel = new javax.swing.JButton();
        add = new javax.swing.JButton();
        pcn = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        update = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jCalendar1 = new com.toedter.calendar.JCalendar();
        on = new javax.swing.JRadioButton();
        dataoph = new javax.swing.JLabel();
        oph = new javax.swing.JSpinner();
        account = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setLayout(null);

        datapc.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        datapc.setForeground(new java.awt.Color(204, 255, 255));
        datapc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        datapc.setText("Empty");
        datapc.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(datapc);
        datapc.setBounds(690, 70, 120, 17);

        reset.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        reset.setText("Reset");
        reset.setContentAreaFilled(false);
        reset.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });
        jPanel2.add(reset);
        reset.setBounds(610, 240, 80, 30);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 255, 255));
        jLabel3.setText(" Total Number of Coin Drops:");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(430, 110, 190, 17);

        datacd.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        datacd.setForeground(new java.awt.Color(204, 255, 255));
        datacd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        datacd.setText("Empty");
        datacd.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(datacd);
        datacd.setBounds(690, 110, 120, 17);
        jPanel2.add(cdn);
        cdn.setBounds(620, 110, 70, 25);

        preview.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        preview.setText("Preview");
        preview.setContentAreaFilled(false);
        preview.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        preview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                previewActionPerformed(evt);
            }
        });
        jPanel2.add(preview);
        preview.setBounds(520, 200, 80, 30);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 255, 255));
        jLabel6.setText("Data Preview");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(710, 40, 90, 17);

        buttonGroup1.add(sleep);
        sleep.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        sleep.setForeground(new java.awt.Color(204, 255, 255));
        sleep.setSelected(true);
        sleep.setText("Sleep");
        sleep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sleepActionPerformed(evt);
            }
        });
        jPanel2.add(sleep);
        sleep.setBounds(490, 30, 60, 25);

        remove.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        remove.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BACTONG COMP SHOP/BACTONG COMP SHOP/222026_preview.png"))); // NOI18N
        remove.setText("Remove");
        remove.setContentAreaFilled(false);
        remove.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeActionPerformed(evt);
            }
        });
        jPanel2.add(remove);
        remove.setBounds(430, 200, 80, 30);

        buttonGroup1.add(shutdown);
        shutdown.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        shutdown.setForeground(new java.awt.Color(204, 255, 255));
        shutdown.setText("Shutdown");
        shutdown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shutdownActionPerformed(evt);
            }
        });
        jPanel2.add(shutdown);
        shutdown.setBounds(550, 30, 90, 25);

        cancel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cancel.setText("Cancel");
        cancel.setContentAreaFilled(false);
        cancel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        jPanel2.add(cancel);
        cancel.setBounds(520, 240, 80, 30);

        add.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        add.setText("Add");
        add.setContentAreaFilled(false);
        add.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        jPanel2.add(add);
        add.setBounds(700, 200, 80, 30);
        jPanel2.add(pcn);
        pcn.setBounds(620, 70, 70, 25);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 255, 255));
        jLabel4.setText("Number of Operating Hours:");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(430, 150, 180, 17);

        update.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        update.setText("Update");
        update.setContentAreaFilled(false);
        update.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        jPanel2.add(update);
        update.setBounds(610, 200, 80, 30);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 255, 255));
        jLabel2.setText("Number of PC Used:");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(480, 70, 130, 17);
        jPanel2.add(jCalendar1);
        jCalendar1.setBounds(10, 10, 410, 260);

        buttonGroup1.add(on);
        on.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        on.setForeground(new java.awt.Color(204, 255, 255));
        on.setText("On");
        on.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onActionPerformed(evt);
            }
        });
        jPanel2.add(on);
        on.setBounds(640, 30, 50, 25);

        dataoph.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        dataoph.setForeground(new java.awt.Color(204, 255, 255));
        dataoph.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dataoph.setText("Empty");
        dataoph.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(dataoph);
        dataoph.setBounds(690, 150, 120, 17);
        jPanel2.add(oph);
        oph.setBounds(620, 150, 70, 25);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(9, 39, 800, 280);

        account.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        account.setForeground(new java.awt.Color(204, 255, 255));
        jPanel1.add(account);
        account.setBounds(60, 330, 210, 20);

        jLabel13.setFont(new java.awt.Font("Times New Roman", 2, 11)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 255, 255));
        jLabel13.setText("Username:");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(10, 330, 60, 20);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BACTONG COMP SHOP/BACTONG COMP SHOP/Galaxy_Glass_Indigo_MOW-HD.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 820, 360);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 815, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 356, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void shutdownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shutdownActionPerformed
    // TODO add your handling code here:
    }//GEN-LAST:event_shutdownActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        // TODO add your handling code here:
        
        pcn.setValue(0);
        cdn.setValue(0);
        oph.setValue(0);
        sleep.setSelected(true);
        datapc.setText("Empty");
        datacd.setText("Empty");
        dataoph.setText("Empty");
        
        
    }//GEN-LAST:event_resetActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        // TODO add your handling code here:
                String msg = account.getText();
                dispose();
                home info = new home(msg);
                info.setVisible(true);
    }//GEN-LAST:event_cancelActionPerformed

    private void previewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_previewActionPerformed
        // TODO add your handling code here:
        SimpleDateFormat sdf = new SimpleDateFormat("MMM dd, yyyy");
        String date = sdf.format(jCalendar1.getDate());
        String user = account.getText();
        int test = 0;
        String power;
        try{
            conn = DriverManager.getConnection("jdbc:derby://localhost:1527/bactong","bactong","bactong");
            st = conn.createStatement();
            rs = st.executeQuery("SELECT * FROM BACTONG.DATAS"+user+" WHERE CALENDAR = '"+date+"' AND USERNAME = '"+user+"'");
            while(rs.next()){
                power = rs.getString(3);
                if (power.equals("1.0")){        
                sleep.setSelected(true);
                }
                else if (power.equals("2.0")){
                shutdown.setSelected(true);
                }
                else {
                    on.setSelected(true);
                }
                datapc.setText(rs.getString(4));
                datacd.setText(rs.getString(5));
                dataoph.setText(rs.getString(6));
                test = 1;
                    break;
                }
            }
            catch (Exception ex){
                    Logger.getLogger(login.class.getName()).log(Level.SEVERE,null,ex);
                    final JPanel panel = new JPanel();
                    JOptionPane.showMessageDialog(panel,"No Data to be Previewed!!","Database Notice", JOptionPane.ERROR_MESSAGE);
                    }
        if (test == 0){
            final JPanel panel = new JPanel();
                    JOptionPane.showMessageDialog(panel,"No Data to be Previewed!!","Database Notice", JOptionPane.ERROR_MESSAGE);
                    datapc.setText("Empty");
                    datacd.setText("Empty");
                    dataoph.setText("Empty");
        }
    }//GEN-LAST:event_previewActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        // TODO add your handling code here:
        SimpleDateFormat sdf = new SimpleDateFormat("MMM dd, yyyy");
        String date = sdf.format(jCalendar1.getDate());
        int pcvalue = (int) pcn.getValue();
        int cdvalue = (int) cdn.getValue();
        int open = (int) oph.getValue();
        int power, pric = 0, valid = 0, comp = 0, next = 0;
        if (sleep.isSelected()){
            power = 1;
        }
        else if (shutdown.isSelected()){
            power = 2;
        }
        else {
            power = 3;
        }
        String user = account.getText();
        try{
                conn = DriverManager.getConnection("jdbc:derby://localhost:1527/bactong","bactong","bactong");
                st = conn.createStatement();
        rs = st.executeQuery("SELECT * FROM BACTONG.SETUP WHERE USERNAME = '"+user+"'");
            while(rs.next()){
                comp = rs.getInt(2);
                pric = rs.getInt(3);
                    break;
                }
            }
            catch (Exception ex){
                Logger.getLogger(login.class.getName()).log(Level.SEVERE,null,ex);
                final JPanel panel = new JPanel();
                JOptionPane.showMessageDialog(panel,"Database Table\nAlready have data!!\nRemove first or Update instead!!","Database Notice", JOptionPane.ERROR_MESSAGE);
            }
        valid = (cdvalue / pric)/pcvalue;
        if (valid <= open && open <= 24 && pcvalue <= comp){
            next = 1;
        }
        if (cdvalue >= 0 && pcvalue >= 0 && next == 1){
            try{
                conn = DriverManager.getConnection("jdbc:derby://localhost:1527/bactong","bactong","bactong");
                st = conn.createStatement();
                st.executeUpdate("INSERT INTO BACTONG.DATAS"+user+" (CALENDAR, USERNAME, SWITCH, NUMBERUSED, TOTALHOURS, OPENHOURS) VALUES ('"+date+"', '"+user+"',"+power+","+pcvalue+","+cdvalue+","+open+")");
                final JPanel panel = new JPanel();
                JOptionPane.showMessageDialog(panel,"Data Registered","Database Notice", JOptionPane.INFORMATION_MESSAGE);
            }
            catch (Exception ex){
                Logger.getLogger(login.class.getName()).log(Level.SEVERE,null,ex);
                final JPanel panel = new JPanel();
                JOptionPane.showMessageDialog(panel,"Database Table\nAlready have data!!\nRemove first or Update instead!!","Database Notice", JOptionPane.ERROR_MESSAGE);
            }
        }
        else{
            final JPanel panel = new JPanel();
            JOptionPane.showMessageDialog(panel,"Invalid Data Input!!","Database Notice", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_addActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        // TODO add your handling code here:
        SimpleDateFormat sdf = new SimpleDateFormat("MMM dd, yyyy");
        String date = sdf.format(jCalendar1.getDate());
        int pcvalue = (int) pcn.getValue();
        int cdvalue = (int) cdn.getValue();
        int open = (int) oph.getValue();
        int power, pric = 0, valid = 0, comp = 0, next = 0;
        if (sleep.isSelected()){
            power = 1;
        }
        else if (shutdown.isSelected()){
            power = 2;
        }
        else {
            power = 3;
        }
        String user = account.getText();try{
                conn = DriverManager.getConnection("jdbc:derby://localhost:1527/bactong","bactong","bactong");
                st = conn.createStatement();
        rs = st.executeQuery("SELECT * FROM BACTONG.SETUP WHERE USERNAME = '"+user+"'");
            while(rs.next()){
                comp = rs.getInt(2);
                pric = rs.getInt(3);
                    break;
                }
            }
            catch (Exception ex){
                Logger.getLogger(login.class.getName()).log(Level.SEVERE,null,ex);
                final JPanel panel = new JPanel();
                JOptionPane.showMessageDialog(panel,"Database Table\nAlready have data!!\nRemove first or Update instead!!","Database Notice", JOptionPane.ERROR_MESSAGE);
            }
        valid = (cdvalue / pric)/pcvalue;
        if (valid <= open && open <= 24 && pcvalue <= comp){
            next = 1;
        }
        if (cdvalue >= 0 && pcvalue >= 0 && next == 1){
            try{
                conn = DriverManager.getConnection("jdbc:derby://localhost:1527/bactong","bactong","bactong");
                st = conn.createStatement();
                st.executeUpdate("UPDATE BACTONG.DATAS"+user+" SET SWITCH = "+power+", NUMBERUSED = "+pcvalue+", TOTALHOURS = "+cdvalue+" , OPENHOURS = "+open+" WHERE CALENDAR = '"+date+"' AND USERNAME = '"+user+"'");
                final JPanel panel = new JPanel();
                JOptionPane.showMessageDialog(panel,"Database Table Updated","Database Notice", JOptionPane.INFORMATION_MESSAGE);
            }
            catch (Exception ex){
                Logger.getLogger(login.class.getName()).log(Level.SEVERE,null,ex);
                final JPanel panel = new JPanel();
                JOptionPane.showMessageDialog(panel,"No Database to be Updated!!","Database Notice", JOptionPane.ERROR_MESSAGE);
            }
        }
        else{
            final JPanel panel = new JPanel();
            JOptionPane.showMessageDialog(panel,"Invalid Data Input!!","Database Notice", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_updateActionPerformed

    private void removeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeActionPerformed
        // TODO add your handling code here:
        SimpleDateFormat sdf = new SimpleDateFormat("MMM dd, yyyy");
        String date = sdf.format(jCalendar1.getDate());
        String user = account.getText();
            try{
                conn = DriverManager.getConnection("jdbc:derby://localhost:1527/bactong","bactong","bactong");
                st = conn.createStatement();
                st.executeUpdate("DELETE FROM BACTONG.DATAS"+user+" WHERE CALENDAR = '"+date+"' AND USERNAME = '"+user+"'");
                final JPanel panel = new JPanel();
                JOptionPane.showMessageDialog(panel,"Database Table Removed","Database Notice", JOptionPane.INFORMATION_MESSAGE);

            }
            catch (Exception ex){
                Logger.getLogger(login.class.getName()).log(Level.SEVERE,null,ex);
                final JPanel panel = new JPanel();
                JOptionPane.showMessageDialog(panel,"No Database Table\nTo be Removed","Registration System", JOptionPane.ERROR_MESSAGE);
            }
    }//GEN-LAST:event_removeActionPerformed

    private void onActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onActionPerformed

    }//GEN-LAST:event_onActionPerformed

    private void sleepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sleepActionPerformed
  // TODO add your handling code here:
    }//GEN-LAST:event_sleepActionPerformed

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
            java.util.logging.Logger.getLogger(Insertdata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Insertdata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Insertdata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Insertdata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Insertdata().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel account;
    private javax.swing.JButton add;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton cancel;
    private javax.swing.JSpinner cdn;
    private javax.swing.JLabel datacd;
    private javax.swing.JLabel dataoph;
    private javax.swing.JLabel datapc;
    private com.toedter.calendar.JCalendar jCalendar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton on;
    private javax.swing.JSpinner oph;
    private javax.swing.JSpinner pcn;
    private javax.swing.JButton preview;
    private javax.swing.JButton remove;
    private javax.swing.JButton reset;
    private javax.swing.JRadioButton shutdown;
    private javax.swing.JRadioButton sleep;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
