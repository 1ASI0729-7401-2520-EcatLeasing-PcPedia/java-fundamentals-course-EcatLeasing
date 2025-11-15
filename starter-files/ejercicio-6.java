/*
Crear una función saludar(String nombre).
*/

public class Main {

    public static void main(String[] args) {
        saludar("Carlos");

        int resultado = sumar(10, 4);
        System.out.println("Resultado de la suma: " + resultado);
    }
  
    public static int sumar(int a, int b) {
        return a + b;
    }
}
