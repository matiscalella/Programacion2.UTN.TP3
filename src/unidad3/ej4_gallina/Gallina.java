/* TP 3 - Programacion Orientada a Objetos
Ejercicio 4 - Gallinas en Granja Digital
Alumno Matias Scalella
*/
package unidad3.ej4_gallina;

public class Gallina {
    private int idGallina;
    private int edad;
    private int huevosPuestos;
    
    // Constructor de gallinas
    public Gallina(int idGallina, int edad, int huevosPuestos) {
        this.idGallina = idGallina;
        this.edad = edad;
        this.huevosPuestos = huevosPuestos;
    }
    
    // Getters para los atributos
    public int getIdGallina() { return idGallina; }
    public int getEdad() { return edad; }
    public int getHuevosPuestos() { return huevosPuestos; }
    
    // Metodos de la clase Gallina
    public void ponerHuevo() {
        huevosPuestos ++;
    }
    
    public void envejecer(){
        edad ++;
    }
    
    public void mostrarEstado() {
        System.out.println("=== Datos de la gallina nro: " + idGallina + " === ");
        System.out.println("ID de Gallina: " + idGallina);
        System.out.println("Edad: " + edad + " años.");
        System.out.println("Huevos puestos: " + huevosPuestos);
    }     
}
