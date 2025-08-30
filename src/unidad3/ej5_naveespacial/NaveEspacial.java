/* TP 3 - Programacion Orientada a Objetos
Ejercicio 5 - Nave Espacial
Alumno Matias Scalella
*/
package unidad3.ej5_naveespacial;

public class NaveEspacial {
    private String nombre;
    private int combustible;
    private final int CAPACIDAD_MAXIMA = 50;
    private int consumo = 10;
    private boolean enVuelo = false;
    
    // Constructor
    public NaveEspacial(String nombre, int combustible) {
        this.nombre = nombre;
        this.combustible = combustible;
    }
    // Metodos
    public void despegar(){
        if (enVuelo) {
            System.out.println("Despegue invalido, la nave "+ nombre +" ya esta en el aire.");
            return;
        }
        else if (combustible < consumo) {
            System.out.println("La nave "+ nombre +" no puede despegar, recarga combustible.");
        }
        else {
            combustible -= consumo;
            enVuelo = true;
            System.out.println("La nave " + nombre + " despegó!");
            System.out.println(" ^");
            System.out.println(" ^");
            System.out.println(" |");
            System.out.println("/ \\");
        }
        
    }
    public void avanzar(int distancia) {
        if (!enVuelo) {
            System.out.println("La nave se encuentra en tierra, despegue antes de intentar avanzar.");
            return;
        }
        if (distancia <= 0) {
            System.out.println("La distancia debe ser mayor a cero.");
            return;
        }
        if (combustible < distancia) {
            System.out.println("No hay suficiente combustible para avanzar, recargue.");
            return;
        }
        combustible -= distancia;
        System.out.println("La nave avanzo: " + distancia + " unidades.");
        System.out.println("--> > > > ");
        System.out.println("Combustible restante: " + combustible);
    }
    public void recargarCombustible(int cantidad){
        if (cantidad <= 0) {
            System.out.println("Ingreso una cantidad de combustible invalida. Intenta nuevamente.");
            return;
        } 
        if (cantidad + combustible > CAPACIDAD_MAXIMA) {
            System.out.println("Capacidad maxima del tanque excedida, no puede recargar esa cantidad.");
            System.out.println("Cantidad de combustible en tanque = " + combustible + "lts.");
            return;
        } else {
            combustible += cantidad;
            System.out.println( cantidad + "lts recargados exitosamente.");
        }
    }
    public void mostrarEstado(){
        System.out.println("=== Estado de la nave " + nombre + " ===");
        System.out.println("Cantidad de combustible: " + combustible + "lts");
        if (enVuelo) {
            System.out.println("La nave se encuentra volando.");
        } else {
            System.out.println("La nave esta en tierra.");
        }
    }    
}
