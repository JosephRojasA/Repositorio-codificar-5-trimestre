    import java.util.Scanner;
    import clasesbiblioteca.*;

    public class AppBiblioteca {
        private Libro libro;

        public static void main(String[] args) throws Exception {
            AppBiblioteca appBiblioteca = new AppBiblioteca();
            appBiblioteca.cargarLibro();
            appBiblioteca.imprimir();
        }

        // Método para cargar datos del libro desde la consola
        public void cargarLibro() {
            Scanner sc = new Scanner(System.in);
            libro = new Libro();

            System.out.println("Digite el código del libro:");
            libro.setCodigo(Integer.parseInt(sc.nextLine()));  // Asignar código al libro

            //sc.nextLine();

            System.out.println("Digite el nombre del libro:");
            libro.setNombre(sc.nextLine());  // Asignar nombre al libro

            System.out.println("Digite el año de publicación:");
            libro.setAñoPublicacion(Integer.parseInt(sc.nextLine()));  // Asignar año de publicación

            System.out.println("Digite la edición:");
            libro.setEdicion(Integer.parseInt(sc.nextLine()));  // Asignar edición

            // Datos del autor
            Autor autor = new Autor();
            System.out.println("Digite el código del autor del libro:");
            autor.setCodigo(Integer.parseInt(sc.nextLine()));  // Asignar código al autor

            //sc.nextLine();
            
            System.out.println("Digite el nombre del autor del libro:");
            autor.setNombre(sc.nextLine());  // Asignar nombre al autor

            libro.setAutor(autor);  // Asignar el autor al libro

            sc.close();  // Cerrar el Scanner
        }

        // Método para imprimir la información del libro
        public void imprimir() {
            System.out.println(libro);  // Imprimir los detalles del libro
        }
    }
