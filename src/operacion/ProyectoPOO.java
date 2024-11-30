/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operacion;

import interfaz_grafica.*;


public class ProyectoPOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Conexion_db conex=new Conexion_db();
        
        
        registrar_usuario regis = new registrar_usuario();
        
        regis.setVisible(true);
        regis.setLocationRelativeTo(null);
 
        
    }
    
}
