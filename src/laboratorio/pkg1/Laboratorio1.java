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
        per.setApellido(apellido "Perez");
        per.setDni(dni "Perez");
        per.setEdad(edad "16");
        String imprimir=per.getConsola();
        System.out.println( imprimir);
        //segundo ejemplo
        String nombre2 ="miguel";
        String apellido ="Cervantes";
        String dni ="11112222";
        
        Persona per2 = new Persona(
        nombre2,apellido,dni);
        String imprimir2 =per2.getConsola();
        System.out.println( imprimir2);
        System.out.println(""
                +"/n el nombre es:"+per.getNombre()
                +"/n el apellido es:"+per.getApellido()
                +"/n el dni es:" +per,getdni()
                +"/n la edad es:" +per.getedad()
        );
                
                        
                
    }
}
    

