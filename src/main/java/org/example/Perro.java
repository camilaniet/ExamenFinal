package org.example;

public class Perro extends Animales {

    public Perro(int cantidadPatas, int edad, String pelaje) {
        super(cantidadPatas, edad, pelaje);
    }

    public void ladrar() {
        System.out.println("El perro ladra");
    }
    public void jugar() {
        System.out.println("El perro juega");
    }
}
