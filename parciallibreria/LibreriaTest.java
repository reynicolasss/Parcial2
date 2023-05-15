package co.edu.upb.parciallibreria;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class LibreriaTest {
    private Libreria libreria;

    @BeforeEach
    public void setUp() {
        libreria = new Libreria();
        // Agregar libros de ejemplo para las pruebas
        libreria.agregarLibro(new Libro("Harry Potter y la piedra filosofal", "J.K. Rowling", "Fantasía"));
        libreria.agregarLibro(new Libro("El código Da Vinci", "Dan Brown", "Misterio"));
        libreria.agregarLibro(new Libro("Cien años de soledad", "Gabriel García Márquez", "Realismo mágico"));
    }

    @Test
    public void buscarLibros_DebeRetornarLibrosCorrectos() {
        List<Libro> resultados = libreria.buscarLibros("Harry Potter");
        assertEquals(1, resultados.size());
        assertEquals("Harry Potter y la piedra filosofal", resultados.get(0).getTitulo());
    }

    @Test
    public void reservarLibro_LibroDisponible_DebeCambiarDisponibilidad() {
        Libro libro = new Libro("El código Da Vinci", "Dan Brown", "Misterio");
        assertTrue(libro.isDisponible());
        libreria.reservarLibro(libro);
        assertFalse(libro.isDisponible());
    }

    @Test
    public void reservarLibro_LibroNoDisponible_NoDebeCambiarDisponibilidad() {
        Libro libro = new Libro("Cien años de soledad", "Gabriel García Márquez", "Realismo mágico");
        libro.setDisponible(false);
        assertFalse(libro.isDisponible());
        libreria.reservarLibro(libro);
        assertFalse(libro.isDisponible());
    }

    @Test
    public void comprarLibro_LibroDisponible_DebeCambiarDisponibilidad() {
        Libro libro = new Libro("Cien años de soledad", "Gabriel García Márquez", "Realismo mágico");
        assertTrue(libro.isDisponible());
        libreria.comprarLibro(libro);
        assertFalse(libro.isDisponible());
    }

    @Test
    public void comprarLibro_LibroNoDisponible_NoDebeCambiarDisponibilidad() {
        Libro libro = new Libro("El código Da Vinci", "Dan Brown", "Misterio");
        libro.setDisponible(false);
        assertFalse(libro.isDisponible());
        libreria.comprarLibro(libro);
        assertFalse(libro.isDisponible());
    }

    @Test
    public void devolverLibro_LibroNoDisponible_DebeCambiarDisponibilidad() {
        Libro libro = new Libro("Cien años de soledad", "Gabriel García Márquez", "Realismo mágico");
        libro.setDisponible(false);
        assertFalse(libro.isDisponible());
        libreria.devolverLibro(libro);
        assertTrue(libro.isDisponible());
    }

    @Test
    public void devolverLibro_LibroDisponible_NoDebeCambiarDisponibilidad() {
       