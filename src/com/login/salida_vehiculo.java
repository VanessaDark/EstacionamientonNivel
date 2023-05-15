/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.login;

import root.*;
import com.login.*;
import root.*;

import javax.swing.table.DefaultTableModel;
import clases.*;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JOptionPane;



/**
 *
 * @author vanes
 */
public class salida_vehiculo extends javax.swing.JFrame {

    private DefaultTableModel modelo;
    int contador=0;
    public int buscar;
    
    public salida_vehiculo() {
        initComponents();
        this.setLocationRelativeTo(null);
        mostrarTiempo();
        txt_entrada.setEditable(false);
        txt_costo.setEditable(false);
        txt_fecha.setEditable(false);
        txt_lugar.setEditable(false);
    }
    
     tiempo tm=new tiempo();
    
    public void mostrarTiempo(){
         txt_salida.setText(tm.horaFormateada);
       
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
           
             btn_pagar.setEnabled(false);
         }else{
             btn_pagar.setEnabled(true);
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
        jPanel2 = new javax.swing.JPanel();
        txt_entrada = new javax.swing.JTextField();
        txt_salida = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Tiempo = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btn_calcular = new javax.swing.JButton();
        btn_pagar = new javax.swing.JButton();
        txt_costo = new javax.swing.JTextField();
        txt_placa = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        txt_fecha = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txt_lugar = new javax.swing.JTextField();
        lb_IngPlaca = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_menu.setText("Menu");
        btn_menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_menuActionPerformed(evt);
            }
        });
        jPanel1.add(btn_menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 45, 80, 30));

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_entrada.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N
        txt_entrada.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(txt_entrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 140, 40));

        txt_salida.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 18)); // NOI18N
        txt_salida.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(txt_salida, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 160, 140, 40));

        jLabel2.setFont(new java.awt.Font("Segoe Script", 0, 14)); // NOI18N
        jLabel2.setText("Entrada");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe Script", 0, 14)); // NOI18N
        jLabel3.setText("Salida");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 110, -1, -1));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("HH:MMMM:SS");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, 100, 20));

        Tiempo.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        Tiempo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Tiempo.setText("El tiempo transcurrido es: \"horas\":\"minutos\":\"segundos\"\n");
        jPanel2.add(Tiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 490, 30));

        jLabel6.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        jLabel6.setText("$15 x hora");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, -1, -1));

        btn_calcular.setText("Calcular");
        btn_calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_calcularActionPerformed(evt);
            }
        });
        jPanel2.add(btn_calcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 310, 90, 30));

        btn_pagar.setText("Pagar");
        btn_pagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pagarActionPerformed(evt);
            }
        });
        jPanel2.add(btn_pagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 390, 90, 30));

        txt_costo.setFont(new java.awt.Font("Modern No. 20", 0, 18)); // NOI18N
        txt_costo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(txt_costo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 380, 80, 40));

        txt_placa.setFont(new java.awt.Font("Rockwell", 1, 20)); // NOI18N
        txt_placa.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_placa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_placaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_placaKeyTyped(evt);
            }
        });
        jPanel2.add(txt_placa, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, 170, 40));

        jLabel1.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel1.setText("Placa");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, 70, 30));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 740, 10));

        jLabel5.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        jLabel5.setText("Fecha");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 150, -1, -1));

        txt_fecha.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(txt_fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 190, 120, 30));

        jLabel7.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        jLabel7.setText("Lugar");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 250, -1, -1));

        txt_lugar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(txt_lugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 290, 90, 30));

        lb_IngPlaca.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        lb_IngPlaca.setForeground(new java.awt.Color(153, 0, 0));
        jPanel2.add(lb_IngPlaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 30, 160, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 790, 470));

        jLabel8.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/IconSalida.png"))); // NOI18N
        jLabel8.setText("Salida Vehiculo");
        jLabel8.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, 300, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 846, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 634, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_pagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pagarActionPerformed
        // TODO add your handling code here:
        frm_horaFrac.contenedorHora.remove(buscar);
        
       JOptionPane.showMessageDialog(null, "TICKET"
                +"\nPlaca: "+txt_placa.getText()
                +"\nEntrada: "+txt_entrada.getText()
                +"\nSalida: "+txt_salida.getText()
                +"\nFecha"+txt_fecha.getText()
                +"\nLugar"+Integer.parseInt(txt_lugar.getText())
                +"\nTota: "+txt_costo.getText());
       
        
        txt_placa.setText("");
        txt_entrada.setText("");
        txt_salida.setText(tm.horaFormateada);
        txt_fecha.setText(tm.fechaFormateada);
        txt_lugar.setText("");
        txt_costo.setText("");
       
        
        
        
    }//GEN-LAST:event_btn_pagarActionPerformed

    private void btn_menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_menuActionPerformed
        // TODO add your handling code here:
        new panel_usr().setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_menuActionPerformed

    private void btn_calcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_calcularActionPerformed
        // TODO add your handling code here:
        String entradaStr=this.txt_entrada.getText();
        String salidaStr= this.txt_salida.getText();
        
        
        // Parsear las cadenas de entrada a objetos de tiempo
        String[] entradaParts = entradaStr.split(":");
        int entradaHoras = Integer.parseInt(entradaParts[0]);
        int entradaMinutos = Integer.parseInt(entradaParts[1]);
        int entradaSegundos = Integer.parseInt(entradaParts[2]);
        
        String[] salidaParts = salidaStr.split(":");
        int salidaHoras = Integer.parseInt(salidaParts[0]);
        int salidaMinutos = Integer.parseInt(salidaParts[1]);
        int salidaSegundos = Integer.parseInt(salidaParts[2]);
        
        // Calcular la diferencia de tiempo
        int horas = salidaHoras - entradaHoras;
        int minutos = salidaMinutos - entradaMinutos;
        int segundos = salidaSegundos - entradaSegundos;
        
        // Ajustar los valores para que estén en el rango correcto
        if (segundos < 0) {
            segundos += 60;
            minutos--;
        }
        
        if (minutos < 0) {
            minutos += 60;
            horas--;
        }
        
        if (horas < 0) {
            horas += 24;
        }
        
         Tiempo.setText("El tiempo transcurrido es: " + horas + " horas, " + minutos + " minutos, " + segundos + " segundos.");
    
         
         double total=horas*15;
         txt_costo.setText("$ "+total);
    }//GEN-LAST:event_btn_calcularActionPerformed

    private void txt_placaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_placaKeyTyped

         //Limita la cantidad de carracteres (QWE-789-Q)
        if(txt_placa.getText().length()>=9){
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
        
         //Busca los demas valores
          int press=evt.getKeyChar();
        if(press==10){
            String idEncontrado=txt_placa.getText().trim();
            Auto a;
            for(int i = 0; i < frm_horaFrac.contenedorHora.size(); i++){
                a=(Auto)frm_horaFrac.contenedorHora.get(i);
                if(idEncontrado.equalsIgnoreCase(a.getPlaca())){
            
                    txt_entrada.setText(a.getHora());
                    txt_fecha.setText(a.getFecha());
                    txt_lugar.setText(Integer.toString(a.getLugar()));
                    
                    buscar=i;
                    break;
                    
                }//Fin if
                    
            }//fin for
            JOptionPane.showMessageDialog(null, "Placas de auto no encontradas");
        }//Fin if
        
    }//GEN-LAST:event_txt_placaKeyTyped

    private void txt_placaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_placaKeyReleased
        // TODO add your handling code here:
        validar();
    }//GEN-LAST:event_txt_placaKeyReleased

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
            java.util.logging.Logger.getLogger(salida_vehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(salida_vehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(salida_vehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(salida_vehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new salida_vehiculo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Tiempo;
    private javax.swing.JButton btn_calcular;
    private javax.swing.JButton btn_menu;
    private javax.swing.JButton btn_pagar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lb_IngPlaca;
    private javax.swing.JTextField txt_costo;
    private javax.swing.JTextField txt_entrada;
    private javax.swing.JTextField txt_fecha;
    private javax.swing.JTextField txt_lugar;
    private javax.swing.JTextField txt_placa;
    private javax.swing.JTextField txt_salida;
    // End of variables declaration//GEN-END:variables
}
