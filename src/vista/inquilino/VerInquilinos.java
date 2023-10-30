package vista.inquilino;

import accesoADatos.InquilinoData;
import entidades.Inquilino;
import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import vista.menuPrincipal.MenuPrincipal;

public class VerInquilinos extends javax.swing.JInternalFrame {

    private FondoPanel fondo = new FondoPanel();    
    private DefaultTableModel modelo = new DefaultTableModel() {
        public boolean isCellEditable(int f, int c) {
            return false;
        }
    };
    private MenuPrincipal menuPrincipal;
    int aviso = 0;

    public VerInquilinos(MenuPrincipal menuPrincipal) {
        this.setContentPane(fondo);
        initComponents();
        this.menuPrincipal = menuPrincipal;
        cargarColumnas();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
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
        jButton1 = new javax.swing.JButton();

        botonVerDetalles.setFont(new java.awt.Font("Swis721 Hv BT", 0, 12)); // NOI18N
        botonVerDetalles.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconVerDetalles.png"))); // NOI18N
        botonVerDetalles.setText("Ver detalles");
        botonVerDetalles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVerDetallesActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(10, 110, 182));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Ver Inquilinos");

        botonSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconSalir.png"))); // NOI18N
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });

        tablaInquilinos.setBackground(new java.awt.Color(255, 236, 218));
        tablaInquilinos.setForeground(new java.awt.Color(0, 0, 0));
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
        tablaInquilinos.setSelectionBackground(new java.awt.Color(183, 142, 80));
        tablaInquilinos.setSelectionForeground(new java.awt.Color(255, 255, 255));
        tablaInquilinos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaInquilinosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaInquilinos);

        campoCuit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campoCuitKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel2.setText("Filtrar por . . .");

        botonBuscarApellido.setFont(new java.awt.Font("Swis721 Hv BT", 0, 12)); // NOI18N
        botonBuscarApellido.setText("Buscar por Apellido");
        botonBuscarApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarApellidoActionPerformed(evt);
            }
        });

        jLabel3.setText("Apellido");

        botonBuscarNombre.setFont(new java.awt.Font("Swis721 Hv BT", 0, 12)); // NOI18N
        botonBuscarNombre.setText("Buscar por Nombre");
        botonBuscarNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarNombreActionPerformed(evt);
            }
        });

        campoApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campoApellidoKeyTyped(evt);
            }
        });

        botonBuscarCuit.setFont(new java.awt.Font("Swis721 Hv BT", 0, 12)); // NOI18N
        botonBuscarCuit.setText("Buscar por CUIT/CUIL");
        botonBuscarCuit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarCuitActionPerformed(evt);
            }
        });

        jLabel4.setText("Nombre");

        campoNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campoNombreKeyTyped(evt);
            }
        });

        jLabel5.setText("CUIT/CUIL");

        buttonGroup1.add(radioBInactivos);
        radioBInactivos.setText("Inactivos");

        buttonGroup1.add(radioBTodos);
        radioBTodos.setText("Todos");

        buttonGroup1.add(radioBActivos);
        radioBActivos.setText("Activos");

        jButton1.setFont(new java.awt.Font("Swis721 Hv BT", 0, 12)); // NOI18N
        jButton1.setText("Buscar Por Filtro");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addComponent(botonVerDetalles)
                        .addGap(99, 99, 99)
                        .addComponent(botonSalir))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(campoApellido)
                                    .addComponent(campoNombre)
                                    .addComponent(campoCuit, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(60, 60, 60)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(botonBuscarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(botonBuscarCuit, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(radioBTodos)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(86, 86, 86))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(radioBActivos)
                                        .addGap(18, 18, 18)
                                        .addComponent(radioBInactivos)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(botonBuscarApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioBTodos)
                    .addComponent(radioBActivos)
                    .addComponent(radioBInactivos)
                    .addComponent(jLabel2)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(botonBuscarApellido)
                    .addComponent(campoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botonSalir)
                    .addComponent(botonVerDetalles))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        dispose();
        menuPrincipal.mostrarItemsEscritorio();
    }//GEN-LAST:event_botonSalirActionPerformed

    public static boolean Validar(String datos) {
        return datos.matches("[a-zA-Z ]*");
    }

    private void botonBuscarApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarApellidoActionPerformed
        
        eliminarFilas();
        if (campoApellido.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese el apellido a buscar");
        } else {
            if (VerInquilinos.Validar(campoApellido.getText())) {
                String apellido = campoApellido.getText() + "%";
                InquilinoData inqdata = new InquilinoData();
                ArrayList<Inquilino> inq = new ArrayList<>();
                inq = inqdata.buscarInquilinoPorApellido(apellido);
                if (inq.isEmpty()) {
                    JOptionPane.showMessageDialog(this, "No hay inquilino/s con este apellido");
                } else {
                    campoNombre.setText("");
                    campoCuit.setText("");
                    eliminarFilas();
                    for (Inquilino inq1 : inq) {
                        cargarfilas(inq1);
                    }
                }
            } else {
                JOptionPane.showMessageDialog(this, "Solo letras en el campo Apellido");
                campoApellido.setText("");
            }
        }
    }//GEN-LAST:event_botonBuscarApellidoActionPerformed

    private void botonBuscarNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarNombreActionPerformed

        eliminarFilas();
        if (campoNombre.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese el Nombre a buscar");
        } else {
            if (VerInquilinos.Validar(campoNombre.getText())) {
                String nombre = campoNombre.getText() + "%";
                InquilinoData inqdata = new InquilinoData();
                ArrayList<Inquilino> inq = new ArrayList<>();
                inq = inqdata.buscarInquilinoPorNombre(nombre);
                if (inq.isEmpty()) {
                    JOptionPane.showMessageDialog(this, "No hay inquilino/s con este Nombre");
                } else {
                    eliminarFilas();
                    campoApellido.setText("");
                    campoCuit.setText("");
                    for (Inquilino inq1 : inq) {
                        cargarfilas(inq1);
                    }
                }
            } else {
                JOptionPane.showMessageDialog(this, "Solo letras en el campo Nombre");
                campoNombre.setText("");
            }
        }
    }//GEN-LAST:event_botonBuscarNombreActionPerformed

    private void botonBuscarCuitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarCuitActionPerformed

        eliminarFilas();
        if (campoCuit.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese el Cuit a buscar");
        } else {
            long cuit = Long.parseLong(campoCuit.getText());
            InquilinoData inqdata = new InquilinoData();
            ArrayList<Inquilino> inq = new ArrayList<>();
            inq = inqdata.buscarInquilinoPorcuil(cuit);
            if (inq.isEmpty()) {
                JOptionPane.showMessageDialog(this, "No hay inquilino/s con este cuit");
            } else {
                campoNombre.setText("");
                campoApellido.setText("");
                eliminarFilas();
                for (Inquilino inq1 : inq) {
                    cargarfilas(inq1);
                }
            }

        }
    }//GEN-LAST:event_botonBuscarCuitActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ArrayList<Inquilino> inquili;
        InquilinoData inqdata = new InquilinoData();

        if (radioBTodos.isSelected()) {
            inquili = inqdata.listarinquilinosT();
            eliminarFilas();
            if (inquili.isEmpty()) {
                JOptionPane.showConfirmDialog(this, "No hay inquilinos");
                eliminarFilas();
            } else {
                for (Inquilino inqi : inquili) {
                    cargarfilas(inqi);
                }
            }
        } else if (radioBActivos.isSelected()) {
            inquili = inqdata.listarinquilinosA();
            eliminarFilas();
            if (inquili.isEmpty()) {
                JOptionPane.showMessageDialog(this, "No hay inquilinos activos");
                eliminarFilas();
            } else {
                for (Inquilino inqi : inquili) {
                    cargarfilas(inqi);
                }
            }
        } else if (radioBInactivos.isSelected()) {
            inquili = inqdata.listarinquilinosI();
            eliminarFilas();
            if (inquili.isEmpty()) {
                JOptionPane.showMessageDialog(this, "No hay inquilinos inactivos");
                eliminarFilas();
            } else {
                for (Inquilino inqi : inquili) {
                    cargarfilas(inqi);
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Seleccion un filtro para bscar");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void botonVerDetallesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVerDetallesActionPerformed
        int filaSeleccionada = tablaInquilinos.getSelectedRow();
        InquilinoData inqdata = new InquilinoData();
        if (filaSeleccionada >= 0) {
            int id = (int) tablaInquilinos.getValueAt(filaSeleccionada, 0);
            Inquilino inq = inqdata.buscarInquilinoPorId(id);
            String estado;
            if (inq.isEstado()) {
                estado = "Activo";
            } else {
                estado = "Inactivo";
            }
            String detalles = "ID: " + inq.getIdInquilino() + "\n"
                    + "CUIT: " + inq.getCuit() + "\n"
                    + "Apellido: " + inq.getApellido() + "\n"
                    + "Nombre: " + inq.getNombre() + "\n"
                    + "Lugar de Trabajo: " + inq.getLugarDeTrabajo() + "\n"
                    + "Nombre Del Garante: " + inq.getNombreGarante() + "\n"
                    + "DNI del garante: " + inq.getDniGarante() + "\n"
                    + "Estado: " + estado;
            JOptionPane.showMessageDialog(null, detalles, "Detalles del Inquilino", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "No se ha seleccionado Inquilino", "Advertencia", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_botonVerDetallesActionPerformed

    private void tablaInquilinosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaInquilinosMouseClicked

    }//GEN-LAST:event_tablaInquilinosMouseClicked

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonBuscarApellido;
    private javax.swing.JButton botonBuscarCuit;
    private javax.swing.JButton botonBuscarNombre;
    private javax.swing.JButton botonSalir;
    private javax.swing.JButton botonVerDetalles;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField campoApellido;
    private javax.swing.JTextField campoCuit;
    private javax.swing.JTextField campoNombre;
    private javax.swing.JButton jButton1;
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

    private void eliminarFilas() {
        int filas = tablaInquilinos.getRowCount() - 1;
        if (filas > -1) {
            for (; filas >= 0; filas--) {
                modelo.removeRow(filas);
            }
        }
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
