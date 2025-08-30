/* TP 3 - Programacion Orientada a Objetos
Ejercicio 4 - Gallinas en Granja Digital
Alumno Matias Scalella
*/
package unidad3.ej4_gallina;

public class MainEj4 {
    public static void main(String[] args) {
        Gallina gallina1 = new Gallina (1, 2, 448);
        Gallina gallina2 = new Gallina (2, 4, 700);
        System.out.println(" === Estado Inicial de las gallinas ===");
        gallina1.mostrarEstado();
        System.out.println("");
        gallina2.mostrarEstado();
        
        System.out.println(" === Inicio de ciclo ===");
        gallina1.envejecer();
        System.out.println("La gallina nro: " + gallina1.getIdGallina() + " envejecio un año.");
        gallina1.ponerHuevo();
        System.out.println("La gallina nro: " + gallina1.getIdGallina() + " ha puesto 1 huevo.");
        gallina1.ponerHuevo();
        System.out.println("La gallina nro: " + gallina1.getIdGallina() + " ha puesto 1 huevo.");
        gallina1.ponerHuevo();
        System.out.println("La gallina nro: " + gallina1.getIdGallina() + " ha puesto 1 huevo.");
        gallina1.envejecer();
        System.out.println("La gallina nro: " + gallina1.getIdGallina() + " envejecio un año.");
        gallina2.ponerHuevo();
        System.out.println("La gallina nro: " + gallina2.getIdGallina() + " ha puesto 1 huevo.");
        gallina2.ponerHuevo();
        System.out.println("La gallina nro: " + gallina2.getIdGallina() + " ha puesto 1 huevo.");
        gallina2.ponerHuevo();
        System.out.println("La gallina nro: " + gallina2.getIdGallina() + " ha puesto 1 huevo.");
        gallina2.envejecer();
        System.out.println("La gallina nro: " + gallina2.getIdGallina() + " envejecio un año.");
        gallina2.envejecer();
        System.out.println("La gallina nro: " + gallina2.getIdGallina() + " envejecio un año.");
        gallina2.envejecer();
        System.out.println("La gallina nro: " + gallina2.getIdGallina() + " envejecio un año.");
       
        System.out.println("");
        System.out.println(" === Estado actual de las gallinas ===");
        gallina1.mostrarEstado();
        System.out.println("");
        gallina2.mostrarEstado();
        
    }
    
}
