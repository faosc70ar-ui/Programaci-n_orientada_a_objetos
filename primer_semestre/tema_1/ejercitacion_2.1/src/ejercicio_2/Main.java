package ejercicio_2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //creamos una lista para guardar los obejetos mascota:
        var mascotas = new ArrayList<Mascota>();
        //use 3 Arrays para agregas los datos de cada perro:
        String[] nombres = {"Milo", "Chocolate", "Roco"};
        String[] especie = {"salchicha", "chiguagua", "pastor aleman"};
        int[] edad = {20, 45, 60};

        //luego hice un for para guardar todas las mascotas con las respectivos datos/valores:
        for (int i = 0; i < 3; i++){
            mascotas.add(new Mascota(nombres[i], especie[i], edad[i]));
        }

        //luego usamos otro for para recorrer la lista e imprimir sus datos con el String.format;
        for(int i = 0; i < 3; i++){
            System.out.println(String.format(
                    "nombre de la mascota: %s\nespecie: %s\nedad perruna: %d años\n",
                    mascotas.get(i).nombre, mascotas.get(i).especie, mascotas.get(i).edad
            ));
        }
    }
}