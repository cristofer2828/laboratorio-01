/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laboratorio.pkg1;

/**
 *
 * @author ESTUDIANTE
 */
public class Persona {
  private String nombre;
  private String apellido;
  private String dni;
  private int edad;
  private String direccion;
  
  public Persona(){}
  public Persona (String nombre){
      this.nombre=nombre;   
  } 
   public Persona(
    String nombre,
    String apellido,
    String dni){
    this.nombre = nombre;
    this.apellido = apellido;
    this.dni = dni;
}

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDni() {
        return dni;
    }

    public int getEdad() {
        return edad;
    }

    public String getDireccion() {
        return direccion;
        
    }

}
