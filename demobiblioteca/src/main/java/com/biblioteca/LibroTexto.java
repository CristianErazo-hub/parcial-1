package com.biblioteca;

public class LibroTexto extends Libro {
    private String cursoAsociado;

    public LibroTexto(String titulo, String autor, int numeroEjemplares, int numeroEjemplaresPrestados, String cursoAsociado) {
        super(titulo, autor, numeroEjemplares, numeroEjemplaresPrestados);
        this.cursoAsociado = cursoAsociado;
    }

    public String getCursoAsociado() {
        return cursoAsociado;
    }

    public void setCursoAsociado(String cursoAsociado) {
        this.cursoAsociado = cursoAsociado;
    }

    @Override
    public String toString() {
        return "LibroTexto{" +
                "cursoAsociado='" + cursoAsociado + '\'' +
                ", datosBase=" + super.toString() +
                '}';
    }
}