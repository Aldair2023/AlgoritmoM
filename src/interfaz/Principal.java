/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import clases.Helper;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author aldair
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {

        initComponents();
        JButton botonesH[] = {cmdCrear, cmdLimpiar};
        JButton botonesD[] = {cmdAuto, cmdManual, cmdOperacion};
        Helper.habilitarBotones(botonesH);
        Helper.deshabilitarBotones(botonesD);
        this.setLocationRelativeTo(this);
        

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtColumnas = new javax.swing.JTextField();
        txtFilas = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        cmdLimpiar = new javax.swing.JButton();
        cmdCrear = new javax.swing.JButton();
        cmdManual = new javax.swing.JButton();
        cmdAuto = new javax.swing.JButton();
        cmdOperacion = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblTablaInicial = new javax.swing.JTable();
        cmbCombo = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTablaResultado = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 50)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Operaciones Matrices");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, -1, 50));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos Iniciales", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 3, 14))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        jLabel2.setText("# De Filas");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        jLabel3.setText("# De Columnas");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, -1, -1));

        txtColumnas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtColumnasKeyTyped(evt);
            }
        });
        jPanel2.add(txtColumnas, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 30, 60, 40));

        txtFilas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFilasKeyTyped(evt);
            }
        });
        jPanel2.add(txtFilas, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 50, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 390, 90));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Acciones", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 3, 14))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmdLimpiar.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        cmdLimpiar.setText("Limpiar");
        cmdLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdLimpiarActionPerformed(evt);
            }
        });
        jPanel3.add(cmdLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 60, -1, -1));

        cmdCrear.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        cmdCrear.setText("Crear");
        cmdCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCrearActionPerformed(evt);
            }
        });
        jPanel3.add(cmdCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        cmdManual.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        cmdManual.setText("Manual");
        cmdManual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdManualActionPerformed(evt);
            }
        });
        jPanel3.add(cmdManual, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, -1, -1));

        cmdAuto.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        cmdAuto.setText("Automatico");
        cmdAuto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdAutoActionPerformed(evt);
            }
        });
        jPanel3.add(cmdAuto, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, -1, -1));

        cmdOperacion.setFont(new java.awt.Font("Arial", 2, 14)); // NOI18N
        cmdOperacion.setText("Operacion");
        cmdOperacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdOperacionActionPerformed(evt);
            }
        });
        jPanel3.add(cmdOperacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, -1, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 150, 400, 110));

        tblTablaInicial.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tblTablaInicial);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 390, 210));

        cmbCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "DiagonalSecundaria", "TriangularSuperoor", "TriangularInferior", "Transponerl", "LetraA", "LetraZ", "LetraT", "LetraV", "LetraE", "LetraF", "LetraP", "LetraI", "LetraN", "LetraY", "LetraX" }));
        jPanel1.add(cmbCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 390, 100, 50));

        tblTablaResultado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblTablaResultado);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 320, 390, 210));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaz/Wallpapersxl Futurista Computers Laptops Netbook Lights Cubes 77751 1366x768.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 640));

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
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 635, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLimpiarActionPerformed
        // TODO add your handling code here:

        Helper.tablaPorDefecto(tblTablaInicial);
        Helper.tablaPorDefecto(tblTablaResultado);

        txtFilas.setText("");
        txtColumnas.setText("");
        txtFilas.requestFocusInWindow();
        cmbCombo.setSelectedIndex(0);
        
        JButton botonesH[] = {cmdCrear, cmdLimpiar};
        JButton botonesD[] = {cmdAuto, cmdManual, cmdOperacion};
        Helper.habilitarBotones(botonesH);
        Helper.deshabilitarBotones(botonesD);

    }//GEN-LAST:event_cmdLimpiarActionPerformed

    private void cmdCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCrearActionPerformed
        // TODO add your handling code here:
        try {
            int nFilas, nColumnas;
            DefaultTableModel tm1, tm2;

            nFilas = Integer.parseInt(txtFilas.getText());
            nColumnas = Integer.parseInt(txtColumnas.getText());

            if (nFilas >= 15 && nColumnas >= 15) {
                Helper.mensaje(this, "La Matriz es Demasiado Grande", "Aviso", 1);

                JButton botonesD[] = {cmdAuto, cmdManual, cmdCrear, cmdOperacion};
                Helper.deshabilitarBotones(botonesD);
                JButton botonesH[] = {cmdLimpiar};
                Helper.habilitarBotones(botonesH);
                Helper.limpiarTabla(tblTablaInicial);
                Helper.limpiarTabla(tblTablaResultado);
                Helper.tablaPorDefecto(tblTablaInicial);
                Helper.tablaPorDefecto(tblTablaResultado);
                txtFilas.setText("");
                txtColumnas.setText("");

            } else if (nFilas <= 3 && nColumnas <= 3) {
                Helper.mensaje(this, "La Matriz Es Muy Pequeña", "aviso", 1);
                JButton botonesD[] = {cmdAuto, cmdManual, cmdCrear, cmdOperacion};
                Helper.deshabilitarBotones(botonesD);
                JButton botonesH[] = {cmdLimpiar};
                Helper.habilitarBotones(botonesH);
                Helper.limpiarTabla(tblTablaInicial);
                Helper.limpiarTabla(tblTablaResultado);
                Helper.tablaPorDefecto(tblTablaInicial);
                Helper.tablaPorDefecto(tblTablaResultado);
                txtFilas.setText("");
                txtColumnas.setText("");

            } else if (nFilas != nColumnas) {
                Helper.mensaje(this, "El numero de filas Y columnas debe ser IGUALES", "aviso", 1);
                JButton botonesD[] = {cmdAuto, cmdManual, cmdCrear, cmdOperacion};
                Helper.deshabilitarBotones(botonesD);
                JButton botonesH[] = {cmdLimpiar};
                Helper.habilitarBotones(botonesH);
                Helper.limpiarTabla(tblTablaInicial);
                Helper.limpiarTabla(tblTablaResultado);
                Helper.tablaPorDefecto(tblTablaInicial);
                Helper.tablaPorDefecto(tblTablaResultado);
                txtFilas.setText("");
                txtColumnas.setText("");

            } else {
                JButton botonesD[] = {cmdCrear, cmdOperacion};
                Helper.deshabilitarBotones(botonesD);
                JButton botonesH[] = {cmdLimpiar, cmdAuto, cmdManual};
                Helper.habilitarBotones(botonesH);
            }

            tm1 = (DefaultTableModel) tblTablaInicial.getModel();
            tm2 = (DefaultTableModel) tblTablaResultado.getModel();

            tm1.setRowCount(nFilas);
            tm1.setColumnCount(nColumnas);

            tm2.setRowCount(nFilas);
            tm2.setColumnCount(nColumnas);

        } catch (NumberFormatException e) {
            Helper.mensaje(this, "hay campos vacios", "Aviso", 1);
        }

    }//GEN-LAST:event_cmdCrearActionPerformed

    private void cmdAutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdAutoActionPerformed
        // TODO add your handling code here:

        int nFilas, nColumnas, n;

        nFilas = tblTablaInicial.getColumnCount();
        nColumnas = tblTablaResultado.getRowCount();

        for (int i = 0; i < nColumnas; i++) {
            for (int j = 0; j < nFilas; j++) {
                n = (int) (Math.random() * 100 + 1);
                tblTablaInicial.setValueAt(n, i, j);

            }

        }
        JButton botonesH[] = {cmdLimpiar, cmdOperacion};
        JButton botonesD[] = {cmdCrear, cmdAuto, cmdManual};
        Helper.habilitarBotones(botonesH);
        Helper.deshabilitarBotones(botonesD);
    }//GEN-LAST:event_cmdAutoActionPerformed

    private void cmdOperacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdOperacionActionPerformed
        // TODO add your handling code here:

        int op, nFilas, nColumnas, aux;

        op = cmbCombo.getSelectedIndex();
        nFilas = tblTablaInicial.getColumnCount();
        nColumnas = tblTablaResultado.getRowCount();

        switch (op) {
            case 0: //Diagonal_Secundaria 
                Helper.DiagonalSecundaria(tblTablaInicial, tblTablaResultado);
                break;
            case 1: //Triangular_Superior
                Helper.TriangularSuperior(tblTablaInicial, tblTablaResultado);
                break;
            case 2: //Triangular_Inferior
                Helper.TriangularInferior(tblTablaInicial, tblTablaResultado);
                break;
            case 3: //Transposicion_De_La_Matriz
                Helper.MatrizTranspouesta(tblTablaInicial, tblTablaResultado);
                break;
            case 4: //Letra_A 
                if (nFilas % 2 != 0 || nColumnas % 2 != 0) {
                    Helper.mensaje(this, "La matriz debe ser par para visualizar mejor la Letra requerida", "Aviso", 1);
                    Helper.tablaPorDefecto(tblTablaInicial);
                    Helper.tablaPorDefecto(tblTablaResultado);
                    txtFilas.setText("");
                    txtColumnas.setText("");
                    txtFilas.requestFocusInWindow();
                    cmbCombo.setSelectedIndex(0);
                    JButton botonesH[] = {cmdLimpiar, cmdCrear};
                    JButton botonesD[] = {cmdOperacion, cmdAuto, cmdManual};
                    Helper.habilitarBotones(botonesH);
                    Helper.deshabilitarBotones(botonesD);
                    
                }
                
                Helper.LetraA(tblTablaInicial, tblTablaResultado);
                break;
            case 5: //Letra_Z
                Helper.LetraZ(tblTablaInicial, tblTablaResultado);
                break;
            case 6: //Letra_T
                if (nFilas % 2 == 0 || nColumnas % 2 == 0) {
                    Helper.mensaje(this, "La matriz debe ser Impar para visualizar mejor la Letra requerida", "Aviso", 1);
                    Helper.tablaPorDefecto(tblTablaInicial);
                    Helper.tablaPorDefecto(tblTablaResultado);
                    txtFilas.setText("");
                    txtColumnas.setText("");
                    txtFilas.requestFocusInWindow();
                    cmbCombo.setSelectedIndex(0);
                    JButton botonesH[] = {cmdLimpiar, cmdCrear};
                    JButton botonesD[] = {cmdOperacion, cmdAuto, cmdManual};
                    Helper.habilitarBotones(botonesH);
                    Helper.deshabilitarBotones(botonesD);
                }
                Helper.LetraT(tblTablaInicial, tblTablaResultado);
                break;
            case 7: //Letra_V
                if (nFilas % 2 == 0 || nColumnas % 2 == 0) {
                    Helper.mensaje(this, "La matriz debe ser Impar para visualizar mejor la Letra requerida", "Aviso", 1);
                    Helper.tablaPorDefecto(tblTablaInicial);
                    Helper.tablaPorDefecto(tblTablaResultado);
                    txtFilas.setText("");
                    txtColumnas.setText("");
                    txtFilas.requestFocusInWindow();
                    cmbCombo.setSelectedIndex(0);
                    JButton botonesH[] = {cmdLimpiar, cmdCrear};
                    JButton botonesD[] = {cmdOperacion, cmdAuto, cmdManual};
                    Helper.habilitarBotones(botonesH);
                    Helper.deshabilitarBotones(botonesD);
                }
                Helper.LetraV(tblTablaInicial, tblTablaResultado);
                break;
            case 8: //Letra_E
                if (nFilas % 2 == 0 || nColumnas % 2 == 0) {
                    Helper.mensaje(this, "La matriz debe ser Impar para visualizar mejor la Letra requerida", "Aviso", 1);
                    Helper.tablaPorDefecto(tblTablaInicial);
                    Helper.tablaPorDefecto(tblTablaResultado);
                    txtFilas.setText("");
                    txtColumnas.setText("");
                    txtFilas.requestFocusInWindow();
                    cmbCombo.setSelectedIndex(0);
                    JButton botonesH[] = {cmdLimpiar, cmdCrear};
                    JButton botonesD[] = {cmdOperacion, cmdAuto, cmdManual};
                    Helper.habilitarBotones(botonesH);
                    Helper.deshabilitarBotones(botonesD);
                }
                Helper.LetraE(tblTablaInicial, tblTablaResultado);
                break;
            case 9: //Letra_F
                Helper.LetraF(tblTablaInicial, tblTablaResultado);
                break;
            case 10: //Letra_P
                Helper.LetraP(tblTablaInicial, tblTablaResultado);
                break;
            case 11: //Letra_I
                if (nFilas % 2 == 0 || nColumnas % 2 == 0) {
                    Helper.mensaje(this, "La matriz debe ser Impar para visualizar mejor la Letra requerida", "Aviso", 1);
                    Helper.tablaPorDefecto(tblTablaInicial);
                    Helper.tablaPorDefecto(tblTablaResultado);
                    txtFilas.setText("");
                    txtColumnas.setText("");
                    txtFilas.requestFocusInWindow();
                    cmbCombo.setSelectedIndex(0);
                    JButton botonesH[] = {cmdLimpiar, cmdCrear};
                    JButton botonesD[] = {cmdOperacion, cmdAuto, cmdManual};
                    Helper.habilitarBotones(botonesH);
                    Helper.deshabilitarBotones(botonesD);
                }
                Helper.LetraI(tblTablaInicial, tblTablaResultado);
                break;
            case 12: //Letra_N
                Helper.LetraN(tblTablaInicial, tblTablaResultado);
                break;
            case 13: //Letra_Y
                if (nFilas % 2 == 0 || nColumnas % 2 == 0) {
                    Helper.mensaje(this, "La matriz debe ser Impar para visualizar mejor la Letra requerida", "Aviso", 1);
                    Helper.tablaPorDefecto(tblTablaInicial);
                    Helper.tablaPorDefecto(tblTablaResultado);
                    txtFilas.setText("");
                    txtColumnas.setText("");
                    txtFilas.requestFocusInWindow();
                    cmbCombo.setSelectedIndex(0);
                    JButton botonesH[] = {cmdLimpiar, cmdCrear};
                    JButton botonesD[] = {cmdOperacion, cmdAuto, cmdManual};
                    Helper.habilitarBotones(botonesH);
                    Helper.deshabilitarBotones(botonesD);
                }
                Helper.LetraY(tblTablaInicial, tblTablaResultado);
                break;
            case 14: //Letra_X
                Helper.LetraX(tblTablaInicial, tblTablaResultado);
                break;
        }
    }//GEN-LAST:event_cmdOperacionActionPerformed

    private void txtFilasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFilasKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {
            getToolkit();

            evt.consume();
        }

    }//GEN-LAST:event_txtFilasKeyTyped

    private void txtColumnasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtColumnasKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {
            getToolkit();

            evt.consume();
        }

    }//GEN-LAST:event_txtColumnasKeyTyped

    private void cmdManualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdManualActionPerformed
        // TODO add your handling code here:
        int nFilas, nColumnas, res, aux;
        double n;
        boolean sw = true;
        nFilas = tblTablaInicial.getRowCount();
        nColumnas = tblTablaInicial.getColumnCount();

        for (int i = 0; i < nFilas; i++) {
            for (int j = 0; j < nColumnas; j++) {
                do {
                    aux = 1;
                    try {
                        n = Double.parseDouble(Helper.recibirDatos(this, "Digite el elemento en la posición: [" + i + "][" + j + "]"));
                        tblTablaInicial.setValueAt(n, i, j);
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(this, "Digite la información correctamente", "Error", JOptionPane.ERROR_MESSAGE);
                        aux = 0;
                    } catch (NullPointerException e) {
                        res = JOptionPane.showConfirmDialog(this, "¿Desea Salir?", "Salir", JOptionPane.YES_NO_OPTION);
                        System.out.println(res);
                        if (res == 0) {
                            aux = 1;
                            j = nColumnas;
                            i = nFilas;
                            sw = false;
                            Helper.tablaPorDefecto(tblTablaInicial);
                            Helper.tablaPorDefecto(tblTablaResultado);
                        } else {
                            aux = 0;
                        }

                    }
                } while (aux == 0);

            }

        }
        JButton botonesH[] = {cmdOperacion, cmdLimpiar};
        JButton botonesD[] = {cmdCrear, cmdManual, cmdAuto};
        Helper.habilitarBotones(botonesH);
        Helper.deshabilitarBotones(botonesD);
    }//GEN-LAST:event_cmdManualActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cmbCombo;
    private javax.swing.JButton cmdAuto;
    private javax.swing.JButton cmdCrear;
    private javax.swing.JButton cmdLimpiar;
    private javax.swing.JButton cmdManual;
    private javax.swing.JButton cmdOperacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblTablaInicial;
    private javax.swing.JTable tblTablaResultado;
    private javax.swing.JTextField txtColumnas;
    private javax.swing.JTextField txtFilas;
    // End of variables declaration//GEN-END:variables
}
