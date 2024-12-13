/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase_concreta;

import clase_abstracta.Historial_abstrac;

import java.sql.*;
import operacion.Conexion_db;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import interfaz_grafica.historial;

public class historial_clase extends Historial_abstrac{
    
    Conexion_db enlace = new Conexion_db();
    Connection conect = enlace.conexion();
    
    @Override
    public void mostrarDatos(){
            DefaultTableModel thistorial = new DefaultTableModel();
            thistorial.addColumn("FECHA");
            thistorial.addColumn("HORA");
            thistorial.addColumn("ESPECIALIDAD");
            historial.tableHistorial.setModel(thistorial);

            String []datos = new String[3];
            try {
                Statement leer = conect.createStatement();
                ResultSet resultado = leer.executeQuery("""
                                                        SELECT CITA_MED.fecha, CITA_MED.hora, Especialidad.Nombre_Espec FROM CITA_MED INNER JOIN Especialidad ON CITA_MED.id_especialidad = Especialidad.id_especialidad
                                                        """);
                while(resultado.next()){
                    datos[0] = resultado.getString(1);
                    datos[1] = resultado.getString(2);
                    datos[2] = resultado.getString(3);
                    thistorial.addRow(datos);
                } 
                historial.tableHistorial.setModel(thistorial);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e + " Error en la consulta");
            }
    }
    
    @Override
    public void buscar(String valor, int opt){
        DefaultTableModel thistorial = new DefaultTableModel();
        thistorial.addColumn("FECHA");
        thistorial.addColumn("HORA");
        thistorial.addColumn("ESPECIALIDAD");
        historial.tableHistorial.setModel(thistorial);
        
        String cod;
        
        if(opt == 0 && valor == null){
            cod = "Select fecha,hora,id_especialidad From Cita_Med";
        }else{
            if(opt == 1 && valor != null){
                cod = "SELECT CITA_MED.fecha, CITA_MED.hora, Especialidad.Nombre_Espec FROM CITA_MED INNER JOIN Especialidad ON CITA_MED.id_especialidad = Especialidad.id_especialidad Where CITA_MED.Fecha = '"+valor+"'";
            }else{
                 if(opt == 2 && valor != null){
                        cod = "SELECT CITA_MED.fecha, CITA_MED.hora, Especialidad.Nombre_Espec FROM CITA_MED INNER JOIN Especialidad ON CITA_MED.id_especialidad = Especialidad.id_especialidad Where Especialidad.Nombre_Espec = '"+valor+"'";
                    }else{
                     cod = "Select fecha,hora,id_especialidad From Cita_Med";
                }
            }
        }
        
        String []datos = new String[3];
        
        try {
            Statement leer = conect.createStatement();
            ResultSet resultado = leer.executeQuery(cod);
            
            while(resultado.next()){
                datos[0] = resultado.getString(1);
                datos[1] = resultado.getString(2);
                datos[2] = resultado.getString(3);
                
                thistorial.addRow(datos);
            }
            historial.tableHistorial.setModel(thistorial);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e + " Error en la consulta");
        }
    }
    
    
}
