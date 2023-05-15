package co.edu.upb.parciallibreria;
import java.util.List;
import java.util.Scanner;

public class LibreriaView {
    private Scanner scanner;

    public LibreriaView() {
        scanner = new Scanner(System.in);
    }

    public String obtenerEntradaUsuario() {
        return scanner.nextLine();
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public void mostrarLibros(List<Libro> libros) {
        System.out.println("Libros encontrados:");
        for (Libro libro : libros) {
            System.out.println("Título: " + libro.getTitulo());
            System.out.println("Autor: " + libro.getAutor());
            System.out.println("Categoría: " + libro.getCategoria());
            System.out.println("Disponible: " + (libro.isDisponible() ? "Sí" : "No"));
            System.out.println("-----------------------");
        }
    }
}