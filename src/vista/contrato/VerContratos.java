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
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import vista.menuPrincipal.MenuPrincipal;


public class VerContratos extends javax.swing.JInternalFrame {
    private final MenuPrincipal menuPrincipal;
    private ContratoData contratoData = new ContratoData();
    private InmuebleData inmuebleData = new InmuebleData();
    private InquilinoData inquilinoData = new InquilinoData();
   
    DefaultTableModel modelo = new DefaultTableModel(){
        public boolean isCellEditable(int f, int c){
            return false;
        }
    };
    public VerContratos(MenuPrincipal menuPrincipal) {
        initComponents();
         this.menuPrincipal = menuPrincipal;
         cargarTabla();
         cargarComboInmueble();
         //cargarComboInquilino();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        grupoBotonesFiltros = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        botonVerDetalles = new javax.swing.JButton();
        botonSalir = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaContratos = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        comboInquilino = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        botonTodos = new javax.swing.JRadioButton();
        botonVigentes = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        comboInmueble = new javax.swing.JComboBox<>();
        botonBuscar = new javax.swing.JButton();
        botonBuscarId = new javax.swing.JButton();
        botonBuscarInquilino = new javax.swing.JButton();
        botonNoVigentes = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        campoID = new javax.swing.JTextField();
        botonBuscarInmueble1 = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setPreferredSize(new java.awt.Dimension(555, 470));

        jPanel1.setBackground(new java.awt.Color(255, 102, 102));

        botonVerDetalles.setText("Ver Detalle");

        botonSalir.setText("Salir");
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });

        tablaContratos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tablaContratos);

        jLabel4.setText("Filtrar por...");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Ver Contratos");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setText("Inquilino");

        grupoBotonesFiltros.add(botonTodos);
        botonTodos.setText("Todos");

        grupoBotonesFiltros.add(botonVigentes);
        botonVigentes.setText("Vigentes");

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setText("ID");

        botonBuscar.setText("Buscar ");
        botonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarActionPerformed(evt);
            }
        });

        botonBuscarId.setText("Buscar por ID");
        botonBuscarId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarIdActionPerformed(evt);
            }
        });

        botonBuscarInquilino.setText("Buscar por Inquilino");
        botonBuscarInquilino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarInquilinoActionPerformed(evt);
            }
        });

        grupoBotonesFiltros.add(botonNoVigentes);
        botonNoVigentes.setText("No Vigentes");

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setText("Inmueble");

        botonBuscarInmueble1.setText("Buscar por Inmueble");
        botonBuscarInmueble1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarInmueble1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(botonVerDetalles)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonSalir)
                .addGap(93, 93, 93))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jScrollPane2))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel4)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel7)
                                                .addGap(3, 3, 3)))
                                        .addGap(26, 26, 26))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(29, 29, 29)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(botonTodos)
                                                .addGap(18, 18, 18)
                                                .addComponent(botonVigentes)
                                                .addGap(18, 18, 18)
                                                .addComponent(botonNoVigentes))
                                            .addComponent(comboInquilino, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(comboInmueble, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(botonBuscarInquilino, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(botonBuscar, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(botonBuscarInmueble1, javax.swing.GroupLayout.Alignment.TRAILING)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(campoID, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(botonBuscarId)))))))
                .addGap(31, 31, 31))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(158, 158, 158))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(botonTodos)
                    .addComponent(botonVigentes)
                    .addComponent(botonBuscar)
                    .addComponent(botonNoVigentes))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(campoID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonBuscarId))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboInmueble, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(botonBuscarInmueble1))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonBuscarInquilino))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comboInquilino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonVerDetalles)
                    .addComponent(botonSalir))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        dispose();
        menuPrincipal.mostrarItemsEscritorio();
    
    }//GEN-LAST:event_botonSalirActionPerformed
   
    public static boolean Validar(String datos) {
        return datos.matches("[a-zA-Z]*");
    }
    
    private void botonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarActionPerformed
        ArrayList<Contrato> contrato;
                
        if(botonTodos.isSelected()){
            contrato = contratoData.listarContratosVigentes();
            if(contrato.isEmpty()){
                JOptionPane.showMessageDialog(this, "No se ha cargado contrato todavía");
                vaciarTodo();
            }else{    
                eliminarFilas();
                for(Contrato contratos : contrato){
                    cargarfilas(contratos);
                }
            }    
        }else{
            boolean disponible = botonVigentes.isSelected();
            contrato = contratoData.listarContratosVigentes();
            
            if(disponible==true && contrato.isEmpty()){
                JOptionPane.showMessageDialog(this, "No hay contrato");
                campoID.setText("");
                comboInquilino.setSelectedIndex(0);
                comboInmueble.setSelectedIndex(0);
                eliminarFilas();
            }else if(disponible==false && contrato.isEmpty()){
                JOptionPane.showMessageDialog(this, "No existe contrato NO vigente en este momento");
                campoID.setText("");
                comboInmueble.setSelectedIndex(0);
                comboInquilino.setSelectedIndex(0);
                eliminarFilas();
            }else{
                eliminarFilas();
                for(Contrato contratos : contrato){
                    cargarfilas(contratos);
                }
                campoID.setText("");
                comboInmueble.setSelectedIndex(0);
                comboInquilino.setSelectedIndex(0);
            }
        }   
    }//GEN-LAST:event_botonBuscarActionPerformed

    private void botonBuscarIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarIdActionPerformed
       try{
           int id = Integer.parseInt(campoID.getText());
           Contrato contrato = contratoData.buscarContratoPorId(id);
           
           if(contrato == null){
               JOptionPane.showMessageDialog(this, "No existe contrato con esa Id");
              
           }else{
               eliminarFilas();
               cargarfilas(contrato);
               botonTodos.setSelected(true);
               comboInmueble.setSelectedIndex(0);
               comboInquilino.setSelectedIndex(0);
           }
           
        }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(this, "Ingrese el id del contrato a buscar");
        }
             
    }//GEN-LAST:event_botonBuscarIdActionPerformed

    private void botonBuscarInquilinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarInquilinoActionPerformed
         
        if(comboInquilino.getSelectedIndex()<1){
            JOptionPane.showMessageDialog(this, "Ingrese un inquilino para buscar sus contratos");
            vaciarTodo();
        }else{
            Inquilino inquilino = (Inquilino) comboInquilino.getSelectedItem();
            
            ArrayList<Inquilino> inquilinos = inquilinoData.listarinquilinosT();
            
            if(inquilinos.isEmpty()){
                JOptionPane.showMessageDialog(this, "Ese propietario no ha registrado ningún inmueble");  
                vaciarTodo();
            }else{
                eliminarFilas();
                for(Inquilino inquilino: inquilinos){
                    cargarFila(in);
                    radioBTodos.setSelected(true);
                    campoId.setText("");
                    campoDireccion.setText("");
                }
            }
        }*/
    }//GEN-LAST:event_botonBuscarInquilinoActionPerformed

    private void botonBuscarInmueble1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarInmueble1ActionPerformed
         
        if(comboInmueble.getSelectedIndex()<1){
            JOptionPane.showMessageDialog(this, "Seleccione inmueble para buscar su contrato");
            vaciarTodo();
        }else{
            Inmueble inmueble = (Inmueble)comboInmueble.getSelectedItem();
            
            ArrayList<Contrato> contratos = contratoData.listarContratosPorInmueble(inmueble.getIdInmueble());
            
            if(contratos.isEmpty()){
                JOptionPane.showMessageDialog(this, "No hay contrato para ese inmueble");  
                vaciarTodo();
            }else{
                eliminarFilas();
                for(Contrato contrato: contratos){
                    cargarfilas(contrato);
                    botonTodos.setSelected(true);
                    campoID.setText("");
                    
                }
            }
        }
    }//GEN-LAST:event_botonBuscarInmueble1ActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonBuscar;
    private javax.swing.JButton botonBuscarId;
    private javax.swing.JButton botonBuscarInmueble1;
    private javax.swing.JButton botonBuscarInquilino;
    private javax.swing.JRadioButton botonNoVigentes;
    private javax.swing.JButton botonSalir;
    private javax.swing.JRadioButton botonTodos;
    private javax.swing.JButton botonVerDetalles;
    private javax.swing.JRadioButton botonVigentes;
    private javax.swing.JTextField campoID;
    private javax.swing.JComboBox<Inmueble> comboInmueble;
    private javax.swing.JComboBox<Inmueble> comboInquilino;
    private javax.swing.ButtonGroup grupoBotonesFiltros;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tablaContratos;
    // End of variables declaration//GEN-END:variables
   
    private void cargarTabla() {
       
        /*mostrar id, inquilino,inmueble,estado en la tabla*/
        modelo.addColumn("ID");
        modelo.addColumn("Inquilino");
        modelo.addColumn("Inmueble");
        modelo.addColumn("Estado");
        tablaContratos.setModel(modelo); 
    }

    private void cargarfilas(Contrato contrato) {
        modelo.addRow(new Object[]{contrato.getIdContrato(),contrato.getInquilino(),contrato.getInmueble(),contrato.isVigente()});
    }

    private void eliminarFilas() {
        int filas = tablaContratos.getRowCount() - 1;
        if (filas > -1) {
            for (; filas >= 0; filas--) {
                modelo.removeRow(filas);
            }
        }
    }
    
     private void cargarComboInmueble(){
        
        ArrayList<Inmueble> inmueble = inmuebleData.listarInmueblesDisponiblesONo(true);
        
        comboInmueble.addItem(null);
        for(Inmueble inmuebles: inmueble){
            comboInmueble.addItem(inmuebles);
            
        }    
    }
    /* 
    private void cargarComboInquilino(){
        
        ArrayList<Inquilino> inquilinos = inquilinoData.listarinquilinosT();
        
        comboInquilino.addItem(null);
        
        for(Inquilino inquilino: inquilinos){
            comboInquilino.addItem(inquilino);
            }    
    }*/
    
    private void vaciarTodo(){
        botonTodos.setSelected(true);
        comboInquilino.setSelectedIndex(0);
        comboInmueble.setSelectedIndex(0);
        eliminarFilas();
    }
}

