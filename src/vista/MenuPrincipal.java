package vista;

import vista.propietario.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JLabel;
import vista.contrato.*;
import vista.inmueble.*;
import vista.inquilino.*;

public class MenuPrincipal extends javax.swing.JFrame {

    private final List<JButton> buttons = new ArrayList();
    private final List<JLabel> labels = new ArrayList();

    public MenuPrincipal() {
        initComponents();
        cargarBotones();
        cargarLabels();
        setLocationRelativeTo(null); // Coloca la ventana en el centro
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        Escritorio = new javax.swing.JDesktopPane();
        label1 = new javax.swing.JLabel();
        botonCargarPropietario = new javax.swing.JButton();
        botonVerPropietarios = new javax.swing.JButton();
        label2 = new javax.swing.JLabel();
        botonCargarInmueble = new javax.swing.JButton();
        botonVerInmuebles = new javax.swing.JButton();
        botonVerTodos = new javax.swing.JButton();
        label3 = new javax.swing.JLabel();
        botonCargarInquilino = new javax.swing.JButton();
        botonVerInquilinos = new javax.swing.JButton();
        botonVerPorFiltros = new javax.swing.JButton();
        label4 = new javax.swing.JLabel();
        botonCargarContrato = new javax.swing.JButton();
        botonVerContratos = new javax.swing.JButton();
        botonSalir = new javax.swing.JButton();

        jMenu1.setText("jMenu1");

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        label1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        label1.setForeground(new java.awt.Color(0, 0, 0));
        label1.setText("Propietario");

        botonCargarPropietario.setBackground(new java.awt.Color(255, 255, 255));
        botonCargarPropietario.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        botonCargarPropietario.setForeground(new java.awt.Color(0, 0, 0));
        botonCargarPropietario.setText("Datos");
        botonCargarPropietario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCargarPropietarioActionPerformed(evt);
            }
        });

        botonVerPropietarios.setBackground(new java.awt.Color(255, 255, 255));
        botonVerPropietarios.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        botonVerPropietarios.setForeground(new java.awt.Color(0, 0, 0));
        botonVerPropietarios.setText("Ver propietarios");

        label2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        label2.setForeground(new java.awt.Color(0, 0, 0));
        label2.setText("Inmueble");

        botonCargarInmueble.setBackground(new java.awt.Color(255, 255, 255));
        botonCargarInmueble.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        botonCargarInmueble.setForeground(new java.awt.Color(0, 0, 0));
        botonCargarInmueble.setText("Datos");
        botonCargarInmueble.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCargarInmuebleActionPerformed(evt);
            }
        });

        botonVerInmuebles.setBackground(new java.awt.Color(255, 255, 255));
        botonVerInmuebles.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        botonVerInmuebles.setForeground(new java.awt.Color(0, 0, 0));
        botonVerInmuebles.setText("Ver Inmuebles");
        botonVerInmuebles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVerInmueblesActionPerformed(evt);
            }
        });

        botonVerTodos.setBackground(new java.awt.Color(255, 255, 255));
        botonVerTodos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        botonVerTodos.setForeground(new java.awt.Color(0, 0, 0));
        botonVerTodos.setText("Ver todos");

        label3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        label3.setForeground(new java.awt.Color(0, 0, 0));
        label3.setText("Inquilino");

        botonCargarInquilino.setBackground(new java.awt.Color(255, 255, 255));
        botonCargarInquilino.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        botonCargarInquilino.setForeground(new java.awt.Color(0, 0, 0));
        botonCargarInquilino.setText("Datos");
        botonCargarInquilino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCargarInquilinoActionPerformed(evt);
            }
        });

        botonVerInquilinos.setBackground(new java.awt.Color(255, 255, 255));
        botonVerInquilinos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        botonVerInquilinos.setForeground(new java.awt.Color(0, 0, 0));
        botonVerInquilinos.setText("Ver inquilinos");
        botonVerInquilinos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVerInquilinosActionPerformed(evt);
            }
        });

        botonVerPorFiltros.setBackground(new java.awt.Color(255, 255, 255));
        botonVerPorFiltros.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        botonVerPorFiltros.setForeground(new java.awt.Color(0, 0, 0));
        botonVerPorFiltros.setText("Ver por filtros");
        botonVerPorFiltros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVerPorFiltrosActionPerformed(evt);
            }
        });

        label4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        label4.setForeground(new java.awt.Color(0, 0, 0));
        label4.setText("Contratos");

        botonCargarContrato.setBackground(new java.awt.Color(255, 255, 255));
        botonCargarContrato.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        botonCargarContrato.setForeground(new java.awt.Color(0, 0, 0));
        botonCargarContrato.setText("Datos");
        botonCargarContrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCargarContratoActionPerformed(evt);
            }
        });

        botonVerContratos.setBackground(new java.awt.Color(255, 255, 255));
        botonVerContratos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        botonVerContratos.setForeground(new java.awt.Color(0, 0, 0));
        botonVerContratos.setText("Ver contratos");
        botonVerContratos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVerContratosActionPerformed(evt);
            }
        });

        botonSalir.setBackground(new java.awt.Color(234, 65, 65));
        botonSalir.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        botonSalir.setForeground(new java.awt.Color(0, 0, 0));
        botonSalir.setText("SALIR");
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });

        Escritorio.setLayer(label1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Escritorio.setLayer(botonCargarPropietario, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Escritorio.setLayer(botonVerPropietarios, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Escritorio.setLayer(label2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Escritorio.setLayer(botonCargarInmueble, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Escritorio.setLayer(botonVerInmuebles, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Escritorio.setLayer(botonVerTodos, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Escritorio.setLayer(label3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Escritorio.setLayer(botonCargarInquilino, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Escritorio.setLayer(botonVerInquilinos, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Escritorio.setLayer(botonVerPorFiltros, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Escritorio.setLayer(label4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Escritorio.setLayer(botonCargarContrato, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Escritorio.setLayer(botonVerContratos, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Escritorio.setLayer(botonSalir, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout EscritorioLayout = new javax.swing.GroupLayout(Escritorio);
        Escritorio.setLayout(EscritorioLayout);
        EscritorioLayout.setHorizontalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EscritorioLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label1)
                    .addComponent(label2)
                    .addComponent(label3)
                    .addComponent(label4))
                .addGap(69, 69, 69)
                .addGroup(EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(EscritorioLayout.createSequentialGroup()
                        .addComponent(botonCargarInquilino)
                        .addGap(18, 18, 18)
                        .addComponent(botonVerInquilinos))
                    .addGroup(EscritorioLayout.createSequentialGroup()
                        .addComponent(botonCargarContrato)
                        .addGap(18, 18, 18)
                        .addComponent(botonVerContratos))
                    .addGroup(EscritorioLayout.createSequentialGroup()
                        .addGroup(EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(botonCargarPropietario)
                            .addComponent(botonCargarInmueble))
                        .addGap(18, 18, 18)
                        .addGroup(EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botonVerPropietarios)
                            .addGroup(EscritorioLayout.createSequentialGroup()
                                .addComponent(botonVerInmuebles)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(botonVerTodos)
                                .addGap(18, 18, 18)
                                .addComponent(botonVerPorFiltros)))))
                .addContainerGap(136, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EscritorioLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonSalir)
                .addContainerGap())
        );
        EscritorioLayout.setVerticalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EscritorioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83)
                .addGroup(EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label1)
                    .addComponent(botonCargarPropietario)
                    .addComponent(botonVerPropietarios))
                .addGap(71, 71, 71)
                .addGroup(EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label2)
                    .addComponent(botonCargarInmueble)
                    .addComponent(botonVerInmuebles)
                    .addComponent(botonVerTodos)
                    .addComponent(botonVerPorFiltros))
                .addGap(70, 70, 70)
                .addGroup(EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label3)
                    .addComponent(botonCargarInquilino)
                    .addComponent(botonVerInquilinos))
                .addGap(75, 75, 75)
                .addGroup(EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label4)
                    .addGroup(EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(botonCargarContrato)
                        .addComponent(botonVerContratos)))
                .addContainerGap(153, Short.MAX_VALUE))
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

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_botonSalirActionPerformed

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
        CargaDeInmueble cargaDeInmueble = new CargaDeInmueble(this);
        cargaDeInmueble.setVisible(true);
        Escritorio.add(cargaDeInmueble);
        Escritorio.moveToFront(cargaDeInmueble);
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
    private javax.swing.JButton botonVerTodos;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label2;
    private javax.swing.JLabel label3;
    private javax.swing.JLabel label4;
    // End of variables declaration//GEN-END:variables

    public void mostrarItemsEscritorio() {
        Escritorio.repaint();

        for (JButton button : buttons) {
            Escritorio.add(button);
        }

        for (JLabel label : labels) {
            Escritorio.add(label);
        }
    }

    public void cargarBotones() {
        buttons.add(botonCargarPropietario);
        buttons.add(botonVerPropietarios);
        buttons.add(botonCargarInmueble);
        buttons.add(botonVerInmuebles);
        buttons.add(botonVerTodos);
        buttons.add(botonVerPorFiltros);
        buttons.add(botonCargarInquilino);
        buttons.add(botonVerInquilinos);
        buttons.add(botonCargarContrato);
        buttons.add(botonVerContratos);
        buttons.add(botonSalir);
    }

    public void cargarLabels() {
        labels.add(label1);
        labels.add(label2);
        labels.add(label3);
        labels.add(label4);
    }

}
