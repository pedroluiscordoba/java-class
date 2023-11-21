/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;

/**
 *
 * @author Peter Louis
 */
public class Nuevafactura extends javax.swing.JFrame {

    /**
     * Creates new form Nuevafactuta
     */
    public Nuevafactura() {
        initComponents();
    }

    public JButton getjButoGuardar() {
        return jButoGuardar;
    }

    public void setjButoGuardar(JButton jButoGuardar) {
        this.jButoGuardar = jButoGuardar;
    }

    public JComboBox<String> getjCombtipodepago() {
        return jCombtipodepago;
    }

    public void setjCombtipodepago(JComboBox<String> jCombtipodepago) {
        this.jCombtipodepago = jCombtipodepago;
    }

    public JTextField getjTexdescuento() {
        return jTexdescuento;
    }

    public void setjTexdescuento(JTextField jTexdescuento) {
        this.jTexdescuento = jTexdescuento;
    }

    public JTextField getjTexidenproveedor() {
        return jTexidenproveedor;
    }

    public void setjTexidenproveedor(JTextField jTexidenproveedor) {
        this.jTexidenproveedor = jTexidenproveedor;
    }

    public JTextField getjTexidenusuario() {
        return jTexidenusuario;
    }

    public void setjTexidenusuario(JTextField jTexidenusuario) {
        this.jTexidenusuario = jTexidenusuario;
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
        Lanuevafactura = new javax.swing.JLabel();
        jLatipodepago = new javax.swing.JLabel();
        jCombtipodepago = new javax.swing.JComboBox<>();
        jLaIidenproveedor = new javax.swing.JLabel();
        jTexidenproveedor = new javax.swing.JTextField();
        jLaidenusuario = new javax.swing.JLabel();
        jTexidenusuario = new javax.swing.JTextField();
        jLadescuento = new javax.swing.JLabel();
        jTexdescuento = new javax.swing.JTextField();
        jButoGuardar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 51, 0));

        Lanuevafactura.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        Lanuevafactura.setText("Nueva Factura");

        jLatipodepago.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLatipodepago.setText("Tipo De Pago");

        jCombtipodepago.setBackground(new java.awt.Color(0, 255, 51));
        jCombtipodepago.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jCombtipodepago.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Tarjeta de Credito", "Efectivo", " ", " " }));

        jLaIidenproveedor.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLaIidenproveedor.setText("Identificacion Proveedor");

        jLaidenusuario.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLaidenusuario.setText("Identificacion Usuario");

        jLadescuento.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLadescuento.setText("Descuento");

        jButoGuardar.setBackground(new java.awt.Color(0, 255, 51));
        jButoGuardar.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jButoGuardar.setText("Guardar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(Lanuevafactura, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLatipodepago, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                        .addComponent(jCombtipodepago, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLaIidenproveedor)
                            .addComponent(jLaidenusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLadescuento, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTexidenproveedor)
                            .addComponent(jTexidenusuario, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                            .addComponent(jTexdescuento, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButoGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(58, 58, 58))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(Lanuevafactura)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLatipodepago)
                    .addComponent(jCombtipodepago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLaIidenproveedor)
                    .addComponent(jTexidenproveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLaidenusuario)
                    .addComponent(jTexidenusuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLadescuento)
                    .addComponent(jTexdescuento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addComponent(jButoGuardar)
                .addContainerGap(86, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Lanuevafactura;
    private javax.swing.JButton jButoGuardar;
    private javax.swing.JComboBox<String> jCombtipodepago;
    private javax.swing.JLabel jLaIidenproveedor;
    private javax.swing.JLabel jLadescuento;
    private javax.swing.JLabel jLaidenusuario;
    private javax.swing.JLabel jLatipodepago;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTexdescuento;
    private javax.swing.JTextField jTexidenproveedor;
    private javax.swing.JTextField jTexidenusuario;
    // End of variables declaration//GEN-END:variables
}
