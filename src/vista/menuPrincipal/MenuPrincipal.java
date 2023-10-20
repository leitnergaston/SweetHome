package vista.menuPrincipal;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.PopupMenu;
import vista.propietario.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import vista.contrato.*;
import vista.inmueble.*;
import vista.inquilino.*;

public final class MenuPrincipal extends javax.swing.JFrame {

    private final List<JButton> buttons = new ArrayList();
    private final List<JLabel> labels = new ArrayList();
    private final List<JPanel> panels = new ArrayList();

    public MenuPrincipal() {
        initComponents();
        cargarPaneles();
        setLocationRelativeTo(null); // Coloca la ventana en el centro
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImageIcon icon = new ImageIcon(getClass().getResource("/images/bg1.jpg"));
        Image image = icon.getImage();
        Escritorio = new javax.swing.JDesktopPane(){
            public void paintComponent(Graphics g) {
                g.drawImage(image, 0, 0, 1280, 720, this);
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
        botonSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Escritorio.setBackground(new java.awt.Color(71, 85, 119));

        panel1.setBackground(new java.awt.Color(0, 71, 90));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/usuario.png"))); // NOI18N

        label1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        label1.setForeground(new java.awt.Color(255, 255, 255));
        label1.setText("Propietario");

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        botonCargarPropietario.setBackground(new java.awt.Color(255, 255, 255));
        botonCargarPropietario.setFont(new java.awt.Font("GeoSlab703 Md BT", 0, 18)); // NOI18N
        botonCargarPropietario.setForeground(new java.awt.Color(0, 0, 0));
        botonCargarPropietario.setText("Datos");
        botonCargarPropietario.setToolTipText("");
        botonCargarPropietario.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        botonCargarPropietario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCargarPropietarioActionPerformed(evt);
            }
        });

        botonVerPropietarios.setBackground(new java.awt.Color(255, 255, 255));
        botonVerPropietarios.setFont(new java.awt.Font("GeoSlab703 Md BT", 0, 18)); // NOI18N
        botonVerPropietarios.setForeground(new java.awt.Color(0, 0, 0));
        botonVerPropietarios.setText("Ver propietarios");
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
            .addGroup(panel1Layout.createSequentialGroup()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(botonVerPropietarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botonCargarPropietario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(label1)))
                .addContainerGap(40, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(84, 84, 84))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label1)
                .addGap(31, 31, 31)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonCargarPropietario, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonVerPropietarios, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(111, Short.MAX_VALUE))
        );

        panel2.setBackground(new java.awt.Color(0, 72, 90));
        panel2.setForeground(new java.awt.Color(90, 90, 90));
        panel2.setPreferredSize(new java.awt.Dimension(285, 595));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/inmueble.png"))); // NOI18N

        label2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        label2.setForeground(new java.awt.Color(255, 255, 255));
        label2.setText("Inmueble");

        jSeparator3.setForeground(new java.awt.Color(255, 255, 255));

        botonCargarInmueble.setBackground(new java.awt.Color(255, 255, 255));
        botonCargarInmueble.setFont(new java.awt.Font("GeoSlab703 Md BT", 0, 18)); // NOI18N
        botonCargarInmueble.setForeground(new java.awt.Color(0, 0, 0));
        botonCargarInmueble.setText("Datos");
        botonCargarInmueble.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCargarInmuebleActionPerformed(evt);
            }
        });

        botonVerInmuebles.setBackground(new java.awt.Color(255, 255, 255));
        botonVerInmuebles.setFont(new java.awt.Font("GeoSlab703 Md BT", 0, 18)); // NOI18N
        botonVerInmuebles.setForeground(new java.awt.Color(0, 0, 0));
        botonVerInmuebles.setText("Ver Inmuebles");
        botonVerInmuebles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVerInmueblesActionPerformed(evt);
            }
        });

        botonVerPorFiltros.setBackground(new java.awt.Color(255, 255, 255));
        botonVerPorFiltros.setFont(new java.awt.Font("GeoSlab703 Md BT", 0, 18)); // NOI18N
        botonVerPorFiltros.setForeground(new java.awt.Color(0, 0, 0));
        botonVerPorFiltros.setText("Ver por filtros");
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
                .addContainerGap(39, Short.MAX_VALUE)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                        .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botonVerInmuebles, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonCargarInmueble, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonVerPorFiltros, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(83, 83, 83))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                        .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54))))
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label2)
                .addGap(31, 31, 31)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonCargarInmueble, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonVerInmuebles, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonVerPorFiltros, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panel3.setBackground(new java.awt.Color(0, 72, 90));
        panel3.setForeground(new java.awt.Color(90, 90, 90));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/usuario.png"))); // NOI18N

        label3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        label3.setForeground(new java.awt.Color(255, 255, 255));
        label3.setText("Inquilino");

        jSeparator5.setForeground(new java.awt.Color(255, 255, 255));

        botonCargarInquilino.setBackground(new java.awt.Color(255, 255, 255));
        botonCargarInquilino.setFont(new java.awt.Font("GeoSlab703 Md BT", 0, 18)); // NOI18N
        botonCargarInquilino.setForeground(new java.awt.Color(0, 0, 0));
        botonCargarInquilino.setText("Datos");
        botonCargarInquilino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCargarInquilinoActionPerformed(evt);
            }
        });

        botonVerInquilinos.setBackground(new java.awt.Color(255, 255, 255));
        botonVerInquilinos.setFont(new java.awt.Font("GeoSlab703 Md BT", 0, 18)); // NOI18N
        botonVerInquilinos.setForeground(new java.awt.Color(0, 0, 0));
        botonVerInquilinos.setText("Ver inquilinos");
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
            .addGroup(panel3Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botonCargarInquilino, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                    .addComponent(botonVerInquilinos, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE))
                .addContainerGap(38, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(86, 86, 86))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(label3)
                .addGap(64, 64, 64))
        );
        panel3Layout.setVerticalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel3Layout.createSequentialGroup()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label3)
                .addGap(30, 30, 30)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonCargarInquilino, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonVerInquilinos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panel4.setBackground(new java.awt.Color(0, 72, 90));
        panel4.setForeground(new java.awt.Color(90, 90, 90));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/contrato.png"))); // NOI18N

        label4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        label4.setForeground(new java.awt.Color(255, 255, 255));
        label4.setText("Contrato");

        jSeparator6.setForeground(new java.awt.Color(255, 255, 255));

        botonCargarContrato.setBackground(new java.awt.Color(255, 255, 255));
        botonCargarContrato.setFont(new java.awt.Font("GeoSlab703 Md BT", 0, 18)); // NOI18N
        botonCargarContrato.setForeground(new java.awt.Color(0, 0, 0));
        botonCargarContrato.setText("Datos");
        botonCargarContrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCargarContratoActionPerformed(evt);
            }
        });

        botonVerContratos.setBackground(new java.awt.Color(255, 255, 255));
        botonVerContratos.setFont(new java.awt.Font("GeoSlab703 Md BT", 0, 18)); // NOI18N
        botonVerContratos.setForeground(new java.awt.Color(0, 0, 0));
        botonVerContratos.setText("Ver contratos");
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(label4)
                .addGap(68, 68, 68))
            .addGroup(panel4Layout.createSequentialGroup()
                .addGroup(panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel4Layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(jLabel8))
                    .addGroup(panel4Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botonVerContratos, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonCargarContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        panel4Layout.setVerticalGroup(
            panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel4Layout.createSequentialGroup()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label4)
                .addGap(31, 31, 31)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonCargarContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonVerContratos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        botonSalir.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        botonSalir.setForeground(new java.awt.Color(0, 0, 0));
        botonSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/buttonExit.png"))); // NOI18N
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });

        Escritorio.setLayer(panel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Escritorio.setLayer(panel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Escritorio.setLayer(panel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Escritorio.setLayer(panel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Escritorio.setLayer(botonSalir, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout EscritorioLayout = new javax.swing.GroupLayout(Escritorio);
        Escritorio.setLayout(EscritorioLayout);
        EscritorioLayout.setHorizontalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(EscritorioLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonSalir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EscritorioLayout.createSequentialGroup()
                        .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(panel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(panel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        EscritorioLayout.setVerticalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EscritorioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86)
                .addGroup(EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel2, javax.swing.GroupLayout.DEFAULT_SIZE, 370, Short.MAX_VALUE)
                    .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(120, Short.MAX_VALUE))
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

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_botonSalirActionPerformed


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
    private javax.swing.JButton botonSalir;
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

    
    
    public void mostrarItemsEscritorio() {
        Escritorio.repaint();
        Escritorio.add(botonSalir);
        
        for (JPanel panel : panels) {
            Escritorio.add(panel);
        }
    }
    
    public void cargarPaneles(){
        panels.add(panel1);
        panels.add(panel2);
        panels.add(panel3);
        panels.add(panel4);
    }

   
    


}
