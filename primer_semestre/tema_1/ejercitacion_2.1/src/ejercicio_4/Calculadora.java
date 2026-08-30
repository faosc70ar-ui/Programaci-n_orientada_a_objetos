package ejercicio_4;

public class Calculadora {

    //metodos:
    public double sumar(double n1, double n2) {
        return n1 + n2;
    }


    public double restar(double n1, double n2) {
        return n1 - n2;
    }


    public double multiplicar(double n1, double n2) {
        return n1 * n2;
    }


    public double dividir(double n1, double n2) {
        if(n2 != 0) {
            return n1 / n2;
        }else{
            System.out.println("Error: no se puede realizar una división por cero.");
        }
        return 0.0;
    }

}
