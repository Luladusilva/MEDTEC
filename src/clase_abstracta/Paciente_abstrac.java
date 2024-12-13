/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase_abstracta;


import interfaz_class.interface_registrar;

public abstract class Paciente_abstrac implements interface_registrar{
    private String nombre;
    private String apellido;
    private int celular;
    private int dni;
    private String fecha_nac;
    private String genero;
    
    
    public Paciente_abstrac(int dni, String nombre, String apellido, String genero, int celular, String fecha_nac) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.celular = celular;
        this.dni = dni;
        this.fecha_nac = fecha_nac;
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getFecha_nac() {
        return fecha_nac;
    }

    public void setFecha_nac(String fecha_nac) {
        this.fecha_nac = fecha_nac;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    
    @Override
    public void registrar_paciente(int dni, String nombre, String apellido, String genero, int celular, String fecha_nac){
    }
    
}
