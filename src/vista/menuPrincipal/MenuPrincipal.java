package vista.menuPrincipal;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import vista.propietario.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import vista.contrato.*;
import vista.inmueble.*;
import vista.inquilino.*;

public final class MenuPrincipal extends javax.swing.JFrame {

    private final List<JPanel> panels = new ArrayList();

    public MenuPrincipal() {
        initComponents();
        cargarPaneles();
        setLocationRelativeTo(null); // Coloca la ventana de ejecucion en el centro
        setExtendedState(MAXIMIZED_BOTH); // abrir en pantalla completa

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImageIcon icon = new ImageIcon(getClass().getResource("/images/bg1.jpg"));
        Image image = icon.getImage();
        Escritorio = new javax.swing.JDesktopPane(){
            public void paintComponent(Graphics g) {
                g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
            }

        };
        panel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        label1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        botonCargarPropietario = new javax.swing.JButton();
        botonVerPropietarios = new javax.swing.JButton();
        panel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        label2 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        botonCargarInmueble = new javax.swing.JButton();
        botonVerInmuebles = new javax.swing.JButton();
        botonVerPorFiltros = new javax.swing.JButton();
        panel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        label3 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        botonCargarInquilino = new javax.swing.JButton();
        botonVerInquilinos = new javax.swing.JButton();
        panel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        label4 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        botonCargarContrato = new javax.swing.JButton();
        botonVerContratos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Escritorio.setBackground(new java.awt.Color(71, 85, 119));

        panel1.setBackground(new java.awt.Color(0, 71, 90));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/usuario.png"))); // NOI18N

        label1.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        label1.setForeground(new java.awt.Color(255, 255, 255));
        label1.setText("Propietario");

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        botonCargarPropietario.setBackground(new java.awt.Color(255, 255, 255));
        botonCargarPropietario.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        botonCargarPropietario.setForeground(new java.awt.Color(0, 0, 0));
        botonCargarPropietario.setText("Datos");
        botonCargarPropietario.setToolTipText("");
        botonCargarPropietario.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonCargarPropietario.setBorderPainted(false);
        botonCargarPropietario.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        botonCargarPropietario.setFocusPainted(false);
        botonCargarPropietario.setFocusable(false);
        botonCargarPropietario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCargarPropietarioActionPerformed(evt);
            }
        });

        botonVerPropietarios.setBackground(new java.awt.Color(255, 255, 255));
        botonVerPropietarios.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        botonVerPropietarios.setForeground(new java.awt.Color(0, 0, 0));
        botonVerPropietarios.setText("Ver propietarios");
        botonVerPropietarios.setFocusable(false);
        botonVerPropietarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVerPropietariosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(label1)
                .addGap(75, 75, 75))
            .addGroup(panel1Layout.createSequentialGroup()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(jLabel2))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(botonVerPropietarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botonCargarPropietario, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label1)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(botonCargarPropietario, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonVerPropietarios, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panel2.setBackground(new java.awt.Color(0, 72, 90));
        panel2.setForeground(new java.awt.Color(90, 90, 90));
        panel2.setPreferredSize(new java.awt.Dimension(285, 595));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/inmueble.png"))); // NOI18N

        label2.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        label2.setForeground(new java.awt.Color(255, 255, 255));
        label2.setText("Inmueble");

        jSeparator3.setForeground(new java.awt.Color(255, 255, 255));

        botonCargarInmueble.setBackground(new java.awt.Color(255, 255, 255));
        botonCargarInmueble.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        botonCargarInmueble.setForeground(new java.awt.Color(0, 0, 0));
        botonCargarInmueble.setText("Datos");
        botonCargarInmueble.setFocusPainted(false);
        botonCargarInmueble.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCargarInmuebleActionPerformed(evt);
            }
        });

        botonVerInmuebles.setBackground(new java.awt.Color(255, 255, 255));
        botonVerInmuebles.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        botonVerInmuebles.setForeground(new java.awt.Color(0, 0, 0));
        botonVerInmuebles.setText("Ver Inmuebles");
        botonVerInmuebles.setFocusPainted(false);
        botonVerInmuebles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVerInmueblesActionPerformed(evt);
            }
        });

        botonVerPorFiltros.setBackground(new java.awt.Color(255, 255, 255));
        botonVerPorFiltros.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        botonVerPorFiltros.setForeground(new java.awt.Color(0, 0, 0));
        botonVerPorFiltros.setText("Ver por filtros");
        botonVerPorFiltros.setFocusPainted(false);
        botonVerPorFiltros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVerPorFiltrosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator3)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                .addContainerGap(69, Short.MAX_VALUE)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                        .addComponent(label2)
                        .addGap(74, 74, 74))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(106, 106, 106))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                        .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(botonCargarInmueble, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(botonVerInmuebles, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(botonVerPorFiltros, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(51, 51, 51))))
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(label2)
                .addGap(18, 18, 18)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(botonCargarInmueble, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonVerInmuebles, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonVerPorFiltros, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panel3.setBackground(new java.awt.Color(0, 72, 90));
        panel3.setForeground(new java.awt.Color(90, 90, 90));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/usuario.png"))); // NOI18N

        label3.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        label3.setForeground(new java.awt.Color(255, 255, 255));
        label3.setText("Inquilino");

        jSeparator5.setForeground(new java.awt.Color(255, 255, 255));

        botonCargarInquilino.setBackground(new java.awt.Color(255, 255, 255));
        botonCargarInquilino.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        botonCargarInquilino.setForeground(new java.awt.Color(0, 0, 0));
        botonCargarInquilino.setText("Datos");
        botonCargarInquilino.setFocusPainted(false);
        botonCargarInquilino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCargarInquilinoActionPerformed(evt);
            }
        });

        botonVerInquilinos.setBackground(new java.awt.Color(255, 255, 255));
        botonVerInquilinos.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        botonVerInquilinos.setForeground(new java.awt.Color(0, 0, 0));
        botonVerInquilinos.setText("Ver inquilinos");
        botonVerInquilinos.setFocusPainted(false);
        botonVerInquilinos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVerInquilinosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel3Layout = new javax.swing.GroupLayout(panel3);
        panel3.setLayout(panel3Layout);
        panel3Layout.setHorizontalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator5)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel3Layout.createSequentialGroup()
                .addContainerGap(65, Short.MAX_VALUE)
                .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel3Layout.createSequentialGroup()
                        .addComponent(label3)
                        .addGap(86, 86, 86))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel3Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(111, 111, 111))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel3Layout.createSequentialGroup()
                        .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(botonCargarInquilino, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botonVerInquilinos, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(55, 55, 55))))
        );
        panel3Layout.setVerticalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label3)
                .addGap(18, 18, 18)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(botonCargarInquilino, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonVerInquilinos, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panel4.setBackground(new java.awt.Color(0, 72, 90));
        panel4.setForeground(new java.awt.Color(90, 90, 90));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/contrato.png"))); // NOI18N

        label4.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        label4.setForeground(new java.awt.Color(255, 255, 255));
        label4.setText("Contrato");

        jSeparator6.setForeground(new java.awt.Color(255, 255, 255));

        botonCargarContrato.setBackground(new java.awt.Color(255, 255, 255));
        botonCargarContrato.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        botonCargarContrato.setForeground(new java.awt.Color(0, 0, 0));
        botonCargarContrato.setText("Datos");
        botonCargarContrato.setFocusPainted(false);
        botonCargarContrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCargarContratoActionPerformed(evt);
            }
        });

        botonVerContratos.setBackground(new java.awt.Color(255, 255, 255));
        botonVerContratos.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        botonVerContratos.setForeground(new java.awt.Color(0, 0, 0));
        botonVerContratos.setText("Ver contratos");
        botonVerContratos.setFocusPainted(false);
        botonVerContratos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVerContratosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel4Layout = new javax.swing.GroupLayout(panel4);
        panel4.setLayout(panel4Layout);
        panel4Layout.setHorizontalGroup(
            panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator6)
            .addGroup(panel4Layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addGroup(panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label4)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel4Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(21, 21, 21)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel4Layout.createSequentialGroup()
                .addContainerGap(66, Short.MAX_VALUE)
                .addGroup(panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botonCargarContrato, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonVerContratos, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54))
        );
        panel4Layout.setVerticalGroup(
            panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel4Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(label4)
                .addGap(18, 18, 18)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(botonCargarContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonVerContratos, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(99, Short.MAX_VALUE))
        );

        Escritorio.setLayer(panel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Escritorio.setLayer(panel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Escritorio.setLayer(panel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Escritorio.setLayer(panel4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout EscritorioLayout = new javax.swing.GroupLayout(Escritorio);
        Escritorio.setLayout(EscritorioLayout);
        EscritorioLayout.setHorizontalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(EscritorioLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(panel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(panel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        EscritorioLayout.setVerticalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EscritorioLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel2, javax.swing.GroupLayout.DEFAULT_SIZE, 446, Short.MAX_VALUE)
                    .addComponent(panel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Escritorio, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Escritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonCargarPropietarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCargarPropietarioActionPerformed
        Escritorio.removeAll();
        Escritorio.repaint();
        CargaDePropietario cargaPropietario = new CargaDePropietario(this);
        cargaPropietario.setVisible(true);
        Escritorio.add(cargaPropietario);
        Escritorio.moveToFront(cargaPropietario);
    }//GEN-LAST:event_botonCargarPropietarioActionPerformed

    private void botonVerPorFiltrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVerPorFiltrosActionPerformed
        Escritorio.removeAll();
        Escritorio.repaint();
        VerPorFiltros verPorFiltros = new VerPorFiltros(this);
        verPorFiltros.setVisible(true);
        Escritorio.add(verPorFiltros);
        Escritorio.moveToFront(verPorFiltros);
    }//GEN-LAST:event_botonVerPorFiltrosActionPerformed

    private void botonCargarInmuebleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCargarInmuebleActionPerformed
        Escritorio.removeAll();
        Escritorio.repaint();
        CargaDeInmueble CargaDeInmueble = new CargaDeInmueble(this);
        CargaDeInmueble.setVisible(true);
        Escritorio.add(CargaDeInmueble);
        Escritorio.moveToFront(CargaDeInmueble);
    }//GEN-LAST:event_botonCargarInmuebleActionPerformed

    private void botonCargarInquilinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCargarInquilinoActionPerformed
        Escritorio.removeAll();
        Escritorio.repaint();
        CargaDeInquilino CargaDeInquilino = new CargaDeInquilino(this);
        CargaDeInquilino.setVisible(true);
        Escritorio.add(CargaDeInquilino);
        Escritorio.moveToFront(CargaDeInquilino);
    }//GEN-LAST:event_botonCargarInquilinoActionPerformed

    private void botonCargarContratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCargarContratoActionPerformed
        Escritorio.removeAll();
        Escritorio.repaint();
        CargaDeContrato CargaDeContrato = new CargaDeContrato(this);
        CargaDeContrato.setVisible(true);
        Escritorio.add(CargaDeContrato);
        Escritorio.moveToFront(CargaDeContrato);
    }//GEN-LAST:event_botonCargarContratoActionPerformed

    private void botonVerInmueblesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVerInmueblesActionPerformed
        Escritorio.removeAll();
        Escritorio.repaint();
        VerInmuebles verInmuebles = new VerInmuebles(this);
        verInmuebles.setVisible(true);
        Escritorio.add(verInmuebles);
        Escritorio.moveToFront(verInmuebles);
    }//GEN-LAST:event_botonVerInmueblesActionPerformed

    private void botonVerInquilinosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVerInquilinosActionPerformed
        Escritorio.removeAll();
        Escritorio.repaint();
        VerInquilinos VerInquilinos = new VerInquilinos(this);
        VerInquilinos.setVisible(true);
        Escritorio.add(VerInquilinos);
        Escritorio.moveToFront(VerInquilinos);
    }//GEN-LAST:event_botonVerInquilinosActionPerformed

    private void botonVerContratosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVerContratosActionPerformed
        Escritorio.removeAll();
        Escritorio.repaint();
        VerContratos contrato = new VerContratos(this);
        contrato.setVisible(true);
        Escritorio.add(contrato);
        Escritorio.moveToFront(contrato);
    }//GEN-LAST:event_botonVerContratosActionPerformed

    private void botonVerPropietariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVerPropietariosActionPerformed
        Escritorio.removeAll();
        Escritorio.repaint();
        VerPropietarios verPropietarios = new VerPropietarios(this);
        verPropietarios.setVisible(true);
        Escritorio.add(verPropietarios);
        Escritorio.moveToFront(verPropietarios);
    }//GEN-LAST:event_botonVerPropietariosActionPerformed

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane Escritorio;
    private javax.swing.JButton botonCargarContrato;
    private javax.swing.JButton botonCargarInmueble;
    private javax.swing.JButton botonCargarInquilino;
    private javax.swing.JButton botonCargarPropietario;
    private javax.swing.JButton botonVerContratos;
    private javax.swing.JButton botonVerInmuebles;
    private javax.swing.JButton botonVerInquilinos;
    private javax.swing.JButton botonVerPorFiltros;
    private javax.swing.JButton botonVerPropietarios;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label2;
    private javax.swing.JLabel label3;
    private javax.swing.JLabel label4;
    private javax.swing.JPanel panel1;
    private javax.swing.JPanel panel2;
    private javax.swing.JPanel panel3;
    private javax.swing.JPanel panel4;
    // End of variables declaration//GEN-END:variables

    // Metodo para mostrar los paneles al cerrar internalFrames
    public void mostrarItemsEscritorio() {
        Escritorio.repaint();

        for (JPanel panel : panels) {
            Escritorio.add(panel);
        }
    }

    // Metodo de cargar los paneles
    private void cargarPaneles() {
        panels.add(panel1);
        panels.add(panel2);
        panels.add(panel3);
        panels.add(panel4);

        // diseños de paneles
        panel1.setBackground(new Color(0, 71, 90, 180));
        panel2.setBackground(new Color(0, 71, 90, 180));
        panel3.setBackground(new Color(0, 71, 90, 180));
        panel4.setBackground(new Color(0, 71, 90, 180));
        

    }

}
