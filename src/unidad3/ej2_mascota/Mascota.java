/* TP 3 - Programacion Orientada a Objetos
Ejercicio 2 - Registro de Mascota
Alumno Matias Scalella
*/
package unidad3.ej2_mascota;

public class Mascota {
    
    // === Definicion de Atributos ===
    private String nombre;
    private String especie;
    private int edad;
    
    // === Setters de Mascota ===
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setEspecie(String especie) {
        this.especie = especie;
    }
    
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    // === Metodos de la clase Mascota ===
    public void mostrarInfo(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Especie: " + especie);
        System.out.println("Edad: " + edad);
    }
    
    public void cumplirAnios() {
        this.edad += 1;
    }
    
}
