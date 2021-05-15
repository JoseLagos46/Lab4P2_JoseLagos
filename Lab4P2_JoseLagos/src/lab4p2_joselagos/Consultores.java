package lab4p2_joselagos;

import java.util.ArrayList;


public class Consultores extends Empleados{
    private int projects;
    private String campo;
    private int tiempo;
    private double sueldo = 0;

    public Consultores() {
        super();
    }

    public Consultores(String campo, int tiempo, int asignados, String nombre, String apellido, String Id, String nacionalidad, int contrato, String user, String clave ) {
        super(nombre, apellido, Id, nacionalidad, contrato, user, clave);
        this.campo = campo;
        this.tiempo = tiempo;
        this.sueldo = Sueldo(projects, contrato, asignados);
    }


    public int getProjects() {
        return projects;
    }

    public void setProjects(int projects) {
        this.projects = projects;
    }

    public String getCampo() {
        return campo;
    }

    public void setCampo(String campo) {
        this.campo = campo;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return super.toString()+" Cargo = Consultor" + "Proyectos realizados = " + projects  + ", Principal campo de experiencia = " + campo + ", Tiempo de duracion de consultoria = " + tiempo ;
    }
    
    
    
    public double Sueldo(int proyectos, int contrato, int asignados){
        double aux;
        double aux2;
        aux = 4.13*proyectos*13280;
        aux2 = asignados+contrato;
        return aux/aux2;
    }
    
}
