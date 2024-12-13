
package interfaz_grafica;
import java.sql.*;
import operacion.Conexion_db;
/**
 *
 * @author HP
 */
public class menu_principal extends javax.swing.JFrame {

    /**
     * Creates new form menu_principal
     */
    
        // Instancia de la clase Conexion_db

    private Conexion_db enlace = new Conexion_db();
    
    public menu_principal() {
        initComponents();
        cargarDatosCitas();
    }
    
    private int contarCitas() {
        int total = 0;
        try (Connection conexion = enlace.conexion()) {
            // Consulta para contar el total de citas
            String sql = "SELECT COUNT(*) AS total FROM CITA_MED";
            PreparedStatement stmt = conexion.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                total = rs.getInt("total");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return total;
    }


    // Método para obtener la próxima cita
private String obtenerProximaCita() {
    String proximaCitaFecha = "No disponible"; // Valor predeterminado para la fecha
    Connection conect = null; // Declaración de la conexión
    try {
        conect = enlace.conexion(); // Establecer conexión
        if (conect != null) {
            // La consulta ahora solo selecciona la fecha de la cita
            String sql = "SELECT c.fecha FROM CITA_MED c " +
                         "ORDER BY c.fecha ASC LIMIT 1"; // Consulta para obtener la próxima cita
            PreparedStatement stmt = conect.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                // Obtenemos solo la fecha de la próxima cita
                proximaCitaFecha = rs.getString("fecha") != null ? rs.getString("fecha") : "No disponible";
            }
        } else {
            System.err.println("No se pudo establecer la conexión a la base de datos.");
        }
    } catch (Exception e) {
        System.err.println("Error al obtener la próxima cita: " + e.getMessage());
        e.printStackTrace();
    } finally {
        try {
            if (conect != null) {
                conect.close(); // Cerrar la conexión
            }
        } catch (Exception e) {
            System.err.println("Error al cerrar la conexión: " + e.getMessage());
        }
    }
    return proximaCitaFecha;
}

private String obtenerEspecialidadProximaCita() {
    String especialidad = "No disponible"; // Valor predeterminado
    Connection conect = null; // Declaración de la conexión
    try {
        conect = enlace.conexion(); // Establecer conexión
        if (conect != null) {
            // Consulta para obtener el nombre de la especialidad de la próxima cita
            String sql = "SELECT e.Nombre_Espec FROM CITA_MED c " +
                         "JOIN ESPECIALIDAD e ON c.id_especialidad = e.ID_Especialidad " +
                         "ORDER BY c.fecha ASC LIMIT 1"; // La consulta obtiene la especialidad
            PreparedStatement stmt = conect.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                // Obtenemos el nombre de la especialidad de la próxima cita
                especialidad = rs.getString("Nombre_Espec") != null ? rs.getString("Nombre_Espec") : "No disponible";
            }
        } else {
            System.err.println("No se pudo establecer la conexión a la base de datos.");
        }
    } catch (Exception e) {
        System.err.println("Error al obtener la especialidad de la próxima cita: " + e.getMessage());
        e.printStackTrace();
    } finally {
        try {
            if (conect != null) {
                conect.close(); // Cerrar la conexión
            }
        } catch (Exception e) {
            System.err.println("Error al cerrar la conexión: " + e.getMessage());
        }
    }
    return especialidad;
}

    
    private void cargarDatosCitas() {
        // Obtener el número de citas
        int totalCitas = contarCitas();
        labelCitas.setText("" + totalCitas);
        System.out.println(totalCitas);

        // Obtener la próxima cita
        String proximaCita = obtenerProximaCita(); // Ahora solo se obtiene la fecha
        proximoLabel.setText("" + proximaCita); // Mostrar solo la fecha
        
        String especialidad = obtenerEspecialidadProximaCita(); // Solo la especialidad
        especialidadLabel.setText("Especialidad: " + especialidad); // Mostrar la especialidad
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        proximoLabel = new javax.swing.JLabel();
        especialidadLabel = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        labelCitas = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(13, 13, 13));

        jButton5.setBackground(new java.awt.Color(13, 13, 13));
        jButton5.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/user2.png"))); // NOI18N
        jButton5.setBorderPainted(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logo4.jpeg"))); // NOI18N
        jLabel2.setText("jLabel2");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton5)
                .addGap(58, 58, 58))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 850, 62);

        jPanel2.setBackground(new java.awt.Color(244, 245, 245));
        jPanel2.setLayout(null);

        jButton2.setBackground(new java.awt.Color(15, 220, 167));
        jButton2.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("HISTORIAL");
        jButton2.setBorderPainted(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);
        jButton2.setBounds(350, 10, 216, 41);

        jButton4.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        jButton4.setText("CITA");
        jButton4.setBorderPainted(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4);
        jButton4.setBounds(20, 10, 214, 41);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(140, 90, 580, 60);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        jPanel5.setBackground(new java.awt.Color(15, 220, 167));

        jLabel8.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("PRÓXIMO:");

        proximoLabel.setFont(new java.awt.Font("Bahnschrift", 1, 24)); // NOI18N
        proximoLabel.setForeground(new java.awt.Color(255, 255, 255));
        proximoLabel.setText("Pediatría");

        especialidadLabel.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        especialidadLabel.setForeground(new java.awt.Color(255, 255, 255));
        especialidadLabel.setText("Martes 18/11, Hora 17:00 ");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(especialidadLabel)
                    .addComponent(proximoLabel)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(75, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(proximoLabel)
                .addGap(18, 18, 18)
                .addComponent(especialidadLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );

        jPanel3.setBackground(new java.awt.Color(15, 220, 167));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));

        labelCitas.setFont(new java.awt.Font("Bahnschrift", 1, 48)); // NOI18N
        labelCitas.setForeground(new java.awt.Color(255, 255, 255));
        labelCitas.setText("8");

        jLabel4.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("citas");

        jLabel3.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("PENDIENTES:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(labelCitas, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addContainerGap(47, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(80, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCitas, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(25, 25, 25)
                    .addComponent(jLabel3)
                    .addContainerGap(79, Short.MAX_VALUE)))
        );

        jButton1.setBackground(new java.awt.Color(242, 242, 242));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setText("AGENDAR CITA");
        jButton1.setBorderPainted(false);
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1MouseEntered(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(185, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(160, 160, 160))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(343, 343, 343)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        getContentPane().add(jPanel6);
        jPanel6.setBounds(0, 172, 846, 320);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        usuario ventanaUsuario = new usuario();
        ventanaUsuario.setVisible(true);
        ventanaUsuario.setLocationRelativeTo(null);
        this.setVisible(false); 
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        registrar_cita ventanaRegisCita = new registrar_cita();
        ventanaRegisCita.setVisible(true);
        ventanaRegisCita.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        menu_principal ventanaCita = new menu_principal();
        ventanaCita.setVisible(true);
        ventanaCita.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        historial ventanaHistorial = new historial();
        ventanaHistorial.setVisible(true);
        ventanaHistorial.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1MouseEntered

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel especialidadLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel labelCitas;
    private javax.swing.JLabel proximoLabel;
    // End of variables declaration//GEN-END:variables
}
