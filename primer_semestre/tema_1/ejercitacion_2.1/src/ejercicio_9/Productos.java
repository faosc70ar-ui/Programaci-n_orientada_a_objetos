package ejercicio_9;

public class Productos {

    //atributos:
    private String nombre;
    private double precio;

    //constructor:
    public Productos(String nombre, double precio){
        this.setNombre(nombre);
        this.setPrecio(precio);
    }


    //metodos:
    public void setNombre(String nombre) {
        if (nombre.isBlank()){
            System.out.println("Error (nombre invalido, no puede estar vacío)");
        }else{
            this.nombre = nombre;
        }
    }


    public void setPrecio(double precio) {
        if(precio > 0.0){
            this.precio = precio;
        }else{
            System.out.println("Error (el precio debe ser mayor a cero)");
        }
    }



    public String getNombre(){
        return nombre;
    }


    public double getPrecio(){
        return precio;
    }

}
