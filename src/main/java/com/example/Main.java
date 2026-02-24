package com.example;

public class Main {
    public static void main(String[] args) {
        Libro libro1 = new Libro();
        Libro libro2 = new Libro("piensa y hagase rico", "Napoleon Hill");
        Libro libro3 = new Libro("deja de ser tu", "joe dispenza", 96);

        libro1.mostrarDetalles();
        libro2.mostrarDetalles();
        libro3.mostrarDetalles();
       
        // ejercicio 2

        System.out.println("\n=== EJERCICIO 2: CUENTA BANCARIA ===");

        CuentaBancaria cuenta = new CuentaBancaria("Jefry Lopez", 500);

        System.out.println("Titular: " + cuenta.getTitular());
        System.out.println("Saldo inicial: " + cuenta.getSaldo());

        cuenta.depositar(200);
        System.out.println("Saldo después de depositar: " + cuenta.getSaldo());

        cuenta.retirar(100);
        System.out.println("Saldo después de retirar: " + cuenta.getSaldo());

        cuenta.retirar(1000); // prueba de saldo insuficiente

        //ejercicio 3

        System.out.println("\n=== EJERCICIO 3: ESTUDIANTE ===");

        Estudiante e = new Estudiante("Pedro", 21, 2.5);
        e.mostrarInfo();
    }
}