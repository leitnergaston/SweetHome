/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista.inquilino;

import accesoADatos.*;
import entidades.*;
import java.time.LocalDate;
import java.time.ZoneId;
import javax.swing.JOptionPane;

public class CargaDeInquilino extends javax.swing.JInternalFrame {

    public CargaDeInquilino() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        checkEstado = new javax.swing.JCheckBox();
        campoId = new javax.swing.JTextField();
        campoCuit = new javax.swing.JTextField();
        campoApellido = new javax.swing.JTextField();
        campoLugarDeTrabajo = new javax.swing.JTextField();
        campoDniGarante = new javax.swing.JTextField();
        campoNombreGarante = new javax.swing.JTextField();
        botonGuardar = new javax.swing.JButton();
        BotonEliminar = new javax.swing.JButton();
        botonbuscar1 = new javax.swing.JButton();
        botonModificar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        campoNombre = new javax.swing.JTextField();

        setClosable(true);

        jLabel1.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        jLabel1.setText("Cargar datos");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Nombre");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("CUIT");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("Apellido");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setText("Lugar de Trabajo");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setText("Inquilino");

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel7.setText("Garante");

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setText("Nombre del Garante");

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel9.setText("DNI del Garante");

        checkEstado.setText("Estado");

        campoId.setEditable(false);

        campoNombreGarante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoNombreGaranteActionPerformed(evt);
            }
        });

        botonGuardar.setText("Guardar");
        botonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardarActionPerformed(evt);
            }
        });

        BotonEliminar.setText("Eliminar");

        botonbuscar1.setText("Buscar");
        botonbuscar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonbuscar1ActionPerformed(evt);
            }
        });

        botonModificar.setText("Modificar");
        botonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificarActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel10.setText("ID");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(campoNombreGarante, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(campoDniGarante, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(botonGuardar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BotonEliminar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botonModificar))
                            .addComponent(jLabel6)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(campoCuit, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(botonbuscar1)))))
                        .addGap(0, 32, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(151, 151, 151)
                                .addComponent(checkEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(campoId, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(campoNombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(campoApellido, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(campoLugarDeTrabajo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(121, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(21, 21, 21)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoCuit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(botonbuscar1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(campoId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(campoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(campoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(campoLugarDeTrabajo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(checkEstado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8))
                    .addComponent(campoNombreGarante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(campoDniGarante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonModificar)
                    .addComponent(BotonEliminar)
                    .addComponent(botonGuardar))
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campoNombreGaranteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoNombreGaranteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoNombreGaranteActionPerformed

    public static boolean Validar(String datos) {
        return datos.matches("[a-zA-Z]*");
    }

    private void campoDocumentoKeyTyped(java.awt.event.KeyEvent evt) {
        int key = evt.getKeyChar();//obtiene el caracter de la tecla presionada y devuelve el valor del caracter
        boolean numero = key >= 48 && key <= 57;//se compara con el codigo ASCII para saber si es un numero
        if (!numero) { // si no se presiona un numero
            evt.consume();//"destruye" o evita mostrar la letra ingresada
        }
    }

    private void botonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarActionPerformed
        try {
            int cuit = Integer.parseInt(campoCuit.getText());
            int id = Integer.parseInt(campoId.getText());
            int dnigarante = Integer.parseInt(campoDniGarante.getText());
            
            String apellido = campoApellido.getText();
            String nombre = campoNombre.getText();
            String lugartrabajo = campoLugarDeTrabajo.getText();
            String nombregarante = campoNombreGarante.getText();
            
            int limitador = 0;

            if (CargaDeInquilino.Validar(nombre)) {
                nombre = campoNombre.getText();
            } else { // caso contrario
                JOptionPane.showMessageDialog(this, "Solo letras en el campo nombre");
                campoNombre.setText("");
                limitador++;
            }
            if (CargaDeInquilino.Validar(apellido)) {
                apellido = campoApellido.getText(); //
            } else {
                JOptionPane.showMessageDialog(this, "Solo letras en el campo apellido");
                campoApellido.setText("");
                limitador++;
            }
            if (CargaDeInquilino.Validar(lugartrabajo)){
                lugartrabajo = campoLugarDeTrabajo.getText();
            }else{
                JOptionPane.showMessageDialog(this, "Solo letras en el campo Lugar De Trabajo");
                campoLugarDeTrabajo.setText("");
                limitador++;
            }
            if (CargaDeInquilino.Validar(nombregarante)){
                lugartrabajo = campoLugarDeTrabajo.getText();
            }else{
                JOptionPane.showMessageDialog(this, "Solo letras en el campo Nombre de Garate");
                campoNombreGarante.setText("");
                limitador++;
            }
            boolean estado;
            if (checkEstado.isSelected()) {//is selected detecta si el check esta marcado o no
                estado = true;
            } else {
                estado = false;
            }
            Inquilino inq = new Inquilino(nombre, apellido, cuit, lugartrabajo, dnigarante, nombregarante, estado);
            InquilinoData inqData = new InquilinoData();
            if (limitador == 0) { // si es 0 es porq los campos nombre y apellido son validos
                inqData.agregarInquilino(inq);
            }
        } catch (NumberFormatException e) {
            if (campoNombre.getText().isEmpty() || campoApellido.getText().isEmpty()
                    || campoCuit.getText().isEmpty() || campoNombreGarante.getText().isEmpty()
                    || campoNombreGarante.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "No debe dejar espacios vacios");
            } else {
                JOptionPane.showMessageDialog(this, "El Cuit y/O DNI del garante debe contener solo numeros");
            }
        }
    }//GEN-LAST:event_botonGuardarActionPerformed

    private void botonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarActionPerformed
        InquilinoData inqData = new InquilinoData();
        int cuit = Integer.parseInt(campoCuit.getText());
        int id = Integer.parseInt(campoId.getText());
        String apellido = campoApellido.getText();
        String nombre = campoNombre.getText();
        String lugartrabajo = campoLugarDeTrabajo.getText();
        String nombregarante = campoNombreGarante.getText();
        int dnigarante = Integer.parseInt(campoDniGarante.getText());
        boolean estado;
        if (checkEstado.isSelected()) {//is selected detecta si el check esta marcado o no
            estado = true;
        } else {
            estado = false;
        }
        Inquilino inq = new Inquilino(id, nombre, apellido, cuit, lugartrabajo, dnigarante, nombregarante, estado);
        inqData.modificarinquilino(inq);
    }//GEN-LAST:event_botonModificarActionPerformed

    private void botonbuscar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonbuscar1ActionPerformed
        InquilinoData inqData = new InquilinoData();
        Inquilino inq = new Inquilino();
        if (campoCuit.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Se requiere el Cuit para buscar");
        } else {
            long cuit = Integer.parseInt(campoCuit.getText());
            inq = inqData.buscarinquilinoCUIT(cuit);
            if (inq == null) {
                JOptionPane.showMessageDialog(this, "El inquilino no existe");
            } else {
                campoId.setText(Integer.toString(inq.getIdInquilino()));
                campoApellido.setText(inq.getApellido());
                campoNombre.setText(inq.getNombre());
                campoLugarDeTrabajo.setText(inq.getLugarDeTrabajo());
                checkEstado.setSelected(inq.isEstado());
                campoNombreGarante.setText(inq.getNombreGarante());
                campoDniGarante.setText(Integer.toString(inq.getDniGarante()));
            }
        }
    }//GEN-LAST:event_botonbuscar1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonEliminar;
    private javax.swing.JButton botonGuardar;
    private javax.swing.JButton botonModificar;
    private javax.swing.JButton botonbuscar1;
    private javax.swing.JTextField campoApellido;
    private javax.swing.JTextField campoCuit;
    private javax.swing.JTextField campoDniGarante;
    private javax.swing.JTextField campoId;
    private javax.swing.JTextField campoLugarDeTrabajo;
    private javax.swing.JTextField campoNombre;
    private javax.swing.JTextField campoNombreGarante;
    private javax.swing.JCheckBox checkEstado;
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
    // End of variables declaration//GEN-END:variables
}
