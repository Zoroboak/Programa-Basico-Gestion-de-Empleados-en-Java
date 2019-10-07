/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MisClases.Empleados;

import javax.swing.DefaultListModel;

/**
 *
 * @author enrique
 */
public abstract  class Empleado {
    public static DefaultListModel<Empleado> listaEmpleados=new DefaultListModel<>();

    private String nombre;
    private String apellidos;
    public Empleado(String nombre, String apellidos){
        this.nombre=nombre;
        this.apellidos=apellidos;
        listaEmpleados.addElement(this);
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }
    
    private String getApellidosYNombre(){
        return getApellidos() + ", " +  getNombre();     
    }
    
    public abstract  double getSalario();
    
    public String getDatos(){
        return getApellidosYNombre()+" - "+String.format("%,.2f", getSalario());

    }
    
    @Override
    public  String toString(){
        return getApellidosYNombre();
    }
        
}
