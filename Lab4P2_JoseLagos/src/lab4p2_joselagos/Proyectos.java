package lab4p2_joselagos;

import java.util.ArrayList;

public class Proyectos {
    private String nombre;
    private String empresa;
    private String descripcion;
    private int duracion;
    private String estado;
    private ArrayList<Directores> directores = new ArrayList();
    private ArrayList<Desarrolladores> desarrolladores = new ArrayList();
    private ArrayList<Consultores> consultores = new ArrayList();

    public Proyectos() {
    }

    public Proyectos(String nombre, String empresa, String descripcion, int duracion, String estado, ArrayList<Directores> directores, ArrayList<Desarrolladores> desarrolladores, ArrayList<Consultores>  consultores) {
        this.nombre = nombre;
        this.empresa = empresa;
        this.descripcion = descripcion;
        this.duracion = duracion;
        this.estado = estado;
        this.directores = directores;
        this.desarrolladores = desarrolladores;
        this.consultores = consultores;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public ArrayList<Directores> getDirectores() {
        return directores;
    }

    public void setDirectores(ArrayList<Directores> directores) {
        this.directores = directores;
    }

    public ArrayList<Desarrolladores> getDesarrolladores() {
        return desarrolladores;
    }

    public void setDesarrolladores(ArrayList<Desarrolladores> desarrolladores) {
        this.desarrolladores = desarrolladores;
    }

    public ArrayList<Consultores> getConsultores() {
        return consultores;
    }

    public void setConsultores(ArrayList<Consultores> consultores) {
        this.consultores = consultores;
    }

    

    @Override
    public String toString() {
        return "Proyecto: " + "Nombre del proyecto = " + nombre + ", Nombre de la empresa=" + empresa + ", Descripcion del proyecto=" + descripcion + ", Años de duracion = " + duracion + ", Estado del proyecto = " + estado + ", Directores a cargo = " + directores + ", Desarrolladores = " + desarrolladores + ", Consultores = " + consultores;
    }
    
}
