/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package administrador;

import root.*;
import clases.*;

import java.awt.Color;
import java.awt.Toolkit;
import java.util.LinkedList;
import javax.swing.JOptionPane;


/**
 *
 * @author vanes
 */
public class frm_membresia extends javax.swing.JFrame {

    
    public static LinkedList contenedorMembresia = new LinkedList();
    public int buscar;
    
    public frm_membresia() {
        initComponents();
        this.setLocationRelativeTo(null);
        //tiempo();
        mostrarTiempo();
        
         txt_hora.setEditable(false);
        txt_fecha.setEditable(false);
        
    }
    
    tiempo tm=new tiempo();
    
    public void mostrarTiempo(){
         txt_hora.setText(tm.horaFormateada);
         txt_fecha.setText(tm.fechaFormateada);
    }
    
    //Metodo para validar datos
    public void validar(){
        
        //Placa
        if(txt_placa.getText().isEmpty()){
            txt_placa.setBackground(new Color(251, 197, 197));
            lb_obP1.setText("*Obligatorio");
        }else{
              txt_placa.setBackground(new Color(224, 251, 197));
               lb_obP1.setText("");
        }
        
        //Propiwtario
        if(txt_propietario.getText().isEmpty()){
            txt_propietario.setBackground(new Color(251, 197, 197));
        
        }else{
              txt_propietario.setBackground(new Color(224, 251, 197));
        }
        //Modelo
        if(txt_modelo.getText().isEmpty()){
            txt_modelo.setBackground(new Color(251, 197, 197));
        }else{
              txt_modelo.setBackground(new Color(224, 251, 197));
        }
        //Color
         if(txt_color.getText().isEmpty()){
            txt_color.setBackground(new Color(251, 197, 197));
        }else{
              txt_color.setBackground(new Color(224, 251, 197));
        }
        //Lugar
         if(txt_lugar.getText().isEmpty()){
            txt_lugar.setBackground(new Color(251, 197, 197));
           
        }else{
              txt_lugar.setBackground(new Color(224, 251, 197));
        }

       if(txt_placa.getText().isEmpty() ||
            txt_propietario.getText().isEmpty()    ||
            txt_lugar.getText().isEmpty()  ){
           
             btn_guardar.setEnabled(false);
         }else{
             btn_guardar.setEnabled(true);
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
        btn_menu = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txt_placa = new javax.swing.JTextField();
        txt_propietario = new javax.swing.JTextField();
        txt_hora = new javax.swing.JTextField();
        txt_fecha = new javax.swing.JTextField();
        txt_modelo = new javax.swing.JTextField();
        cb_tipo = new javax.swing.JComboBox<>();
        cb_marca = new javax.swing.JComboBox<>();
        txt_color = new javax.swing.JTextField();
        btn_guardar = new javax.swing.JButton();
        txt_lugar = new javax.swing.JTextField();
        btn_limpiar = new javax.swing.JButton();
        lb_obP1 = new javax.swing.JLabel();
        fondo_label = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_menu.setText("Menu");
        btn_menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_menuActionPerformed(evt);
            }
        });
        jPanel1.add(btn_menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 80, 30));

        jLabel1.setFont(new java.awt.Font("Lucida Calligraphy", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 204, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/IconMenb.png"))); // NOI18N
        jLabel1.setText("Membresia");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, 300, -1));

        jLabel2.setBackground(new java.awt.Color(204, 204, 255));
        jLabel2.setFont(new java.awt.Font("Palatino Linotype", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Placa");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 90, 30));

        jLabel3.setBackground(new java.awt.Color(204, 204, 255));
        jLabel3.setFont(new java.awt.Font("Palatino Linotype", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Propietario");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 100, -1));

        jLabel4.setBackground(new java.awt.Color(204, 204, 255));
        jLabel4.setFont(new java.awt.Font("Palatino Linotype", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Hora");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 50, -1));

        jLabel5.setBackground(new java.awt.Color(204, 204, 255));
        jLabel5.setFont(new java.awt.Font("Palatino Linotype", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Fecha");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 50, -1));

        jLabel6.setBackground(new java.awt.Color(204, 204, 255));
        jLabel6.setFont(new java.awt.Font("Palatino Linotype", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Tipo");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, 50, -1));

        jLabel7.setBackground(new java.awt.Color(204, 204, 255));
        jLabel7.setFont(new java.awt.Font("Palatino Linotype", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("Marca");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 210, 60, 20));

        jLabel8.setBackground(new java.awt.Color(204, 204, 255));
        jLabel8.setFont(new java.awt.Font("Palatino Linotype", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setText("Modelo");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 260, 70, -1));

        jLabel9.setBackground(new java.awt.Color(204, 204, 255));
        jLabel9.setFont(new java.awt.Font("Palatino Linotype", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setText("Color");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 310, 50, -1));

        jLabel10.setBackground(new java.awt.Color(204, 204, 255));
        jLabel10.setFont(new java.awt.Font("Palatino Linotype", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setText("Lugar");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 360, 60, -1));

        txt_placa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_placaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_placaKeyTyped(evt);
            }
        });
        jPanel1.add(txt_placa, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 200, 30));

        txt_propietario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_propietarioKeyReleased(evt);
            }
        });
        jPanel1.add(txt_propietario, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 200, 30));
        jPanel1.add(txt_hora, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, 200, 30));
        jPanel1.add(txt_fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, 200, 30));

        txt_modelo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_modeloKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_modeloKeyTyped(evt);
            }
        });
        jPanel1.add(txt_modelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 250, 200, 30));

        cb_tipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sedan", "Pick up", "Moto" }));
        cb_tipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_tipoActionPerformed(evt);
            }
        });
        jPanel1.add(cb_tipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 350, 200, 30));

        cb_marca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Audi", "BMW", "Cadilac", "Chevrolet", "Chrysler", "Dodge", "Ferrari", "Fiat", "Ford", "Honda", "Hyundai", "Jeep", "Kia", "Mazda", "Mercedes Benz", "Nissan", "Ram", "Renault", "Susuki", "Tesla", "Toyota", "Volkswagen", "Volvo" }));
        cb_marca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cb_marcaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cb_marcaKeyTyped(evt);
            }
        });
        jPanel1.add(cb_marca, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 200, 200, 30));

        txt_color.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_colorKeyReleased(evt);
            }
        });
        jPanel1.add(txt_color, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 300, 200, 30));

        btn_guardar.setText("Guardar");
        btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 460, 190, 30));

        txt_lugar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_lugarKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_lugarKeyTyped(evt);
            }
        });
        jPanel1.add(txt_lugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 350, 70, 30));

        btn_limpiar.setText("Limpiar");
        btn_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limpiarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 460, 190, 30));

        lb_obP1.setFont(new java.awt.Font("MV Boli", 0, 16)); // NOI18N
        lb_obP1.setForeground(new java.awt.Color(204, 0, 0));
        jPanel1.add(lb_obP1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 150, 100, 30));

        fondo_label.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        fondo_label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/flogins.jpg"))); // NOI18N
        jPanel1.add(fondo_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 570));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed
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

    
        JOptionPane.showMessageDialog(null, "Auto registrado");
        
        JOptionPane.showMessageDialog(null, "TICKET"
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
        contenedorMembresia.add(auto);
        
        //Se limpian los campos
        txt_placa.setText("");
        txt_propietario.setText("");
        
        txt_hora.setText(tm.horaFormateada);
        txt_fecha.setText(tm.fechaFormateada);
        
        txt_modelo.setText("");
        txt_color.setText("");
        txt_lugar.setText("");
    

    }//GEN-LAST:event_btn_guardarActionPerformed

    private void txt_placaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_placaKeyTyped
 
         //Limita la cantidad de carracteres (QWE-789-Q)
        if(txt_placa.getText().length()>=9){
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
        
        //Busca los valores de los demas campos
        int press=evt.getKeyChar();
        if(press==10){
            String idEncontrado=txt_placa.getText().trim();
            Auto a;
            for(int i = 0; i < contenedorMembresia.size(); i++){
                a=(Auto)contenedorMembresia.get(i);
                if(idEncontrado.equalsIgnoreCase(a.getPlaca())){
                    txt_propietario.setText(a.getPropietario());
                    txt_hora.setText(a.getHora());
                    txt_fecha.setText(a.getFecha());
                    cb_tipo.setSelectedItem(a.getTipo());
                    cb_marca.setSelectedItem(a.getMarca());
                    txt_modelo.setText(Integer.toString(a.getModelo()));
                    txt_color.setText(a.getColor());
                    txt_lugar.setText(Integer.toString(a.getLugar()));
                    
                    buscar=i;
                    break;
                    
                }//Fin if
                    
            }//fin for
            JOptionPane.showMessageDialog(null, "Placas de auto no encontradas");
        }//Fin if
    }//GEN-LAST:event_txt_placaKeyTyped

    private void btn_menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_menuActionPerformed
        // TODO add your handling code here:
        new panel_admin().setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_menuActionPerformed

    private void cb_tipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_tipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_tipoActionPerformed

    private void btn_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpiarActionPerformed
        // TODO add your handling code here:
        
       lb_obP1.setText("");
        txt_placa.setText("");
        txt_propietario.setText("");
        
        txt_hora.setText(tm.horaFormateada);
        txt_fecha.setText(tm.fechaFormateada);
        
        txt_modelo.setText("");
        txt_color.setText("");
        txt_lugar.setText("");
    }//GEN-LAST:event_btn_limpiarActionPerformed

    private void txt_placaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_placaKeyReleased
        // TODO add your handling code here:
         validar();
    }//GEN-LAST:event_txt_placaKeyReleased

    private void cb_marcaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cb_marcaKeyReleased
        // TODO add your handling code here:
       
    }//GEN-LAST:event_cb_marcaKeyReleased

    private void cb_marcaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cb_marcaKeyTyped
        // TODO add your handling code here:
   
    }//GEN-LAST:event_cb_marcaKeyTyped

    private void txt_propietarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_propietarioKeyReleased
        // TODO add your handling code here:
        validar();
    }//GEN-LAST:event_txt_propietarioKeyReleased

    private void txt_modeloKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_modeloKeyReleased
        // TODO add your handling code here:
        validar();
    }//GEN-LAST:event_txt_modeloKeyReleased

    private void txt_colorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_colorKeyReleased
        // TODO add your handling code here:
        validar();
    }//GEN-LAST:event_txt_colorKeyReleased

    private void txt_lugarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_lugarKeyReleased
        // TODO add your handling code here:
        validar();
    }//GEN-LAST:event_txt_lugarKeyReleased

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
            java.util.logging.Logger.getLogger(frm_membresia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_membresia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_membresia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_membresia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_membresia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_guardar;
    private javax.swing.JButton btn_limpiar;
    private javax.swing.JButton btn_menu;
    private javax.swing.JComboBox<String> cb_marca;
    private javax.swing.JComboBox<String> cb_tipo;
    private javax.swing.JLabel fondo_label;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lb_obP1;
    private javax.swing.JTextField txt_color;
    private javax.swing.JTextField txt_fecha;
    private javax.swing.JTextField txt_hora;
    private javax.swing.JTextField txt_lugar;
    private javax.swing.JTextField txt_modelo;
    private javax.swing.JTextField txt_placa;
    private javax.swing.JTextField txt_propietario;
    // End of variables declaration//GEN-END:variables
}
