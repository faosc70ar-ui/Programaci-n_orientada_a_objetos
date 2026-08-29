package Ejercicio_3;

public class Auto {
    //Atributos de la clase:
    String marca;
    String modelo;
    boolean encendido = false;

    //Constructor de la clase:
    public Auto(String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
    }

    //metodos de la clase:
    public  void encender(){
        encendido = true;
        System.out.println("\n¡EL VEHICULO SE ENCENDIÓ!");
    }

    public void apagar(){
        encendido = false;
        System.out.println("\n¡EL VEHICULO SE APAGO!");
    }

    public void mostrarEstado(){
        if(encendido){
            System.out.println("\nEL VEHICULO SE ENCUENTRA ENCENDIDO");
        }else{
            System.out.println("\nEL VEHICULO SE ENCUENTRA APAGADO");
        }
    }
}
