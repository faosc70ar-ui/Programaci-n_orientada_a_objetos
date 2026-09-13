package ejercicio_7;

public class CuentaBancaria {
    //atributo:
    private String titular;
    private double saldo;

    //constructor:
    public CuentaBancaria(String titular, double saldo) {
        this.setTitular(titular);
        this.setSaldo(saldo);
    }

    //setters:
    private void setTitular(String nombre) {
        this.titular = nombre;
    }


    private void setSaldo(double monto) {
        if (monto > 0) {
            this.saldo = monto;
        } else {
            System.out.println("saldo invalido(debe ser mayor a cero)");
        }
    }


    //getters:
    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }


    //metodos:
    public void depositar(double monto){
        if(monto > 0){
            saldo += monto;
            System.out.println("Operación completada con exito");
        }else{
            System.out.println("error monto invalido(debe ser mayor a cero)");
        }
    }


    public void retirar(double monto){
        if(monto > 0 && monto <= saldo){
            saldo -= monto;
            System.out.println("Operación completada con exito");
        }else if(monto > saldo){
            System.out.println("Saldo insuficiente");
        }else{
            System.out.println("Monto invalido(debe ser mayor a cero)");
        }
    }
}
