/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia1;
import java.util.Scanner;
/**
 *
 * @author Estudiante
 */
public class Herencia1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       
       Profesor op = new Profesor("f", "123", "poo");
       
       double notas[] = {5,5,5,5};
       
       Estudiante es = new Estudiante(notas, op, "j", "456", "Poo");
       
        System.out.println("la direccion del estudiante " + es.getDireccion());
        
        System.out.println("El profesor es " + es.getAsignado().getDireccion());
        
        System.out.println("La materia que cursa es " + es.getMateria());
        
        System.out.println("El promedio del estudiante es " + es.calcularPromedio());
        
        
    }
    
}
