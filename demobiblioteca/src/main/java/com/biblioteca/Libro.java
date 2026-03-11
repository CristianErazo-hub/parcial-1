package com.biblioteca;

public class Libro {
    private String titulo;
    private String autor;
    private int numeroEjemplares;
    private int numeroEjemplaresPrestados;

    public Libro() {
        this("", "", 0, 0);
    }

    public Libro(String titulo, String autor, int numeroEjemplares, int numeroEjemplaresPrestados) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroEjemplares = Math.max(numeroEjemplares, 0);
        this.numeroEjemplaresPrestados = Math.max(numeroEjemplaresPrestados, 0);

        if (this.numeroEjemplaresPrestados > this.numeroEjemplares) {
            this.numeroEjemplaresPrestados = this.numeroEjemplares;
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumeroEjemplares() {
        return numeroEjemplares;
    }

    public void setNumeroEjemplares(int numeroEjemplares) {
        this.numeroEjemplares = Math.max(numeroEjemplares, 0);
        if (this.numeroEjemplaresPrestados > this.numeroEjemplares) {
            this.numeroEjemplaresPrestados = this.numeroEjemplares;
        }
    }

    public int getNumeroEjemplaresPrestados() {
        return numeroEjemplaresPrestados;
    }

    public void setNumeroEjemplaresPrestados(int numeroEjemplaresPrestados) {
        this.numeroEjemplaresPrestados = Math.max(numeroEjemplaresPrestados, 0);
        if (this.numeroEjemplaresPrestados > this.numeroEjemplares) {
            this.numeroEjemplaresPrestados = this.numeroEjemplares;
        }
    }

    public boolean prestamo() {
        int disponibles = numeroEjemplares - numeroEjemplaresPrestados;
        if (disponibles > 0) {
            numeroEjemplaresPrestados++;
            return true;
        }
        return false;
    }

    public boolean devolucion() {
        if (numeroEjemplaresPrestados > 0) {
            numeroEjemplaresPrestados--;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", numeroEjemplares=" + numeroEjemplares +
                ", numeroEjemplaresPrestados=" + numeroEjemplaresPrestados +
                '}';
    }
}