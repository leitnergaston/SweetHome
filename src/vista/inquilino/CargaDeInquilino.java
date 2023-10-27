/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista.inquilino;

import accesoADatos.*;
import entidades.*;
import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import vista.menuPrincipal.MenuPrincipal;

public class CargaDeInquilino extends javax.swing.JInternalFrame {

    private MenuPrincipal menuPrincipal;
    private int aviso = 0;
    private FondoPanel fondo = new FondoPanel();
    
    public CargaDeInquilino(MenuPrincipal menuPrincipal) {
        this.setContentPane(fondo);
        initComponents();
        this.menuPrincipal = menuPrincipal;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
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
        jButton1 = new javax.swing.JButton();
        botonNuevo = new javax.swing.JButton();

        setTitle("Datos Inquilino");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Nombre");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("CUIT");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("Apellido");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setText("Lugar de Trabajo");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(10, 110, 182));
        jLabel6.setText("Carga de inquilino");

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setText("Nombre del Garante");

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel9.setText("DNI del Garante");

        checkEstado.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        checkEstado.setText("Estado");

        campoId.setEditable(false);

        campoCuit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campoCuitKeyTyped(evt);
            }
        });

        campoApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campoApellidoKeyTyped(evt);
            }
        });

        campoDniGarante.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campoDniGaranteKeyTyped(evt);
            }
        });

        campoNombreGarante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoNombreGaranteActionPerformed(evt);
            }
        });
        campoNombreGarante.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campoNombreGaranteKeyTyped(evt);
            }
        });

        botonGuardar.setFont(new java.awt.Font("Swis721 Hv BT", 0, 12)); // NOI18N
        botonGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconGuardar.png"))); // NOI18N
        botonGuardar.setText("Guardar");
        botonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardarActionPerformed(evt);
            }
        });

        BotonEliminar.setFont(new java.awt.Font("Swis721 Hv BT", 0, 12)); // NOI18N
        BotonEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconEliminar.png"))); // NOI18N
        BotonEliminar.setText("Eliminar");
        BotonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEliminarActionPerformed(evt);
            }
        });

        botonbuscar1.setFont(new java.awt.Font("Swis721 Hv BT", 0, 12)); // NOI18N
        botonbuscar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconBuscar.png"))); // NOI18N
        botonbuscar1.setText("Buscar");
        botonbuscar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonbuscar1ActionPerformed(evt);
            }
        });

        botonModificar.setFont(new java.awt.Font("Swis721 Hv BT", 0, 12)); // NOI18N
        botonModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconModificar.png"))); // NOI18N
        botonModificar.setText("Modificar");
        botonModificar.setEnabled(false);
        botonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificarActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel10.setText("ID");

        campoNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campoNombreKeyTyped(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconSalir.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        botonNuevo.setFont(new java.awt.Font("Swis721 Hv BT", 0, 12)); // NOI18N
        botonNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconNuevo.png"))); // NOI18N
        botonNuevo.setText("Nuevo");
        botonNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonNuevoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(240, 240, 240)
                                .addComponent(botonbuscar1))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(33, 33, 33)
                                    .addComponent(campoLugarDeTrabajo, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel9)
                                    .addGap(43, 43, 43)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(checkEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(campoDniGarante, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(botonNuevo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botonGuardar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BotonEliminar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botonModificar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton1)))
                        .addGap(20, 40, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(campoNombreGarante, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(campoCuit, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGap(151, 151, 151)
                                    .addComponent(jLabel6))
                                .addComponent(campoId, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(campoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(campoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoNombreGarante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(campoDniGarante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(checkEstado)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(botonModificar)
                        .addComponent(BotonEliminar)
                        .addComponent(botonGuardar)
                        .addComponent(botonNuevo)))
                .addGap(51, 51, 51))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campoNombreGaranteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoNombreGaranteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoNombreGaranteActionPerformed

    public static boolean Validar(String datos) {
        return datos.matches("[a-zA-Z ]*");
    }

    private void botonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarActionPerformed
        try {
            long cuit = Long.parseLong(campoCuit.getText());
            int dnigarante = Integer.parseInt(campoDniGarante.getText());

            String apellido = campoApellido.getText();
            String nombre = campoNombre.getText();
            String lugartrabajo = campoLugarDeTrabajo.getText();
            String nombregarante = campoNombreGarante.getText();

            int limitador = 0;

            if (!validarCuil(cuit)) {
                JOptionPane.showMessageDialog(this, "Ya existe un propietario con ese cuil");
                campoCuit.setText("");
            } else {

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
                if (CargaDeInquilino.Validar(lugartrabajo)) {
                    lugartrabajo = campoLugarDeTrabajo.getText();
                } else {
                    JOptionPane.showMessageDialog(this, "Solo letras en el campo Lugar De Trabajo");
                    campoLugarDeTrabajo.setText("");
                    limitador++;
                }
                if (CargaDeInquilino.Validar(nombregarante)) {
                    lugartrabajo = campoLugarDeTrabajo.getText();
                } else {
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
                if (campoNombre.getText().isEmpty() || campoApellido.getText().isEmpty()
                        || campoCuit.getText().isEmpty() || campoNombreGarante.getText().isEmpty()
                        || campoLugarDeTrabajo.getText().isEmpty() || campoDniGarante.getText().isEmpty()) {
                    limitador++;
                }

                Inquilino inq = new Inquilino(nombre, apellido, cuit, lugartrabajo, dnigarante, nombregarante, estado);
                InquilinoData inqData = new InquilinoData();
                if (limitador == 0) { // si es 0 es porq los campos nombre y apellido son validos
                    inqData.agregarInquilino(inq);
                } else {
                    JOptionPane.showMessageDialog(this, " No deje espacios vacios");
                }
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "No deje los campos vacíos");
        }
    }//GEN-LAST:event_botonGuardarActionPerformed

    private void botonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarActionPerformed

        InquilinoData inqData = new InquilinoData();
        long cuit = 0;
        int id;
        
        if (campoNombre.getText().isEmpty() || campoApellido.getText().isEmpty()||  campoNombreGarante.getText().isEmpty()
            || campoLugarDeTrabajo.getText().isEmpty() || campoDniGarante.getText().isEmpty() || campoCuit.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "No se permite modificar con espacios vacios");
        } else if (!campoCuit.getText().isEmpty()){
            cuit = Long.parseLong(campoCuit.getText());
            id = Integer.parseInt(campoId.getText());
            if (!validarCuil(cuit) && cuit!=inqData.buscarInquilinoPorId(id).getCuit()) {
                JOptionPane.showMessageDialog(this, "Ya existe un propietario con ese cuil");
                campoCuit.setText("");
            } else {
                String apellido = campoApellido.getText();
                String nombre = campoNombre.getText();
                String lugartrabajo = campoLugarDeTrabajo.getText();
                String nombregarante = campoNombreGarante.getText();
                int dnigarante = Integer.parseInt(campoDniGarante.getText());
                id = Integer.parseInt(campoId.getText());
                boolean estado;
                if (checkEstado.isSelected()) {//is selected detecta si el check esta marcado o no
                    estado = true;
                } else {
                    estado = false;
                }
                Inquilino inq = new Inquilino(id, nombre, apellido, cuit, lugartrabajo, dnigarante, nombregarante, estado);

                inqData.modificarinquilino(inq);
            }    
        }
    }//GEN-LAST:event_botonModificarActionPerformed

    private void botonbuscar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonbuscar1ActionPerformed
        InquilinoData inqData = new InquilinoData();
        Inquilino inq = new Inquilino();
        if (campoCuit.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Se requiere el Cuit para buscar");
        } else {
            long cuit = Long.parseLong(campoCuit.getText());
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
        if (campoId.getText().isEmpty()) {
            botonModificar.setEnabled(false);
        } else {
            botonModificar.setEnabled(true);
        }
    }//GEN-LAST:event_botonbuscar1ActionPerformed

    private void campoCuitKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoCuitKeyTyped
        int key = evt.getKeyChar();
        boolean numero = key >= 48 && key <= 57 || key == 8;
        if (!numero) {
            evt.consume();
            aviso++;
            if (aviso == 10) {
                JOptionPane.showMessageDialog(this, "Solo se permiten numeros en este campo");
                aviso = 0;
            }
        }
    }//GEN-LAST:event_campoCuitKeyTyped

    private void campoDniGaranteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoDniGaranteKeyTyped
        int key = evt.getKeyChar();
        boolean numero = key >= 48 && key <= 57 || key == 8;
        if (!numero) {
            evt.consume();
            aviso++;
            if (aviso == 5) {
                JOptionPane.showMessageDialog(this, "Solo se permiten numeros en este campo");
                aviso = 0;
            }
        }
    }//GEN-LAST:event_campoDniGaranteKeyTyped

    private void BotonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEliminarActionPerformed
        try {
            long cuit = Long.parseLong(campoCuit.getText());
            InquilinoData inqData = new InquilinoData();
            inqData.eliminarInquilino(cuit);
            checkEstado.setSelected(false);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Para eliminar un inquilino debe primero buscar uno");
        }
        if (campoId.getText().isEmpty()) {
            botonModificar.setEnabled(false);
        } else {
            botonModificar.setEnabled(true);
        }
    }//GEN-LAST:event_BotonEliminarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
        menuPrincipal.mostrarItemsEscritorio();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void botonNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonNuevoActionPerformed
        campoApellido.setText("");
        campoCuit.setText("");
        campoDniGarante.setText("");
        campoId.setText("");
        campoLugarDeTrabajo.setText("");
        campoNombre.setText("");
        campoNombreGarante.setText("");
        checkEstado.setSelected(false);
        if (campoId.getText().isEmpty()) {
            botonModificar.setEnabled(false);
        } else {
            botonModificar.setEnabled(true);
        }
    }//GEN-LAST:event_botonNuevoActionPerformed

    private void campoNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoNombreKeyTyped
        int key = evt.getKeyChar();
        boolean numero = key >= 65 && key <= 90 || key >= 97 && key <= 122 || key == 8 || key == 32;
        if (!numero) {
            evt.consume();
            aviso++;
            if (aviso == 10) {
                JOptionPane.showMessageDialog(this, "Solo se permiten letras en este campo");
                aviso = 0;
            }
        }
    }//GEN-LAST:event_campoNombreKeyTyped

    private void campoApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoApellidoKeyTyped
        int key = evt.getKeyChar();
        boolean numero = key >= 65 && key <= 90 || key >= 97 && key <= 122 || key == 8 || key == 32;
        if (!numero) {
            evt.consume();
            aviso++;
            if (aviso == 10) {
                JOptionPane.showMessageDialog(this, "Solo se permiten letras en este campo");
                aviso = 0;
            }
        }
    }//GEN-LAST:event_campoApellidoKeyTyped

    private void campoNombreGaranteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoNombreGaranteKeyTyped
        int key = evt.getKeyChar();
        boolean numero = key >= 65 && key <= 90 || key >= 97 && key <= 122 || key == 8 || key == 32;
        if (!numero) {
            evt.consume();
            aviso++;
            if (aviso == 10) {
                JOptionPane.showMessageDialog(this, "Solo se permiten letras en este campo");
                aviso = 0;
            }
        }
    }//GEN-LAST:event_campoNombreGaranteKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonEliminar;
    private javax.swing.JButton botonGuardar;
    private javax.swing.JButton botonModificar;
    private javax.swing.JButton botonNuevo;
    private javax.swing.JButton botonbuscar1;
    private javax.swing.JTextField campoApellido;
    private javax.swing.JTextField campoCuit;
    private javax.swing.JTextField campoDniGarante;
    private javax.swing.JTextField campoId;
    private javax.swing.JTextField campoLugarDeTrabajo;
    private javax.swing.JTextField campoNombre;
    private javax.swing.JTextField campoNombreGarante;
    private javax.swing.JCheckBox checkEstado;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables

    private boolean validarCuil(long cuil) {
        InquilinoData inquilinoData = new InquilinoData();
        ArrayList<Inquilino> inquilinos = inquilinoData.listarinquilinosT();
        boolean bandera = true;

        for (Inquilino inquilino : inquilinos) {
            if (cuil == inquilino.getCuit()) {
                bandera = false;
                break;
            }
        }
        return bandera;
    }
    
    private class FondoPanel extends JPanel{
    
        private Image imagen;
        
        @Override
        public void paint(Graphics g){
            imagen = new ImageIcon(getClass().getResource("/images/fondo4.jpg")).getImage();
            g.drawImage(imagen,0,0, getWidth(), getHeight(), this);
            setOpaque(false);
            super.paint(g);
        
        }
    
    }  
}
