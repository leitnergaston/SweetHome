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
    int aviso = 0;
    DefaultTableModel modelo = new DefaultTableModel() {
        @Override
        public boolean isCellEditable(int row, int column) {
            return false;
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

        setTitle("Ver inmuebles por filtros");

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setText("Ver Inmuebles por filtros");

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel5.setText("Precio Mínimo");

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel6.setText("Precio Máximo");

        botonBuscar.setFont(new java.awt.Font("Swis721 Hv BT", 0, 14)); // NOI18N
        botonBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconBuscar.png"))); // NOI18N
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

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel3.setText("Zona");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel2.setText("Tipo");

        jSeparator6.setForeground(new java.awt.Color(0, 0, 0));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel4.setText("Superficie Mínima");

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel7.setText("$");

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel8.setText("$");

        campoSuperficie.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campoSuperficieKeyTyped(evt);
            }
        });

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));

        botonLimpiarFiltros.setFont(new java.awt.Font("Swis721 Hv BT", 0, 14)); // NOI18N
        botonLimpiarFiltros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconNuevo.png"))); // NOI18N
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
            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jSeparator6)
            .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(comboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(comboZona, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(campoSuperficie, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(botonBuscar)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoPrecioMinimo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoPrecioMaximo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(81, 81, 81))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(botonLimpiarFiltros)
                        .addGap(45, 45, 45))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(botonBuscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonLimpiarFiltros)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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

        botonVerDetalle.setFont(new java.awt.Font("Swis721 Hv BT", 0, 14)); // NOI18N
        botonVerDetalle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconVerDetalles.png"))); // NOI18N
        botonVerDetalle.setText("Ver detalle");
        botonVerDetalle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVerDetalleActionPerformed(evt);
            }
        });

        botonSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconSalir.png"))); // NOI18N
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonVerDetalle)
                .addGap(60, 60, 60)
                .addComponent(botonSalir)
                .addGap(152, 152, 152))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonSalir)
                    .addComponent(botonVerDetalle)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(37, 37, 37))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(169, 169, 169)))
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //====== BOTON SALIR ======//
    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        dispose();
        menuPrincipal.mostrarItemsEscritorio();
    }//GEN-LAST:event_botonSalirActionPerformed

    //====== BOTON BUSCAR ======//
    private void botonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarActionPerformed

        boolean alMenosUnFiltro = false;

        if (!campoSuperficie.getText().isEmpty() && !campoPrecioMinimo.getText().isEmpty()&& !campoPrecioMaximo.getText().isEmpty()&& !comboTipo.getSelectedItem().equals("") && !comboZona.getSelectedItem().equals("")) {
            alMenosUnFiltro = true;
        } else {
            JOptionPane.showMessageDialog(this, "Debe llenar todos los campos");
        }

        if (alMenosUnFiltro) {
            InmuebleData inmData = new InmuebleData();
            Inmueble inm = new Inmueble();
            
            String tipo = (String) comboTipo.getSelectedItem();
            double superficieMinima = Double.parseDouble(campoSuperficie.getText());
            double precioMin = Double.parseDouble(campoPrecioMinimo.getText());
            double precioMax = Double.parseDouble(campoPrecioMaximo.getText());
            String zona = (String) comboZona.getSelectedItem();

            ArrayList<Inmueble> inmuebles = inmData.listarInmueblesPorParametros(tipo, superficieMinima, precioMin, precioMax, zona);

            eliminarFilas();

            for (Inmueble inmueble : inmuebles) {
                cargarFilas(inmueble);
            }
            
            if (inmData.listarInmueblesPorParametros(tipo, superficieMinima, precioMin, precioMax, zona).isEmpty()) {
                JOptionPane.showMessageDialog(this, "No existen inmuebles con esos parametros");
            }
            
        }
        
    }//GEN-LAST:event_botonBuscarActionPerformed

    //====== BOTON LIMPIAR FILTROS ======//
    private void botonLimpiarFiltrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonLimpiarFiltrosActionPerformed
        comboZona.setSelectedIndex(0);
        comboTipo.setSelectedIndex(0);
        campoSuperficie.setText("");
        campoPrecioMinimo.setText("");
        campoPrecioMaximo.setText("");
    }//GEN-LAST:event_botonLimpiarFiltrosActionPerformed

    // Validacion campo Superficie
    private void campoSuperficieKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoSuperficieKeyTyped
        int key = evt.getKeyChar();
        boolean numero = key >= 48 && key <= 57 || key==8;
        if (!numero) {
            evt.consume();
            aviso++;
            if (aviso == 10) {
                JOptionPane.showMessageDialog(this, "Solo se permiten numeros en este campo");
                aviso = 0;
            }
        }
    }//GEN-LAST:event_campoSuperficieKeyTyped

    // Validacion campo Precio minimo
    private void campoPrecioMinimoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoPrecioMinimoKeyTyped
        int key = evt.getKeyChar();
        boolean numero = key >= 48 && key <= 57 || key==8;
        if (!numero) {
            evt.consume();
            aviso++;
            if (aviso == 10) {
                JOptionPane.showMessageDialog(this, "Solo se permiten numeros en este campo");
                aviso = 0;
            }
        }
    }//GEN-LAST:event_campoPrecioMinimoKeyTyped

    // Validacion campo Precio maximo
    private void campoPrecioMaximoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoPrecioMaximoKeyTyped
        int key = evt.getKeyChar();
        boolean numero = key >= 48 && key <= 57 || key==8;
        if (!numero) {
            evt.consume();
            aviso++;
            if (aviso == 10) {
                JOptionPane.showMessageDialog(this, "Solo se permiten numeros en este campo");
                aviso = 0;
            }
        }
    }//GEN-LAST:event_campoPrecioMaximoKeyTyped

    //====== BOTON VER DETALLE ======//
    private void botonVerDetalleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVerDetalleActionPerformed
        try {
            String nombrePropietario, apellidoPropietario = "", nombreInquilino, apellidoInquilino = "", disponible;
            
            int filaSeleccionada = tablaInmuebles.getSelectedRow();

            int idInmueble = (int) tablaInmuebles.getValueAt(filaSeleccionada, 0);
            InmuebleData inmData = new InmuebleData();
            Inmueble inmueble = inmData.buscarInmueble(idInmueble);

            if (inmueble.getPropietario() != null) {
                nombrePropietario = inmueble.getPropietario().getNombre();
                apellidoPropietario = inmueble.getPropietario().getApellido();
                
            } else {
                nombrePropietario = "Sin propietario";
            }
            
            if(inmueble.getInquilino() != null) {
                nombreInquilino = inmueble.getInquilino().getNombre();
                apellidoInquilino = inmueble.getInquilino().getApellido();
            } else {
                nombreInquilino = "Sin Inquilino";
            }
            
            if (inmueble.isDisponible()) {
                disponible = "Si";
            } else {
                disponible = "No";
            }
            
            String detalles = "ID: " + Integer.toString(inmueble.getIdInmueble())+ "\n"
                    + "Tipo: " + inmueble.getTipo() + "\n"
                    + "Superficie: " + inmueble.getSuperficie() + " m²\n"
                    + "Precio: $" + inmueble.getPrecio() + "\n"
                    + "Zona: " + inmueble.getZona() + "\n"
                    + "Direccion: " + inmueble.getDireccion() + "\n"
                    + "Propietario: " + nombrePropietario + " " + apellidoPropietario + "\n"
                    + "Inquilino: " + nombreInquilino + " " + apellidoInquilino + "\n"
                    + "Disponible: " + disponible;
            JOptionPane.showMessageDialog(null, detalles, "Detalles del inmueble", JOptionPane.INFORMATION_MESSAGE);

        } catch (NullPointerException ex) {

        }catch (ArrayIndexOutOfBoundsException ex) {
            JOptionPane.showMessageDialog(this, "Debe seleccionar un inmueble para ver sus detalles");
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

    // Metodo cargar columnas de la tabla
    private void cargarColumnas() {
        modelo.addColumn("ID Inmuble");
        modelo.addColumn("Tipo");
        modelo.addColumn("Superficie");
        modelo.addColumn("Precio");
        modelo.addColumn("Zona");
        tablaInmuebles.setModel(modelo);
    }

    // Metodo eliminar filas de la tabla
    private void eliminarFilas() {
        int filas = tablaInmuebles.getRowCount() - 1;
        if (filas > -1) {
            for (; filas >= 0; filas--) {
                modelo.removeRow(filas);
            }
        }
    }

    // Metodo cargar filas de la tabla
    private void cargarFilas(Inmueble inmueble) {
        modelo.addRow(new Object[]{inmueble.getIdInmueble(), inmueble.getTipo(), inmueble.getSuperficie(), inmueble.getPrecio(), inmueble.getZona()});
    }

    // Metodo cargar comboBox de Tipo
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

    // Metodo cargar comboBox de Zona
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

    

}
