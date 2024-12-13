/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase_concreta;

import clase_abstracta.Login_abstrac;
import java.sql.*;
import javax.swing.JOptionPane;
import operacion.Conexion_db;
import interfaz_grafica.menu_principal;
import interfaz_grafica.Login;

public class login_clase extends Login_abstrac{

    Conexion_db enlace = new Conexion_db();
    Connection conect = enlace.conexion();
    
    public login_clase(int dni) {
        super(dni);
    }
    
    @Override
    public void validacion(int valor){
        if(valor != 0){
                String consulta = "SELECT * FROM PACIENTE WHERE Dni_paciente = '"+valor+"'"; 
                try {
                    Statement leer = conect.createStatement();
                    ResultSet resultado = leer.executeQuery(consulta);
                        
                    if (resultado.next()) {
                    JOptionPane.showMessageDialog(null, "DNI válido. Bienvenido, " +
                    resultado.getString("Nombre") + "!");
                    
                    menu_principal ventanaCita = new menu_principal();
                    ventanaCita.setVisible(true);
                    ventanaCita.setLocationRelativeTo(null);
                    }else{
                        JOptionPane.showMessageDialog(null, "No esta registrado, relize un nuevo registro");
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e + " Error en la consulta");
                }
                
              }else{
                  JOptionPane.showMessageDialog(null, "Por favor, ingrese un DNI válido.");
            }
    }
}

