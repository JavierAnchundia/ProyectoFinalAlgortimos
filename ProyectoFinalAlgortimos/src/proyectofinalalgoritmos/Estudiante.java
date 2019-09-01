/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinalalgoritmos;

/**
 *
 * @author Javier
 */
public class Estudiante {
    protected String nombre;
    protected String apellido;
    protected String matricula;
    protected double promEconomia;
    protected double promSalud;
    protected double promLaboral;
    protected double promFamilia;
    protected double promGlobal;
    
    public Estudiante next;

    public Estudiante(String nombre, String apellido, String matricula, double promEconomia, double promSalud, double promLaboral, double promFamilia,double promGlobal) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.matricula = matricula;
        this.promEconomia = promEconomia;
        this.promSalud = promSalud;
        this.promLaboral = promLaboral;
        this.promFamilia = promFamilia;
        this.promGlobal = promGlobal;
    }

    public Estudiante(String nombre, String apellido, String matricula, double prom) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.matricula = matricula;
        this.promLaboral = prom;
        this.promSalud = prom;
        this.promEconomia = prom;
        this.promFamilia = prom;
        this.promGlobal = prom;
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

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getPromEconomia() {
        return promEconomia;
    }

    public void setPromEconomia(int promEconomia) {
        this.promEconomia = promEconomia;
    }

    public double getPromSalud() {
        return promSalud;
    }

    public void setPromSalud(int promSalud) {
        this.promSalud = promSalud;
    }

    public double getPromLaboral() {
        return promLaboral;
    }

    public void setPromLaboral(int promLaboral) {
        this.promLaboral = promLaboral;
    }

    public double getPromFamilia() {
        return promFamilia;
    }

    public void setPromFamilia(int promFamilia) {
        this.promFamilia = promFamilia;
    }

    public double getPromGlobal() {
        return promGlobal;
    }

    public void setPromGlobal(int promGlobal) {
        this.promGlobal = promGlobal;
    }




}
