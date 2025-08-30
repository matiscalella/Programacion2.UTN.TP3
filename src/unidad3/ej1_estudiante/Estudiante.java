/* TP 3 - Programacion Orientada a Objetos
Ejercicio 1
Alumno Matias Scalella
*/
package unidad3.ej1_estudiante;


public class Estudiante {
    // Definicion de atributos
    private String nombre;
    private String apellido;
    private String curso;
    private double calificacion;
    
    // Setters para los atributos privados
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    /* Alternativa utilizando un constructor:
    
    public Estudiante(String nombre, String apellido, String curso, double calificacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.curso = curso;
        this.calificacion = calificacion;
    }
    */
    
    
    // Metodos
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Curso: " + curso);
        System.out.println("Calificacion: " + calificacion  );
    }
    
    public void subirCalificacion(double puntos) {
        calificacion += puntos;
        if (calificacion > 10) {
            calificacion = 10;                
            }
    }
    
    public void bajarCalificacion(double puntos) {
        calificacion -= puntos;
        if (calificacion < 0) {
            calificacion = 0;            
        }
    }       
    
}
