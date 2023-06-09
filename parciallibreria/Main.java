import java.util.List;
import java.util.Scanner;

public class Main {
    private static LibreriaController libreriaController;
    private static LibreriaView libreriaView;

    public static void main(String[] args) {
        libreriaController = new LibreriaController();
        libreriaView = new LibreriaView();

        // Agregar libros de ejemplo
        libreriaController.agregarLibro(new Libro("Harry Potter y la piedra filosofal", "J.K. Rowling", "Fantasía"));
        libreriaController.agregarLibro(new Libro("El código Da Vinci", "Dan Brown", "Misterio"));
        libreriaController.agregarLibro(new Libro("Cien años de soledad", "Gabriel García Márquez", "Realismo mágico"));

        mostrarMenuPrincipal();
    }

    private static void mostrarMenuPrincipal() {
        int opcion = 0;
        Scanner scanner = new Scanner(System.in);

        while (opcion != 6) {
            System.out.println("=== Libros para Todos ===");
            System.out.println("1. Buscar libros");
            System.out.println("2. Mostrar todos los libros");
            System.out.println("3. Reservar libro");
            System.out.println("4. Comprar libro");
            System.out.println("5. Devolver libro");
            System.out.println("6. Salir");
            System.out.print("Ingrese una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            switch (opcion) {
                case 1:
                    buscarLibros();
                    break;
                case 2:
                    mostrarTodosLosLibros();
                    break;
                case 3:
                    reservarLibro();
                    break;
                case 4:
                    comprarLibro();
                    break;
                case 5:
                    devolverLibro();
                    break;
                case 6:
                    System.out.println("¡Gracias por utilizar Libros para Todos!");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
                    break;
            }
        }
    }

    private static void buscarLibros() {
        System.out.print("Ingrese el título del libro a buscar: ");
        String titulo = libreriaView.obtenerEntradaUsuario();
        List<Libro> resultados = libreriaController.buscarLibros(titulo);
        libreriaView.mostrarLibros(resultados);
    }

    private static void mostrarTodosLosLibros() {
        List<Libro> libros = libreriaController.obtenerTodosLosLibros();
        libreriaView.mostrarLibros(libros);
    }

    private static void reservarLibro() {
        System.out.print("Ingrese el título del libro a reservar: ");
        String titulo = libreriaView.obtenerEntradaUsuario();
        Libro libro = libreriaController.buscarLibroPorTitulo(titulo);
        if (libro != null) {
            libreriaController.reservarLibro(libro);
        } else {
            System.out.println("Libro no encontrado.");
        }
    }

    private static void comprarLibro() {
        System.out.print("Ingrese el título del libro a comprar: ");
        String titulo = libreriaView.obtenerEntradaUsuario();
        Libro libro = libreriaController.buscarLibro