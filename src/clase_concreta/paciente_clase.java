/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase_concreta;

import clase_abstracta.Paciente_abstrac;
import javax.swing.JOptionPane;
import java.sql.*;
import operacion.Conexion_db;

public class paciente_clase extends Paciente_abstrac{
    
    Conexion_db enlace = new Conexion_db();
    Connection conect = enlace.conexion();
    
    public paciente_clase(int dni, String nombre, String apellido, String genero, int celular, String fecha_nac) {
        super(dni, nombre, apellido, genero, celular, fecha_nac);
    }
    
    @Override
    public void registrar_paciente(int dni, String nombre, String apellido, String genero, int celular, String fecha_nac){
        try {
                    PreparedStatement guardar_user = conect.prepareStatement("INSERT INTO Paciente(dni_paciente, Nombre, Apellido, Genero, Celular, Fecha_nacimiento) VALUES (?,?,?,?,?,?)");
                    guardar_user.setInt(1,dni);
                    guardar_user.setString(2,nombre);
                    guardar_user.setString(3, apellido);
                    guardar_user.setString(4, genero);
                    guardar_user.setInt(5,celular);
                    guardar_user.setString(6, fecha_nac);
                    guardar_user.executeUpdate();
                    JOptionPane.showMessageDialog(null, " Usuario agregado");
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e + " No se pudo agregar el usuario");
                }
    }
}
