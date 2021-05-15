package lab4p2_joselagos;

import java.util.ArrayList;

public class Directores extends Empleados{
    private int años;
    private int projects;
    private double sueldo = 0;
    private int asignados;
    private ArrayList<Desarrolladores> desarrolladores = new ArrayList();

    public Directores() {
        super();
    }

    public Directores(int años, int projects, ArrayList<Desarrolladores> desarrolladores, String nombre, String apellido, String Id, String nacionalidad, int contrato, String user, String clave) {
        super(nombre, apellido, Id, nacionalidad, contrato, user, clave);
        this.años = años;
        this.projects = projects;
        this.desarrolladores = desarrolladores;
        this.sueldo = Sueldo(projects, asignados, contrato, desarrolladores.size(), contrato);
    }

    public int getAños() {
        return años;
    }

    public void setAños(int años) {
        this.años = años;
    }

    public int getProjects() {
        return projects;
    }

    public void setProjects(int projects) {
        this.projects = projects;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public ArrayList<Desarrolladores> getDesarrolladores() {
        return desarrolladores;
    }

    public void setDesarrolladores(ArrayList<Desarrolladores> desarrolladores) {
        this.desarrolladores = desarrolladores;
    }
    
    public double Sueldo(int proyectos, int proyectosA, int consultores, int desarrolladores, int contrato){
        double aux;
        double aux2;
        aux = proyectos*proyectosA*consultores*desarrolladores*5.23;
        aux2 = proyectosA*contrato*2.28;
        return aux/aux2;
    }
    
}
