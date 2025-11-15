/*
Cambiar los valores y observar el resultado.
*/

public class Main {
    public static void main(String[] args) {

        int promedio = 14;

        if (promedio >= 11) {
            System.out.println("¡Aprobado! 🎉");
        } else {
            System.out.println("Desaprobado 😢");
        }

        // Segundo ejemplo:
        int edad = 16;

        if (edad < 12) {
            System.out.println("Eres un niño.");
        } else if (edad < 18) {
            System.out.println("Eres un adolescente.");
        } else {
            System.out.println("Eres un adulto.");
        }
    }
}
