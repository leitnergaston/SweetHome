package vista.inmueble;

import accesoADatos.InmuebleData;
import entidades.Inmueble;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import vista.menuPrincipal.MenuPrincipal;

public class VerPorFiltros extends javax.swing.JInternalFrame {

    private final MenuPrincipal menuPrincipal;
    DefaultTableModel modelo = new DefaultTableModel() {
        @Override
        public boolean isCellEditable(int row, int column) {
            return true;
        }
    };

    DefaultComboBoxModel<String> modelTipo = new DefaultComboBoxModel<>();
    DefaultComboBoxModel<String> modelZona = new DefaultComboBoxModel<>();

    public VerPorFiltros(MenuPrincipal menuPrincipal) {
        initComponents();
        this.menuPrincipal = menuPrincipal;
        cargarColumnas();
        cargarComboTipo();
        cargarComboZona();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        botonBuscar = new javax.swing.JButton();
        campoPrecioMinimo = new javax.swing.JTextField();
        campoPrecioMaximo = new javax.swing.JTextField();
        comboTipo = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        comboZona = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        campoSuperficie = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        botonLimpiarFiltros = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaInmuebles = new javax.swing.JTable();
        botonVerDetalle = new javax.swing.JButton();
        botonSalir = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Ver Inmuebles por filtros");

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Precio Mínimo");

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Precio Máximo");

        botonBuscar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        botonBuscar.setText("Buscar");
        botonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarActionPerformed(evt);
            }
        });

        campoPrecioMinimo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campoPrecioMinimoKeyTyped(evt);
            }
        });

        campoPrecioMaximo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campoPrecioMaximoKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Zona");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Tipo");

        jSeparator6.setForeground(new java.awt.Color(0, 0, 0));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Superficie Mínima");

        jLabel7.setText("$");

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        jLabel8.setText("$");

        campoSuperficie.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campoSuperficieKeyTyped(evt);
            }
        });

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));

        botonLimpiarFiltros.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        botonLimpiarFiltros.setText("Limpiar Filtros");
        botonLimpiarFiltros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonLimpiarFiltrosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator3)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(jLabel3))
                            .addComponent(comboZona, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(66, 66, 66))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(73, 73, 73))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(campoSuperficie, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7)))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(campoPrecioMaximo, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoPrecioMinimo, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(118, 118, 118))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(comboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64))))
            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jSeparator6)
            .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(botonBuscar)
                .addGap(18, 18, 18)
                .addComponent(botonLimpiarFiltros)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonBuscar)
                    .addComponent(botonLimpiarFiltros))
                .addGap(33, 33, 33)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(comboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(comboZona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(campoSuperficie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(campoPrecioMinimo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(campoPrecioMaximo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        tablaInmuebles.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tablaInmuebles);

        botonVerDetalle.setText("Ver detalle");
        botonVerDetalle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVerDetalleActionPerformed(evt);
            }
        });

        botonSalir.setText("Salir");
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addComponent(botonVerDetalle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonSalir)
                .addGap(97, 97, 97))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonVerDetalle)
                    .addComponent(botonSalir)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(265, 265, 265)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(39, 39, 39)))
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addGap(56, 56, 56)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        dispose();
        menuPrincipal.mostrarItemsEscritorio();
    }//GEN-LAST:event_botonSalirActionPerformed

    //====== BOTON BUSCAR ======//
    private void botonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarActionPerformed

        boolean alMenosUnFiltro = false;

        if (!campoSuperficie.getText().isEmpty() && !campoPrecioMinimo.getText().isBlank() && !campoPrecioMaximo.getText().isBlank() && !comboTipo.getSelectedItem().equals("") && !comboZona.getSelectedItem().equals("")) {
            alMenosUnFiltro = true;
        } else {
            JOptionPane.showMessageDialog(this, "Faltan filtros por llenar");
        }

        if (alMenosUnFiltro) {
            String tipo = (String) comboTipo.getSelectedItem();
            double superficieMinima = Double.parseDouble(campoSuperficie.getText());
            double precioMin = Double.parseDouble(campoPrecioMinimo.getText());
            double precioMax = Double.parseDouble(campoPrecioMaximo.getText());
            String zona = (String) comboZona.getSelectedItem();

            InmuebleData inmData = new InmuebleData();
            Inmueble inm = new Inmueble();
            ArrayList<Inmueble> inmuebles = inmData.listarInmueblesPorParametros(tipo, superficieMinima, precioMin, precioMax, zona);

            eliminarFilas();

            for (Inmueble inmueble : inmuebles) {
                cargarFilas(inmueble);
            }
        }


    }//GEN-LAST:event_botonBuscarActionPerformed

    //====== BOTON LIMPIAR FILTROS ======//
    private void botonLimpiarFiltrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonLimpiarFiltrosActionPerformed

        comboZona.addItem(null);
        campoSuperficie.setText("");
        campoPrecioMinimo.setText("");
        campoPrecioMaximo.setText("");
    }//GEN-LAST:event_botonLimpiarFiltrosActionPerformed

    private void campoSuperficieKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoSuperficieKeyTyped
        int key = evt.getKeyChar();
        boolean numero = key >= 48 && key <= 57;
        if (!numero) {
            evt.consume();
        }

    }//GEN-LAST:event_campoSuperficieKeyTyped

    private void campoPrecioMinimoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoPrecioMinimoKeyTyped
        int key = evt.getKeyChar();
        boolean numero = key >= 48 && key <= 57;
        if (!numero) {
            evt.consume();
        }
    }//GEN-LAST:event_campoPrecioMinimoKeyTyped

    private void campoPrecioMaximoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoPrecioMaximoKeyTyped
        int key = evt.getKeyChar();
        boolean numero = key >= 48 && key <= 57;
        if (!numero) {
            evt.consume();
        }
    }//GEN-LAST:event_campoPrecioMaximoKeyTyped

    private void botonVerDetalleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVerDetalleActionPerformed

        try {
            
            int filaSeleccionada = tablaInmuebles.getSelectedRow();
            if (filaSeleccionada != -1) {
                // Obtén el inmueble seleccionado

                // Muestra una ventana emergente con detalles adicionales
            }

        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(this, "Debe seleccionar una fila");
        }

    }//GEN-LAST:event_botonVerDetalleActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonBuscar;
    private javax.swing.JButton botonLimpiarFiltros;
    private javax.swing.JButton botonSalir;
    private javax.swing.JButton botonVerDetalle;
    private javax.swing.JTextField campoPrecioMaximo;
    private javax.swing.JTextField campoPrecioMinimo;
    private javax.swing.JTextField campoSuperficie;
    private javax.swing.JComboBox<String> comboTipo;
    private javax.swing.JComboBox<String> comboZona;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JTable tablaInmuebles;
    // End of variables declaration//GEN-END:variables

    private void cargarColumnas() {
        modelo.addColumn("ID Inmuble");
        modelo.addColumn("Tipo");
        modelo.addColumn("Superficie");
        modelo.addColumn("Precio");
        modelo.addColumn("Zona");
        tablaInmuebles.setModel(modelo);
    }

    private void eliminarFilas() {
        int filas = tablaInmuebles.getRowCount() - 1;
        if (filas > -1) {
            for (; filas >= 0; filas--) {
                modelo.removeRow(filas);
            }
        }
    }

    private void cargarFilas(Inmueble inmueble) {
        modelo.addRow(new Object[]{inmueble.getIdInmueble(), inmueble.getTipo(), inmueble.getSuperficie(), inmueble.getPrecio(), inmueble.getZona()});
    }

    private void cargarComboTipo() {

        ArrayList<String> tipos = new ArrayList<>();
        tipos.add("");
        tipos.add("Local");
        tipos.add("Depósito");
        tipos.add("Oficina");
        tipos.add("Casa");
        tipos.add("Departamento");

        for (String tipo : tipos) {
            modelTipo.addElement(tipo);
        }

        comboTipo.setModel(modelTipo);

    }

    private void cargarComboZona() {

        ArrayList<String> zonas = new ArrayList<>();
        zonas.add("");
        zonas.add("Norte");
        zonas.add("Centro");
        zonas.add("Sur");
        zonas.add("Este");
        zonas.add("Oeste");

        for (String zona : zonas) {
            modelZona.addElement(zona);
        }

        comboZona.setModel(modelZona);
    }

    private void mostrarDetalles(Inmueble inmueble) {
        String detalles = "ID: " + inmueble.getIdInmueble() + "\n"
                + "Tipo: " + inmueble.getTipo() + "\n"
                + "Zona: " + inmueble.getZona() + "\n"
                + "Superficie: " + inmueble.getSuperficie() + "\n"
                + "Precio: " + inmueble.getPrecio();

        JOptionPane.showMessageDialog(this, detalles, "Detalles del inmueble", JOptionPane.INFORMATION_MESSAGE);
    }

}
