/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package regis;

import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;

/**
 *
 * @author PEDRO
 */
public class login extends javax.swing.JFrame {

    
    public login() {
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

        btn_iniciar8 = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        btn_registrar8 = new javax.swing.JButton();
        txt_usu8 = new javax.swing.JTextField();
        txt_contra8 = new javax.swing.JPasswordField();
        btn_iniciar9 = new javax.swing.JButton();

        btn_iniciar8.setText("INICIAR");
        btn_iniciar8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_iniciar8ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel18.setFont(new java.awt.Font("Palatino Linotype", 0, 18)); // NOI18N
        jLabel18.setText("BIENVENIDOS");

        btn_registrar8.setText("REGISTRAR");
        btn_registrar8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registrar8ActionPerformed(evt);
            }
        });

        txt_usu8.setBorder(javax.swing.BorderFactory.createTitledBorder("Usuario"));

        txt_contra8.setBorder(javax.swing.BorderFactory.createTitledBorder("Contraseña"));
        txt_contra8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_contra8ActionPerformed(evt);
            }
        });

        btn_iniciar9.setText("INICIAR");
        btn_iniciar9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_iniciar9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jLabel18))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(btn_registrar8))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(btn_iniciar9))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_contra8, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_usu8, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(84, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18)
                .addGap(18, 18, 18)
                .addComponent(txt_usu8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(txt_contra8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btn_iniciar9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(btn_registrar8)
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_registrar8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrar8ActionPerformed
        dispose();
        new rol().setVisible(true);
    }//GEN-LAST:event_btn_registrar8ActionPerformed

    private void txt_contra8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_contra8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_contra8ActionPerformed

    private void btn_iniciar8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_iniciar8ActionPerformed

        //creacion de variables que guardan usuario y contraseña
        /*String User=txt_usu.getText();
        String Contra=txt_contra.getText();
        //generacion de consulta cuando el usuario y contarseña son iguales a los que se escribieron
        String SQL="select id_usuario from usuario where usuario='"+User+"'and contraseña='"+Contra+"'    ";

        try{

            Statement st=cn.createStatement();
            ResultSet rs=st.executeQuery(SQL);

            //rs.next verifica si se encontro la  consulta osea si se econtro un agente que tenga ese usuario y contraseña
            if(rs.next()){
                //y si es verdad muestra la ventana datos donde estan los datos del usuario y cierra la actual
                datos obj=new datos (rs.getString(1));
                dispose();
                obj.setVisible(true);
            }else{
                //y si no es muestra mensaje
                txt_usu.setText("");
                txt_contra.setText("");
                JOptionPane.showMessageDialog(this, "USUARIO NO REGISTRADO");
            }

        }catch(SQLException e){

            System.out.print("ERROR AL INGERESAR EL USUARIO "+e);
        }*/

    }//GEN-LAST:event_btn_iniciar8ActionPerformed

    private void btn_iniciar9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_iniciar9ActionPerformed

        //creacion de variables que guardan usuario y contraseña
        /*String User=txt_usu.getText();
        String Contra=txt_contra.getText();
        //generacion de consulta cuando el usuario y contarseña son iguales a los que se escribieron
        String SQL="select id_usuario from usuario where usuario='"+User+"'and contraseña='"+Contra+"'    ";

        try{

            Statement st=cn.createStatement();
            ResultSet rs=st.executeQuery(SQL);

            //rs.next verifica si se encontro la  consulta osea si se econtro un agente que tenga ese usuario y contraseña
            if(rs.next()){
                //y si es verdad muestra la ventana datos donde estan los datos del usuario y cierra la actual
                datos obj=new datos (rs.getString(1));
                dispose();
                obj.setVisible(true);
            }else{
                //y si no es muestra mensaje
                txt_usu.setText("");
                txt_contra.setText("");
                JOptionPane.showMessageDialog(this, "USUARIO NO REGISTRADO");
            }

        }catch(SQLException e){

            System.out.print("ERROR AL INGERESAR EL USUARIO "+e);
        }*/

    }//GEN-LAST:event_btn_iniciar9ActionPerformed

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
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_iniciar;
    private javax.swing.JButton btn_iniciar1;
    private javax.swing.JButton btn_iniciar2;
    private javax.swing.JButton btn_iniciar3;
    private javax.swing.JButton btn_iniciar4;
    private javax.swing.JButton btn_iniciar5;
    private javax.swing.JButton btn_iniciar6;
    private javax.swing.JButton btn_iniciar7;
    private javax.swing.JButton btn_iniciar8;
    private javax.swing.JButton btn_iniciar9;
    private javax.swing.JButton btn_registrar;
    private javax.swing.JButton btn_registrar1;
    private javax.swing.JButton btn_registrar2;
    private javax.swing.JButton btn_registrar3;
    private javax.swing.JButton btn_registrar4;
    private javax.swing.JButton btn_registrar5;
    private javax.swing.JButton btn_registrar6;
    private javax.swing.JButton btn_registrar7;
    private javax.swing.JButton btn_registrar8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPasswordField txt_contra;
    private javax.swing.JPasswordField txt_contra1;
    private javax.swing.JPasswordField txt_contra2;
    private javax.swing.JPasswordField txt_contra3;
    private javax.swing.JPasswordField txt_contra4;
    private javax.swing.JPasswordField txt_contra5;
    private javax.swing.JPasswordField txt_contra6;
    private javax.swing.JPasswordField txt_contra7;
    private javax.swing.JPasswordField txt_contra8;
    private javax.swing.JTextField txt_usu;
    private javax.swing.JTextField txt_usu1;
    private javax.swing.JTextField txt_usu2;
    private javax.swing.JTextField txt_usu3;
    private javax.swing.JTextField txt_usu4;
    private javax.swing.JTextField txt_usu5;
    private javax.swing.JTextField txt_usu6;
    private javax.swing.JTextField txt_usu7;
    private javax.swing.JTextField txt_usu8;
    // End of variables declaration//GEN-END:variables
}
