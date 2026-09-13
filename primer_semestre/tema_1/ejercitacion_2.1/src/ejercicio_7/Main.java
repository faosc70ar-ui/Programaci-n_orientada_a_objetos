package ejercicio_7;

public class Main {

    public static void main(String[] args) {
        var cuenta = new CuentaBancaria("Juan Jesús Farias", 2300.56);

        System.out.println(String.format("titular: %s",cuenta.getTitular()));
        System.out.println(String.format("saldo actual: $%.2f ", cuenta.getSaldo()));

        cuenta.depositar(349000.67);
        System.out.println(String.format("saldo actual: $%.2f", cuenta.getSaldo()));

        cuenta.retirar(34080.67);
        System.out.println(String.format("saldo actual: $%.2f", cuenta.getSaldo()));
    }
}
