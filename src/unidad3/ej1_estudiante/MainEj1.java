/* TP 3 - Programacion Orientada a Objetos
Ejercicio 1
Alumno Matias Scalella
*/
package unidad3.ej1_estudiante;

public class MainEj1 {
    public static void main(String[] args) {
        
        
        Estudiante estudiante1 = new Estudiante();
        /*
        
        Si utilizo un constructor debo pasar lo valores como parametros:
        
        Estudiante estudiante1 = new Estudiante("Matias", "Scalella", "Programacion 2", 10);
        
        */
        System.out.println("=== Establecimiento de valores (setters) ===");
        estudiante1.setNombre("Matias");
        estudiante1.setApellido("Scalella");
        estudiante1.setCurso("Programacion 2");
        estudiante1.subirCalificacion(10);
        estudiante1.bajarCalificacion(5);
        estudiante1.mostrarInfo();
        estudiante1.subirCalificacion(11);
        estudiante1.mostrarInfo();

    }
}