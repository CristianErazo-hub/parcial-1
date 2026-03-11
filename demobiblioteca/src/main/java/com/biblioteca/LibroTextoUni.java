package com.biblioteca;

public class LibroTextoUni extends LibroTexto {
    private String facultadPublicadora;

    public LibroTextoUni(String titulo, String autor, int numeroEjemplares, int numeroEjemplaresPrestados,
                           String cursoAsociado, String facultadPublicadora) {
        super(titulo, autor, numeroEjemplares, numeroEjemplaresPrestados, cursoAsociado);
        this.facultadPublicadora = facultadPublicadora;
    }

    public String getFacultadPublicadora() {
        return facultadPublicadora;
    }

    public void setFacultadPublicadora(String facultadPublicadora) {
        this.facultadPublicadora = facultadPublicadora;
    }

    @Override
    public String toString() {
        return "LibroTextoUni{" +
                "facultadPublicadora='" + facultadPublicadora + '\'' +
                ", datosLibroTexto=" + super.toString() +
                '}';
    }
}