/*

Programación Orientada a Objetos (POO) en Java desde cero

Lección 9: Encapsulación: getters, setters y constructores

*/


public class Persona {
  String nombre;
  
  public Persona() {
      nombre = "Matias";
  }

  public static void main(String[] args) {
    Persona persona1 = new Persona();
    Persona persona2 = new Persona();
    
    persona1.setNombre("Juan");
    persona2.setNombre("Rodrigo");
    
    System.out.println("Mi nombre es: " + persona1.getNombre());
    System.out.println("Mi nombre es: " + persona2.getNombre());
  }
  
  public void setNombre(String _nombre){
      this.nombre = _nombre;
  }
  
  public String getNombre(){
      return this.nombre;
  }
}
