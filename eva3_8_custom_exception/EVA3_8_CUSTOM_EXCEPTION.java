/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.eva3_8_custom_exception;

/**
 *
 * @author eduar
 */
public class EVA3_8_CUSTOM_EXCEPTION {

    public static void main(String[] args) {
        Persona perso = new Persona();
        perso.setNombre("Eduardo");
        perso.setApellido("Muñoz");
        try{
     
        perso.setEdad(-10);
        }catch (DatoEntradaCheckedEx e){
            System.out.println(e.getMessage());
        }
        
    }
}
class Persona{
    private String nombre;
    private String apellido;
    private int edad;

    public Persona() {
         this.nombre = ".";
        this.apellido = ".";
        this.edad = 0;
    }

    public Persona(String nombre, String apellido, int edad) throws DatoEntradaCheckedEx {
        this.nombre = nombre;
        this.apellido = apellido;
        setEdad(edad);
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) throws DatoEntradaCheckedEx {
        if(edad < 0)
        //throw new DatoEntradaException();
        throw new DatoEntradaCheckedEx();
            
        this.edad = edad;
    }
    
    
}
class DatoEntradaException extends RuntimeException{

    public DatoEntradaException() {
        super("Dato de entrada incorrecto!! El valor debe ser positivo.");
    }
    
    
}
class DatoEntradaCheckedEx extends Exception{

    public DatoEntradaCheckedEx() {
        super("Dato de entrada incorrecto!! El valor debe ser positivo.");
    }
    
    
    
}