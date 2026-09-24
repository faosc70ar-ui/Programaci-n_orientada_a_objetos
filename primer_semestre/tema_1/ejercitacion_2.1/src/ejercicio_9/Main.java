package ejercicio_9;

public class Main {
    public static void main(String[] args) {
        var carrito = new CarritoDeCompras();
        //creacion de los productos:
        var producto1 = new Productos("jabon", 1290.67);
        var producto2 = new Productos("Galletas Oreo", 3280.97);
        var producto3 = new Productos("Taragui yerba mate", 4583.99);

        carrito.mostrarDetalle();

        //agregar al carrito:
        carrito.agregarProducto(producto1);
        carrito.agregarProducto(producto2);
        carrito.agregarProducto(producto3);

        carrito.mostrarDetalle();

    }
}
