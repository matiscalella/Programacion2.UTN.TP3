/* TP 3 - Programacion Orientada a Objetos
Ejercicio 3 - Clase Libro
Alumno Matias Scalella
*/
package unidad3.ej3_libro;

public class MainEj3 {
    public static void main(String[] args) {
        
        Libro libro = new Libro();
        libro.setTitulo("Don Segundo Sombra");
        libro.setAutor("Ricardo Guiraldes");
        // Se ingresa un valor invalido para el anio de publicacion
        libro.setAnioPublicacion(2029);
        // Impresion de los datos del libro
        System.out.println("=== Datos del Libro creado ===");
        System.out.println("Titulo: " + libro.getTitulo());
        System.out.println("Autor: " + libro.getAutor());
        System.out.println("Año de Publicacion con valor erroneo: " + libro.getAnioPublicacion());
        // Se ingresa un valor valido para el año de publicacion
        libro.setAnioPublicacion(1926);
        System.out.println("Año de Publicacion con valor valido: " + libro.getAnioPublicacion());    
        
    }
}
