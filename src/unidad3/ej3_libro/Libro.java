/* TP 3 - Programacion Orientada a Objetos
Ejercicio 3 - Clase Libro
Alumno Matias Scalella
*/
package unidad3.ej3_libro;

public class Libro {
    
    // Definicion de los atributos de la clase Libro
    private String titulo;
    private String autor;
    private int anioPublicacion;
    
    // Creacion de setters para los valores
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public void setAnioPublicacion(int anioPublicacion) {
        // Validacion del año de Publicacion
        if ((anioPublicacion > 0) && (anioPublicacion < 2025)) {
            this.anioPublicacion = anioPublicacion;
        } else {
            System.out.println("El año ingresado no es valido.");
        }
    }
    
    // Getters para todos los atributos
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }
    
}
