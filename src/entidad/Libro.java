package entidad;

import java.util.Scanner;

/**
 * Crear una clase llamada Libro que contenga los siguientes atributos: ISBN,
 * Título, Autor, Número de páginas, y un constructor con todos los atributos
 * pasados por parámetro y un constructor vacío. Crear un método para cargar un
 * libro pidiendo los datos al usuario y luego informar mediante otro método el
 * número de ISBN, el título, el autor del libro y el número de páginas.
 *
 * @author elias
 */
public class Libro {

    public int ISBN;
    public String Titulo;
    public String autor;
    public int numP;

    public Libro() {
    }

    public Libro(int ISBN, String Titulo, String autor, int numP) {
        this.ISBN = ISBN;
        this.Titulo = Titulo;
        this.autor = autor;
        this.numP = numP;
    }

    public void cargarLibro() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el ISBN del libro: ");
        this.ISBN = leer.nextInt();
        System.out.println("Ingrese el Titulo del libro: ");
        this.Titulo = leer.next();
        System.out.println("Ingrese el autor del libro: ");
        this.autor = leer.next();
        System.out.println("Ingrese el numero de paginas: ");
        this.numP = leer.nextInt();

    }

    public void mostrarLibro() {
        System.out.println(this.ISBN);
        System.out.println(this.Titulo);
        System.out.println(this.autor);
        System.out.println(this.numP);

    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumP() {
        return numP;
    }

    public void setNumP(int numP) {
        this.numP = numP;
    }

    
    
    
}
