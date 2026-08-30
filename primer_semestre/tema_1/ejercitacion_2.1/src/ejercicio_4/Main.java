package ejercicio_4;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        var calculadora = new Calculadora();
        double n1 = input("ingresar primer número: ");
        double n2 = input("ingresar segundo número: ");

        double r1 = calculadora.sumar(n1, n2);
        double r2 = calculadora.restar(n1, n2);
        double r3 = calculadora.multiplicar(n1, n2);
        double r4 = calculadora.dividir(n1, n2);

        resultados(r1, r2, r3, r4, n1, n2);
    }

    public static double input(String mensaje){
        System.out.print(mensaje);
        return scanner.nextDouble();
    }

    public static void resultados(double r1, double r2, double r3, double r4, double n1, double n2){
        System.out.println(String.format(" %.2f + %.2f = %.2f", n1, n2, r1));
        System.out.println(String.format(" %.2f - %.2f = %.2f", n1, n2, r2));
        System.out.println(String.format(" %.2f * %.2f = %.2f", n1, n2, r3));
        System.out.println(String.format(" %.2f / %.2f = %.2f", n1, n2, r4));

    }

}
