/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package administrador;

import root.*;
import clases.*;

import java.awt.Color;
import java.awt.Toolkit;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import static root.frm_membresia.contenedorMembresia;
/**
 *
 * @author vanes
 */
public class frm_renovacion extends javax.swing.JFrame {

   
    public int buscar;
    
    public frm_renovacion() {
        initComponents();
        mostrarTiempo();
        this.setLocationRelativeTo(null);
        txt_hora.setEditable(false);
        txt_fecha.setEditable(false);
    }
    
    tiempo tm=new tiempo();
    public void mostrarTiempo(){
         txt_hora.setText(tm.horaFormateada);
         txt_fecha.setText(tm.fechaFormateada);
    }
    
    public void validar(){
        
         //Placa
         if(txt_placa.getText().isEmpty()){
            txt_placa.setBackground(new Color(251, 197, 197));
            lb_IngPlaca.setText("*Ingrese la placa");
           
        }else{
              txt_placa.setBackground(new Color(224, 251, 197));
              lb_IngPlaca.setText("");
        }
        
        
         if(txt_placa.getText().isEmpty() ){
           
             btn_gurdar.setEnabled(false);
         }else{
             btn_gurdar.setEnabled(true);
         }
        
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
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txt_placa = new javax.swing.JTextField();
        txt_propietario = new javax.swing.JTextField();
        txt_hora = new javax.swing.JTextField();
        txt_fecha = new javax.swing.JTextField();
        cb_tipo = new javax.swing.JComboBox<>();
        txt_modelo = new javax.swing.JTextField();
        txt_color = new javax.swing.JTextField();
        cb_marca = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btn_gurdar = new javax.swing.JButton();
        txt_lugar = new javax.swing.JTextField();
        lb_IngPlaca = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 153, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("Menu");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 31, -1, -1));

        jLabel1.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel1.setText("Placa");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, -1, -1));

        jLabel2.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel2.setText("Propietario");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, -1, -1));

        jLabel3.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel3.setText("Hora");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 310, -1, -1));

        jLabel4.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel4.setText("Fecha");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 370, -1, -1));

        jLabel5.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel5.setText("Tipo");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 430, -1, -1));

        jLabel6.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel6.setText("Marca");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 260, -1, -1));

        jLabel7.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel7.setText("Modelo");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 310, -1, -1));

        jLabel8.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel8.setText("Color");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 370, -1, -1));

        jLabel9.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel9.setText("Lugar");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 430, -1, -1));

        txt_placa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_placaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_placaKeyTyped(evt);
            }
        });
        jPanel1.add(txt_placa, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 189, 30));

        txt_propietario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_propietarioKeyReleased(evt);
            }
        });
        jPanel1.add(txt_propietario, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, 189, 30));
        jPanel1.add(txt_hora, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 300, 190, 30));
        jPanel1.add(txt_fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 360, 190, 30));

        cb_tipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sedan", "Pick up", "Moto" }));
        jPanel1.add(cb_tipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 420, 190, 30));

        txt_modelo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_modeloKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_modeloKeyTyped(evt);
            }
        });
        jPanel1.add(txt_modelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 300, 200, 30));

        txt_color.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_colorKeyReleased(evt);
            }
        });
        jPanel1.add(txt_color, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 360, 200, 30));

        cb_marca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Audi", "BMW", "Cadilac", "Chevrolet", "Chrysler", "Dodge", "Ferrari", "Fiat", "Ford", "Honda", "Hyundai", "Jeep", "Kia", "Mazda", "Mercedes Benz", "Nissan", "Ram", "Renault", "Susuki", "Tesla", "Toyota", "Volkswagen", "Volvo" }));
        jPanel1.add(cb_marca, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 250, 200, 30));

        jLabel10.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/IconRenov.png"))); // NOI18N
        jLabel10.setText("Renovacion (Membresias)");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, 350, -1));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 690, 20));

        btn_gurdar.setText("Guardar");
        btn_gurdar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_gurdar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_gurdarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_gurdar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 530, 150, 30));

        txt_lugar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_lugarKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_lugarKeyTyped(evt);
            }
        });
        jPanel1.add(txt_lugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 420, 80, 30));

        lb_IngPlaca.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        lb_IngPlaca.setForeground(new java.awt.Color(153, 0, 0));
        jPanel1.add(lb_IngPlaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 200, 140, 30));
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 600));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 813, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 599, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_gurdarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_gurdarActionPerformed
        // TODO add your handling code here:
         String placa=txt_placa.getText();
        String prop=txt_propietario.getText();
        String hora=txt_hora.getText();
        String fecha=txt_fecha.getText();
        String tipo=cb_tipo.getSelectedItem().toString();
        String marca=cb_marca.getSelectedItem().toString();
        int modelo=Integer.parseInt(txt_modelo.getText());
        String color=txt_color.getText();
        int lugar=Integer.parseInt(txt_lugar.getText());
        
        JOptionPane.showMessageDialog(null, "TICKET RENOVACION"
                + "\nPlaca"+txt_placa.getText()
                +"\nPropietario"+txt_propietario.getText()
                +"\nHora"+txt_hora.getText()
                +"\nFecha"+txt_fecha.getText()
                +"\nTipo"+cb_tipo.getSelectedItem().toString()
                +"\nMarca"+cb_marca.getSelectedItem().toString()
                +"\nModelo"+Integer.parseInt(txt_modelo.getText())
                +"\nColor"+txt_color.getText()
                +"\nLugar"+Integer.parseInt(txt_lugar.getText()));
        
        Auto auto=new Auto(placa, prop, hora, fecha, tipo, marca, modelo, color, lugar);
        contenedorMembresia.set(buscar, auto);
        
        txt_placa.setText("");
        txt_propietario.setText("");
        
        txt_hora.setText(tm.horaFormateada);
        txt_fecha.setText(tm.fechaFormateada);
        
        txt_modelo.setText("");
        txt_color.setText("");
    }//GEN-LAST:event_btn_gurdarActionPerformed

    private void txt_placaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_placaKeyTyped
 
        //Limita la cantidad de carracteres (QWE-789-Q)
        if(txt_placa.getText().length()>=9){
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
        
        //Busca los valores que estan registrados en la placa
         int press=evt.getKeyChar();
        if(press==10){
            String idEncontrado=txt_placa.getText().trim();
            Auto a;
            for(int i = 0; i < frm_membresia.contenedorMembresia.size(); i++){
                a=(Auto)frm_membresia.contenedorMembresia.get(i);
                if(idEncontrado.equalsIgnoreCase(a.getPlaca())){
                    txt_propietario.setText(a.getPropietario());
                    txt_hora.setText(a.getHora());
                    txt_fecha.setText(a.getFecha());
                    cb_tipo.setSelectedItem(a.getTipo());
                    cb_marca.setSelectedItem(a.getMarca());
                    txt_modelo.setText(Integer.toString(a.getModelo()));
                     txt_lugar.setText(Integer.toString(a.getLugar()));
                    txt_color.setText(a.getColor());
                    
                    buscar=i;
                    break;
                    
                }//Fin if
                    
            }//fin for
            JOptionPane.showMessageDialog(null, "Placas de auto no encontradas");
        }//Fin if
    }//GEN-LAST:event_txt_placaKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        new panel_admin().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txt_lugarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_lugarKeyTyped
        // TODO add your handling code here:
        char validar=evt.getKeyChar();
        
        if(Character.isLetter((validar))){
            getToolkit().beep();
            evt.consume();
            
            JOptionPane.showMessageDialog(rootPane, "Ingrese solo numeros");
        }
    }//GEN-LAST:event_txt_lugarKeyTyped

    private void txt_modeloKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_modeloKeyTyped
        // TODO add your handling code here:
        char validar=evt.getKeyChar();
        
        if(Character.isLetter((validar))){
            getToolkit().beep();
            evt.consume();
            
            JOptionPane.showMessageDialog(rootPane, "Ingrese solo numeros");
        }
    }//GEN-LAST:event_txt_modeloKeyTyped

    private void txt_placaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_placaKeyReleased
        // TODO add your handling code here:
        validar();
        
    }//GEN-LAST:event_txt_placaKeyReleased

    private void txt_propietarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_propietarioKeyReleased
        // TODO add your handling code here:
         
    }//GEN-LAST:event_txt_propietarioKeyReleased

    private void txt_modeloKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_modeloKeyReleased
        // TODO add your handling code here:
       
    }//GEN-LAST:event_txt_modeloKeyReleased

    private void txt_colorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_colorKeyReleased
        // TODO add your handling code here:
         
    }//GEN-LAST:event_txt_colorKeyReleased

    private void txt_lugarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_lugarKeyReleased
        // TODO add your handling code here:
       
    }//GEN-LAST:event_txt_lugarKeyReleased

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
            java.util.logging.Logger.getLogger(frm_renovacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_renovacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_renovacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_renovacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_renovacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_gurdar;
    private javax.swing.JComboBox<String> cb_marca;
    private javax.swing.JComboBox<String> cb_tipo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lb_IngPlaca;
    private javax.swing.JTextField txt_color;
    private javax.swing.JTextField txt_fecha;
    private javax.swing.JTextField txt_hora;
    private javax.swing.JTextField txt_lugar;
    private javax.swing.JTextField txt_modelo;
    private javax.swing.JTextField txt_placa;
    private javax.swing.JTextField txt_propietario;
    // End of variables declaration//GEN-END:variables
}
