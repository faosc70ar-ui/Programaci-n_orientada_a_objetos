package ejercicio_4;

public class Operaciones {
    //atributos:
    double n1;
    double n2;


    //constructor:
    public Operaciones(double n1, double n2){
        this.n1 = n1;
        this.n2 = n2;
    }



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
