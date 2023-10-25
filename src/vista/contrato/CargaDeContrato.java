/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista.contrato;

import accesoADatos.ContratoData;
import accesoADatos.InmuebleData;
import accesoADatos.InquilinoData;
import entidades.Contrato;
import entidades.Inmueble;
import entidades.Inquilino;
import java.sql.Date;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import vista.menuPrincipal.MenuPrincipal;

/**
 *
 * @author Usuario
 */
public class CargaDeContrato extends javax.swing.JInternalFrame {
    private MenuPrincipal menuPrincipal;
    private ContratoData contratoData = new ContratoData();
    private InmuebleData inmuebleData = new InmuebleData();
    private InquilinoData inquilinoData = new InquilinoData();
    private int aviso = 0;
    /**
     * Creates new form CargaDeContrato
     */
    public CargaDeContrato(MenuPrincipal menuPrincipal) {
        initComponents();
        this.menuPrincipal = menuPrincipal;
        cargarComboInquilino();
        cargarComboInmueble();
        vaciarCampos();
        
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
        jLContrato = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLIdContrato = new javax.swing.JLabel();
        jLInmueble = new javax.swing.JLabel();
        jLInquilino = new javax.swing.JLabel();
        campoBotonSalir = new javax.swing.JButton();
        jLFechaIni = new javax.swing.JLabel();
        campoCheckVigente = new javax.swing.JCheckBox();
        campoBotonGuardar = new javax.swing.JButton();
        ComboInmueble = new javax.swing.JComboBox<>();
        campoBotonModificar = new javax.swing.JButton();
        ComboInquilino = new javax.swing.JComboBox<>();
        campoBotonEliminar = new javax.swing.JButton();
        campoDateFechaInicio = new com.toedter.calendar.JDateChooser();
        campoIdContrato = new javax.swing.JTextField();
        campoDateFechaFin = new com.toedter.calendar.JDateChooser();
        campoBotonBuscar = new javax.swing.JButton();
        campoBotonNuevo = new javax.swing.JButton();
        campoPrecioAlquiler = new javax.swing.JTextField();
        labelDisponible = new javax.swing.JLabel();
        jLPrecio = new javax.swing.JLabel();
        campoCheckRenovado = new javax.swing.JCheckBox();
        jLFechaFin = new javax.swing.JLabel();

        setTitle("Datos de Contrato");

        jLContrato.setBackground(new java.awt.Color(255, 204, 204));
        jLContrato.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLContrato.setForeground(new java.awt.Color(0, 153, 153));
        jLContrato.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLContrato.setText("Contratos");

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("Carga de Datos");

        jLIdContrato.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLIdContrato.setText("ID Contrato");

        jLInmueble.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLInmueble.setText("Inmueble");

        jLInquilino.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLInquilino.setText("Inquilino");

        campoBotonSalir.setFont(new java.awt.Font("Swis721 Hv BT", 0, 12)); // NOI18N
        campoBotonSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconSalir.png"))); // NOI18N
        campoBotonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoBotonSalirActionPerformed(evt);
            }
        });

        jLFechaIni.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLFechaIni.setText("Fecha de Inicio");

        campoCheckVigente.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        campoCheckVigente.setText("Vigente");
        campoCheckVigente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoCheckVigenteActionPerformed(evt);
            }
        });

        campoBotonGuardar.setFont(new java.awt.Font("Swis721 Hv BT", 0, 12)); // NOI18N
        campoBotonGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconGuardar.png"))); // NOI18N
        campoBotonGuardar.setText("Guardar");
        campoBotonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoBotonGuardarActionPerformed(evt);
            }
        });

        ComboInmueble.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboInmuebleActionPerformed(evt);
            }
        });

        campoBotonModificar.setFont(new java.awt.Font("Swis721 Hv BT", 0, 12)); // NOI18N
        campoBotonModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconModificar.png"))); // NOI18N
        campoBotonModificar.setText("Modificar");
        campoBotonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoBotonModificarActionPerformed(evt);
            }
        });

        campoBotonEliminar.setFont(new java.awt.Font("Swis721 Hv BT", 0, 12)); // NOI18N
        campoBotonEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconEliminar.png"))); // NOI18N
        campoBotonEliminar.setText("Eliminar");
        campoBotonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoBotonEliminarActionPerformed(evt);
            }
        });

        campoIdContrato.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campoIdContratoKeyTyped(evt);
            }
        });

        campoBotonBuscar.setFont(new java.awt.Font("Swis721 Hv BT", 0, 12)); // NOI18N
        campoBotonBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconBuscar.png"))); // NOI18N
        campoBotonBuscar.setText("Buscar");
        campoBotonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoBotonBuscarActionPerformed(evt);
            }
        });

        campoBotonNuevo.setFont(new java.awt.Font("Swis721 Hv BT", 0, 12)); // NOI18N
        campoBotonNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconNuevo.png"))); // NOI18N
        campoBotonNuevo.setText("Nuevo");
        campoBotonNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoBotonNuevoActionPerformed(evt);
            }
        });

        campoPrecioAlquiler.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campoPrecioAlquilerKeyTyped(evt);
            }
        });

        jLPrecio.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLPrecio.setText("Precio Alquiler");

        campoCheckRenovado.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        campoCheckRenovado.setText("Renovado");
        campoCheckRenovado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoCheckRenovadoActionPerformed(evt);
            }
        });

        jLFechaFin.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLFechaFin.setText("Fecha de Finalización");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(142, 142, 142)
                                .addComponent(campoCheckVigente)
                                .addGap(35, 35, 35)
                                .addComponent(campoCheckRenovado))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(campoBotonNuevo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campoBotonGuardar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campoBotonModificar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campoBotonEliminar)
                                .addGap(18, 18, 18)
                                .addComponent(campoBotonSalir))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLFechaFin)
                                            .addComponent(jLPrecio))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(11, 11, 11)
                                                .addComponent(campoPrecioAlquiler, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(campoDateFechaFin, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLInmueble)
                                            .addComponent(jLIdContrato))
                                        .addGap(84, 84, 84)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(ComboInmueble, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(campoIdContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLFechaIni)
                                            .addComponent(jLInquilino))
                                        .addGap(56, 56, 56)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(ComboInquilino, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(campoDateFechaInicio, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(labelDisponible, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(12, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                                        .addComponent(campoBotonBuscar)
                                        .addGap(34, 34, 34))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(104, 104, 104)
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel1)))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoIdContrato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLIdContrato)
                    .addComponent(campoBotonBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLInmueble)
                        .addComponent(ComboInmueble, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(labelDisponible, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLInquilino)
                    .addComponent(ComboInquilino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLFechaIni))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(campoDateFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLFechaFin)
                    .addComponent(campoDateFechaFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoPrecioAlquiler, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLPrecio))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoCheckVigente)
                    .addComponent(campoCheckRenovado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campoBotonSalir)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(campoBotonEliminar)
                        .addComponent(campoBotonModificar)
                        .addComponent(campoBotonGuardar)
                        .addComponent(campoBotonNuevo)))
                .addGap(36, 36, 36))
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
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campoCheckRenovadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoCheckRenovadoActionPerformed

    }//GEN-LAST:event_campoCheckRenovadoActionPerformed

    private void campoPrecioAlquilerKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoPrecioAlquilerKeyTyped
        int key = evt.getKeyChar();
        boolean numero;
        if(campoPrecioAlquiler.getText().contains(".")){
            numero = key >= 48 && key <= 57 || key == 8;
        }
        else{
            numero = key >= 48 && key <= 57 || key == 46 || key == 8;
        }
        if (!numero) {
            evt.consume();
            aviso++;
            if (aviso == 5) {
                JOptionPane.showMessageDialog(this, "En este campo solo puede ingresar números enteros o números decimales");
                aviso = 0;
            }
        }
    }//GEN-LAST:event_campoPrecioAlquilerKeyTyped

    private void campoBotonNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoBotonNuevoActionPerformed
        vaciarCampos();
    }//GEN-LAST:event_campoBotonNuevoActionPerformed

    private void campoBotonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoBotonBuscarActionPerformed
        try{
            Contrato contrato = new Contrato();

            if (campoIdContrato.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Ingrese ID para buscar");
            } else {
                int id = Integer.parseInt(campoIdContrato.getText());
                contrato = contratoData.buscarContratoPorId(id);
                if (contrato == null) {
                    vaciarCampos();
                } else {
                    int idInqui = contrato.getInquilino().getIdInquilino();
                    int cantidadItem = ComboInquilino.getItemCount();

                    for (int i = 1; i < cantidadItem; i++) {
                        Inquilino inqui = ComboInquilino.getItemAt(i);
                        if(inqui.getIdInquilino()== idInqui){
                            ComboInquilino.setSelectedIndex(i);
                        }
                    }
                    int idInmu = contrato.getInmueble().getIdInmueble();
                    int cantItem = ComboInmueble.getItemCount();

                    for (int i = 1; i < cantItem; i++) {
                        Inmueble inmu = ComboInmueble.getItemAt(i);
                        if(inmu.getIdInmueble()== idInmu){
                            ComboInmueble.setSelectedIndex(i);
                        }
                    }
                    campoDateFechaInicio.setDate(Date.valueOf(contrato.getFechaInicio()));
                    campoDateFechaFin.setDate(Date.valueOf(contrato.getFechaFinal()));
                    campoPrecioAlquiler.setText(contrato.getPrecioAlquiler()+"");
                    campoCheckVigente.setSelected(contrato.isVigente());
                    campoCheckRenovado.setSelected(contrato.isRenovacion());
                }
            }
            if (campoIdContrato.getText().isEmpty()) {
                campoBotonModificar.setEnabled(false);
            } else {
                campoBotonModificar.setEnabled(true);
            }
        }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(this, "Para guardar un contrato debe completar todos los campos excepto Id");
        }
    }//GEN-LAST:event_campoBotonBuscarActionPerformed

    private void campoIdContratoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoIdContratoKeyTyped
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
    }//GEN-LAST:event_campoIdContratoKeyTyped

    private void campoBotonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoBotonEliminarActionPerformed
        if(campoIdContrato.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Para eliminar debe seleccionar un Id correspondiente");
        }else{
            int id = Integer.parseInt(campoIdContrato.getText());
            contratoData.eliminarContrato(id);
            contratoData.buscarContratoPorId(id).getInmueble().setDisponible(true);
            campoCheckVigente.setSelected(false);
            ComboInquilino.setSelectedIndex(0);
            actualizarDisponible();
        }
    }//GEN-LAST:event_campoBotonEliminarActionPerformed

    private void campoBotonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoBotonModificarActionPerformed
        try{

            if(ComboInmueble.getSelectedIndex()<1 || ComboInquilino.getSelectedIndex()<1 ){
                JOptionPane.showMessageDialog(this, "No deje los campos vacíos");
            }else if(campoDateFechaInicio.getDate() == null || campoDateFechaFin.getDate()== null  || campoPrecioAlquiler.getText().isEmpty()){
                JOptionPane.showMessageDialog(this, "No dejar los campos Fecha Inicio, Fecha fin y precio vacíos.");
            }else{

                int id = Integer.parseInt(campoIdContrato.getText());
                Inmueble inmueble = (Inmueble) ComboInmueble.getSelectedItem();
                Inquilino inquilino = (Inquilino) ComboInquilino.getSelectedItem();
                LocalDate fecha1 = campoDateFechaInicio.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                LocalDate fecha2 = campoDateFechaFin.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                double precio = Double.parseDouble(campoPrecioAlquiler.getText());
                boolean vigente = false;
                boolean renovacion = false;

                if(campoCheckVigente.isSelected()){
                    vigente = true;
                }
                if(campoCheckRenovado.isSelected()){
                    renovacion = true;
                }

                Contrato contrato = new Contrato(id,inmueble,inquilino,fecha1,fecha2,precio,vigente,renovacion);
                if(inmueble.isDisponible() || inmueble.getIdInmueble() == contratoData.buscarContratoPorId(id).getInmueble().getIdInmueble()){
                    contratoData.modificarContrato(contrato);
                    actualizarDisponible();
                }else{
                    JOptionPane.showMessageDialog(this, "El inmueble seleccionado no se encuentra disponible");
                }
            }

        }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(this, "Para modificar el contrato debe completar todos los campos excepto Id");
        }
    }//GEN-LAST:event_campoBotonModificarActionPerformed

    private void ComboInmuebleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboInmuebleActionPerformed
        actualizarDisponible();
    }//GEN-LAST:event_ComboInmuebleActionPerformed

    private void campoBotonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoBotonGuardarActionPerformed
        try{

            if(ComboInmueble.getSelectedIndex()<1 || ComboInquilino.getSelectedIndex()<1 ){
                JOptionPane.showMessageDialog(this, "No deje los campos vacíos");
            }else if(campoDateFechaInicio.getDate() == null || campoDateFechaFin.getDate()== null  || campoPrecioAlquiler.getText().isEmpty()){
                JOptionPane.showMessageDialog(this, "No dejar los campos Fecha Inicio, Fecha fin y precio vacíos.");
            }else{

                //int id = Integer.parseInt(campoIdContrato.getText());
                Inmueble inmueble = (Inmueble) ComboInmueble.getSelectedItem();
                Inquilino inquilino = (Inquilino) ComboInquilino.getSelectedItem();
                LocalDate fecha1 = campoDateFechaInicio.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                LocalDate fecha2 = campoDateFechaFin.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                double precio = Double.parseDouble(campoPrecioAlquiler.getText());
                boolean vigente = false;
                boolean renovacion = false;

                if(campoCheckVigente.isSelected()){
                    vigente = true;
                }
                if(campoCheckRenovado.isSelected()){
                    renovacion = true;
                }

                if(inmueble.isDisponible()){

                    Contrato contrato = new Contrato(inmueble,inquilino,fecha1,fecha2,precio,vigente,renovacion);
                    contratoData.crearContrato(contrato);
                    cargarComboInmueble();
                    campoIdContrato.setText(contrato.getIdContrato()+"");
                    actualizarDisponible();
                }else{
                    JOptionPane.showMessageDialog(this, "Este inmueble no se encuentra disponible");
                }
            }

        }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(this, "Para guardar un contrato debe completar todos los campos excepto Id");
        }
    }//GEN-LAST:event_campoBotonGuardarActionPerformed

    private void campoCheckVigenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoCheckVigenteActionPerformed

    }//GEN-LAST:event_campoCheckVigenteActionPerformed

    private void campoBotonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoBotonSalirActionPerformed
        dispose();
        menuPrincipal.mostrarItemsEscritorio();
    }//GEN-LAST:event_campoBotonSalirActionPerformed
    public static boolean Validar(String datos) {
        return datos.matches("[a-zA-Z ]*");
    }
       

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Inmueble> ComboInmueble;
    private javax.swing.JComboBox<Inquilino> ComboInquilino;
    private javax.swing.JButton campoBotonBuscar;
    private javax.swing.JButton campoBotonEliminar;
    private javax.swing.JButton campoBotonGuardar;
    private javax.swing.JButton campoBotonModificar;
    private javax.swing.JButton campoBotonNuevo;
    private javax.swing.JButton campoBotonSalir;
    private javax.swing.JCheckBox campoCheckRenovado;
    private javax.swing.JCheckBox campoCheckVigente;
    private com.toedter.calendar.JDateChooser campoDateFechaFin;
    private com.toedter.calendar.JDateChooser campoDateFechaInicio;
    private javax.swing.JTextField campoIdContrato;
    private javax.swing.JTextField campoPrecioAlquiler;
    private javax.swing.JLabel jLContrato;
    private javax.swing.JLabel jLFechaFin;
    private javax.swing.JLabel jLFechaIni;
    private javax.swing.JLabel jLIdContrato;
    private javax.swing.JLabel jLInmueble;
    private javax.swing.JLabel jLInquilino;
    private javax.swing.JLabel jLPrecio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelDisponible;
    // End of variables declaration//GEN-END:variables

    private void cargarComboInquilino(){
        
        ArrayList<Inquilino> inquilinos = inquilinoData.listarinquilinosT();
        
        ComboInquilino.addItem(null);
        
        for(Inquilino inquilino: inquilinos){
            ComboInquilino.addItem(inquilino);
            }    
    }

    private void cargarComboInmueble(){
        
        ArrayList<Inmueble> inmuebles = inmuebleData.listarInmuebles();
        
        ComboInmueble.addItem(null);
        
        for(Inmueble inmueble: inmuebles){
            ComboInmueble.addItem(inmueble);
            }    
    }
    
    private void vaciarCampos(){
        campoIdContrato.setText("");
        ComboInmueble.setSelectedIndex(0);
        ComboInquilino.setSelectedIndex(0);
        campoDateFechaFin.setDate(null);
        campoDateFechaInicio.setDate(null);
        campoPrecioAlquiler.setText("");
        campoCheckRenovado.setSelected(false);
        campoCheckVigente.setSelected(false);
    }

    private void actualizarDisponible(){
        if(ComboInmueble.getSelectedIndex()>0){
            Inmueble inmueble = (Inmueble)ComboInmueble.getSelectedItem();
            if(inmuebleData.buscarInmueble(inmueble.getIdInmueble()).isDisponible()){
                labelDisponible.setText("Disponible");
            }else{
                labelDisponible.setText("No disponible");
            }
        }
        else{
            labelDisponible.setText("");
        }
    }    
    
}
