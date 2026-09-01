package ejercicio_4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var operaciones = new Operaciones(78, 2.4);

        double r1 = operaciones.sumar(operaciones.n1, operaciones.n2);
        double r2 = operaciones.restar(operaciones.n1, operaciones.n2);
        double r3 = operaciones.multiplicar(operaciones.n1, operaciones.n2);
        double r4 = operaciones.dividir(operaciones.n1, operaciones.n2);

        resultados(r1, r2, r3, r4, operaciones.n1, operaciones.n2);
    }


    public static void resultados(double r1, double r2, double r3, double r4, double n1, double n2){
        System.out.println(String.format(" %.2f + %.2f = %.2f", n1, n2, r1));
        System.out.println(String.format(" %.2f - %.2f = %.2f", n1, n2, r2));
        System.out.println(String.format(" %.2f * %.2f = %.2f", n1, n2, r3));
        System.out.println(String.format(" %.2f / %.2f = %.2f", n1, n2, r4));

    }

}
