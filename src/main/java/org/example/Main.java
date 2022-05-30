package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println(sumaNumeros(3,7,5));
        Coche coche = new Coche();
        System.out.println(coche.puertas);
        coche.sumaPuertas();
        System.out.println(coche.puertas);
        coche.sumaPuertas();
        System.out.println(coche.puertas);
    }

    public static int sumaNumeros(int a, int b, int c) {
        return a+b+c;
    }
}