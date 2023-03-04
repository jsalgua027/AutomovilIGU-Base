package automovil_igu;

import automovil_logica.Automovil;
import automovil_logica.Controladora;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ConsultaAutomovil extends javax.swing.JFrame {
//instancion un objeto controladora para usarlo a la hora de hacer las consultas --> la  IGU llama a la Logica(Controladora)

    Controladora control = new Controladora();

    public ConsultaAutomovil() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaAutos = new javax.swing.JTable();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 56)); // NOI18N
        jLabel1.setText("CONSULTA DE AUTOMÓVILES");

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        TablaAutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(TablaAutos);

        btnModificar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnEliminar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 686, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap(720, Short.MAX_VALUE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(16, 16, 16)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(28, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(24, 24, 24)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(428, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(78, 78, 78))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // control de que la table no este vacia

        if (TablaAutos.getRowCount() > 0) {
            // valido que se haya seleccionado una fila
            if (TablaAutos.getSelectedRow() != -1) {
                //Aqui va el modificar

                // obtengo la id del auto que quiero modificar
                int idAuto = Integer.parseInt(String.valueOf(TablaAutos.getValueAt(TablaAutos.getSelectedRow(), 0)));
                
                ModificarAuto modif = new ModificarAuto(idAuto);
                   modif.setVisible(true);
                   modif.setLocationRelativeTo(null);
                   // una vez que tengo la ventana modificar abierta cierro la ventana consulta
                   this.dispose();
             mostraMensaje("Auto Modificado correctamente", "Info", "Modificado Existoso");
                // una vez que borro carga la tabla para que se actualice
                cargarTabla();
            } else {
                mostraMensaje("No selecciono un registro para eliminar", "Error", "Error al modififar");
            }
        } else {

            mostraMensaje("La tabla esta vacia", "Error", "Error al modificarr");
        }
   

    }//GEN-LAST:event_btnModificarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        cargarTabla();
    }//GEN-LAST:event_formWindowOpened

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // control de que la table no este vacia

        if (TablaAutos.getRowCount() > 0) {
            // valido que se haya seleccionado una fila
            if (TablaAutos.getSelectedRow() != -1) {
                // obtengo la id del auto que quiero borrar
                int idAuto = Integer.parseInt(String.valueOf(TablaAutos.getValueAt(TablaAutos.getSelectedRow(), 0)));

                control.borrarAuto(idAuto);
            
                // una vez que borro carga la tabla para que se actualice
                cargarTabla();
                    mostraMensaje("Auto borrado correctamente", "Info", "Borrado Existoso");
            } else {
                mostraMensaje("No selecciono un registro para eliminar", "Error", "Error al eliminar");
            }
        } else {

            mostraMensaje("La tabla esta vacia", "Error", "Error al eliminar");
        }

    }//GEN-LAST:event_btnEliminarActionPerformed
    /*
    mostarMensaje()
    metodo creado para mandar mensajes de todo tipo al usuario, tipo información--> el borrado se ha efectuado
                                                                                                                 tipo error--> no existe el automovil solicitado
    
     */
    public void mostraMensaje(String mensaje, String tipo, String titulo) {
        JOptionPane optionPane = new JOptionPane(mensaje);
        if (tipo.equals("Info")) {
            optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
        } else if (tipo.equals("Error")) {

            optionPane.setMessageType(JOptionPane.ERROR_MESSAGE);
        }
        JDialog dialog = optionPane.createDialog(titulo);
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaAutos;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    private void cargarTabla() {

        DefaultTableModel modeloTabla = new DefaultTableModel() {
            // con este metodo sobrescrito consigo que por defecto la tabla no sea editable
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }

        };

        // ponemos titulos a las columnas
        String titulos[] = {"Id", "Modelo", "Marca", "Motor", "Color", "Matícula", "Puertas"};
        //añado el array con los titulos al objeto modelotabla
        modeloTabla.setColumnIdentifiers(titulos);

        // traer los autos desde la base de datos
        List<Automovil> listaAutomoviles = control.traerAutos();
        // muestro los datos en la tabla, los seteos

        if (listaAutomoviles != null) {

            for (Automovil auto : listaAutomoviles) {
                // uso la clase Object que es la mas generica 
                Object[] objeto = {auto.getId(), auto.getModelo(),
                    auto.getMarca(), auto.getMotor(), auto.getColor(), auto.getMatricula(),
                    auto.getCantPuertas()};

                // agrego el objeto a mi modelo de tabla 
                modeloTabla.addRow(objeto);

            }
        }

        //añado el modelo tabla a el tableJframe
        TablaAutos.setModel(modeloTabla);

    }
}
