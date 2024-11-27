/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaz_grafica;



/**
 *
 * @author HP
 */
public class usuario extends javax.swing.JFrame {
    
    private String dni_paciente;
    private String nombre_paciente;
    private String apellido_paciente;
    private String gener_paciente;
    private String celular_paciente;
    private String fecha_nac;
    
    public usuario() {
        initComponents();
    }

    public void setDni_paciente(String dni_paciente){
        this.dni_paciente = dni_paciente;
        lblDni.setText(dni_paciente);
    }

    public void setNombre_paciente(String nombre_paciente) {
        this.nombre_paciente = nombre_paciente;
        lblNombre.setText(nombre_paciente);
    }

    public void setApellido_paciente(String apellido_paciente) {
        this.apellido_paciente = apellido_paciente;
        lblApellido.setText(apellido_paciente);
    }

    public void setGener_paciente(String gener_paciente) {
        this.gener_paciente = gener_paciente;
        lblGenero.setText(gener_paciente);
    }

    public void setCelular_paciente(String celular_paciente) {
        this.celular_paciente = celular_paciente;
        lblCelular.setText(celular_paciente);
    }

    public void setFecha_nac(String fecha_nac) {
        this.fecha_nac = fecha_nac;
        lblFecha_nac.setText(fecha_nac);
    }
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        f_nacimiento = new javax.swing.JFormattedTextField();
        A_usuario = new javax.swing.JTextField();
        N_usuario = new javax.swing.JTextField();
        camp_dni = new javax.swing.JTextField();
        Num_usuario = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        con_usuario = new javax.swing.JFormattedTextField();
        G_usuario = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        lblNombre = new javax.swing.JLabel();
        lblGenero = new javax.swing.JLabel();
        lblCelular = new javax.swing.JLabel();
        lblFecha_nac = new javax.swing.JLabel();
        lblDni = new javax.swing.JLabel();
        lblApellido = new javax.swing.JLabel();

        jLabel3.setText("jLabel3");

        f_nacimiento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));

        A_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A_usuarioActionPerformed(evt);
            }
        });

        camp_dni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                camp_dniActionPerformed(evt);
            }
        });

        Num_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Num_usuarioActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(102, 255, 102));
        jButton1.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("GUARDAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        con_usuario.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));

        G_usuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Masculino", "Femenino" }));
        G_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                G_usuarioActionPerformed(evt);
            }
        });

        jLabel18.setText("Contraseña:");

        jLabel6.setBackground(new java.awt.Color(204, 204, 204));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Mayus, Minus, Nums");

        jLabel5.setBackground(new java.awt.Color(204, 204, 204));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Apellido");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 204, 204));
        jLabel13.setText("Nombre");

        jLabel7.setText("jLabel4");

        jLabel8.setText("jLabel4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 0, 153));

        jLabel1.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("MEDTECH");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(289, 289, 289)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(272, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(51, 0, 153));

        jButton2.setBackground(new java.awt.Color(51, 0, 153));
        jButton2.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("HISTORIAL");
        jButton2.setBorderPainted(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(51, 0, 153));
        jButton4.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("CITA");
        jButton4.setBorderPainted(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        jButton5.setText("USUARIO");
        jButton5.setBorderPainted(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton4)
                    .addComponent(jButton5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblNombre.setBorder(javax.swing.BorderFactory.createTitledBorder("Nombre"));

        lblGenero.setBorder(javax.swing.BorderFactory.createTitledBorder("Género"));

        lblCelular.setBorder(javax.swing.BorderFactory.createTitledBorder("Celular"));

        lblFecha_nac.setBorder(javax.swing.BorderFactory.createTitledBorder("Fecha de Nacimiento"));

        lblDni.setBorder(javax.swing.BorderFactory.createTitledBorder("Documento de Identidad (DNI)"));

        lblApellido.setBorder(javax.swing.BorderFactory.createTitledBorder("Apellido"));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblDni, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80)
                        .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(90, 90, 90)
                        .addComponent(lblGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblFecha_nac, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(90, 90, 90)
                        .addComponent(lblCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDni, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lblGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblFecha_nac, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void A_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A_usuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_A_usuarioActionPerformed

    private void Num_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Num_usuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Num_usuarioActionPerformed

    private void camp_dniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_camp_dniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_camp_dniActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
   
        
    }//GEN-LAST:event_jButton1ActionPerformed
    
    private void G_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G_usuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_G_usuarioActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField A_usuario;
    private javax.swing.JComboBox<String> G_usuario;
    private javax.swing.JTextField N_usuario;
    private javax.swing.JTextField Num_usuario;
    private javax.swing.JTextField camp_dni;
    private javax.swing.JFormattedTextField con_usuario;
    private javax.swing.JFormattedTextField f_nacimiento;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblApellido;
    private javax.swing.JLabel lblCelular;
    private javax.swing.JLabel lblDni;
    private javax.swing.JLabel lblFecha_nac;
    private javax.swing.JLabel lblGenero;
    private javax.swing.JLabel lblNombre;
    // End of variables declaration//GEN-END:variables
}