package com.examen;


public class Libro {
    private String titulo;
    private String genero;
    private double pesoKg;

    public Libro(String titulo, String genero, double peso){
        this.titulo=titulo;
        this.genero=genero;
        if(peso<0) throw new IllegalArgumentException("El peso no puede ser negativo");
        else this.pesoKg=peso;
    }


    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return this.genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public double getPesoKg() {
        return this.pesoKg;
    }

    public void setPesoKg(double pesoKg) {
        this.pesoKg = pesoKg;
    }
}
