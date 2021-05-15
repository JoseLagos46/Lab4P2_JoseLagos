package lab4p2_joselagos;

public class Desarrolladores extends Empleados{
    private int projects;
    private int exp;
    private String lenguaje;
    private int horas;
    private double sueldo = 0;
    private int asignados = 0;

    public Desarrolladores() {
        super();
    }

    public Desarrolladores(int exp, String lenguaje, int horas, String nombre, String apellido, String Id, String nacionalidad, int contrato, String user, String clave) {
        super(nombre, apellido, Id, nacionalidad, contrato, user, clave);
        this.exp = exp;
        this.lenguaje = lenguaje;
        this.horas = horas;
        this.sueldo = Sueldo(contrato, projects, asignados);
    }

    public int getProjects() {
        return projects;
    }

    public void setProjects(int projects) {
        this.projects = projects;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public String getLenguaje() {
        return lenguaje;
    }

    public void setLenguaje(String lenguaje) {
        this.lenguaje = lenguaje;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public int getAsignados() {
        return asignados;
    }

    public void setAsignados(int asignados) {
        this.asignados = asignados;
    }
    
    
    public double Sueldo(int contrato, int proyectos, int asignados){
        double aux;
        double aux2;
        aux = proyectos*115000*2;
        aux2 = asignados+contrato;
        return aux/aux2;
    }

    @Override
    public String toString() {
        return super.toString()+" Cargo = Desarrollador: " + "Proyectos realizados = " + projects + ", Años de experiencia = " + exp  + ", Lenguaje de programacion preferido = " + lenguaje + ", Horas de trabajo diarias = " + horas + ", Sueldo Mensual = " + sueldo;
    }
    
}
