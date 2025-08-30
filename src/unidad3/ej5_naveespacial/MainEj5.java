/* TP 3 - Programacion Orientada a Objetos
Ejercicio 5 - Nave Espacial
Alumno Matias Scalella
*/
package unidad3.ej5_naveespacial;

public class MainEj5 {
    public static void main(String[] args) {
        // Creacion de la nave con 50 unidades
        NaveEspacial nautilus = new NaveEspacial("Nautilus", 50);
        System.out.println("=== Intento de avance ===");
        // Intento de avance
        nautilus.avanzar(10);
        System.out.println("=== Despegue de la nave ===");
        // Despegue de la nave.
        nautilus.despegar();
        System.out.println("");
        System.out.println("=== Avance de la nave ===");
        // Avance de la nave
        nautilus.avanzar(10);
        nautilus.avanzar(10);
        nautilus.avanzar(10);
        nautilus.avanzar(10);
        System.out.println("");
        System.out.println("=== Avance de la nave con combustible agotado ===");
        // Avance de la nave con combustible agotado
        nautilus.avanzar(10);
        System.out.println("");
        System.out.println("=== Recarga de combustible ===");
        // Recarga de combustible
        nautilus.recargarCombustible(50);
        System.out.println("");
        // Estado de la nave
        nautilus.mostrarEstado();
        
    }
}
