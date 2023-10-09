
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
        jMenuItem2 = new javax.swing.JMenuItem();
        Escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuPropietario = new javax.swing.JMenu();
        itemCargarPropietario = new javax.swing.JMenuItem();
        itemVerPropietarios = new javax.swing.JMenuItem();
        menuInmueble = new javax.swing.JMenu();
        itemCargarInmueble = new javax.swing.JMenuItem();
        itemVerDisponibles = new javax.swing.JMenuItem();
        itemVerTodos = new javax.swing.JMenuItem();
        itemBuscarPorFiltros = new javax.swing.JMenuItem();
        menuInquilino = new javax.swing.JMenu();
        itemCargarInquilino = new javax.swing.JMenuItem();
        itemVerInquilinos = new javax.swing.JMenuItem();
        menuContrato = new javax.swing.JMenu();
        itemCargarContrato = new javax.swing.JMenuItem();
        itemVerContratos = new javax.swing.JMenuItem();
        menuSalir = new javax.swing.JMenu();

        jMenu1.setText("jMenu1");

        jMenuItem2.setText("jMenuItem2");

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

        menuPropietario.setText("Propietario");

        itemCargarPropietario.setText("Cargar");
        itemCargarPropietario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemCargarPropietarioActionPerformed(evt);
            }
        });
        menuPropietario.add(itemCargarPropietario);

        itemVerPropietarios.setText("Ver propietarios");
        itemVerPropietarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemVerPropietariosActionPerformed(evt);
            }
        });
        menuPropietario.add(itemVerPropietarios);

        jMenuBar1.add(menuPropietario);

        menuInmueble.setText("Inmueble");

        itemCargarInmueble.setText("Cargar");
        itemCargarInmueble.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemCargarInmuebleActionPerformed(evt);
            }
        });
        menuInmueble.add(itemCargarInmueble);

        itemVerDisponibles.setText("Ver disponibles");
        itemVerDisponibles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemVerDisponiblesActionPerformed(evt);
            }
        });
        menuInmueble.add(itemVerDisponibles);

        itemVerTodos.setText("Ver todos");
        menuInmueble.add(itemVerTodos);

        itemBuscarPorFiltros.setText("Buscar por filtros");
        menuInmueble.add(itemBuscarPorFiltros);

        jMenuBar1.add(menuInmueble);

        menuInquilino.setText("Inquilino");

        itemCargarInquilino.setText("Cargar");
        menuInquilino.add(itemCargarInquilino);

        itemVerInquilinos.setText("Ver inquilinos");
        menuInquilino.add(itemVerInquilinos);

        jMenuBar1.add(menuInquilino);

        menuContrato.setText("Contrato");

        itemCargarContrato.setText("Cargar");
        menuContrato.add(itemCargarContrato);

        itemVerContratos.setText("Ver contratos");
        menuContrato.add(itemVerContratos);

        jMenuBar1.add(menuContrato);

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

    private void itemCargarInmuebleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemCargarInmuebleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemCargarInmuebleActionPerformed

    private void itemVerDisponiblesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemVerDisponiblesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemVerDisponiblesActionPerformed

    private void itemCargarPropietarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemCargarPropietarioActionPerformed
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
    }//GEN-LAST:event_itemCargarPropietarioActionPerformed

    private void menuSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuSalirMouseClicked
        System.exit(0);
    }//GEN-LAST:event_menuSalirMouseClicked

    private void itemVerPropietariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemVerPropietariosActionPerformed
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
    }//GEN-LAST:event_itemVerPropietariosActionPerformed

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
    private javax.swing.JMenu menuContrato;
    private javax.swing.JMenu menuInmueble;
    private javax.swing.JMenu menuInquilino;
    private javax.swing.JMenu menuPropietario;
    private javax.swing.JMenu menuSalir;
    // End of variables declaration//GEN-END:variables
}
