package ejercicio_8;

import java.util.ArrayList;
import java.util.List;

public class Estudiante{
    //atributos:
    private String nombre;
    private List<Double> calificaciones;

    public Estudiante(String nombre){
        this.nombre = nombre;
        this.calificaciones = new ArrayList<>();
    }

    //metodos:
    public  void agregarNota(double nota) {
        if (nota >= 0.0 && nota <= 10.0) {
            calificaciones.add(nota);
        } else {
            System.out.println("nota incorrecta (debe ser mayo a cero y menor igual a 10");
        }
    }

    public double calcularPromedio(){
        double suma = 0;
        for(double calificacion : calificaciones){
            suma += calificacion;
        }
        return suma / calificaciones.size();
    }


    public boolean haAprobado(){
        return calcularPromedio() >= 6.0;
    }

    public String getNombre(){
        return nombre;
    }

}
