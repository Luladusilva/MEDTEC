/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase_concreta;

import clase_abstracta.Cita_abstrac;
import java.sql.*;
import javax.swing.JOptionPane;
import operacion.Conexion_db;
import interfaz_grafica.menu_principal;

public class cita_clase extends Cita_abstrac{
    
    Conexion_db enlace = new Conexion_db();
    Connection conect = enlace.conexion();
    
    public cita_clase(String especialidad) {
        super(especialidad);
    }
    
    @Override
    public void registrar_cita(int cod_espec, String especialidad, String fecha_cita, String hora_cita) {
        try {
                    PreparedStatement guardar_esp = conect.prepareStatement("INSERT INTO ESPECIALIDAD(id_especialidad,Nombre_Espec) VALUES(?,?)");
                    guardar_esp.setInt(1,cod_espec);
                    guardar_esp.setString(2, especialidad);
                    guardar_esp.executeUpdate();
                    PreparedStatement guardar_cita = conect.prepareStatement("INSERT INTO Cita_Med(Fecha, Hora,id_especialidad) VALUES (?,?,?)");
                    guardar_cita.setString(1,fecha_cita);
                    guardar_cita.setString(2,hora_cita);
                    guardar_cita.setInt(3, cod_espec);
                    guardar_cita.executeUpdate();
                    JOptionPane.showMessageDialog(null, " Cita agendada");
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e + " No se pudo agendar la cita");
            }
    }
}

