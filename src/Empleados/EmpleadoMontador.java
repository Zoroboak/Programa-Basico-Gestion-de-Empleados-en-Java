/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Empleados;

/**
 *
 * @author enrique
 */
public class EmpleadoMontador extends Empleado {
    private int numeroPiezas;
    private double salarioPieza;
    public EmpleadoMontador(String nombre, String apellidos,int unidadesMontadas, double salarioPieza){
        super(nombre,apellidos);
        numeroPiezas=unidadesMontadas;
        this.salarioPieza=salarioPieza;
    }

    public int getUnidadesMontadas() {
        return numeroPiezas;
    }

    public void setUnidadesMontadas(int numeroPiezas) {
        this.numeroPiezas = numeroPiezas;
    }

    public double getSalarioUnidadMontada() {
        return salarioPieza;
    }

    public void setSalarioUnidadMontada(double salarioPieza) {
        this.salarioPieza = salarioPieza;
    }
    
    @Override
    public double getSalario(){
        return getSalarioUnidadMontada() * getUnidadesMontadas();
    }
    @Override
    public String toString(){
        return "Empleado Montador: " + super.toString();
    }
}
