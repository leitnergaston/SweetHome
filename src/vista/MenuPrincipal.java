
package vista;

<<<<<<< HEAD
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
=======
>>>>>>> a26a556dd2c1741cdd355a0300ad58dc8a048011

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
        Escritorio = new javax.swing.JDesktopPane();
        label1 = new javax.swing.JLabel();
        botonCargarPropietario = new javax.swing.JButton();
        botonVerPropietarios = new javax.swing.JButton();
        label2 = new javax.swing.JLabel();
        botonCargarInmueble = new javax.swing.JButton();
        botonVerInmuebles = new javax.swing.JButton();
        botonVerTodos = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuDatos = new javax.swing.JMenu();
        itemDatosPropietario = new javax.swing.JMenuItem();
        itemDatosInquilino = new javax.swing.JMenuItem();
        itemDatosInmueble = new javax.swing.JMenuItem();
        menuBusqueda = new javax.swing.JMenu();
        itemBusquedaInquilino = new javax.swing.JMenuItem();
        itemBusquedaPropietario = new javax.swing.JMenuItem();
        itemBusquedaInmueble = new javax.swing.JMenuItem();
        menuContrato = new javax.swing.JMenu();
        itemContrato = new javax.swing.JMenuItem();
        menuListados = new javax.swing.JMenu();
        listadoInmuebles = new javax.swing.JMenuItem();
        listadoPropietarios = new javax.swing.JMenuItem();
        listadoInquilinos = new javax.swing.JMenuItem();
        menuSalir = new javax.swing.JMenu();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        label1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        label1.setText("Propietario");

        botonCargarPropietario.setText("Cargar");
        botonCargarPropietario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCargarPropietarioActionPerformed(evt);
            }
        });

        botonVerPropietarios.setText("Ver propietarios");

        label2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        label2.setText("Inmueble");

        botonCargarInmueble.setText("Cargar");

        botonVerInmuebles.setText("Ver Inmuebles");

        botonVerTodos.setText("Ver todos");

        Escritorio.setLayer(label1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Escritorio.setLayer(botonCargarPropietario, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Escritorio.setLayer(botonVerPropietarios, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Escritorio.setLayer(label2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Escritorio.setLayer(botonCargarInmueble, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Escritorio.setLayer(botonVerInmuebles, javax.swing.JLayeredPane.DEFAULT_LAYER);
        Escritorio.setLayer(botonVerTodos, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout EscritorioLayout = new javax.swing.GroupLayout(Escritorio);
        Escritorio.setLayout(EscritorioLayout);
        EscritorioLayout.setHorizontalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EscritorioLayout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label1)
                    .addComponent(label2))
                .addGap(33, 33, 33)
                .addGroup(EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botonCargarPropietario)
                    .addComponent(botonCargarInmueble))
                .addGap(18, 18, 18)
                .addGroup(EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonVerPropietarios)
                    .addGroup(EscritorioLayout.createSequentialGroup()
                        .addComponent(botonVerInmuebles)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botonVerTodos)))
                .addContainerGap(282, Short.MAX_VALUE))
        );
        EscritorioLayout.setVerticalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EscritorioLayout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addGroup(EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label1)
                    .addComponent(botonCargarPropietario)
                    .addComponent(botonVerPropietarios))
                .addGap(71, 71, 71)
                .addGroup(EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label2)
                    .addComponent(botonCargarInmueble)
                    .addComponent(botonVerInmuebles)
                    .addComponent(botonVerTodos))
                .addContainerGap(355, Short.MAX_VALUE))
        );

        menuDatos.setText("Menu de datos");

<<<<<<< HEAD
        itemCargarPropietario.setText("Cargar");
        menuPropietario.add(itemCargarPropietario);
=======
        itemDatosPropietario.setText("Propietario");
        itemDatosPropietario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemDatosPropietarioActionPerformed(evt);
            }
        });
        menuDatos.add(itemDatosPropietario);
>>>>>>> a26a556dd2c1741cdd355a0300ad58dc8a048011

        itemDatosInquilino.setText("Inquilino");
        itemDatosInquilino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemDatosInquilinoActionPerformed(evt);
            }
        });
        menuDatos.add(itemDatosInquilino);

        itemDatosInmueble.setText("Inmueble");
        menuDatos.add(itemDatosInmueble);

        jMenuBar1.add(menuDatos);

        menuBusqueda.setText("Menu de Busqueda");

        itemBusquedaInquilino.setText("Inquilino");
        itemBusquedaInquilino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemBusquedaInquilinoActionPerformed(evt);
            }
        });
        menuBusqueda.add(itemBusquedaInquilino);

        itemBusquedaPropietario.setText("Propietario");
        itemBusquedaPropietario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemBusquedaPropietarioActionPerformed(evt);
            }
        });
        menuBusqueda.add(itemBusquedaPropietario);

        itemBusquedaInmueble.setText("Inmueble");
        menuBusqueda.add(itemBusquedaInmueble);

        jMenuBar1.add(menuBusqueda);

        menuContrato.setText("Contrato");

        itemContrato.setText("Contrato");
        menuContrato.add(itemContrato);

        jMenuBar1.add(menuContrato);

        menuListados.setText("Listados");

        listadoInmuebles.setText("Inmuebles");
        menuListados.add(listadoInmuebles);

        listadoPropietarios.setText("Propietarios");
        menuListados.add(listadoPropietarios);

        listadoInquilinos.setText("Inquilinos");
        menuListados.add(listadoInquilinos);

        jMenuBar1.add(menuListados);

        menuSalir.setText("Salir");
        menuSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuSalirMouseClicked(evt);
            }
        });
        jMenuBar1.add(menuSalir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Escritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

<<<<<<< HEAD
=======
    private void itemBusquedaInquilinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemBusquedaInquilinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemBusquedaInquilinoActionPerformed

    private void itemBusquedaPropietarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemBusquedaPropietarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemBusquedaPropietarioActionPerformed

    private void itemDatosPropietarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemDatosPropietarioActionPerformed
        Escritorio.removeAll();
        
        //Actualizamos la vista
        Escritorio.repaint();
        
        // Creamos un objeto del internalFrame
        CargaDePropietario cargaPropietario = new CargaDePropietario();
        
        // Lo hacemos visible
        cargaPropietario.setVisible(true);
        
        // Lo agregamos al escritorio
        Escritorio.add(cargaPropietario);
        
        // Lo traemos al frente
        Escritorio.moveToFront(cargaPropietario);
    }//GEN-LAST:event_itemDatosPropietarioActionPerformed

>>>>>>> a26a556dd2c1741cdd355a0300ad58dc8a048011
    private void menuSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuSalirMouseClicked
        System.exit(0);
    }//GEN-LAST:event_menuSalirMouseClicked

<<<<<<< HEAD
    private void botonCargarPropietarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCargarPropietarioActionPerformed
        Escritorio.removeAll();
        Escritorio.repaint();
        CargaDePropietario cargaPropietario = new CargaDePropietario(this);
        cargaPropietario.setVisible(true);
        Escritorio.add(cargaPropietario);
        Escritorio.moveToFront(cargaPropietario);
        
        
    }//GEN-LAST:event_botonCargarPropietarioActionPerformed
=======
    private void itemDatosInquilinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemDatosInquilinoActionPerformed
        Escritorio.removeAll();
        
        //Actualizamos la vista
        Escritorio.repaint();
        
        // Creamos un objeto del internalFrame
        CargaDeInquilino cargaInquilino = new CargaDeInquilino();
        
        // Lo hacemos visible
        cargaInquilino.setVisible(true);
        
        // Lo agregamos al escritorio
        Escritorio.add(cargaInquilino);
        
        // Lo traemos al frente
        Escritorio.moveToFront(cargaInquilino);
    }//GEN-LAST:event_itemDatosInquilinoActionPerformed
>>>>>>> a26a556dd2c1741cdd355a0300ad58dc8a048011

    /**
     * @param args the command line arguments
     */
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
<<<<<<< HEAD
    private javax.swing.JButton botonCargarInmueble;
    private javax.swing.JButton botonCargarPropietario;
    private javax.swing.JButton botonVerInmuebles;
    private javax.swing.JButton botonVerPropietarios;
    private javax.swing.JButton botonVerTodos;
    private javax.swing.JMenuItem itemBuscarPorFiltros;
    private javax.swing.JMenuItem itemCargarContrato;
    private javax.swing.JMenuItem itemCargarInmueble;
    private javax.swing.JMenuItem itemCargarInquilino;
    private javax.swing.JMenuItem itemCargarPropietario;
    private javax.swing.JMenuItem itemVerContratos;
    private javax.swing.JMenuItem itemVerDisponibles;
    private javax.swing.JMenuItem itemVerInquilinos;
    private javax.swing.JMenuItem itemVerPropietarios;
    private javax.swing.JMenuItem itemVerTodos;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label2;
=======
    private javax.swing.JMenuItem itemBusquedaInmueble;
    private javax.swing.JMenuItem itemBusquedaInquilino;
    private javax.swing.JMenuItem itemBusquedaPropietario;
    private javax.swing.JMenuItem itemContrato;
    private javax.swing.JMenuItem itemDatosInmueble;
    private javax.swing.JMenuItem itemDatosInquilino;
    private javax.swing.JMenuItem itemDatosPropietario;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem listadoInmuebles;
    private javax.swing.JMenuItem listadoInquilinos;
    private javax.swing.JMenuItem listadoPropietarios;
    private javax.swing.JMenu menuBusqueda;
>>>>>>> a26a556dd2c1741cdd355a0300ad58dc8a048011
    private javax.swing.JMenu menuContrato;
    private javax.swing.JMenu menuDatos;
    private javax.swing.JMenu menuListados;
    private javax.swing.JMenu menuSalir;
    // End of variables declaration//GEN-END:variables
    
    public void mostrarItemsEscritorio(){
        Escritorio.repaint();
        
        for (JButton button : buttons){
            Escritorio.add(button);
        }
        
        for (JLabel label : labels){
            Escritorio.add(label);
        }
    }
    
    
    public void cargarBotones(){
        buttons.add(botonCargarPropietario);
        buttons.add(botonVerPropietarios);
        buttons.add(botonCargarInmueble);
        buttons.add(botonVerInmuebles);
        buttons.add(botonVerTodos);
    }
    
    public void cargarLabels(){
        labels.add(label1);
        labels.add(label2);
    }
    
   


}
