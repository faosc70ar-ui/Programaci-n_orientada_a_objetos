package Ejercicio_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        var auto = new Auto("Renault", "Megane");//creamos el objeto auto tipo Auto
        int op;

        //creamos un bucle para que el usuario interactúe cuanto quiera y decida cuando salir:
        do {
            menu(auto.marca, auto.modelo);//mostramos un menu con las respectivas acciones
            op = input("\ningresar acción a ejecutar: ");
            //use un switch, ya que es más limpio cuando se trata de menus con opciones/acciones:
            switch (op) {
                case 1:
                    auto.encender();
                    break;
                case 2:
                    auto.apagar();
                    break;
                case 3:
                    auto.mostrarEstado();
                    break;
                case 4:
                    System.out.println("saliste del vehiculo");
                    break;
                default:
                    System.out.println("acción invalida");
            }
        } while (op != 4);

    }

    /*cree esta función reutilizable la cual llame "input" para hacer el código
    más limpio y evitar repetición de código la cual tiene como función guardar
    datos ingresados por teclado*/
    public static int input(String mensaje) {
        System.out.print(mensaje);
        return scanner.nextInt();
    }

    //función estética del programa principal;
    public static void menu(String marca, String modelo){
        List<String> opciones = new ArrayList<>(List.of(
                "_encender", "_apagar", "_ver estado del vehiculo", "_salir del vehiculo"
        ));

        for(int i = 0; i < 4; i++){
            System.out.println(String.format("%d%s (%s %s)", i + 1, opciones.get(i), marca, modelo));
        }
    }

}
