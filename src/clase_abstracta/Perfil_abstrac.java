/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase_abstracta;

import interfaz_class.Interface_mostrarDatos;

public abstract class Perfil_abstrac implements Interface_mostrarDatos{
    
    private String dni;

    public Perfil_abstrac(String dni) {
        this.dni = dni;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
    
    @Override
    public void mostrarDatos(){
    
    }
    
    
}
