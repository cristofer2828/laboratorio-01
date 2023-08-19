/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package laboratorio.pkg1;

/**
 *
 * @author ESTUDIANTE
 */
public class Laboratorio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre ="Juan";
        Persona per =new Persona (nombre);
        //segundo ejemplo
        String nombre2 ="miguel";
        String apellido ="Cervantes";
        String dni ="11112222";
        
        Persona per2 = new Persona(
        nombre,apellido,dni);
        System.out.printin(""
                +"/n el nombre es:"+per.getNombre()
                +"/n el apellido es:"+per.getApellido()
                +"/n el dni es:" +per,getdni()
                +"/n la edad es:" +per.getedad()
        );
                
                        
                
    }
}
    

