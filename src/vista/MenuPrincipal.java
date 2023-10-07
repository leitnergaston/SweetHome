
package vista;


public class MenuPrincipal extends javax.swing.JFrame {

   
    public MenuPrincipal() {
        initComponents();
        setLocationRelativeTo(null); // Coloca la ventana en el centro
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        Escritorio = new javax.swing.JDesktopPane();
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

        javax.swing.GroupLayout EscritorioLayout = new javax.swing.GroupLayout(Escritorio);
        Escritorio.setLayout(EscritorioLayout);
        EscritorioLayout.setHorizontalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 760, Short.MAX_VALUE)
        );
        EscritorioLayout.setVerticalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 603, Short.MAX_VALUE)
        );

        menuDatos.setText("Menu de datos");

        itemDatosPropietario.setText("Propietario");
        itemDatosPropietario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemDatosPropietarioActionPerformed(evt);
            }
        });
        menuDatos.add(itemDatosPropietario);

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

    private void menuSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuSalirMouseClicked
        System.exit(0);
    }//GEN-LAST:event_menuSalirMouseClicked

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
    private javax.swing.JMenu menuContrato;
    private javax.swing.JMenu menuDatos;
    private javax.swing.JMenu menuListados;
    private javax.swing.JMenu menuSalir;
    // End of variables declaration//GEN-END:variables
}
