/*
Cambiar los datos de los estudiantes.
*/

class Estudiante {
    String nombre;
    int edad;
}

public class Main {
    public static void main(String[] args) {

        Estudiante e1 = new Estudiante();
        e1.nombre = "Ana";
        e1.edad = 14;

        Estudiante e2 = new Estudiante();
        e2.nombre = "Luis";
        e2.edad = 16;

        System.out.println(e1.nombre + " tiene " + e1.edad + " años.");
        System.out.println(e2.nombre + " tiene " + e2.edad + " años.");
    }
}
