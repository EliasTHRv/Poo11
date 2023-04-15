package main;

import entidad.Libro;

/**
 *
 * @author elias
 */
public class main_libro {

    public static void main(String[] args) {
        
        Libro libro2 = new Libro(180,"no se ", "pedro",120);
        Libro libro1 = new Libro();

//        libro1.cargarLibro();
        System.out.println("-------");

//        libro1.mostrarLibro();
        libro2.setISBN(125);
        libro2.setTitulo("cualquiera");
        libro2.setAutor("carlitos");
        libro2.setNumP(150);
        
        
        System.out.println(libro2.getISBN());
        System.out.println(libro2.getTitulo());
        System.out.println(libro2.getAutor());
        System.out.println(libro2.getNumP());
        
    }
    
}
