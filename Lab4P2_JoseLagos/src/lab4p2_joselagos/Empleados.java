package lab4p2_joselagos;

public class Empleados {
    private String nombre;
    private String apellido;
    private String Id;
    private String nacionalidad;
    private int contrato;
    private String user;
    private String clave;

    public Empleados() {
    }

    public Empleados(String nombre, String apellido, String Id, String nacionalidad, int contrato, String user, String clave) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.Id = Id;
        this.nacionalidad = nacionalidad;
        this.contrato = contrato;
        this.user = user;
        this.clave = clave;
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

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public int getContrato() {
        return contrato;
    }

    public void setContrato(int contrato) {
        this.contrato = contrato;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    } 
    
    public double Sueldo(int contrato){
        double aux;
        double aux2;
        aux = 12000*8;
        aux2 = 2*contrato;
        
        return aux/aux2;
    }
    
    @Override
    public String toString() {
        return "Empleado: " + "Nombre = " + nombre + ", Apellido = " + apellido + ", ID = " + Id + ", Nacionalidad = " + nacionalidad ;
    }
    
    
}
