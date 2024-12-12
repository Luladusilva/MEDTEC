/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase_abstracta;

import interfaz_class.interface_cita;

public abstract class Cita_abstrac implements interface_cita{
    private String fecha;
    private String hora;
    private String especialidad;
    private String estado;
    private int cod;
    
    public Cita_abstrac(String especialidad){
        this.especialidad = especialidad;
    }
    
    public Cita_abstrac(String fecha, String hora, String especialidad, int cod){
        this.fecha = fecha;
        this.hora = hora;
        this.especialidad = especialidad;
        this.cod = cod;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }
    
    @Override
    public void registrar_cita() {
    }
}
