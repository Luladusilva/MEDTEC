
package interfaz_grafica;

import java.sql.*;
import operacion.Conexion_db;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;

public class historial extends javax.swing.JFrame {

    Conexion_db enlace = new Conexion_db();
    Connection conect = enlace.conexion();
    
    
    public historial() {
        initComponents();
        mostrarDatos();
    }
    
     public void mostrarDatos(){
        DefaultTableModel thistorial = new DefaultTableModel();
        thistorial.addColumn("FECHA");
        thistorial.addColumn("HORA");
        thistorial.addColumn("ESPECIALIDAD");
        thistorial.addColumn("ESTADO");
        tableHistorial.setModel(thistorial);
        
        String []datos = new String[4];
        
        try {
            Statement leer = conect.createStatement();
            ResultSet resultado = leer.executeQuery("SELECT * FROM Paciente where");
            
            while(resultado.next()){
                datos[0] = resultado.getString(1);
                datos[1] = resultado.getString(2);
                datos[2] = resultado.getString(3);
                datos[3] = resultado.getString(4);
                thistorial.addRow(datos);
            }
            tableHistorial.setModel(thistorial);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e + " Error en la consulta");
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jCheckBox1 = new javax.swing.JCheckBox();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jBHistorial = new javax.swing.JButton();
        jBCita = new javax.swing.JButton();
        jBUsuario = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableHistorial = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jCBEspec = new javax.swing.JComboBox<>();
        jCBEstado = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jTFiltFecha = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        jCheckBox1.setText("jCheckBox1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 0, 153));

        jLabel1.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("MEDTECH");

        jPanel2.setBackground(new java.awt.Color(51, 0, 153));

        jBHistorial.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        jBHistorial.setText("HISTORIAL");
        jBHistorial.setBorderPainted(false);
        jBHistorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBHistorialActionPerformed(evt);
            }
        });

        jBCita.setBackground(new java.awt.Color(51, 0, 153));
        jBCita.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        jBCita.setForeground(new java.awt.Color(255, 255, 255));
        jBCita.setText("CITA");
        jBCita.setBorderPainted(false);
        jBCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCitaActionPerformed(evt);
            }
        });

        jBUsuario.setBackground(new java.awt.Color(51, 0, 153));
        jBUsuario.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        jBUsuario.setForeground(new java.awt.Color(255, 255, 255));
        jBUsuario.setText("USUARIO");
        jBUsuario.setBorderPainted(false);
        jBUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBUsuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jBCita, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBHistorial, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBHistorial)
                    .addComponent(jBCita)
                    .addComponent(jBUsuario))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(289, 289, 289)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        tableHistorial.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "FECHA", "HORA", "ESPECIALIDAD", "ESTADO"
            }
        ));
        jScrollPane2.setViewportView(tableHistorial);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        jLabel2.setText("FILTROS:");

        jCBEspec.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---", "Cardiologia", "Pediatria", "Dermatología", "Gastroenterología", " " }));
        jCBEspec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBEspecActionPerformed(evt);
            }
        });

        jCBEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---", "VIGENTE", "REALIZADO" }));
        jCBEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBEstadoActionPerformed(evt);
            }
        });

        jLabel3.setText("Fecha:");

        jTFiltFecha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFiltFechaKeyTyped(evt);
            }
        });

        jLabel4.setText("Especialidad:");

        jLabel5.setText("Estado");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTFiltFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCBEspec, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCBEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCBEspec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCBEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFiltFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 521, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(83, 83, 83))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(43, 43, 43)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBHistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBHistorialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBHistorialActionPerformed

    private void jBCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCitaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBCitaActionPerformed

    private void jBUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBUsuarioActionPerformed

    private void jCBEspecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBEspecActionPerformed
        // Obtener la especialidad seleccionada del ComboBox
        String especialidad = jCBEspec.getSelectedItem().toString();
        
        // Configurar el modelo de la tabla
        DefaultTableModel thistorial = new DefaultTableModel();
        thistorial.addColumn("FECHA");
        thistorial.addColumn("HORA");
        thistorial.addColumn("ESPECIALIDAD");
        thistorial.addColumn("ESTADO");
        tableHistorial.setModel(thistorial);
        
        // Arreglo para almacenar temporalmente los datos de las filas
        String []datos = new String[4];
        
        try {
            String query = "SELECT FECHA, HORA, ESPECIALIDAD, ESTADO FROM Paciente WHERE ESPECIALIDAD = ?";
            PreparedStatement ps = conect.prepareStatement(query);
            ps.setString(1, especialidad);
            
            // Ejecutar la consulta
            ResultSet resultado = ps.executeQuery();
            
            while(resultado.next()){
                datos[0] = resultado.getString(1);
                datos[1] = resultado.getString(2);
                datos[2] = resultado.getString(3);
                datos[3] = resultado.getString(4);
                thistorial.addRow(datos);
            }
            
            // Actualizar la tabla con el modelo
            tableHistorial.setModel(thistorial);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e + " Error en la consulta");
        }
        
    }//GEN-LAST:event_jCBEspecActionPerformed

    private void jCBEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBEstadoActionPerformed
        // Obtener la especialidad seleccionada del ComboBox
        String estado = jCBEstado.getSelectedItem().toString();
        
        // Configurar el modelo de la tabla
        DefaultTableModel thistorial = new DefaultTableModel();
        thistorial.addColumn("FECHA");
        thistorial.addColumn("HORA");
        thistorial.addColumn("ESPECIALIDAD");
        thistorial.addColumn("ESTADO");
        tableHistorial.setModel(thistorial);
        
        // Arreglo para almacenar temporalmente los datos de las filas
        String []datos = new String[4];
        
        try {
            String query = "SELECT FECHA, HORA, ESPECIALIDAD, ESTADO FROM Paciente WHERE ESTADO = ?";
            PreparedStatement ps = conect.prepareStatement(query);
            ps.setString(1, estado);
            
            // Ejecutar la consulta
            ResultSet resultado = ps.executeQuery();
            
            while(resultado.next()){
                datos[0] = resultado.getString(1);
                datos[1] = resultado.getString(2);
                datos[2] = resultado.getString(3);
                datos[3] = resultado.getString(4);
                thistorial.addRow(datos);
            }
            
            // Actualizar la tabla con el modelo
            tableHistorial.setModel(thistorial);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e + " Error en la consulta");
        }
                           
    }//GEN-LAST:event_jCBEstadoActionPerformed

    private void jTFiltFechaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFiltFechaKeyTyped
        
    }//GEN-LAST:event_jTFiltFechaKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jBCita;
    private javax.swing.JButton jBHistorial;
    private javax.swing.JButton jBUsuario;
    private javax.swing.JComboBox<String> jCBEspec;
    private javax.swing.JComboBox<String> jCBEstado;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTFiltFecha;
    private javax.swing.JTable tableHistorial;
    // End of variables declaration//GEN-END:variables
}
