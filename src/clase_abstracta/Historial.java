/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase_abstracta;

import interfaz_class.interface_buscarDatos;
import interfaz_class.Interface_mostrarDatos;

public abstract class Historial implements interface_buscarDatos, Interface_mostrarDatos{
    
    private int DNI;
    
    public Historial(int DNI){
        this.DNI = DNI;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }
    
    @Override
    public void mostrarDatos(){
    }
    
    @Override
    public void buscar(){
    }
    
}

