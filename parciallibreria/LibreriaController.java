package co.edu.upb.parciallibreria;
import java.util.ArrayList;
import java.util.List;

public class LibreriaController {
    private Libreria libreria;

    public LibreriaController() {
        libreria = new Libreria();
    }

    public void agregarLibro(Libro libro) {
        libreria.agregarLibro(libro);
    }

    public List<Libro> buscarLibros(String titulo) {
        return libreria.buscarLibros(titulo);
    }

    public Libro buscarLibroPorTitulo(String titulo) {
        List<Libro> resultados = libreria.buscarLibros(titulo);
        if (!resultados.isEmpty()) {
            return resultados.get(0);
        }
        return null;
    }

    public List<Libro> obtenerTodosLosLibros() {
        return libreria.getLibros();
    }

    public void reservarLibro(Libro libro) {
        if (libro.isDisponible()) {
            libro.setDisponible(false);
            System.out.println("Libro reservado: " + libro.getTitulo());
        } else {
            System.out.println("El libro no está disponible para reservar.");
        }
    }

    public void comprarLibro(Libro libro) {
        if (libro.isDisponible()) {
            libro.setDisponible(false);
            System.out.println("Libro comprado: " + libro.getTitulo());
        } else {
            System.out.println("El libro no está disponible para comprar.");
        }
    }

    public void devolverLibro(Libro libro) {
        if (!libro.isDisponible()) {
            libro.setDisponible(true);
            System.out.println("Libro devuelto: " + libro.getTitulo());
        } else {
            System.out.println("El libro ya está disponible.");
        }
    }
}