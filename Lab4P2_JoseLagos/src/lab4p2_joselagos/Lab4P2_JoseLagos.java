package lab4p2_joselagos;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Lab4P2_JoseLagos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ArrayList empleados = new ArrayList();
        ArrayList proyectos = new ArrayList();

        boolean res = false;
        while (res == false) {
            int login = 1;
            try {
                System.out.print("\nLOGIN\n"
                        + "Seleccione su rango: \n"
                        + "1. Crear usuario\n"
                        + "2. Ingresar\n"
                        + "3. Cerrar\n"
                        + "Ingrese su eleccion: ");
                login = leer.nextInt();
            } catch (Exception e) {
                System.out.println("No se pueden ingresar letras o simbolos");
                res = true;
            }

            switch (login) {
                case 1: {
                    System.out.print("\nCrear Usuario\n"
                            + "Ingrese su Nombre de usuario: ");
                    String user = leer.next();
                    System.out.print("Ingrese su contraseña: ");
                    String contraseña = leer.next();
                    System.out.print("Ingrese su nombre: ");
                    String nombre = leer.next();
                    System.out.print("Ingrese su apellido: ");
                    String apellido = leer.next();
                    System.out.print("Ingrese su ID: ");
                    String id = leer.next();
                    System.out.print("Ingrese su nacionalidad: ");
                    String nacionalidad = leer.next();
                    System.out.print("Ingrese los años de contrato: ");
                    int contrato = leer.nextInt();
                    System.out.print("Seleccione su cargo:\n"
                            + "a. Director\n"
                            + "b. Desarrollador\n"
                            + "c. Consultor\n"
                            + "d. Empleado normal\n"
                            + "Ingrese su opcion: ");
                    char cargo = leer.next().charAt(0);

                    switch (cargo) {
                        case 'a': {
                            int puesto = 0;
                            try {
                                System.out.print("Ingrese los años que lleva en el puesto: ");
                                puesto = leer.nextInt();
                            } catch (Exception e) {
                                System.out.println("Debe ingresar un numero entero");
                                break;
                            }
                            try {
                                System.out.print("Ingrese los años de contrato: ");
                                contrato = leer.nextInt();
                            } catch (Exception e) {
                                System.out.println("Debe ingresar un numero entero");
                                break;
                            }
                            int sueldo = 0;
                            int des = 0;
                            ArrayList<Desarrolladores> aux = new ArrayList();
                            try {
                                System.out.print("Ingrese la cantidad de desarrolladores asignados: ");
                                des = leer.nextInt();
                            } catch (Exception e) {
                                System.out.println("Debe ingresar un numero entero");
                                break;
                            }
                            int cont = 0;
                            for (Object t : empleados) {
                                if (t instanceof Desarrolladores) {
                                    System.out.println(empleados);;
                                }
                            }
                            while (cont < des) {
                                int pos = 0;
                                try {
                                    System.out.println("Ingrese la posicion del desarrollador a asignar: ");
                                    pos = leer.nextInt();
                                } catch (Exception e) {
                                    System.out.println("Debe ingresar un numero entero");
                                    break;
                                }
                                aux.add(((Desarrolladores) empleados.get(pos)));
                            }
                            System.out.print("Ingrese la cantidad de proyectos asignados: ");
                            int asignados = leer.nextInt();

                            empleados.add(new Directores(puesto, asignados, aux, nombre, apellido, id, nacionalidad, contrato, user, contraseña));
                            break;
                        }
                        case 'b': {
                            int horas = 0;
                            int exp = 0;
                            try {
                                System.out.print("Ingrese los años de experiencia: ");
                                exp = leer.nextInt();
                            } catch (Exception e) {
                                System.out.println("Debe ingresar un numero entero");
                                break;
                            }
                            int sueldo = 0;
                            System.out.print("Ingrese el lenguaje de programacion preferido: ");
                            String lenguaje = leer.next();

                            try {
                                System.out.print("Ingrese horas de trabajo diarias: ");
                                horas = leer.nextInt();
                            } catch (Exception e) {
                                System.out.println("Debe ingresar un numero entero");
                                break;
                            }

                            empleados.add(new Desarrolladores(exp, lenguaje, horas, nombre, apellido, id, nacionalidad, contrato, user, contraseña));
                            break;
                        }
                        case 'c': {
                            int realizados = 0;
                            try {
                                System.out.print("Ingrese la cantidad de proyectos realizados: ");
                                realizados = leer.nextInt();
                            } catch (Exception e) {
                                System.out.println("Debe ingresar un numero entero");
                                break;
                            }
                            try {
                                System.out.print("Ingrese los años de contrato: ");
                                contrato = leer.nextInt();
                            } catch (Exception e) {
                                System.out.println("Debe ingresar un numero entero");
                                break;
                            }
                            int sueldo = 0;
                            System.out.print("Ingrese el principal campo de experiencia: ");
                            String campo = leer.next();

                            System.out.print("Ingrese el tiempo de duracion de la consultoria: ");
                            int consultoria = leer.nextInt();

                            empleados.add(new Consultores(campo, sueldo, realizados, nombre, apellido, id, nacionalidad, contrato, user, contraseña));
                            break;
                        }
                        case 'd': {
                            empleados.add(new Empleados(nombre, apellido, id, nacionalidad, contrato, user, contraseña));
                            System.out.println("Su usuario ha sido guardado exitosamente");
                            break;
                        }
                        default: {
                            System.out.println("Opcion invalida");
                            break;
                        }
                    }
                    break;
                }
                case 2: {
                    System.out.print("Ingrese su nombre de usuario: ");
                    String usuario = leer.next();
                    System.out.print("Ingrese su contraseña: ");
                    String contraseña = leer.next();

                    if ("admin".equals(usuario) || "1234".equals(contraseña)) {
                        int opcion = 0;
                        try {
                            System.out.print("\nADMIN\n"
                                    + "1. Listar\n"
                                    + "2. Modificar\n"
                                    + "3. Crear/Agregar\n"
                                    + "4. Eliminar\n"
                                    + "Ingrese su opcion: ");
                            opcion = leer.nextInt();

                        } catch (Exception e) {
                            System.out.println("No se pueden ingresar letras");
                            break;
                        }
                        switch (opcion) {
                            case 1: {
                                System.out.println("\nDesarrolladpores");
                                for (int i = 0; i < empleados.size(); i++) {
                                    if (empleados.get(i) instanceof Desarrolladores) {
                                        System.out.println(i + " - " + empleados.get(i));
                                    }
                                }
                                System.out.println("\nDirectores");
                                for (int i = 0; i < empleados.size(); i++) {
                                    if (empleados.get(i) instanceof Directores) {
                                        System.out.println(i + " - " + empleados.get(i));
                                    }
                                }
                                System.out.println("\nConsultores");
                                for (int i = 0; i < empleados.size(); i++) {
                                    if (empleados.get(i) instanceof Consultores) {
                                        System.out.println(i + " - " + empleados.get(i));
                                    }
                                }
                                System.out.println("\nProyectos");
                                for (int i = 0; i < empleados.size(); i++) {
                                    if (proyectos.get(i) instanceof Proyectos) {
                                        System.out.println(i + " - " + proyectos.get(i));
                                    }
                                }
                                break;
                            }
                            case 2: {

                                int option = 0;
                                System.out.println("MODIFICAR");
                                try {
                                    System.out.print("Que desea modificar?\n"
                                            + "1. Modificar nuevo proyecto\n"
                                            + "2. Modificar Desarrollador\n"
                                            + "3. Modificar Director\n"
                                            + "4. Modificar Consultor\n"
                                            + "Ingrese su opcion: ");
                                    option = leer.nextInt();
                                } catch (Exception e) {
                                    System.out.println("No se pueden agregar palabras o caracteres");
                                    break;
                                }
                                switch (option) {
                                    case 1: {
                                        
                                        break;
                                    }
                                    case 2: {
                                        System.out.print("Ingrese el nombre del desarrollador que desea modificar: ");
                                        String Nombre = leer.next();

                                        for (int i = 0; i < empleados.size(); i++) {
                                            if (((Desarrolladores) empleados.get(i)).getNombre().equals(Nombre)) {
                                                int opti = 0;
                                                try {
                                                    System.out.println("Ingrese lo que desea modificar:\n"
                                                            + "1. Nombre\n"
                                                            + "2. Apellido\n"
                                                            + "3. Id\n"
                                                            + "4. Nacionalidad\n"
                                                            + "5. Años de contrato\n"
                                                            + "6. Años de experiencia\n"
                                                            + "7. Proyectos realizados\n"
                                                            + "8. Lenguaje de programacion preferido\n"
                                                            + "9. Horas de trabajo diarias\n"
                                                            + "Ingrese su opcion: ");
                                                    opti = leer.nextInt();
                                                } catch (Exception e) {
                                                    System.out.println("No se pueden ingresar caracteres o letras");
                                                    break;
                                                }

                                                switch (opti) {
                                                    case 1: {
                                                        System.out.print("Ingrese el nuevo nombre: ");
                                                        String aux = leer.next();

                                                        ((Desarrolladores) empleados.get(i)).setNombre(aux);
                                                        break;
                                                    }
                                                    case 2: {
                                                        System.out.print("Ingrese el nuevo apellido: ");
                                                        String aux = leer.next();

                                                        ((Desarrolladores) empleados.get(i)).setApellido(aux);
                                                        break;
                                                    }
                                                    case 3: {
                                                        System.out.print("Ingrese el nuevo ID: ");
                                                        String aux = leer.next();

                                                        ((Desarrolladores) empleados.get(i)).setId(aux);
                                                        break;
                                                    }
                                                    case 4: {
                                                        System.out.print("Ingrese la nueva nacionalidad: ");
                                                        String aux = leer.next();

                                                        ((Desarrolladores) empleados.get(i)).setNacionalidad(aux);
                                                        break;
                                                    }
                                                    case 5: {
                                                        System.out.print("Ingrese el año de contrato: ");
                                                        int aux = leer.nextInt();

                                                        ((Desarrolladores) empleados.get(i)).setContrato(aux);
                                                        break;
                                                    }
                                                    case 6: {
                                                        System.out.print("Ingrese los años de experiencia: ");
                                                        int aux = leer.nextInt();

                                                        ((Desarrolladores) empleados.get(i)).setExp(aux);
                                                        break;
                                                    }
                                                    case 7: {
                                                        System.out.print("Ingrese los proyectos realizados: ");
                                                        int aux = leer.nextInt();

                                                        ((Desarrolladores) empleados.get(i)).setProjects(aux);
                                                        break;
                                                    }
                                                    case 8: {
                                                        System.out.print("Ingrese el lenguaje de programacion preferido: ");
                                                        String aux = leer.next();

                                                        ((Desarrolladores) empleados.get(i)).setLenguaje(aux);
                                                        break;
                                                    }
                                                    case 9: {
                                                        System.out.print("Ingrese las horas de trabajo diario: ");
                                                        int aux = leer.nextInt();

                                                        ((Desarrolladores) empleados.get(i)).setHoras(aux);
                                                        break;
                                                    }
                                                    default: {
                                                        System.out.println("Opcion Invalida");
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                        break;
                                    }
                                    case 3: {

                                        System.out.print("Ingrese el nombre del Director que desea modificar: ");
                                        String Nombre = leer.next();

                                        for (int i = 0; i < empleados.size(); i++) {
                                            if (((Consultores) empleados.get(i)).getNombre().equals(Nombre)) {
                                                int opti = 0;
                                                try {
                                                    System.out.println("Ingrese lo que desea modificar:\n"
                                                            + "1. Nombre\n"
                                                            + "2. Apellido\n"
                                                            + "3. Id\n"
                                                            + "4. Nacionalidad\n"
                                                            + "5. Años de contrato\n"
                                                            + "6. Años durante su puesto\n"
                                                            + "7. Desarrolladores asignados\n"
                                                            + "8. Proyectos realizados\n"
                                                            + "Ingrese su opcion: ");
                                                    opti = leer.nextInt();
                                                } catch (Exception e) {
                                                    System.out.println("No se pueden ingresar caracteres o letras");
                                                    break;
                                                }

                                                switch (opti) {
                                                    case 1: {
                                                        System.out.print("Ingrese el nuevo nombre: ");
                                                        String aux = leer.next();

                                                        ((Directores) empleados.get(i)).setNombre(aux);
                                                        break;
                                                    }
                                                    case 2: {
                                                        System.out.print("Ingrese el nuevo apellido: ");
                                                        String aux = leer.next();

                                                        ((Directores) empleados.get(i)).setApellido(aux);
                                                        break;
                                                    }
                                                    case 3: {
                                                        System.out.print("Ingrese el nuevo ID: ");
                                                        String aux = leer.next();

                                                        ((Directores) empleados.get(i)).setId(aux);
                                                        break;
                                                    }
                                                    case 4: {
                                                        System.out.print("Ingrese la nueva nacionalidad: ");
                                                        String aux = leer.next();

                                                        ((Directores) empleados.get(i)).setNacionalidad(aux);
                                                        break;
                                                    }
                                                    case 5: {
                                                        System.out.print("Ingrese el año de contrato: ");
                                                        int aux = leer.nextInt();

                                                        ((Directores) empleados.get(i)).setContrato(aux);
                                                        break;
                                                    }
                                                    case 6: {
                                                        System.out.print("Ingrese el año de puesto: ");
                                                        int aux = leer.nextInt();

                                                        ((Directores) empleados.get(i)).setAños(aux);
                                                        break;
                                                    }
                                                    case 7: {
                                                        int des = 0;
                                                        ArrayList<Desarrolladores> aux = new ArrayList();
                                                        try {
                                                            System.out.print("Ingrese la cantidad de desarrolladores asignados: ");
                                                            des = leer.nextInt();
                                                        } catch (Exception e) {
                                                            System.out.println("Debe ingresar un numero entero");
                                                            break;
                                                        }
                                                        int cont = 0;
                                                        for (Object t : empleados) {
                                                            if (t instanceof Desarrolladores) {
                                                                System.out.println(empleados);
                                                            }
                                                        }
                                                        while (cont < des) {
                                                            int pos = 0;
                                                            try {
                                                                System.out.println("Ingrese la posicion del desarrollador a asignar: ");
                                                                pos = leer.nextInt();
                                                            } catch (Exception e) {
                                                                System.out.println("Debe ingresar un numero entero");
                                                                break;
                                                            }
                                                            aux.add(((Desarrolladores) empleados.get(pos)));
                                                        }
                                                        ((Directores) empleados.get(i)).setDesarrolladores(aux);
                                                        break;
                                                    }
                                                    case 8: {
                                                        System.out.print("Ingrese el nuevo numero de proyectos realizados: ");
                                                        int aux = leer.nextInt();

                                                        ((Directores) empleados.get(i)).setProjects(aux);
                                                        break;
                                                    }
                                                    default: {
                                                        System.out.println("Invalido");
                                                    }
                                                }
                                            }
                                        }

                                        break;
                                    }
                                    case 4: {
                                        System.out.print("Ingrese el nombre del consultor que desea modificar: ");
                                        String Nombre = leer.next();

                                        for (int i = 0; i < empleados.size(); i++) {
                                            if (((Consultores) empleados.get(i)).getNombre().equals(Nombre)) {
                                                int opti = 0;
                                                try {
                                                    System.out.println("Ingrese lo que desea modificar:\n"
                                                            + "1. Nombre\n"
                                                            + "2. Apellido\n"
                                                            + "3. Id\n"
                                                            + "4. Nacionalidad\n"
                                                            + "5. Años de contrato\n"
                                                            + "6. Campo de experiencia\n"
                                                            + "7. Tiempo de consultoria\n"
                                                            + "Ingrese su opcion: ");
                                                    opti = leer.nextInt();
                                                } catch (Exception e) {
                                                    System.out.println("No se pueden ingresar caracteres o letras");
                                                    break;
                                                }

                                                switch (opti) {
                                                    case 1: {
                                                        System.out.print("Ingrese el nuevo nombre: ");
                                                        String aux = leer.next();

                                                        ((Consultores) empleados.get(i)).setNombre(aux);
                                                        break;
                                                    }
                                                    case 2: {
                                                        System.out.print("Ingrese el nuevo apellido: ");
                                                        String aux = leer.next();

                                                        ((Consultores) empleados.get(i)).setApellido(aux);
                                                        break;
                                                    }
                                                    case 3: {
                                                        System.out.print("Ingrese el nuevo ID: ");
                                                        String aux = leer.next();

                                                        ((Consultores) empleados.get(i)).setId(aux);
                                                        break;
                                                    }
                                                    case 4: {
                                                        System.out.print("Ingrese la nueva nacionalidad: ");
                                                        String aux = leer.next();

                                                        ((Consultores) empleados.get(i)).setNacionalidad(aux);
                                                        break;
                                                    }
                                                    case 5: {
                                                        System.out.print("Ingrese el año de contrato: ");
                                                        int aux = leer.nextInt();

                                                        ((Consultores) empleados.get(i)).setContrato(aux);
                                                        break;
                                                    }
                                                    case 6: {
                                                        System.out.print("Ingrese el nuevo campo de experiencia: ");
                                                        String aux = leer.next();

                                                        ((Consultores) empleados.get(i)).setCampo(aux);
                                                        break;
                                                    }
                                                    case 7: {
                                                        System.out.print("Ingrese el nuevo tiempo de consultoria: ");
                                                        int aux = leer.nextInt();

                                                        ((Consultores) empleados.get(i)).setTiempo(aux);
                                                        break;
                                                    }
                                                    default: {
                                                        System.out.println("Opcion Invalida");
                                                        break;
                                                    }
                                                }
                                            }
                                        }

                                        break;
                                    }
                                    default: {

                                        System.out.println("Opcion invalida");
                                        break;
                                    }
                                }
                                break;
                            }
                            case 3: {
                                int option = 0;
                                System.out.println("CREAR");
                                try {
                                    System.out.print("Que desea crear o agregar?\n"
                                            + "1. Crear nuevo proyecto\n"
                                            + "2. Agregar Desarrollador\n"
                                            + "3. Agregar Director\n"
                                            + "4. Agregar Consultor\n"
                                            + "Ingrese su opcion: ");
                                    option = leer.nextInt();
                                } catch (Exception e) {
                                    System.out.println("No se pueden agregar palabras o caracteres");
                                    break;
                                }
                                switch (option) {
                                    case 1: {
                                        ArrayList<Desarrolladores> listaD = new ArrayList();
                                        ArrayList<Consultores> listaC = new ArrayList();
                                        ArrayList<Directores> listaDi = new ArrayList();
                                        System.out.print("Ingrese el nombre del proyecto: ");
                                        String nombre = leer.next();
                                        System.out.print("Ingrese el nombre de la empresa que solicitó el proyecto: ");
                                        String empresa = leer.next();
                                        System.out.print("Ingrese la descripcion del proyecto: ");
                                        String descripcion = leer.next();
                                        System.out.print("Ingrese la cantidad de años de duracion: ");
                                        int duracion = leer.nextInt();
                                        System.out.print("Seleccione el estado actual del proyecto:\n"
                                                + "a. Iniciado\n"
                                                + "b. En desarrollo\n"
                                                + "c. Terminado\n"
                                                + "Ingrese su eleccion: ");
                                        char eleccion = leer.next().charAt(0);
                                        String estado = "";
                                        int terminados = 0;
                                        int asignados = 0;
                                        switch (eleccion) {
                                            case 'a': {
                                                estado += "Iniciado";
                                                break;
                                            }
                                            case 'b': {
                                                estado += "En desarrollo";
                                                ((Desarrolladores) empleados.get(0)).setAsignados(asignados);
                                                break;
                                            }
                                            case 'c': {
                                                estado += "Terminado";
                                                terminados++;
                                                ((Desarrolladores) empleados.get(0)).setProjects(terminados);
                                                break;
                                            }
                                            default: {
                                                System.out.println("Invalido");
                                                estado += "Indeterminado";
                                                break;
                                            }
                                        }

                                        int i = 0;
                                        while (i == 0) {
                                            int dir = 0;
                                            try {
                                                System.out.print("Ingrese la cantidad de directores encargados: ");
                                                dir = leer.nextInt();
                                            } catch (Exception e) {
                                                System.out.println("Debe ingresar un numero");
                                            }
                                            if (dir > 2) {
                                                System.out.print("La cantidad de directoresa a cargo no puede ser mayor a 2");
                                            } else if (dir > 0 && dir < 2) {
                                                i = 1;

                                                for (Object t : empleados) {
                                                    if (t instanceof Directores) {
                                                        System.out.println(empleados);;
                                                    }
                                                }
                                                int cont = 1;

                                                while (dir > cont) {
                                                    System.out.print("Ingrese la posicion del director " + cont + ": ");
                                                    int pos = leer.nextInt();
                                                    cont++;
                                                    listaDi.add((Directores) empleados.get(pos));
                                                }

                                            } else {
                                                System.out.println("El numero debe ser mayor a 0");
                                            }

                                            int j = 0;
                                            while (j == 0) {
                                                int cons = 0;
                                                try {
                                                    System.out.print("Ingrese la cantidad de consultores: ");
                                                    dir = leer.nextInt();
                                                } catch (Exception e) {
                                                    System.out.println("Debe ingresar un numero");
                                                }
                                                if (dir > 3) {
                                                    System.out.print("La cantidad de consultores no puede ser mayor a 3");
                                                } else if (dir > 0 && dir < 3) {
                                                    j = 1;

                                                    for (Object t : empleados) {
                                                        if (t instanceof Consultores) {
                                                            System.out.println(empleados);;
                                                        }
                                                    }
                                                    int cont = 1;

                                                    while (dir > cont) {
                                                        System.out.print("Ingrese la posicion del consultor " + cont + ": ");
                                                        int pos = leer.nextInt();
                                                        cont++;
                                                        listaC.add((Consultores) empleados.get(pos));
                                                    }

                                                } else {
                                                    System.out.println("El numero debe ser mayor a cero");
                                                }

                                                int k = 0;
                                                while (k == 0) {
                                                    int des = 0;
                                                    try {
                                                        System.out.print("Ingrese la cantidad de desarrolladores: ");
                                                        dir = leer.nextInt();
                                                    } catch (Exception e) {
                                                        System.out.println("Debe ingresar un numero");
                                                    }
                                                    if (dir > 3) {
                                                        System.out.print("La cantidad de desarrolladores no puede ser mayor a 5");
                                                    } else if (dir > 0 && dir < 5) {
                                                        k = 1;

                                                        for (Object t : empleados) {
                                                            if (t instanceof Desarrolladores) {
                                                                System.out.println(empleados);;
                                                            }
                                                        }
                                                        int cont = 1;

                                                        while (dir > cont) {
                                                            System.out.print("Ingrese la posicion del desarrollador " + cont + ": ");
                                                            int pos = leer.nextInt();
                                                            cont++;
                                                            listaD.add((Desarrolladores) empleados.get(pos));
                                                        }

                                                    } else {
                                                        System.out.println("El numero debe ser mayor a cero");
                                                    }
                                                }
                                            }
                                        }
                                        proyectos.add(new Proyectos(nombre, empresa, descripcion, duracion, estado, listaDi, listaD, listaC));
                                        break;
                                    }

                                    case 2: {
                                        System.out.print("\nIngrese el nombre de usuario: ");
                                        String user = leer.next();
                                        System.out.print("Ingrese su contraseña: ");
                                        String clave = leer.next();
                                        System.out.print("Ingrese su nombre: ");
                                        String nombre = leer.next();
                                        System.out.print("Ingrese su apellido: ");
                                        String apellido = leer.next();
                                        System.out.print("Ingrese su ID: ");
                                        String id = leer.next();
                                        System.out.print("Ingrese su nacionalidad: ");
                                        String nacionalidad = leer.next();
                                        int contrato = 0;
                                        int horas = 0;
                                        int exp = 0;
                                        try {
                                            System.out.print("Ingrese los años de experiencia: ");
                                            exp = leer.nextInt();
                                        } catch (Exception e) {
                                            System.out.println("Debe ingresar un numero entero");
                                            break;
                                        }
                                        try {
                                            System.out.print("Ingrese los años de contrato: ");
                                            contrato = leer.nextInt();
                                        } catch (Exception e) {
                                            System.out.println("Debe ingresar un numero entero");
                                            break;
                                        }
                                        int sueldo = 0;
                                        System.out.print("Ingrese el lenguaje de programacion preferido: ");
                                        String lenguaje = leer.next();

                                        try {
                                            System.out.print("Ingrese horas de trabajo diarias: ");
                                            horas = leer.nextInt();
                                        } catch (Exception e) {
                                            System.out.println("Debe ingresar un numero entero");
                                            break;
                                        }

                                        empleados.add(new Desarrolladores(exp, lenguaje, horas, nombre, apellido, id, nacionalidad, contrato, user, clave));
                                        break;
                                    }
                                    case 3: {
                                        System.out.print("\nIngrese el nombre de usuario: ");
                                        String user = leer.next();
                                        System.out.print("Ingrese su contraseña: ");
                                        String clave = leer.next();
                                        System.out.print("Ingrese su nombre: ");
                                        String nombre = leer.next();
                                        System.out.print("Ingrese su apellido: ");
                                        String apellido = leer.next();
                                        System.out.print("Ingrese su ID: ");
                                        String id = leer.next();
                                        System.out.print("Ingrese su nacionalidad: ");
                                        String nacionalidad = leer.next();
                                        int contrato = 0;
                                        int puesto = 0;
                                        try {
                                            System.out.print("Ingrese los años que lleva en el puesto: ");
                                            puesto = leer.nextInt();
                                        } catch (Exception e) {
                                            System.out.println("Debe ingresar un numero entero");
                                            break;
                                        }
                                        try {
                                            System.out.print("Ingrese los años de contrato: ");
                                            contrato = leer.nextInt();
                                        } catch (Exception e) {
                                            System.out.println("Debe ingresar un numero entero");
                                            break;
                                        }
                                        int sueldo = 0;
                                        int des = 0;
                                        ArrayList<Desarrolladores> aux = new ArrayList();
                                        try {
                                            System.out.print("Ingrese la cantidad de desarrolladores asignados: ");
                                            des = leer.nextInt();
                                        } catch (Exception e) {
                                            System.out.println("Debe ingresar un numero entero");
                                            break;
                                        }
                                        int cont = 0;
                                        for (Object t : empleados) {
                                            if (t instanceof Desarrolladores) {
                                                System.out.println(empleados);
                                            }
                                        }
                                        while (cont < des) {
                                            int pos = 0;
                                            try {
                                                System.out.println("Ingrese la posicion del desarrollador a asignar: ");
                                                pos = leer.nextInt();
                                            } catch (Exception e) {
                                                System.out.println("Debe ingresar un numero entero");
                                                break;
                                            }
                                            aux.add(((Desarrolladores) empleados.get(pos)));
                                        }
                                        System.out.print("Ingrese la cantidad de proyectos asignados: ");
                                        int asignados = leer.nextInt();

                                        empleados.add(new Directores(puesto, asignados, aux, nombre, apellido, id, nacionalidad, contrato, user, clave));
                                        break;
                                    }
                                    case 4: {
                                        System.out.print("\nIngrese el nombre de usuario: ");
                                        String user = leer.next();
                                        System.out.print("Ingrese su contraseña: ");
                                        String clave = leer.next();
                                        System.out.print("Ingrese su nombre: ");
                                        String nombre = leer.next();
                                        System.out.print("Ingrese su apellido: ");
                                        String apellido = leer.next();
                                        System.out.print("Ingrese su ID: ");
                                        String id = leer.next();
                                        System.out.print("Ingrese su nacionalidad: ");
                                        String nacionalidad = leer.next();
                                        int contrato = 0;
                                        int realizados = 0;
                                        try {
                                            System.out.print("Ingrese la cantidad de proyectos realizados: ");
                                            realizados = leer.nextInt();
                                        } catch (Exception e) {
                                            System.out.println("Debe ingresar un numero entero");
                                            break;
                                        }
                                        try {
                                            System.out.print("Ingrese los años de contrato: ");
                                            contrato = leer.nextInt();
                                        } catch (Exception e) {
                                            System.out.println("Debe ingresar un numero entero");
                                            break;
                                        }
                                        int sueldo = 0;
                                        System.out.print("Ingrese el principal campo de experiencia: ");
                                        String campo = leer.next();

                                        System.out.print("Ingrese el tiempo de duracion de la consultoria: ");
                                        int consultoria = leer.nextInt();

                                        empleados.add(new Consultores(campo, sueldo, realizados, nombre, apellido, id, nacionalidad, contrato, user, clave));
                                        break;
                                    }
                                    default: {
                                        System.out.println("Opcion invalida");
                                        break;
                                    }
                                }
                                break;
                            }

                            case 4: {
                                System.out.println("\nEliminar");
                                System.out.print("Ingrese el nombre del proyecto o del empleados que desea eliminar: ");
                                String eliminar = leer.next();

                                for (int i = 0; i < empleados.size(); i++) {
                                    if (((Empleados) empleados.get(i)).getNombre().equals(eliminar)) {
                                        empleados.remove(i);
                                    }
                                }
                                for (int i = 0; i < proyectos.size(); i++) {
                                    if (((Proyectos) proyectos.get(i)).getNombre().equals(eliminar)) {
                                        proyectos.remove(i);
                                    }
                                }
                                break;
                            }
                            default: {
                                System.out.println("Opcion invalida");
                                break;
                            }
                        }

                    } else {
                        for (int i = 0; i < empleados.size(); i++) {
                            if (((Directores) empleados.get(i)).getUser().equals(usuario) && ((Directores) empleados.get(i)).getClave().equals(contraseña)) {
                                System.out.print("\nDIRECTORES\n"
                                        + "1.Crear\n"
                                        + "2. Modificar\n"
                                        + "3. Listar\n"
                                        + "4. Eliminar\n"
                                        + "Ingrese eleccion: ");
                                int option = leer.nextInt();

                                switch (option) {
                                    case 1: {
                                        int opt = 0;
                                        try {
                                            System.out.print("1. Crear Consultores\n"
                                                    + "2. Crear Desarrolladores\n"
                                                    + "Ingrese su opcion: ");
                                            opt = leer.nextInt();
                                        } catch (Exception e) {
                                            System.out.println("Debe ingresar un numero");
                                            break;
                                        }
                                        switch (opt) {
                                            case 1: {
                                                System.out.print("\nIngrese el nombre de usuario: ");
                                                String user = leer.next();
                                                System.out.print("Ingrese su contraseña: ");
                                                String clave = leer.next();
                                                System.out.print("Ingrese su nombre: ");
                                                String nombre = leer.next();
                                                System.out.print("Ingrese su apellido: ");
                                                String apellido = leer.next();
                                                System.out.print("Ingrese su ID: ");
                                                String id = leer.next();
                                                System.out.print("Ingrese su nacionalidad: ");
                                                String nacionalidad = leer.next();
                                                int contrato = 0;
                                                int puesto = 0;
                                                try {
                                                    System.out.print("Ingrese los años que lleva en el puesto: ");
                                                    puesto = leer.nextInt();
                                                } catch (Exception e) {
                                                    System.out.println("Debe ingresar un numero entero");
                                                    break;
                                                }
                                                try {
                                                    System.out.print("Ingrese los años de contrato: ");
                                                    contrato = leer.nextInt();
                                                } catch (Exception e) {
                                                    System.out.println("Debe ingresar un numero entero");
                                                    break;
                                                }
                                                int sueldo = 0;
                                                int des = 0;
                                                ArrayList<Desarrolladores> aux = new ArrayList();
                                                try {
                                                    System.out.print("Ingrese la cantidad de desarrolladores asignados: ");
                                                    des = leer.nextInt();
                                                } catch (Exception e) {
                                                    System.out.println("Debe ingresar un numero entero");
                                                    break;
                                                }
                                                int cont = 0;
                                                for (Object t : empleados) {
                                                    if (t instanceof Desarrolladores) {
                                                        System.out.println(empleados);;
                                                    }
                                                }
                                                while (cont < des) {
                                                    int pos = 0;
                                                    try {
                                                        System.out.println("Ingrese la posicion del desarrollador a asignar: ");
                                                        pos = leer.nextInt();
                                                    } catch (Exception e) {
                                                        System.out.println("Debe ingresar un numero entero");
                                                        break;
                                                    }
                                                    aux.add(((Desarrolladores) empleados.get(pos)));
                                                }
                                                System.out.print("Ingrese la cantidad de proyectos asignados: ");
                                                int asignados = leer.nextInt();

                                                empleados.add(new Directores(puesto, asignados, aux, nombre, apellido, id, nacionalidad, contrato, user, clave));
                                                break;
                                            }
                                            case 2: {

                                                System.out.print("\nIngrese el nombre de usuario: ");
                                                String user = leer.next();
                                                System.out.print("Ingrese su contraseña: ");
                                                String clave = leer.next();
                                                System.out.print("Ingrese su nombre: ");
                                                String nombre = leer.next();
                                                System.out.print("Ingrese su apellido: ");
                                                String apellido = leer.next();
                                                System.out.print("Ingrese su ID: ");
                                                String id = leer.next();
                                                System.out.print("Ingrese su nacionalidad: ");
                                                String nacionalidad = leer.next();
                                                int contrato = 0;
                                                int realizados = 0;
                                                try {
                                                    System.out.print("Ingrese la cantidad de proyectos realizados: ");
                                                    realizados = leer.nextInt();
                                                } catch (Exception e) {
                                                    System.out.println("Debe ingresar un numero entero");
                                                    break;
                                                }
                                                try {
                                                    System.out.print("Ingrese los años de contrato: ");
                                                    contrato = leer.nextInt();
                                                } catch (Exception e) {
                                                    System.out.println("Debe ingresar un numero entero");
                                                    break;
                                                }
                                                int sueldo = 0;
                                                System.out.print("Ingrese el principal campo de experiencia: ");
                                                String campo = leer.next();

                                                System.out.print("Ingrese el tiempo de duracion de la consultoria: ");
                                                int consultoria = leer.nextInt();

                                                empleados.add(new Consultores(campo, sueldo, realizados, nombre, apellido, id, nacionalidad, contrato, user, clave));

                                                break;
                                            }
                                            default: {
                                                System.out.println("Opcion invalida");
                                                break;
                                            }
                                        }
                                        break;
                                    }
                                    case 2: {
                                        int opt = 0;
                                        try {
                                            System.out.print("1. Modificar Consultores\n"
                                                    + "2. Modificar Desarrolladores\n"
                                                    + "Ingresar opcion: ");
                                            opt = leer.nextInt();
                                        } catch (Exception e) {
                                            System.out.println("Error, debe ingresar un numero entero");
                                        }

                                        switch (opt) {
                                            case 1: {
                                                int opti = 0;
                                                try {
                                                    System.out.println("Ingrese lo que desea modificar:\n"
                                                            + "1. Nombre\n"
                                                            + "2. Apellido\n"
                                                            + "3. Id\n"
                                                            + "4. Nacionalidad\n"
                                                            + "5. Años de contrato\n"
                                                            + "6. Campo de experiencia\n"
                                                            + "7. Tiempo de consultoria\n"
                                                            + "Ingrese su opcion: ");
                                                    opti = leer.nextInt();
                                                } catch (Exception e) {
                                                    System.out.println("No se pueden ingresar caracteres o letras");
                                                    break;
                                                }

                                                switch (opti) {
                                                    case 1: {
                                                        System.out.print("Ingrese el nuevo nombre: ");
                                                        String aux = leer.next();

                                                        ((Consultores) empleados.get(i)).setNombre(aux);
                                                        break;
                                                    }
                                                    case 2: {
                                                        System.out.print("Ingrese el nuevo apellido: ");
                                                        String aux = leer.next();

                                                        ((Consultores) empleados.get(i)).setApellido(aux);
                                                        break;
                                                    }
                                                    case 3: {
                                                        System.out.print("Ingrese el nuevo ID: ");
                                                        String aux = leer.next();

                                                        ((Consultores) empleados.get(i)).setId(aux);
                                                        break;
                                                    }
                                                    case 4: {
                                                        System.out.print("Ingrese la nueva nacionalidad: ");
                                                        String aux = leer.next();

                                                        ((Consultores) empleados.get(i)).setNacionalidad(aux);
                                                        break;
                                                    }
                                                    case 5: {
                                                        System.out.print("Ingrese el año de contrato: ");
                                                        int aux = leer.nextInt();

                                                        ((Consultores) empleados.get(i)).setContrato(aux);
                                                        break;
                                                    }
                                                    case 6: {
                                                        System.out.print("Ingrese el nuevo campo de experiencia: ");
                                                        String aux = leer.next();

                                                        ((Consultores) empleados.get(i)).setCampo(aux);
                                                        break;
                                                    }
                                                    case 7: {
                                                        System.out.print("Ingrese el nuevo tiempo de consultoria: ");
                                                        int aux = leer.nextInt();

                                                        ((Consultores) empleados.get(i)).setTiempo(aux);
                                                        break;
                                                    }
                                                    default: {
                                                        System.out.println("Opcion Invalida");
                                                        break;
                                                    }
                                                }
                                                break;
                                            }
                                            case 2: {
                                                int opti = 0;
                                                try {
                                                    System.out.println("Ingrese lo que desea modificar:\n"
                                                            + "1. Nombre\n"
                                                            + "2. Apellido\n"
                                                            + "3. Id\n"
                                                            + "4. Nacionalidad\n"
                                                            + "5. Años de contrato\n"
                                                            + "6. Años de experiencia\n"
                                                            + "7. Proyectos realizados\n"
                                                            + "8. Lenguaje de programacion preferido\n"
                                                            + "9. Horas de trabajo diarias\n"
                                                            + "Ingrese su opcion: ");
                                                    opti = leer.nextInt();
                                                } catch (Exception e) {
                                                    System.out.println("No se pueden ingresar caracteres o letras");
                                                    break;
                                                }

                                                switch (opti) {
                                                    case 1: {
                                                        System.out.print("Ingrese el nuevo nombre: ");
                                                        String aux = leer.next();

                                                        ((Desarrolladores) empleados.get(i)).setNombre(aux);
                                                        break;
                                                    }
                                                    case 2: {
                                                        System.out.print("Ingrese el nuevo apellido: ");
                                                        String aux = leer.next();

                                                        ((Desarrolladores) empleados.get(i)).setApellido(aux);
                                                        break;
                                                    }
                                                    case 3: {
                                                        System.out.print("Ingrese el nuevo ID: ");
                                                        String aux = leer.next();

                                                        ((Desarrolladores) empleados.get(i)).setId(aux);
                                                        break;
                                                    }
                                                    case 4: {
                                                        System.out.print("Ingrese la nueva nacionalidad: ");
                                                        String aux = leer.next();

                                                        ((Desarrolladores) empleados.get(i)).setNacionalidad(aux);
                                                        break;
                                                    }
                                                    case 5: {
                                                        System.out.print("Ingrese el año de contrato: ");
                                                        int aux = leer.nextInt();

                                                        ((Desarrolladores) empleados.get(i)).setContrato(aux);
                                                        break;
                                                    }
                                                    case 6: {
                                                        System.out.print("Ingrese los años de experiencia: ");
                                                        int aux = leer.nextInt();

                                                        ((Desarrolladores) empleados.get(i)).setExp(aux);
                                                        break;
                                                    }
                                                    case 7: {
                                                        System.out.print("Ingrese los proyectos realizados: ");
                                                        int aux = leer.nextInt();

                                                        ((Desarrolladores) empleados.get(i)).setProjects(aux);
                                                        break;
                                                    }
                                                    case 8: {
                                                        System.out.print("Ingrese el lenguaje de programacion preferido: ");
                                                        String aux = leer.next();

                                                        ((Desarrolladores) empleados.get(i)).setLenguaje(aux);
                                                        break;
                                                    }
                                                    case 9: {
                                                        System.out.print("Ingrese las horas de trabajo diario: ");
                                                        int aux = leer.nextInt();

                                                        ((Desarrolladores) empleados.get(i)).setHoras(aux);
                                                        break;
                                                    }
                                                    default: {
                                                        System.out.println("Opcion Invalida");
                                                        break;
                                                    }
                                                }
                                                break;
                                            }
                                            default: {

                                                break;
                                            }
                                        }
                                        break;
                                    }
                                    case 3: {
                                        System.out.println("\nDesarrolladores");
                                        for (int j = 0; j < empleados.size(); j++) {
                                            if (empleados.get(j) instanceof Desarrolladores) {
                                                System.out.println(i + " - " + empleados.get(i));
                                            }
                                        }
                                        System.out.println("\nConsultores");
                                        for (int j = 0; j < empleados.size(); j++) {
                                            if (empleados.get(j) instanceof Consultores) {
                                                System.out.println(i + " - " + empleados.get(i));
                                            }
                                        }
                                        System.out.println("\nProyectos");
                                        for (int j = 0; j < proyectos.size(); j++) {
                                            if (empleados.get(j) instanceof Proyectos) {
                                                System.out.println(i + " - " + proyectos.get(i));
                                            }
                                        }
                                        break;
                                    }
                                    case 4: {
                                        System.out.println("\nEliminar");
                                        System.out.print("Ingrese el nombre del consultor o desarrollador desea eliminar: ");
                                        String eliminar = leer.next();

                                        for (int j = 0; j < empleados.size(); j++) {
                                            if (((Desarrolladores) empleados.get(j)).getNombre().equals(eliminar) || ((Consultores) empleados.get(j)).getNombre().equals(eliminar)) {
                                                empleados.remove(i);
                                            }
                                        }
                                        break;
                                    }
                                    case 5: {
                                        System.out.print("Ingrese la posicion del proyecto a terminar: ");
                                        int pos = leer.nextInt();

                                        ((Proyectos) proyectos.get(pos)).setEstado("Terminado");
                                        break;
                                    }
                                    default: {
                                        System.out.println("Invalido");
                                        break;
                                    }
                                }
                            } else if (((Consultores) empleados.get(i)).getUser().equals(usuario) && ((Consultores) empleados.get(i)).getClave().equals(contraseña)) {
                                System.out.print("\nCONSULTORES\n"
                                        + "1. Ver informacion\n"
                                        + "2. Modificar informacion\n"
                                        + "3. Eliminar cuenta\n"
                                        + "4. Ver proyectos\n"
                                        + "Ingrese eleccion: ");
                                int option = leer.nextInt();

                                switch (option) {
                                    case 1: {
                                        System.out.println(empleados.get(i));
                                        break;
                                    }
                                    case 2: {
                                        int opt = 0;
                                        try {
                                            System.out.println("Ingrese lo que desea modificar:\n"
                                                    + "1. Nombre\n"
                                                    + "2. Apellido\n"
                                                    + "3. Id\n"
                                                    + "4. Nacionalidad\n"
                                                    + "5. Años de contrato\n"
                                                    + "6. Campo de experiencia\n"
                                                    + "7. Tiempo de consultoria\n"
                                                    + "Ingrese su opcion: ");
                                            opt = leer.nextInt();
                                        } catch (Exception e) {
                                            System.out.println("No se pueden ingresar caracteres o letras");
                                            break;
                                        }

                                        switch (opt) {
                                            case 1: {
                                                System.out.print("Ingrese el nuevo nombre: ");
                                                String aux = leer.next();

                                                ((Consultores) empleados.get(i)).setNombre(aux);
                                                break;
                                            }
                                            case 2: {
                                                System.out.print("Ingrese el nuevo apellido: ");
                                                String aux = leer.next();

                                                ((Consultores) empleados.get(i)).setApellido(aux);
                                                break;
                                            }
                                            case 3: {
                                                System.out.print("Ingrese el nuevo ID: ");
                                                String aux = leer.next();

                                                ((Consultores) empleados.get(i)).setId(aux);
                                                break;
                                            }
                                            case 4: {
                                                System.out.print("Ingrese la nueva nacionalidad: ");
                                                String aux = leer.next();

                                                ((Consultores) empleados.get(i)).setNacionalidad(aux);
                                                break;
                                            }
                                            case 5: {
                                                System.out.print("Ingrese el año de contrato: ");
                                                int aux = leer.nextInt();

                                                ((Consultores) empleados.get(i)).setContrato(aux);
                                                break;
                                            }
                                            case 6: {
                                                System.out.print("Ingrese el nuevo campo de experiencia: ");
                                                String aux = leer.next();

                                                ((Consultores) empleados.get(i)).setCampo(aux);
                                                break;
                                            }
                                            case 7: {
                                                System.out.print("Ingrese el nuevo tiempo de consultoria: ");
                                                int aux = leer.nextInt();

                                                ((Consultores) empleados.get(i)).setTiempo(aux);
                                                break;
                                            }
                                            default: {
                                                System.out.println("Opcion Invalida");
                                                break;
                                            }
                                        }
                                        break;
                                    }
                                    case 3: {
                                        System.out.println(empleados.get(i) + "\nSe eliminara esta cuenta");
                                        empleados.remove(i);
                                        System.out.println("Su cuenta fue eliminada exitosamente");
                                        break;
                                    }
                                    case 4: {
                                        System.out.println("\nListado de Proyectos");
                                        for (int j = 0; j < proyectos.size(); j++) {

                                            System.out.println(((Proyectos) proyectos.get(i)));
                                        }
                                        break;
                                    }
                                    default: {
                                        System.out.println("Invalido");
                                        break;
                                    }
                                }

                            } else if (((Desarrolladores) empleados.get(i)).getUser().equals(usuario) && ((Desarrolladores) empleados.get(i)).getClave().equals(contraseña)) {
                                System.out.print("\nDESARROLLADORES\n"
                                        + "1. Ver Informacion\n"
                                        + "2. Eliminar cuenta\n"
                                        + "Ingrese su opcion:");
                                int opt = leer.nextInt();
                                switch (opt) {
                                    case 1: {
                                        System.out.println(empleados.get(i));
                                        break;
                                    }
                                    case 2: {
                                        System.out.println(empleados.get(i) + "\nSe eliminara esta cuenta");
                                        empleados.remove(i);
                                        System.out.println("Su cuenta fue eliminada exitosamente");
                                        break;
                                    }
                                    default: {
                                        System.out.println("Invalido");
                                        break;
                                    }
                                }
                            }

                        }
                    }

                    break;
                }

                case 3: {
                    res = true;
                    System.out.println("Usted ha salido del sistema");
                    break;
                }
                default: {
                    System.out.println("Opcion invalida");
                }
            }
        }
    }

}
