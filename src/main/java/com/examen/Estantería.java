package com.examen;

import java.util.ArrayList;
import java.util.List;

public class Estantería {
    private List<Libro> libros;
    private double pesoMaximoKg;


    public Estantería(int pm) {
        libros=new ArrayList<>();
        if(pm>0&&pm<=150) pesoMaximoKg=pm;
        else throw new IllegalArgumentException("El peso maximo es incorrecto");
    }

    public Estantería(){
        this(100);
    }

    public int getNumeroLibros(){
        return libros.size();
    }

    public double getPesoLibros(){
        double peso=0;
        for (Libro libro : libros) {
            peso+=libro.getPesoKg();
        }
        return peso;
    }

    public boolean colocarLibro(Libro l){
        if((l.getPesoKg()+this.getPesoLibros())<=pesoMaximoKg){
            libros.add(l);
            return true;
        }else return false;
    }

    public List<Libro> getLibrosPorGenero(String genero){
        List<Libro> baldaLibros=new ArrayList<>();
        for (Libro libro : libros) {
            if(libro.getGenero().equals(genero)) baldaLibros.add(libro);
        }
        return baldaLibros;
    }
}
