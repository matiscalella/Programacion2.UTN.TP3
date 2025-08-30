# TP3 – Programación II (UTN)  
**Unidad 3 – Programación Orientada a Objetos en Java**

Alumno: **Matías Scalella**

---

## 📂 Estructura del proyecto

El proyecto contiene los ejercicios 1 a 5 del **Trabajo Práctico Nº3** de la materia **Programación II**.  
Cada ejercicio está organizado en su propio paquete dentro de `src/unidad3/`:

- `ej1_estudiante/` → Clase **Estudiante** y `MainEj1`
- `ej2_mascota/` → Clase **Mascota** y `MainEj2`
- `ej3_libro/` → Clase **Libro** y `MainEj3`
- `ej4_gallina/` → Clase **Gallina** y `MainEj4`
- `ej5_naveespacial/` → Clase **NaveEspacial** y `MainEj5`

---

## ▶️ Ejecución

En NetBeans o cualquier IDE con soporte Java:

1. Abrir el proyecto `Programacion2.UTN.TP3`.
2. Ir al paquete correspondiente (`src/unidad3/ejX_...`).
3. Ejecutar la clase `MainEjX.java`.

Ejemplos:
- Para correr el **Ejercicio 1**: ejecutar `MainEj1`.
- Para correr el **Ejercicio 5**: ejecutar `MainEj5`.

---

## 📌 Contenido de cada ejercicio

1. **Estudiante**  
   - Atributos: `nombre`, `apellido`, `curso`, `calificacion`.  
   - Métodos: `mostrarInfo()`, `subirCalificacion(puntos)`, `bajarCalificacion(puntos)`.  

2. **Mascota**  
   - Atributos: `nombre`, `especie`, `edad`.  
   - Métodos: `mostrarInfo()`, `cumplirAnios()`.  

3. **Libro**  
   - Atributos: `titulo`, `autor`, `anioPublicacion` (privados).  
   - Métodos: getters para todos, setter con validación para el año, `mostrarInfo()`.  

4. **Gallina**  
   - Atributos: `idGallina`, `edad`, `huevosPuestos`.  
   - Métodos: `ponerHuevo()`, `envejecer()`, `mostrarEstado()`.  

5. **NaveEspacial**  
   - Atributos: `nombre`, `combustible`, `CAPACIDAD_MAXIMA`, `consumo`, `enVuelo`.  
   - Métodos: `despegar()`, `avanzar(distancia)`, `recargarCombustible(cantidad)`, `mostrarEstado()`.  

---

## ⚙️ Requisitos

- **Java 17** o superior (compatible con NetBeans 12+).  
- Proyecto configurado en **NetBeans**, con `.gitignore` para excluir archivos temporales (`build/`, `dist/`, `*.class`, etc.).

---

## 📚 Notas

- El TP sigue los conceptos de **POO** vistos en la materia: clases, objetos, encapsulamiento, getters/setters, validaciones.  
- Se añadieron mensajes en consola y algunos dibujos ASCII para representar las acciones (ej. avance de la nave, despegue).  
- Para máxima compatibilidad, se usaron caracteres ASCII simples en los dibujos (evitando emojis que pueden no mostrarse en todas las consolas).

---
