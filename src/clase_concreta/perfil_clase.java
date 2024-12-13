/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase_concreta;

import java.sql.*;
import operacion.Conexion_db;
import javax.swing.JOptionPane;
import clase_abstracta.Perfil_abstrac;
import interfaz_grafica.usuario;

public class perfil_clase extends Perfil_abstrac{
    
    Conexion_db enlace = new Conexion_db();
    Connection conect = enlace.conexion();
    
    public perfil_clase(String dni) {
        super(dni);
    }
    
    @Override
    public void mostrarDatos(){
         try {
            Statement leer = conect.createStatement();
            String dni = usuario.campIngresado_dni.getText();
            ResultSet resultado = leer.executeQuery("SELECT Nombre,Apellido,Genero,Celular,Fecha_nacimiento FROM PACIENTE WHERE DNI_paciente = '"+dni+"' ");
            while(resultado.next()){
                usuario.lblNombre.setText(resultado.getString(1));
                usuario.lblApellido.setText(resultado.getString(2));
                usuario.lblGenero.setText(resultado.getString(3));
                usuario.lblCelular.setText(resultado.getString(4));
                usuario.lblFecha_nac.setText(resultado.getString(5));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e + " Error en la consulta");
        }
        
    }
    
    
}
