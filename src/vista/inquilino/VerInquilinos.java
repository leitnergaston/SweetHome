package vista.inquilino;

import accesoADatos.InquilinoData;
import entidades.Inquilino;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import vista.MenuPrincipal;

public class VerInquilinos extends javax.swing.JInternalFrame {

    DefaultTableModel modelo = new DefaultTableModel();
    private MenuPrincipal menuPrincipal;

    public VerInquilinos(MenuPrincipal menuPrincipal) {
        initComponents();
        this.menuPrincipal = menuPrincipal;
        cargarColumnas();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonVerDetalles = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        botonSalir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaInquilinos = new javax.swing.JTable();
        campoCuit = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        botonBuscarApellido = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        botonBuscarNombre = new javax.swing.JButton();
        campoApellido = new javax.swing.JTextField();
        botonBuscarCuit = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        campoNombre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        radioBInactivos = new javax.swing.JRadioButton();
        radioBTodos = new javax.swing.JRadioButton();
        radioBActivos = new javax.swing.JRadioButton();

        botonVerDetalles.setText("Ver detalles");

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Ver Inquilinos");

        botonSalir.setText("Salir");
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });

        tablaInquilinos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tablaInquilinos);

        jLabel2.setText("Filtrar por . . .");

        botonBuscarApellido.setText("Buscar");
        botonBuscarApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarApellidoActionPerformed(evt);
            }
        });

        jLabel3.setText("Apellido");

        botonBuscarNombre.setText("Buscar");
        botonBuscarNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarNombreActionPerformed(evt);
            }
        });

        botonBuscarCuit.setText("Buscar");
        botonBuscarCuit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarCuitActionPerformed(evt);
            }
        });

        jLabel4.setText("Nombre");

        jLabel5.setText("CUIT/CUIL");

        radioBInactivos.setText("Inactivos");

        radioBTodos.setText("Todos");
        radioBTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBTodosActionPerformed(evt);
            }
        });

        radioBActivos.setText("Activos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(44, 44, 44)
                                        .addComponent(campoCuit, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(campoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(campoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(44, 44, 44)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(botonBuscarApellido)
                                    .addComponent(botonBuscarNombre)
                                    .addComponent(botonBuscarCuit)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(radioBTodos)
                                .addGap(18, 18, 18)
                                .addComponent(radioBActivos)
                                .addGap(18, 18, 18)
                                .addComponent(radioBInactivos))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(77, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(botonVerDetalles)
                        .addGap(100, 100, 100)
                        .addComponent(botonSalir)
                        .addGap(79, 79, 79))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(radioBTodos)
                        .addComponent(radioBActivos)
                        .addComponent(radioBInactivos))
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(campoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonBuscarApellido))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonBuscarNombre)
                    .addComponent(jLabel4)
                    .addComponent(campoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonBuscarCuit)
                    .addComponent(jLabel5)
                    .addComponent(campoCuit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonVerDetalles)
                    .addComponent(botonSalir))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        dispose();
        menuPrincipal.mostrarItemsEscritorio();
    }//GEN-LAST:event_botonSalirActionPerformed

    private void botonBuscarApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarApellidoActionPerformed
        if (campoApellido.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese el apellido a buscar");
        } else {
            String apellido = campoApellido.getText() + "%";
            InquilinoData inqdata = new InquilinoData();
            Inquilino inq = new Inquilino();
            inq = inqdata.buscarInquilinoPorApellido(apellido);
            if (inq == null) {
                JOptionPane.showMessageDialog(this, "No hay inquilino/s con este apellido");
            } else {
                eliminarFilas();
                cargarfilas(inq);
            }

        }
    }//GEN-LAST:event_botonBuscarApellidoActionPerformed

    private void radioBTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioBTodosActionPerformed

    }//GEN-LAST:event_radioBTodosActionPerformed

    private void botonBuscarNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarNombreActionPerformed
        if (campoNombre.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese el nombre a buscar");
        }
    }//GEN-LAST:event_botonBuscarNombreActionPerformed

    private void botonBuscarCuitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarCuitActionPerformed
        if (campoCuit.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese el nombre a buscar");
        }
    }//GEN-LAST:event_botonBuscarCuitActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonBuscarApellido;
    private javax.swing.JButton botonBuscarCuit;
    private javax.swing.JButton botonBuscarNombre;
    private javax.swing.JButton botonSalir;
    private javax.swing.JButton botonVerDetalles;
    private javax.swing.JTextField campoApellido;
    private javax.swing.JTextField campoCuit;
    private javax.swing.JTextField campoNombre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton radioBActivos;
    private javax.swing.JRadioButton radioBInactivos;
    private javax.swing.JRadioButton radioBTodos;
    private javax.swing.JTable tablaInquilinos;
    // End of variables declaration//GEN-END:variables

    private void cargarColumnas() {

        modelo.addColumn("ID");
        modelo.addColumn("CUIT");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido");
        tablaInquilinos.setModel(modelo); // Asigno el modelo a la tabla
    }

    private void cargarfilas(Inquilino inquilino) {
        modelo.addRow(new Object[]{inquilino.getIdInquilino(), inquilino.getCuit(),
            inquilino.getNombre(), inquilino.getApellido()});
    }
    
    private void eliminarFilas(){
        int filas = tablaInquilinos.getRowCount()-1;
        if(filas > -1){
            for(;filas>=0;filas--){
                modelo.removeRow(filas);
            }
        }
    }

}
