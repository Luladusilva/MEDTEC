
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
        thistorial.addColumn("FECHA CITA");
        thistorial.addColumn("ESPECIALIDAD");
        thistorial.addColumn("DNI");
        thistorial.addColumn("NOMBRE");
        thistorial.addColumn("APELLIDO");
        thistorial.addColumn("GENERO");
        thistorial.addColumn("FECHA NACIMIENTO");
        tableHistorial.setModel(thistorial);
        
        String []datos = new String[7];
        
        try {
            Statement leer = conect.createStatement();
            ResultSet resultado = leer.executeQuery("SELECT * FROM Paciente");
            
            while(resultado.next()){
                datos[0] = resultado.getString(1);
                datos[1] = resultado.getString(2);
                datos[2] = resultado.getString(3);
                datos[3] = resultado.getString(4);
                datos[4] = resultado.getString(5);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tableHistorial = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tableHistorial.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tableHistorial);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 644, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 287, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableHistorial;
    // End of variables declaration//GEN-END:variables
}
