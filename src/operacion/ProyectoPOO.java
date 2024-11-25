/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operacion;

import interfaz_grafica.*;

/**
 *
 * @author HP
 */
public class ProyectoPOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        menu_principal men = new menu_principal();
        men.setVisible(true);
        men.setLocationRelativeTo(null);
        
        Login log = new Login();
        log.setVisible(true);
        log.setLocationRelativeTo(null);
        
        historial hs = new historial();
        hs.setVisible(true);
        hs.setLocationRelativeTo(null);
        
        usuario user = new usuario();
        user.setVisible(true);
        user.setLocationRelativeTo(null);
        
        registrar res = new registrar();
        res.setVisible(true);
        res.setLocationRelativeTo(null);
    }
    
}
