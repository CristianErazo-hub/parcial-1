package com.biblioteca;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Libro libro1 = new Libro("Cien Años de Soledad", "Gabriel García Márquez", 5, 1);

        Libro libro2 = new Libro();
        System.out.println("Ingrese título para libro2:");
        libro2.setTitulo(scanner.nextLine());

        System.out.println("Ingrese autor para libro2:");
        libro2.setAutor(scanner.nextLine());

        System.out.println("Ingrese número de ejemplares para libro2:");
        libro2.setNumeroEjemplares(leerEntero(scanner));

        System.out.println("Ingrese número de ejemplares prestados para libro2:");
        libro2.setNumeroEjemplaresPrestados(leerEntero(scanner));

        LibroTextoUni libroTextoUni = new LibroTextoUni(
                "Álgebra Lineal", "Howard Anton", 10, 3,
                "Matemáticas II", "Facultad de Ingeniería"
        );

        Novela novela = new Novela("Dune", "Frank Herbert", 4, 0, TipoNovela.CIENCIA_FICCION);

        System.out.println("\n--- Objetos creados ---");
        System.out.println(libro1);
        System.out.println(libro2);
        System.out.println(libroTextoUni);
        System.out.println(novela);

        System.out.println("\n--- Pruebas de préstamo y devolución ---");
        System.out.println("Préstamo libro1: " + libro1.prestamo());
        System.out.println("Préstamo libro1: " + libro1.prestamo());
        System.out.println("Devolución libro1: " + libro1.devolucion());
        System.out.println("Estado final libro1: " + libro1);

        scanner.close();
    }

    private static int leerEntero(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            System.out.println("Entrada inválida. Ingrese un número entero:");
            scanner.next();
        }
        int valor = scanner.nextInt();
        scanner.nextLine();
        return valor;
    }
}