/*
Crear un bucle que imprima su nombre 5 veces.
*/

public class Main {
    public static void main(String[] args) {

        System.out.println("Bucle FOR del 1 al 10:");
        for (int i = 1; i <= 10; i++) {
            System.out.println("Número: " + i);
        }

        System.out.println("\nBucle WHILE (5 saludos):");
        int contador = 1;

        while (contador <= 5) {
            System.out.println("Hola número " + contador);
            contador++;
        }
    }
}
