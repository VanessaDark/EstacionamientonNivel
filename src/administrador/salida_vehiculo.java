/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package administrador;

import root.*;
import javax.swing.table.DefaultTableModel;
import clases.Auto;
import clases.tiempo;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.Timer;
/**
 *
 * @author vanes
 */
public class salida_vehiculo extends javax.swing.JFrame {

    private DefaultTableModel modelo;
    int contador=0;
    
    public salida_vehiculo() {
        initComponents();
        this.setLocationRelativeTo(null);
        CargarInterfaz();
        CargarDatos();
        mostrarTiempo();
    }
    
     tiempo tm=new tiempo();
    
    public void mostrarTiempo(){
         txt_salida.setText(tm.horaFormateada);
       
    }
    
    public void CargarInterfaz(){
        String datos[][]={};
        String columna[]={"Placa","Hora","Fecha","Lugar"};
        modelo=new DefaultTableModel(datos,columna);
        tb_salida.setModel(modelo);
    }
    
    public void CargarDatos(){
        Auto a;
        for(int i=0; i<frm_horaFrac.contenedorHora.size(); i++){
            
            a=(Auto)frm_horaFrac.contenedorHora.get(i);
            modelo.insertRow(contador,new Object[]{});
         
            modelo.setValueAt(a.getPlaca(),contador, 0);
            modelo.setValueAt(a.getHora(),contador, 1);
            modelo.setValueAt(a.getFecha(),contador, 2);
            modelo.setValueAt(a.getLugar(),contador, 3);
            
            
            
          
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_salida = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txt_placa = new javax.swing.JTextField();
        txt_fecha = new javax.swing.JTextField();
        txt_lugar = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_menu.setText("Menu");
        btn_menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_menuActionPerformed(evt);
            }
        });
        jPanel1.add(btn_menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(txt_entrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 67, 130, 31));
        jPanel2.add(txt_salida, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 70, 130, 30));

        jLabel2.setText("Entrada");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, -1, -1));

        jLabel3.setText("Salida");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 30, -1, -1));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("HH:MMMM:SS");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, 100, 20));

        Tiempo.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        Tiempo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Tiempo.setText("El tiempo transcurrido es: \"horas\":\"minutos\":\"segundos\"\n");
        jPanel2.add(Tiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 490, 30));

        jLabel6.setText("$15 x hora");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, -1, -1));

        btn_calcular.setText("Calcular");
        btn_calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_calcularActionPerformed(evt);
            }
        });
        jPanel2.add(btn_calcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, 90, 30));

        btn_pagar.setText("Pagar");
        btn_pagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pagarActionPerformed(evt);
            }
        });
        jPanel2.add(btn_pagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 295, 90, 30));
        jPanel2.add(txt_costo, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 292, 70, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 520, 370));

        tb_salida.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tb_salida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_salidaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb_salida);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 210, -1, 160));

        jLabel1.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel1.setText("Placa");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 50, -1, -1));
        jPanel1.add(txt_placa, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 40, 170, 40));
        jPanel1.add(txt_fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 132, 110, 30));
        jPanel1.add(txt_lugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 130, 90, 30));

        jLabel5.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        jLabel5.setText("Fecha");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 100, -1, -1));

        jLabel7.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        jLabel7.setText("Lugar");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 100, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 523, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tb_salidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_salidaMouseClicked
        // TODO add your handling code here:
        int seleccionar = tb_salida.rowAtPoint(evt.getPoint());
      
        txt_placa.setText(String.valueOf(tb_salida.getValueAt(seleccionar, 0)));
        txt_entrada.setText(String.valueOf(tb_salida.getValueAt(seleccionar, 1)));
        txt_fecha.setText(String.valueOf(tb_salida.getValueAt(seleccionar, 2)));
        txt_lugar.setText(String.valueOf(tb_salida.getValueAt(seleccionar, 3)));
    }//GEN-LAST:event_tb_salidaMouseClicked

    private void btn_pagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pagarActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "TICKET"
                + "\nPlaca: "+txt_placa.getText()
                +"\nEntrada: "+txt_entrada.getText()
                +"\nSalida: "+txt_salida.getText()
                +"\nFecha"+txt_fecha.getText()
                +"\nLugar"+Integer.parseInt(txt_lugar.getText())
                +"\nTota: "+txt_costo.getText());
    }//GEN-LAST:event_btn_pagarActionPerformed

    private void btn_menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_menuActionPerformed
        // TODO add your handling code here:
        new panel_admin().setVisible(true);
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tb_salida;
    private javax.swing.JTextField txt_costo;
    private javax.swing.JTextField txt_entrada;
    private javax.swing.JTextField txt_fecha;
    private javax.swing.JTextField txt_lugar;
    private javax.swing.JTextField txt_placa;
    private javax.swing.JTextField txt_salida;
    // End of variables declaration//GEN-END:variables
}
