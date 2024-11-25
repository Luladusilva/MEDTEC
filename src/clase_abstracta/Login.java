/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase_abstracta;

/**
 *
 * @author JORDAN
 */
public abstract class Login {

    protected String dni;

    public Login(String dni) {
        this.dni = dni;
    }

    public abstract void autenticar();
}