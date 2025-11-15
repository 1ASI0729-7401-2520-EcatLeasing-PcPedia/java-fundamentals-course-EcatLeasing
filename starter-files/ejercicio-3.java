/*
Cambiar las notas y ver cómo varía el promedio.
*/

public class Main {
    public static void main(String[] args) {

        int nota1 = 15;
        int nota2 = 12;
        int nota3 = 18;

        double promedio = (nota1 + nota2 + nota3) / 3.0;

        System.out.println("Promedio final: " + promedio);

        boolean aprobado = promedio >= 11;

        System.out.println("¿Aprobado?: " + aprobado);
    }
}
