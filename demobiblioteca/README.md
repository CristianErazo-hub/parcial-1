# Diagrama UML de clases

```mermaid
classDiagram
    class Libro {
        -String titulo
        -String autor
        -int numeroEjemplares
        -int numeroEjemplaresPrestados
        +Libro()
        +Libro(String, String, int, int)
        +getTitulo(): String
        +setTitulo(String)
        +getAutor(): String
        +setAutor(String)
        +getNumeroEjemplares(): int
        +setNumeroEjemplares(int)
        +getNumeroEjemplaresPrestados(): int
        +setNumeroEjemplaresPrestados(int)
        +prestamo(): boolean
        +devolucion(): boolean
        +toString(): String
    }

    class LibroTexto {
        -String cursoAsociado
        +LibroTexto(String, String, int, int, String)
        +getCursoAsociado(): String
        +setCursoAsociado(String)
        +toString(): String
    }

    class LibroTextoUni {
        -String facultadPublicadora
        +LibroTextoUni(String, String, int, int, String, String)
        +getFacultadPublicadora(): String
        +setFacultadPublicadora(String)
        +toString(): String
    }

    class Novela {
        -TipoNovela tipo
        +Novela(String, String, int, int, TipoNovela)
        +getTipo(): TipoNovela
        +setTipo(TipoNovela)
        +toString(): String
    }

    class TipoNovela {
        <<enumeration>>
        HISTORICA
        ROMANTICA
        POLICIACA
        REALISTA
        CIENCIA_FICCION
        AVENTURAS
    }

    class Main {
        +main(String[]): void
    }

    Libro <|-- LibroTexto
    LibroTexto <|-- LibroTextoUni
    Libro <|-- Novela
    Novela --> TipoNovela
