package ejercicio_9;

import java.util.ArrayList;
import java.util.List;

public class CarritoDeCompras {
    //atributos:
    private List<Productos> listaProductos = new ArrayList<>();

    
    //metodos:
    public void agregarProducto(Productos producto){
        listaProductos.add(producto);
    }


    public double calcularTotal(){
        double montoTotal = 0;

        for (Productos p : listaProductos){
            montoTotal += p.getPrecio();
        }
        return montoTotal;
    }


    public void mostrarDetalle(){
        if (!listaProductos.isEmpty()){
            for(Productos p : listaProductos){
                System.out.println(String.format("%s     $%.2f", p.getNombre(), p.getPrecio()));
            }
            System.out.println(String.format("\nTotal a pagar: $%.2f", calcularTotal()));
        }else{
            System.out.println("No hay productos en el carrito");
        }
    }

}
