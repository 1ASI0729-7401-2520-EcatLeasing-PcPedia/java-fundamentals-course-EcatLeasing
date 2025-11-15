/*
Modificar el código para agregar un cuarto estudiante o cambiar sus datos.
*/

class Estudiante {
    private String nombre;
    private int edad;

    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() { return nombre; }
    public int getEdad() { return edad; }
}

public class Main {
    public static void main(String[] args) {

        lista[0] = new Estudiante("Ana", 14);
        lista[1] = new Estudiante("Luis", 15);
        lista[2] = new Estudiante("Carla", 16);

        System.out.println("=== Lista de Estudiantes ===");

        for (int i = 0; i < lista.length; i++) {
            System.out.println((i + 1) + ". " 
                + lista[i].getNombre() 
                + " - " + lista[i].getEdad() + " años");
        }
    }
}
