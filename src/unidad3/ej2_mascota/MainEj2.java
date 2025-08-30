/* TP 3 - Programacion Orientada a Objetos
Ejercicio 2 - Registro de Mascota
Alumno Matias Scalella
*/
package unidad3.ej2_mascota;

public class MainEj2 {
    public static void main(String[] args) {
        
        Mascota dakota = new Mascota();
        
        dakota.setNombre("Dakota");
        dakota.setEspecie("Perro");
        dakota.setEdad(7);
        
        System.out.println("=== Datos de la mascota creada ===");
        dakota.mostrarInfo();
        dakota.cumplirAnios();
        dakota.cumplirAnios();
        dakota.cumplirAnios();
        dakota.cumplirAnios();
        dakota.cumplirAnios();
        System.out.println("=== 5 años despues, la informacion de Dakota ===");
        dakota.mostrarInfo();
        
    }
}
