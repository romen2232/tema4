package com.examen;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LibroTest {
    @Test
    public void getPesoTest(){
        Libro l=new Libro("titulo", "genero", 2);
        assertEquals(2000000, l.getPeso("miligramos"), 0.0001);
    }

    @Test
    public void getPesoGramosTest(){
        Libro l=new Libro("titulo", "genero", 2);
        assertEquals(2000, l.getPesoGramos(), 0.0001);
    }
}
