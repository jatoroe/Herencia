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
public class Persona
{
    private String direccion;
    private String telefono;
    private String Materia;
    
    public Persona (String d, String t, String m)
    {
        this.direccion = d;
        this.telefono = t;
        this.Materia = m;
    }
    public String getDireccion(){
        return direccion;
    }
    public String getTelefono(){
        return telefono;
    }
    public String getMateria(){
        return Materia;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setMateria(String Materia) {
        this.Materia = Materia;
    }
    
}


