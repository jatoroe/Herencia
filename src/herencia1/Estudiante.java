/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia1;

/**
 *
 * @author Estudiante
 */
public class Estudiante extends Persona {
    private double[] notas;
    private Profesor asignado;
    
    public Estudiante(double[] notas, Profesor asignado, String direccion, String telefono, String Materia){
        super(direccion, telefono, Materia);
        this.notas = notas;
        this.asignado = asignado;
               
    }
    
    public double calcularPromedio(){
        double resultado = 0;
        for(double nota : notas){
            resultado +=nota;
        }
        return resultado/notas.length;
    }
    
    public double[] getNotas(){
        return notas;
    }

    public Profesor getAsignado() {
        return asignado;
    }
}
