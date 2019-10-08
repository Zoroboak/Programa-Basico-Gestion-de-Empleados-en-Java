/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WinEmpleados;

/**
 *
 * @author alumno
 */
public class ProGestionEmpleados extends javax.swing.JFrame {

    /**
     * Creates new form ProGestionEmpleados
     */
    public ProGestionEmpleados() {
        initComponents();
        initMyComponents();
        
    }
    
    private void initMyComponents(){
        buttonGroupTipoTrabajador.add(jRadioButtonJefeProyecto);
        buttonGroupTipoTrabajador.add(jRadioButtonTrabajadorHoras);
        buttonGroupTipoTrabajador.add(jRadioButtonTrabajadorMontador);
        buttonGroupTipoTrabajador.add(jRadioButtonTrabajadorComision);
        //jTextFieldActualizable1.setVisible(false);
        //jTextFieldActualizable2.setVisible(false);
        //jTextFieldActualizable3.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupTipoTrabajador = new javax.swing.ButtonGroup();
        jPanelDatosTrabajador = new javax.swing.JPanel();
        jLabelNombre = new javax.swing.JLabel();
        jLabelApellido = new javax.swing.JLabel();
        jLabelActualizable1 = new javax.swing.JLabel();
        jLabelActualizable2 = new javax.swing.JLabel();
        jLabelActualizable3 = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jTextFieldApellido = new javax.swing.JTextField();
        jTextFieldActualizable1 = new javax.swing.JTextField();
        jTextFieldActualizable2 = new javax.swing.JTextField();
        jTextFieldActualizable3 = new javax.swing.JTextField();
        jPanelTipodeTrabajador = new javax.swing.JPanel();
        jPanelTipoTrabajador = new javax.swing.JPanel();
        jRadioButtonJefeProyecto = new javax.swing.JRadioButton();
        jRadioButtonTrabajadorHoras = new javax.swing.JRadioButton();
        jRadioButtonTrabajadorMontador = new javax.swing.JRadioButton();
        jRadioButtonTrabajadorComision = new javax.swing.JRadioButton();
        jButtonAñadir = new javax.swing.JButton();
        jButtonBorrarDatos = new javax.swing.JButton();
        jPanelTrabajadoresActivos = new javax.swing.JPanel();
        jScrollPane = new javax.swing.JScrollPane();
        jListListaEmpleados = new javax.swing.JList<>();
        jLabelMensaje = new javax.swing.JLabel();
        jLabelSalario = new javax.swing.JLabel();
        jTextFieldSalario = new javax.swing.JTextField();
        jButtonEliminarTrabajador = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelDatosTrabajador.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos del Trabajador"));

        jLabelNombre.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelNombre.setText("Nombre:");

        jLabelApellido.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelApellido.setText("Apellido:");

        jLabelActualizable1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelActualizable1.setText("Salario Base:");

        jLabelActualizable2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelActualizable2.setText("Incentivo Proyecto:");

        jLabelActualizable3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelActualizable3.setText("Nº Proyectos");

        jTextFieldNombre.setText(" ");
        jTextFieldNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldNombreKeyReleased(evt);
            }
        });

        jTextFieldApellido.setText(" ");
        jTextFieldApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldApellidoKeyReleased(evt);
            }
        });

        jTextFieldActualizable1.setText(" ");

        jTextFieldActualizable2.setText(" ");

        jTextFieldActualizable3.setText(" ");

        javax.swing.GroupLayout jPanelDatosTrabajadorLayout = new javax.swing.GroupLayout(jPanelDatosTrabajador);
        jPanelDatosTrabajador.setLayout(jPanelDatosTrabajadorLayout);
        jPanelDatosTrabajadorLayout.setHorizontalGroup(
            jPanelDatosTrabajadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDatosTrabajadorLayout.createSequentialGroup()
                .addGroup(jPanelDatosTrabajadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelDatosTrabajadorLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanelDatosTrabajadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelActualizable1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(jPanelDatosTrabajadorLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanelDatosTrabajadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelActualizable2, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                            .addComponent(jLabelActualizable3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)))
                .addGroup(jPanelDatosTrabajadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldActualizable1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldActualizable2, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldActualizable3, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        jPanelDatosTrabajadorLayout.setVerticalGroup(
            jPanelDatosTrabajadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDatosTrabajadorLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanelDatosTrabajadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNombre)
                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanelDatosTrabajadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelApellido)
                    .addComponent(jTextFieldApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanelDatosTrabajadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelActualizable1)
                    .addComponent(jTextFieldActualizable1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanelDatosTrabajadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelActualizable2)
                    .addComponent(jTextFieldActualizable2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanelDatosTrabajadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelActualizable3)
                    .addComponent(jTextFieldActualizable3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelTipodeTrabajador.setBorder(javax.swing.BorderFactory.createTitledBorder("Tipo de Trabajadores"));

        jPanelTipoTrabajador.setBorder(javax.swing.BorderFactory.createTitledBorder("Tipo Trabajador"));

        jRadioButtonJefeProyecto.setSelected(true);
        jRadioButtonJefeProyecto.setText("Jefe de Proyecto");
        jRadioButtonJefeProyecto.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButtonJefeProyectoItemStateChanged(evt);
            }
        });

        jRadioButtonTrabajadorHoras.setText("Trabajador por Horas");
        jRadioButtonTrabajadorHoras.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButtonTrabajadorHorasItemStateChanged(evt);
            }
        });

        jRadioButtonTrabajadorMontador.setText("Trabajador Montador");
        jRadioButtonTrabajadorMontador.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButtonTrabajadorMontadorItemStateChanged(evt);
            }
        });

        jRadioButtonTrabajadorComision.setText("Trabajador a Comisión");
        jRadioButtonTrabajadorComision.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButtonTrabajadorComisionItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanelTipoTrabajadorLayout = new javax.swing.GroupLayout(jPanelTipoTrabajador);
        jPanelTipoTrabajador.setLayout(jPanelTipoTrabajadorLayout);
        jPanelTipoTrabajadorLayout.setHorizontalGroup(
            jPanelTipoTrabajadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTipoTrabajadorLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelTipoTrabajadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButtonJefeProyecto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButtonTrabajadorHoras, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButtonTrabajadorMontador, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButtonTrabajadorComision, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );
        jPanelTipoTrabajadorLayout.setVerticalGroup(
            jPanelTipoTrabajadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTipoTrabajadorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jRadioButtonJefeProyecto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButtonTrabajadorHoras)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButtonTrabajadorMontador)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButtonTrabajadorComision)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jButtonAñadir.setText("Añadir");
        jButtonAñadir.setEnabled(false);
        jButtonAñadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAñadirActionPerformed(evt);
            }
        });

        jButtonBorrarDatos.setText("Borrar Datos");
        jButtonBorrarDatos.setEnabled(false);
        jButtonBorrarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBorrarDatosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelTipodeTrabajadorLayout = new javax.swing.GroupLayout(jPanelTipodeTrabajador);
        jPanelTipodeTrabajador.setLayout(jPanelTipodeTrabajadorLayout);
        jPanelTipodeTrabajadorLayout.setHorizontalGroup(
            jPanelTipodeTrabajadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTipodeTrabajadorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelTipodeTrabajadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelTipodeTrabajadorLayout.createSequentialGroup()
                        .addComponent(jButtonAñadir, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonBorrarDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanelTipoTrabajador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelTipodeTrabajadorLayout.setVerticalGroup(
            jPanelTipodeTrabajadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTipodeTrabajadorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelTipoTrabajador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelTipodeTrabajadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAñadir)
                    .addComponent(jButtonBorrarDatos))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jPanelTrabajadoresActivos.setBorder(javax.swing.BorderFactory.createTitledBorder("Trabajadores en Activos"));

        jListListaEmpleados.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jListListaEmpleados.setToolTipText("");
        jScrollPane.setViewportView(jListListaEmpleados);

        jLabelMensaje.setText("Seleccione un trabajador para ver su salario");
        jLabelMensaje.setAutoscrolls(true);

        jLabelSalario.setText("Salarario: ");

        jTextFieldSalario.setEnabled(false);

        jButtonEliminarTrabajador.setText("Eliminar Trabajador");
        jButtonEliminarTrabajador.setEnabled(false);

        javax.swing.GroupLayout jPanelTrabajadoresActivosLayout = new javax.swing.GroupLayout(jPanelTrabajadoresActivos);
        jPanelTrabajadoresActivos.setLayout(jPanelTrabajadoresActivosLayout);
        jPanelTrabajadoresActivosLayout.setHorizontalGroup(
            jPanelTrabajadoresActivosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTrabajadoresActivosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanelTrabajadoresActivosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelMensaje)
                    .addComponent(jLabelSalario)
                    .addComponent(jTextFieldSalario, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonEliminarTrabajador, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelTrabajadoresActivosLayout.setVerticalGroup(
            jPanelTrabajadoresActivosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTrabajadoresActivosLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabelMensaje)
                .addGap(18, 18, 18)
                .addComponent(jLabelSalario)
                .addGap(18, 18, 18)
                .addComponent(jTextFieldSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonEliminarTrabajador)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanelTrabajadoresActivosLayout.createSequentialGroup()
                .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelDatosTrabajador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelTipodeTrabajador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanelTrabajadoresActivos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelDatosTrabajador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelTipodeTrabajador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanelTrabajadoresActivos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAñadirActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jButtonAñadirActionPerformed

    private void jButtonBorrarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBorrarDatosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonBorrarDatosActionPerformed

    private void jRadioButtonJefeProyectoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButtonJefeProyectoItemStateChanged
        // TODO add your handling code here:
        jTextFieldActualizable3.setVisible(true);
        jLabelActualizable1.setText("Salario Base:");
        jLabelActualizable2.setText("Incentivo Proyecto:");
        jLabelActualizable3.setText("Nº Proyectos");
        clearFields();
    }//GEN-LAST:event_jRadioButtonJefeProyectoItemStateChanged

    private void jRadioButtonTrabajadorHorasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButtonTrabajadorHorasItemStateChanged
        // TODO add your handling code here:
        jTextFieldActualizable3.setVisible(false);
        jLabelActualizable1.setText("Salario Hora:");
        jLabelActualizable2.setText("Numero Horas:");
        jLabelActualizable3.setText(" ");
        clearFields();
    }//GEN-LAST:event_jRadioButtonTrabajadorHorasItemStateChanged

    private void jRadioButtonTrabajadorMontadorItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButtonTrabajadorMontadorItemStateChanged
        // TODO add your handling code here:
        jTextFieldActualizable3.setVisible(false);
        jLabelActualizable1.setText("Salario Pieza:");
        jLabelActualizable2.setText("Numero Piezas:");
        jLabelActualizable3.setText(" ");
        clearFields();
    }//GEN-LAST:event_jRadioButtonTrabajadorMontadorItemStateChanged

    private void jRadioButtonTrabajadorComisionItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButtonTrabajadorComisionItemStateChanged
        // TODO add your handling code here:
        // TODO add your handling code here:
        jTextFieldActualizable3.setVisible(true);
        jLabelActualizable1.setText("Salario Base:");
        jLabelActualizable2.setText("Nº Piezas:");
        jLabelActualizable3.setText("Comisión Pieza:");
        clearFields();
    }//GEN-LAST:event_jRadioButtonTrabajadorComisionItemStateChanged

    private void jTextFieldNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNombreKeyReleased
        // TODO add your handling code here:
        checkDataFields();
    }//GEN-LAST:event_jTextFieldNombreKeyReleased

    private void jTextFieldApellidoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldApellidoKeyReleased
        // TODO add your handling code here:
        checkDataFields();
    }//GEN-LAST:event_jTextFieldApellidoKeyReleased

    private void clearFields(){
        jTextFieldNombre.setText(null);
        jTextFieldApellido.setText(null);
        jTextFieldActualizable1.setText(null);
        jTextFieldActualizable2.setText(null);
        jTextFieldActualizable3.setText(null);
    }
    
    private boolean checkDataFields(){
        
        if (("".equals(jTextFieldNombre.getText())==false) &&
                ("".equals(jTextFieldApellido.getText())==false) &&
                    ("".equals(jTextFieldActualizable1.getText())==false) &&
                        ("".equals(jTextFieldActualizable2.getText())==false) &&
                            ("".equals(jTextFieldActualizable3.getText())==false)){
            
            
            jButtonAñadir.setEnabled(true);
            return true;
        }else{
            jButtonBorrarDatos.setEnabled(false);
            return false;
        }
        
    }
    
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
            java.util.logging.Logger.getLogger(ProGestionEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProGestionEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProGestionEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProGestionEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProGestionEmpleados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupTipoTrabajador;
    private javax.swing.JButton jButtonAñadir;
    private javax.swing.JButton jButtonBorrarDatos;
    private javax.swing.JButton jButtonEliminarTrabajador;
    private javax.swing.JLabel jLabelActualizable1;
    private javax.swing.JLabel jLabelActualizable2;
    private javax.swing.JLabel jLabelActualizable3;
    private javax.swing.JLabel jLabelApellido;
    private javax.swing.JLabel jLabelMensaje;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelSalario;
    private javax.swing.JList<String> jListListaEmpleados;
    private javax.swing.JPanel jPanelDatosTrabajador;
    private javax.swing.JPanel jPanelTipoTrabajador;
    private javax.swing.JPanel jPanelTipodeTrabajador;
    private javax.swing.JPanel jPanelTrabajadoresActivos;
    private javax.swing.JRadioButton jRadioButtonJefeProyecto;
    private javax.swing.JRadioButton jRadioButtonTrabajadorComision;
    private javax.swing.JRadioButton jRadioButtonTrabajadorHoras;
    private javax.swing.JRadioButton jRadioButtonTrabajadorMontador;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JTextField jTextFieldActualizable1;
    private javax.swing.JTextField jTextFieldActualizable2;
    private javax.swing.JTextField jTextFieldActualizable3;
    private javax.swing.JTextField jTextFieldApellido;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldSalario;
    // End of variables declaration//GEN-END:variables
}
