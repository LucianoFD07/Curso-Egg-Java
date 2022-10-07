/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libro;

import java.util.Scanner;

/**
 * Crear una clase llamada Libro que contenga los siguientes atributos: ISBN,
 * Título, Autor, Número de páginas, y un constructor con todos los atributos
 * pasados por parámetro y un constructor vacío. Crear un método para cargar un
 * libro pidiendo los datos al usuario y luego informar mediante otro método el
 * número de ISBN, el título, el autor del libro y el numero de páginas
 *
 * @author lf531
 */
public class Libro {
Scanner leer = new Scanner(System.in);
    public String titulo;
    public String autor;
    public int isbn;
    public int n_paginas;

    public Libro() {
        
    }

    public Libro(String titulo, String autor, int isbn, int n_paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.n_paginas = n_paginas;
    }

    public void crearLibro() {
     
        System.out.println("Ingresemos Titulo del Libro");
        titulo=leer.nextLine();
        System.out.println("Ingresemos el autor ");
        autor=leer.nextLine();
        System.out.println("Ingresemos ISBN");
        isbn=leer.nextInt();
        System.out.println("Ingresemos cantidad de paginas  ");
        n_paginas=leer.nextInt();
    }
    
}

