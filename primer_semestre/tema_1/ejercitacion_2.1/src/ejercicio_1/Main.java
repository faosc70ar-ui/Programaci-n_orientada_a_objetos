package ejercicio_1;

public class Main {
    public static void main(String[] args) {
        //creamos dos objetos de la clase Persona para poder usarlo en el codigo:
        var persona2 = new Persona();
        var persona1 = new Persona();

        //le asignamos valores a los atributos de la clase:
        persona1.nombre = "Juan";
        persona1.edad = 78;

        persona2.nombre = "Lucas";
        persona2.edad = 10;

        //mostramos los valores en pantalla con uso de operador de acceso punto(.):
        System.out.println(String.format("nombre: %s , edad : %d", persona1.nombre, persona1.edad));
        System.out.println(String.format("nombre: %s , edad : %d", persona2.nombre, persona2.edad));

    }
}
