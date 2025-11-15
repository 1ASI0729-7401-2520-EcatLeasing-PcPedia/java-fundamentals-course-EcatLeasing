/*
Crear un estudiante con su propio nombre.
*/

class Estudiante {
    private String nombre;
    private int edad;

    // Constructor
    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    // Setter
    public void setNombre(String nuevoNombre) {
        this.nombre = nuevoNombre;
    }
}

public class Main {
    public static void main(String[] args) {

        Estudiante e1 = new Estudiante("Ana", 14);

        System.out.println("Nombre: " + e1.getNombre());
        System.out.println("Edad: " + e1.getEdad());

        e1.setNombre("Ana María");
        System.out.println("Nuevo nombre: " + e1.getNombre());
    }
}
