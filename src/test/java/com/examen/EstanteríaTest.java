package com.examen;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class EstanteríaTest {
    @Test
    public void getNumeroLibrosTest(){
        Estantería e=new Estantería(8);
        e.colocarLibro(new Libro("Don Quijote", "Clásico", 3));
        e.colocarLibro(new Libro("Peter Pan", "Niños", 1.5));
        e.colocarLibro(new Libro("Tom Sawyer", "Clásico", 2));
        e.colocarLibro(new Libro("Spiderman", "Comic", 1));
        
        assertEquals(4, e.getNumeroLibros());
    }

    @Test
    public void getPesoLibrosTest(){
        Estantería e=new Estantería(8);
        e.colocarLibro(new Libro("Don Quijote", "Clásico", 3));
        e.colocarLibro(new Libro("Peter Pan", "Niños", 1.5));
        e.colocarLibro(new Libro("Tom Sawyer", "Clásico", 2));
        e.colocarLibro(new Libro("Spiderman", "Comic", 1));
        
        assertEquals(7.5, e.getPesoLibros(), 0.0001);
    }

    @Test
    public void getLibrosPorGeneroTest(){
        Estantería e=new Estantería(8);
        e.colocarLibro(new Libro("Don Quijote", "Clásico", 3));
        e.colocarLibro(new Libro("Peter Pan", "Niños", 1.5));
        e.colocarLibro(new Libro("Tom Sawyer", "Clásico", 2));
        e.colocarLibro(new Libro("Spiderman", "Comic", 1));
        
        assertEquals(2, e.getLibrosPorGenero("Clásico").size());
        assertEquals("Don Quijote", e.getLibrosPorGenero("Clásico").get(0).getTitulo());
    }

    @Test
    public void colocarLibroTest(){
        Estantería e=new Estantería(8);
        e.colocarLibro(new Libro("Don Quijote", "Clásico", 3));
        e.colocarLibro(new Libro("Peter Pan", "Niños", 1.5));
        e.colocarLibro(new Libro("Tom Sawyer", "Clásico", 2));
        e.colocarLibro(new Libro("Spiderman", "Comic", 1));
        
        assertEquals(false, e.colocarLibro(new Libro("titulo", "gen", 2)));
    }
}
