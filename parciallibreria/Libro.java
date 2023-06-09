package co.edu.upb.parciallibreria;
import java.util.ArrayList;

public class Libro {
    private String titulo;
    private String autor;
    private String categoria;
    private boolean disponible;

    // Constructor
    public Libro(String titulo, String autor, String categoria) {
        this.titulo = titulo;
        this.autor = autor;
        this.categoria = categoria;
        this.disponible = true; // Por defecto, el libro está disponible
    }

    // Getters y Setters

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getCategoria() {
        return categoria;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
}

public class Libreria {
    private List<Libro> libros;

    public Libreria() {
        libros = new ArrayList<>();
    }

    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    public List<Libro> buscarLibros(String titulo) {
        List<Libro> resultados = new ArrayList<>();
        for (Libro libro : libros) {
            if (libro.getTitulo().toLowerCase().contains(titulo.toLowerCase())) {
                resultados.add(libro);
            }
        }
        return resultados;
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
