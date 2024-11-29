/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operacion;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


public class Conexion_db {

    
    public Connection conexion(){
        //Tipo de dato conncetion que tiene como valor null
    Connection enlazar = null;
    
    //Exceocion para que si o si se ejecute el codigo
    try {
        //Funcion para enlazar a nuestra base de datos
        enlazar = DriverManager.getConnection("jdbc:mysql://localhost/Hospital","root","lspeqyrhs451877");
    } catch (Exception e) {
        //Mensaje si no se realizo bien la operacion
        JOptionPane.showMessageDialog(null, e + " No fue posible establecer la conexión");
    }
        //Retorna en la conexion
    return enlazar;

    }
}
